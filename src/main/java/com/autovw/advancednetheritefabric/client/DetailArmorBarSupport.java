package com.autovw.advancednetheritefabric.client;

import com.autovw.advancednetheritefabric.Reference;
import com.autovw.advancednetheritefabric.core.registry.ModItems;
//import com.redlimerl.detailab.api.DetailArmorBarAPI;
//import com.redlimerl.detailab.api.render.ArmorBarRenderManager;
//import com.redlimerl.detailab.api.render.TextureOffset;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

/**
 * Author: Autovw
 * <br/>
 * Support class for Detail Armor Bar mod
 */
public class DetailArmorBarSupport {
    protected static final Identifier ARMOR_BAR_TEXTURE = new Identifier(Reference.MOD_ID, "textures/armor_bar/armor_bar.png");

    public static void register() {
        /*
        TextureOffset full = new TextureOffset(9, 0);
        TextureOffset half = new TextureOffset(0, 0);

        ArmorItem[] netheriteIronSet = {(ArmorItem) ModItems.NETHERITE_IRON_HELMET, (ArmorItem) ModItems.NETHERITE_IRON_CHESTPLATE, (ArmorItem) ModItems.NETHERITE_IRON_LEGGINGS, (ArmorItem) ModItems.NETHERITE_IRON_BOOTS};
        ArmorItem[] netheriteGoldSet = {(ArmorItem) ModItems.NETHERITE_GOLD_HELMET, (ArmorItem) ModItems.NETHERITE_GOLD_CHESTPLATE, (ArmorItem) ModItems.NETHERITE_GOLD_LEGGINGS, (ArmorItem) ModItems.NETHERITE_GOLD_BOOTS};
        ArmorItem[] netheriteEmeraldSet = {(ArmorItem) ModItems.NETHERITE_EMERALD_HELMET, (ArmorItem) ModItems.NETHERITE_EMERALD_CHESTPLATE, (ArmorItem) ModItems.NETHERITE_EMERALD_LEGGINGS, (ArmorItem) ModItems.NETHERITE_EMERALD_BOOTS};
        ArmorItem[] netheriteDiamondSet = {(ArmorItem) ModItems.NETHERITE_DIAMOND_HELMET, (ArmorItem) ModItems.NETHERITE_DIAMOND_CHESTPLATE, (ArmorItem) ModItems.NETHERITE_DIAMOND_LEGGINGS, (ArmorItem) ModItems.NETHERITE_DIAMOND_BOOTS};

        DetailArmorBarAPI.customArmorBarBuilder().armor(netheriteIronSet)
                .render((ItemStack stack) -> new ArmorBarRenderManager(ARMOR_BAR_TEXTURE, 72, 9, new TextureOffset(9, 9), new TextureOffset(0, 9), full, half))
                .register();

        DetailArmorBarAPI.customArmorBarBuilder().armor(netheriteGoldSet)
                .render((ItemStack stack) -> new ArmorBarRenderManager(ARMOR_BAR_TEXTURE, 72, 9, new TextureOffset(27, 9), new TextureOffset(18, 9), full, half))
                .register();

        DetailArmorBarAPI.customArmorBarBuilder().armor(netheriteEmeraldSet)
                .render((ItemStack stack) -> new ArmorBarRenderManager(ARMOR_BAR_TEXTURE, 72, 9, new TextureOffset(45, 9), new TextureOffset(36, 9), full, half))
                .register();

        DetailArmorBarAPI.customArmorBarBuilder().armor(netheriteDiamondSet)
                .render((ItemStack stack) -> new ArmorBarRenderManager(ARMOR_BAR_TEXTURE, 72, 9, new TextureOffset(63, 9), new TextureOffset(54, 9), full, half))
                .register();
         */
    }
}
