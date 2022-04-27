package com.autovw.advancednetherite.mixin;

import com.autovw.advancednetherite.content.armor.ModArmorItem;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.FlyingEntity;
import net.minecraft.entity.mob.Monster;
import net.minecraft.entity.mob.PhantomEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Author: Autovw
 */
@Mixin(PhantomEntity.class)
public abstract class PhantomEntityMixin extends FlyingEntity implements Monster {
    protected PhantomEntityMixin(EntityType<? extends FlyingEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method = "tick", at = @At("HEAD"), cancellable = true)
    private void advancednetherite_PhantomEntity_tick(CallbackInfo ci) {
        PhantomEntity phantom = (PhantomEntity) (Object) this; // phantom (attacker)
        LivingEntity target = phantom.getTarget(); // phantom target
        if (target instanceof PlayerEntity) {
            for (ItemStack stack : target.getArmorItems()) {
                Item item = stack.getItem();
                if (item instanceof ModArmorItem && ((ModArmorItem) item).pacifyPhantoms(stack)) {
                    phantom.setTarget(null);
                }
            }
        }
    }
}
