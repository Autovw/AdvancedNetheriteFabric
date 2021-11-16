package com.autovw.advancednetherite.mixin;

import com.autovw.advancednetherite.core.ModArmorTiers;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.Angerable;
import net.minecraft.entity.mob.EndermanEntity;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * Author: Autovw
 */
@Mixin(EndermanEntity.class)
public abstract class EndermanEntityMixin extends HostileEntity implements Angerable {
    protected EndermanEntityMixin(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }

    // There are probably better ways to write this Mixin but if it works and doesn't crash I'm fine with this.
    @Inject(method = "isPlayerStaring", at = @At("HEAD"), cancellable = true)
    private void advancednetherite_isPlayerStaring(PlayerEntity player, CallbackInfoReturnable<Boolean> cir) {
        ItemStack stack = player.getInventory().armor.get(3);
        if (stack.getItem() instanceof ArmorItem && ((ArmorItem) stack.getItem()).getMaterial() == ModArmorTiers.NETHERITE_EMERALD) {
            cir.setReturnValue(false);
        }
        if (stack.getItem() instanceof ArmorItem && ((ArmorItem) stack.getItem()).getMaterial() == ModArmorTiers.NETHERITE_DIAMOND) {
            cir.setReturnValue(false);
        }
    }
}
