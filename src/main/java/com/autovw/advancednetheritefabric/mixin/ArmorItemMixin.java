package com.autovw.advancednetheritefabric.mixin;

import com.autovw.advancednetheritefabric.common.item.AdvancedArmorItem;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Equipment;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.EnumMap;
import java.util.UUID;

/**
 * Mixin for adding knockback resistance to armor
 * @author Autovw
 */
@Mixin(ArmorItem.class)
public abstract class ArmorItemMixin implements Equipment {

    @Shadow
    @Final
    private static EnumMap<ArmorItem.Type, UUID> MODIFIERS;

    @Shadow
    @Final
    @Mutable
    private Multimap<EntityAttribute, EntityAttributeModifier> attributeModifiers;

    @Shadow
    @Final
    protected float knockbackResistance;

    @Inject(method = "<init>", at = @At(value = "RETURN"))
    private void advancednetherite_ArmorItem(ArmorMaterial material, ArmorItem.Type armorType, Item.Settings settings, CallbackInfo ci) {
        UUID uuid = MODIFIERS.get(armorType);
        ArmorItem armorItem = (ArmorItem) (Object) this;

        if (armorItem instanceof AdvancedArmorItem && this.knockbackResistance > 0) {
            ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();

            this.attributeModifiers.forEach(builder::put);

            builder.put(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, new EntityAttributeModifier(uuid, "Armor knockback resistance", this.knockbackResistance, EntityAttributeModifier.Operation.ADDITION));

            this.attributeModifiers = builder.build();
        }
    }
}
