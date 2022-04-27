package com.autovw.advancednetherite.mixin;

import com.autovw.advancednetherite.common.item.AdvancedArmorItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.PiglinBrain;
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

    @Inject(method = "wearsGoldArmor", at = @At("HEAD"), cancellable = true)
    private static void advancednetherite_wearsGoldArmor(LivingEntity entity, CallbackInfoReturnable<Boolean> cir) {
        for (ItemStack stack : entity.getArmorItems()) {
            Item item = stack.getItem();
            if (item instanceof AdvancedArmorItem && ((AdvancedArmorItem) item).pacifyPiglins(stack)) {
                cir.setReturnValue(true);
            }
        }
    }
}
