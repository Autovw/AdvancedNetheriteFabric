package com.autovw.advancednetherite.mixin;

import com.autovw.advancednetherite.common.item.IAdvancedArmorItem;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.UUID;

/**
 * Author: Autovw
 */
@Mixin(ArmorItem.class)
public abstract class ArmorItemMixin implements IAdvancedArmorItem {

    @Shadow
    @Final
    private static UUID[] MODIFIERS;

    @Shadow
    @Final
    @Mutable
    private Multimap<EntityAttribute, EntityAttributeModifier> attributeModifiers;

    @Shadow
    @Final
    protected float knockbackResistance;

    // Honestly got no idea why this is not patched by default
    @Inject(method = "<init>", at = @At(value = "RETURN"))
    private void advancednetherite_ArmorItem(ArmorMaterial material, EquipmentSlot slot, Item.Settings settings, CallbackInfo ci) {
        UUID uuid = MODIFIERS[slot.getEntitySlotId()];

        if (hasKnockbackResistance() && this.knockbackResistance > 0) {
            ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();

            this.attributeModifiers.forEach(builder::put);

            builder.put(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, new EntityAttributeModifier(uuid, "Armor knockback resistance", this.knockbackResistance, EntityAttributeModifier.Operation.ADDITION));

            this.attributeModifiers = builder.build();
        }
    }
}
