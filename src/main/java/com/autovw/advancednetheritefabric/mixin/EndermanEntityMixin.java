package com.autovw.advancednetheritefabric.mixin;

import com.autovw.advancednetheritefabric.common.item.AdvancedArmorItem;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.Angerable;
import net.minecraft.entity.mob.EndermanEntity;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
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

    // Mixin related to "Pacifies Endermen" armor perk
    @Inject(method = "isPlayerStaring", at = @At("HEAD"), cancellable = true)
    private void advancednetherite_isPlayerStaring(PlayerEntity player, CallbackInfoReturnable<Boolean> cir) {
        for (ItemStack stack : player.getArmorItems()) {
            Item item = stack.getItem();
            if (item instanceof AdvancedArmorItem && ((AdvancedArmorItem) item).pacifyEndermen(stack)) {
                cir.setReturnValue(false);
            }
        }
    }
}
