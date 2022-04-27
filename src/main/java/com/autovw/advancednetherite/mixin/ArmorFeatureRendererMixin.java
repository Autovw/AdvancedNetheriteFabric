package com.autovw.advancednetherite.mixin;

import com.autovw.advancednetherite.common.item.AdvancedArmorItem;
import net.minecraft.client.render.entity.feature.ArmorFeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Map;

/**
 * Author: Autovw
 * <br/>
 * This Mixin allows loading armor textures from a custom namespace instead of the default "minecraft" namespace.
 */
@Mixin(ArmorFeatureRenderer.class)
public abstract class ArmorFeatureRendererMixin extends FeatureRenderer<LivingEntity, BipedEntityModel<LivingEntity>> {
    @Shadow
    @Final
    private static Map<String, Identifier> ARMOR_TEXTURE_CACHE;

    protected ArmorFeatureRendererMixin(FeatureRendererContext<LivingEntity, BipedEntityModel<LivingEntity>> context) {
        super(context);
    }

    @Inject(method = "getArmorTexture", at = @At(value = "HEAD"), cancellable = true)
    private void advancednetherite_getArmorTexture(ArmorItem item, boolean legs, String overlay, CallbackInfoReturnable<Identifier> cir) {
        String itemName = item.getMaterial().getName();
        if (itemName.contains(":") && item instanceof AdvancedArmorItem) {
            String[] splitName = itemName.split(":");
            String namespace = splitName[0];
            String path = splitName[1];
            String texture = namespace + ":textures/models/armor/" + path + "_layer_" + (legs ? 2 : 1) + (overlay == null ? "" : "_" + overlay) + ".png";
            cir.setReturnValue(ARMOR_TEXTURE_CACHE.computeIfAbsent(texture, Identifier::new));
        }
    }
}
