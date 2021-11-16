package com.autovw.advancednetherite.mixin;

import com.autovw.advancednetherite.core.ModArmorTiers;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.PiglinBrain;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * Author: Autovw
 */
@Mixin(PiglinBrain.class)
public class PiglinBrainMixin {

    // There are probably better ways to write this Mixin but if it works and doesn't crash I'm fine with this.
    @Inject(method = "wearsGoldArmor", at = @At("HEAD"), cancellable = true)
    private static void advancednetherite_wearsGoldArmor(LivingEntity entity, CallbackInfoReturnable<Boolean> cir) {
        for (ItemStack stack : entity.getArmorItems()) {
            Item item = stack.getItem();
            if (stack.getItem() instanceof ArmorItem && ((ArmorItem) stack.getItem()).getMaterial() == ModArmorTiers.NETHERITE_GOLD) {
                cir.setReturnValue(true);
            }
            if (stack.getItem() instanceof ArmorItem && ((ArmorItem) stack.getItem()).getMaterial() == ModArmorTiers.NETHERITE_DIAMOND) {
                cir.setReturnValue(true);
            }
        }
    }
}
