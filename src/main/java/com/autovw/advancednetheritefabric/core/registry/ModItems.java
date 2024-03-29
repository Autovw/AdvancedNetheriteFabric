package com.autovw.advancednetheritefabric.core.registry;

import com.autovw.advancednetheritefabric.Reference;
import com.autovw.advancednetheritefabric.common.item.*;
import com.autovw.advancednetheritefabric.core.util.ModArmorTiers;
import com.autovw.advancednetheritefabric.core.util.ModToolTiers;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

/**
 * @author Autovw
 */
public final class ModItems {

    // Ingots
    public static final Item NETHERITE_IRON_INGOT = new Item(new Item.Settings().fireproof());
    public static final Item NETHERITE_GOLD_INGOT = new Item(new Item.Settings().fireproof());
    public static final Item NETHERITE_EMERALD_INGOT = new Item(new Item.Settings().fireproof());
    public static final Item NETHERITE_DIAMOND_INGOT = new Item(new Item.Settings().fireproof());

    // Armor
    // Netherite-Iron
    public static final Item NETHERITE_IRON_HELMET = new AdvancedArmorItem(ModArmorTiers.NETHERITE_IRON, ArmorItem.Type.HELMET, (new Item.Settings()));
    public static final Item NETHERITE_IRON_CHESTPLATE = new AdvancedArmorItem(ModArmorTiers.NETHERITE_IRON, ArmorItem.Type.CHESTPLATE, (new Item.Settings()));
    public static final Item NETHERITE_IRON_LEGGINGS = new AdvancedArmorItem(ModArmorTiers.NETHERITE_IRON, ArmorItem.Type.LEGGINGS, (new Item.Settings()));
    public static final Item NETHERITE_IRON_BOOTS = new AdvancedArmorItem(ModArmorTiers.NETHERITE_IRON, ArmorItem.Type.BOOTS, (new Item.Settings()));
    // Netherite-Gold
    public static final Item NETHERITE_GOLD_HELMET = new AdvancedArmorItem(ModArmorTiers.NETHERITE_GOLD, ArmorItem.Type.HELMET, (new Item.Settings()));
    public static final Item NETHERITE_GOLD_CHESTPLATE = new AdvancedArmorItem(ModArmorTiers.NETHERITE_GOLD, ArmorItem.Type.CHESTPLATE, (new Item.Settings()));
    public static final Item NETHERITE_GOLD_LEGGINGS = new AdvancedArmorItem(ModArmorTiers.NETHERITE_GOLD, ArmorItem.Type.LEGGINGS, (new Item.Settings()));
    public static final Item NETHERITE_GOLD_BOOTS = new AdvancedArmorItem(ModArmorTiers.NETHERITE_GOLD, ArmorItem.Type.BOOTS, (new Item.Settings()));
    // Netherite-Emerald
    public static final Item NETHERITE_EMERALD_HELMET = new AdvancedArmorItem(ModArmorTiers.NETHERITE_EMERALD, ArmorItem.Type.HELMET, (new Item.Settings()));
    public static final Item NETHERITE_EMERALD_CHESTPLATE = new AdvancedArmorItem(ModArmorTiers.NETHERITE_EMERALD, ArmorItem.Type.CHESTPLATE, (new Item.Settings()));
    public static final Item NETHERITE_EMERALD_LEGGINGS = new AdvancedArmorItem(ModArmorTiers.NETHERITE_EMERALD, ArmorItem.Type.LEGGINGS, (new Item.Settings()));
    public static final Item NETHERITE_EMERALD_BOOTS = new AdvancedArmorItem(ModArmorTiers.NETHERITE_EMERALD, ArmorItem.Type.BOOTS, (new Item.Settings()));
    // Netherite-Diamond
    public static final Item NETHERITE_DIAMOND_HELMET = new AdvancedArmorItem(ModArmorTiers.NETHERITE_DIAMOND, ArmorItem.Type.HELMET, (new Item.Settings()));
    public static final Item NETHERITE_DIAMOND_CHESTPLATE = new AdvancedArmorItem(ModArmorTiers.NETHERITE_DIAMOND, ArmorItem.Type.CHESTPLATE, (new Item.Settings()));
    public static final Item NETHERITE_DIAMOND_LEGGINGS = new AdvancedArmorItem(ModArmorTiers.NETHERITE_DIAMOND, ArmorItem.Type.LEGGINGS, (new Item.Settings()));
    public static final Item NETHERITE_DIAMOND_BOOTS = new AdvancedArmorItem(ModArmorTiers.NETHERITE_DIAMOND, ArmorItem.Type.BOOTS, (new Item.Settings()));

    // Tools
    // Axes
    public static final ToolItem NETHERITE_IRON_AXE = new AdvancedAxeItem(ModToolTiers.NETHERITE_IRON, 5, -3.0f, new Item.Settings());
    public static final ToolItem NETHERITE_GOLD_AXE = new AdvancedAxeItem(ModToolTiers.NETHERITE_GOLD, 6, -3.0f, new Item.Settings());
    public static final ToolItem NETHERITE_EMERALD_AXE = new AdvancedAxeItem(ModToolTiers.NETHERITE_EMERALD, 6, -3.0f, new Item.Settings());
    public static final ToolItem NETHERITE_DIAMOND_AXE = new AdvancedAxeItem(ModToolTiers.NETHERITE_DIAMOND, 7, -3.0f, new Item.Settings());
    // Hoes
    public static final ToolItem NETHERITE_IRON_HOE = new AdvancedHoeItem(ModToolTiers.NETHERITE_IRON, -4, 0.0f, new Item.Settings());
    public static final ToolItem NETHERITE_GOLD_HOE= new AdvancedHoeItem(ModToolTiers.NETHERITE_GOLD, -4, 0.0f, new Item.Settings());
    public static final ToolItem NETHERITE_EMERALD_HOE = new AdvancedHoeItem(ModToolTiers.NETHERITE_EMERALD, -5, 0.0f, new Item.Settings());
    public static final ToolItem NETHERITE_DIAMOND_HOE = new AdvancedHoeItem(ModToolTiers.NETHERITE_DIAMOND, -5, 0.0f, new Item.Settings());
    // Pickaxes
    public static final ToolItem NETHERITE_IRON_PICKAXE = new AdvancedPickaxeItem(ModToolTiers.NETHERITE_IRON, 1, -2.8f, new Item.Settings());
    public static final ToolItem NETHERITE_GOLD_PICKAXE = new AdvancedPickaxeItem(ModToolTiers.NETHERITE_GOLD, 1, -2.8f, new Item.Settings());
    public static final ToolItem NETHERITE_EMERALD_PICKAXE = new AdvancedPickaxeItem(ModToolTiers.NETHERITE_EMERALD, 1, -2.8f, new Item.Settings());
    public static final ToolItem NETHERITE_DIAMOND_PICKAXE = new AdvancedPickaxeItem(ModToolTiers.NETHERITE_DIAMOND, 1, -2.8f, new Item.Settings());
    // Shovels
    public static final ToolItem NETHERITE_IRON_SHOVEL = new AdvancedShovelItem(ModToolTiers.NETHERITE_IRON, 1.5F, -3.0f, new Item.Settings());
    public static final ToolItem NETHERITE_GOLD_SHOVEL = new AdvancedShovelItem(ModToolTiers.NETHERITE_GOLD, 1.5F, -3.0f, new Item.Settings());
    public static final ToolItem NETHERITE_EMERALD_SHOVEL = new AdvancedShovelItem(ModToolTiers.NETHERITE_EMERALD, 1, -3.0f, new Item.Settings());
    public static final ToolItem NETHERITE_DIAMOND_SHOVEL = new AdvancedShovelItem(ModToolTiers.NETHERITE_DIAMOND, 1, -3.0f, new Item.Settings());
    // Swords
    public static final ToolItem NETHERITE_IRON_SWORD = new AdvancedSwordItem(ModToolTiers.NETHERITE_IRON, 3, -2.4f, new Item.Settings());
    public static final ToolItem NETHERITE_GOLD_SWORD = new AdvancedSwordItem(ModToolTiers.NETHERITE_GOLD, 4, -2.4f, new Item.Settings());
    public static final ToolItem NETHERITE_EMERALD_SWORD = new AdvancedSwordItem(ModToolTiers.NETHERITE_EMERALD, 4, -2.4f, new Item.Settings());
    public static final ToolItem NETHERITE_DIAMOND_SWORD = new AdvancedSwordItem(ModToolTiers.NETHERITE_DIAMOND, 5, -2.4f, new Item.Settings());

    // Block items
    public static final BlockItem NETHERITE_IRON_BLOCK = new BlockItem(ModBlocks.NETHERITE_IRON_BLOCK, new Item.Settings().fireproof());
    public static final BlockItem NETHERITE_GOLD_BLOCK = new BlockItem(ModBlocks.NETHERITE_GOLD_BLOCK, new Item.Settings().fireproof());
    public static final BlockItem NETHERITE_EMERALD_BLOCK = new BlockItem(ModBlocks.NETHERITE_EMERALD_BLOCK, new Item.Settings().fireproof());
    public static final BlockItem NETHERITE_DIAMOND_BLOCK = new BlockItem(ModBlocks.NETHERITE_DIAMOND_BLOCK, new Item.Settings().fireproof());

    public static void registerItems() {
        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_iron_ingot"), NETHERITE_IRON_INGOT);
        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_gold_ingot"), NETHERITE_GOLD_INGOT);
        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_emerald_ingot"), NETHERITE_EMERALD_INGOT);
        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_diamond_ingot"), NETHERITE_DIAMOND_INGOT);

        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_iron_helmet"), NETHERITE_IRON_HELMET);
        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_iron_chestplate"), NETHERITE_IRON_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_iron_leggings"), NETHERITE_IRON_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_iron_boots"), NETHERITE_IRON_BOOTS);
        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_gold_helmet"), NETHERITE_GOLD_HELMET);
        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_gold_chestplate"), NETHERITE_GOLD_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_gold_leggings"), NETHERITE_GOLD_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_gold_boots"), NETHERITE_GOLD_BOOTS);
        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_emerald_helmet"), NETHERITE_EMERALD_HELMET);
        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_emerald_chestplate"), NETHERITE_EMERALD_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_emerald_leggings"), NETHERITE_EMERALD_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_emerald_boots"), NETHERITE_EMERALD_BOOTS);
        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_diamond_helmet"), NETHERITE_DIAMOND_HELMET);
        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_diamond_chestplate"), NETHERITE_DIAMOND_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_diamond_leggings"), NETHERITE_DIAMOND_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_diamond_boots"), NETHERITE_DIAMOND_BOOTS);

        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_iron_axe"), NETHERITE_IRON_AXE);
        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_gold_axe"), NETHERITE_GOLD_AXE);
        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_emerald_axe"), NETHERITE_EMERALD_AXE);
        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_diamond_axe"), NETHERITE_DIAMOND_AXE);

        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_iron_hoe"), NETHERITE_IRON_HOE);
        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_gold_hoe"), NETHERITE_GOLD_HOE);
        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_emerald_hoe"), NETHERITE_EMERALD_HOE);
        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_diamond_hoe"), NETHERITE_DIAMOND_HOE);

        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_iron_pickaxe"), NETHERITE_IRON_PICKAXE);
        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_gold_pickaxe"), NETHERITE_GOLD_PICKAXE);
        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_emerald_pickaxe"), NETHERITE_EMERALD_PICKAXE);
        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_diamond_pickaxe"), NETHERITE_DIAMOND_PICKAXE);

        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_iron_shovel"), NETHERITE_IRON_SHOVEL);
        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_gold_shovel"), NETHERITE_GOLD_SHOVEL);
        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_emerald_shovel"), NETHERITE_EMERALD_SHOVEL);
        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_diamond_shovel"), NETHERITE_DIAMOND_SHOVEL);

        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_iron_sword"), NETHERITE_IRON_SWORD);
        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_gold_sword"), NETHERITE_GOLD_SWORD);
        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_emerald_sword"), NETHERITE_EMERALD_SWORD);
        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_diamond_sword"), NETHERITE_DIAMOND_SWORD);

        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_iron_block"), NETHERITE_IRON_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_gold_block"), NETHERITE_GOLD_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_emerald_block"), NETHERITE_EMERALD_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, "netherite_diamond_block"), NETHERITE_DIAMOND_BLOCK);
    }
}
