package com.autovw.advancednetheritefabric.datagen.providers;

import com.autovw.advancednetheritefabric.core.registry.ModItems;
import com.autovw.advancednetheritefabric.core.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

/**
 * Author: Autovw
 */
public class ModItemTagsProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagsProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(dataOutput, completableFuture, new ModBlockTagsProvider(dataOutput, completableFuture));
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        // Mod item tags
        copy(ModTags.NETHERITE_BLOCKS, ModTags.NETHERITE_BLOCK_ITEMS);
        getOrCreateTagBuilder(ModTags.NETHERITE_INGOTS)
                .add(ModItems.NETHERITE_IRON_INGOT)
                .add(ModItems.NETHERITE_GOLD_INGOT)
                .add(ModItems.NETHERITE_EMERALD_INGOT)
                .add(ModItems.NETHERITE_DIAMOND_INGOT);
        getOrCreateTagBuilder(ModTags.UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.INGOTS_NETHERITES_IRON);
        getOrCreateTagBuilder(ModTags.UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.INGOTS_NETHERITES_GOLD);
        getOrCreateTagBuilder(ModTags.UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.INGOTS_NETHERITES_EMERALD);
        getOrCreateTagBuilder(ModTags.UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.INGOTS_NETHERITES_DIAMOND);

        getOrCreateTagBuilder(ModTags.INGOTS_NETHERITES).add(Items.NETHERITE_INGOT);
        getOrCreateTagBuilder(ModTags.INGOTS_NETHERITES_IRON).add(ModItems.NETHERITE_IRON_INGOT);
        getOrCreateTagBuilder(ModTags.INGOTS_NETHERITES_GOLD).add(ModItems.NETHERITE_GOLD_INGOT);
        getOrCreateTagBuilder(ModTags.INGOTS_NETHERITES_EMERALD).add(ModItems.NETHERITE_EMERALD_INGOT);
        getOrCreateTagBuilder(ModTags.INGOTS_NETHERITES_DIAMOND).add(ModItems.NETHERITE_DIAMOND_INGOT);
        getOrCreateTagBuilder(ModTags.INGOTS_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.INGOTS_NETHERITES);
        getOrCreateTagBuilder(ModTags.INGOTS_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.INGOTS_NETHERITES_IRON);
        getOrCreateTagBuilder(ModTags.INGOTS_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.INGOTS_NETHERITES_GOLD);
        getOrCreateTagBuilder(ModTags.INGOTS_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.INGOTS_NETHERITES_EMERALD);

        getOrCreateTagBuilder(ModTags.AXES_NETHERITE).add(Items.NETHERITE_AXE);
        getOrCreateTagBuilder(ModTags.AXES_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_AXE);
        getOrCreateTagBuilder(ModTags.AXES_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_AXE);
        getOrCreateTagBuilder(ModTags.AXES_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_AXE);
        getOrCreateTagBuilder(ModTags.AXES_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_AXE);
        getOrCreateTagBuilder(ModTags.AXES_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.AXES_NETHERITE);
        getOrCreateTagBuilder(ModTags.AXES_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.AXES_NETHERITE_IRON);
        getOrCreateTagBuilder(ModTags.AXES_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.AXES_NETHERITE_GOLD);
        getOrCreateTagBuilder(ModTags.AXES_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.AXES_NETHERITE_EMERALD);

        getOrCreateTagBuilder(ModTags.HOES_NETHERITE).add(Items.NETHERITE_HOE);
        getOrCreateTagBuilder(ModTags.HOES_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_HOE);
        getOrCreateTagBuilder(ModTags.HOES_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_HOE);
        getOrCreateTagBuilder(ModTags.HOES_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_HOE);
        getOrCreateTagBuilder(ModTags.HOES_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_HOE);
        getOrCreateTagBuilder(ModTags.HOES_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.HOES_NETHERITE);
        getOrCreateTagBuilder(ModTags.HOES_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.HOES_NETHERITE_IRON);
        getOrCreateTagBuilder(ModTags.HOES_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.HOES_NETHERITE_GOLD);
        getOrCreateTagBuilder(ModTags.HOES_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.HOES_NETHERITE_EMERALD);

        getOrCreateTagBuilder(ModTags.PICKAXES_NETHERITE).add(Items.NETHERITE_PICKAXE);
        getOrCreateTagBuilder(ModTags.PICKAXES_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_PICKAXE);
        getOrCreateTagBuilder(ModTags.PICKAXES_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_PICKAXE);
        getOrCreateTagBuilder(ModTags.PICKAXES_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_PICKAXE);
        getOrCreateTagBuilder(ModTags.PICKAXES_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_PICKAXE);
        getOrCreateTagBuilder(ModTags.PICKAXES_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.PICKAXES_NETHERITE);
        getOrCreateTagBuilder(ModTags.PICKAXES_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.PICKAXES_NETHERITE_IRON);
        getOrCreateTagBuilder(ModTags.PICKAXES_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.PICKAXES_NETHERITE_GOLD);
        getOrCreateTagBuilder(ModTags.PICKAXES_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.PICKAXES_NETHERITE_EMERALD);

        getOrCreateTagBuilder(ModTags.SHOVELS_NETHERITE).add(Items.NETHERITE_SHOVEL);
        getOrCreateTagBuilder(ModTags.SHOVELS_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_SHOVEL);
        getOrCreateTagBuilder(ModTags.SHOVELS_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_SHOVEL);
        getOrCreateTagBuilder(ModTags.SHOVELS_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_SHOVEL);
        getOrCreateTagBuilder(ModTags.SHOVELS_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_SHOVEL);
        getOrCreateTagBuilder(ModTags.SHOVELS_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.SHOVELS_NETHERITE);
        getOrCreateTagBuilder(ModTags.SHOVELS_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.SHOVELS_NETHERITE_IRON);
        getOrCreateTagBuilder(ModTags.SHOVELS_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.SHOVELS_NETHERITE_GOLD);
        getOrCreateTagBuilder(ModTags.SHOVELS_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.SHOVELS_NETHERITE_EMERALD);

        getOrCreateTagBuilder(ModTags.SWORDS_NETHERITE).add(Items.NETHERITE_SWORD);
        getOrCreateTagBuilder(ModTags.SWORDS_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_SWORD);
        getOrCreateTagBuilder(ModTags.SWORDS_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_SWORD);
        getOrCreateTagBuilder(ModTags.SWORDS_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_SWORD);
        getOrCreateTagBuilder(ModTags.SWORDS_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_SWORD);
        getOrCreateTagBuilder(ModTags.SWORDS_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.SWORDS_NETHERITE);
        getOrCreateTagBuilder(ModTags.SWORDS_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.SWORDS_NETHERITE_IRON);
        getOrCreateTagBuilder(ModTags.SWORDS_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.SWORDS_NETHERITE_GOLD);
        getOrCreateTagBuilder(ModTags.SWORDS_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.SWORDS_NETHERITE_EMERALD);

        getOrCreateTagBuilder(ModTags.HELMETS_NETHERITE).add(Items.NETHERITE_HELMET);
        getOrCreateTagBuilder(ModTags.HELMETS_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_HELMET);
        getOrCreateTagBuilder(ModTags.HELMETS_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_HELMET);
        getOrCreateTagBuilder(ModTags.HELMETS_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_HELMET);
        getOrCreateTagBuilder(ModTags.HELMETS_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_HELMET);
        getOrCreateTagBuilder(ModTags.HELMETS_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.HELMETS_NETHERITE);
        getOrCreateTagBuilder(ModTags.HELMETS_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.HELMETS_NETHERITE_IRON);
        getOrCreateTagBuilder(ModTags.HELMETS_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.HELMETS_NETHERITE_GOLD);
        getOrCreateTagBuilder(ModTags.HELMETS_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.HELMETS_NETHERITE_EMERALD);

        getOrCreateTagBuilder(ModTags.CHESTPLATES_NETHERITE).add(Items.NETHERITE_CHESTPLATE);
        getOrCreateTagBuilder(ModTags.CHESTPLATES_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_CHESTPLATE);
        getOrCreateTagBuilder(ModTags.CHESTPLATES_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_CHESTPLATE);
        getOrCreateTagBuilder(ModTags.CHESTPLATES_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_CHESTPLATE);
        getOrCreateTagBuilder(ModTags.CHESTPLATES_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_CHESTPLATE);
        getOrCreateTagBuilder(ModTags.CHESTPLATES_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.CHESTPLATES_NETHERITE);
        getOrCreateTagBuilder(ModTags.CHESTPLATES_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.CHESTPLATES_NETHERITE_IRON);
        getOrCreateTagBuilder(ModTags.CHESTPLATES_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.CHESTPLATES_NETHERITE_GOLD);
        getOrCreateTagBuilder(ModTags.CHESTPLATES_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.CHESTPLATES_NETHERITE_EMERALD);

        getOrCreateTagBuilder(ModTags.LEGGINGS_NETHERITE).add(Items.NETHERITE_LEGGINGS);
        getOrCreateTagBuilder(ModTags.LEGGINGS_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_LEGGINGS);
        getOrCreateTagBuilder(ModTags.LEGGINGS_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_LEGGINGS);
        getOrCreateTagBuilder(ModTags.LEGGINGS_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_LEGGINGS);
        getOrCreateTagBuilder(ModTags.LEGGINGS_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_LEGGINGS);
        getOrCreateTagBuilder(ModTags.LEGGINGS_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.LEGGINGS_NETHERITE);
        getOrCreateTagBuilder(ModTags.LEGGINGS_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.LEGGINGS_NETHERITE_IRON);
        getOrCreateTagBuilder(ModTags.LEGGINGS_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.LEGGINGS_NETHERITE_GOLD);
        getOrCreateTagBuilder(ModTags.LEGGINGS_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.LEGGINGS_NETHERITE_EMERALD);

        getOrCreateTagBuilder(ModTags.BOOTS_NETHERITE).add(Items.NETHERITE_BOOTS);
        getOrCreateTagBuilder(ModTags.BOOTS_NETHERITE_IRON).add(ModItems.NETHERITE_IRON_BOOTS);
        getOrCreateTagBuilder(ModTags.BOOTS_NETHERITE_GOLD).add(ModItems.NETHERITE_GOLD_BOOTS);
        getOrCreateTagBuilder(ModTags.BOOTS_NETHERITE_EMERALD).add(ModItems.NETHERITE_EMERALD_BOOTS);
        getOrCreateTagBuilder(ModTags.BOOTS_NETHERITE_DIAMOND).add(ModItems.NETHERITE_DIAMOND_BOOTS);
        getOrCreateTagBuilder(ModTags.BOOTS_UPGRADE_TO_NETHERITE_IRON).addTag(ModTags.BOOTS_NETHERITE);
        getOrCreateTagBuilder(ModTags.BOOTS_UPGRADE_TO_NETHERITE_GOLD).addTag(ModTags.BOOTS_NETHERITE_IRON);
        getOrCreateTagBuilder(ModTags.BOOTS_UPGRADE_TO_NETHERITE_EMERALD).addTag(ModTags.BOOTS_NETHERITE_GOLD);
        getOrCreateTagBuilder(ModTags.BOOTS_UPGRADE_TO_NETHERITE_DIAMOND).addTag(ModTags.BOOTS_NETHERITE_EMERALD);

        // tiers
        getOrCreateTagBuilder(ModTags.TIERS_ARMOR)
                .addTag(ModTags.TIERS_ARMOR_NETHERITE_IRON)
                .addTag(ModTags.TIERS_ARMOR_NETHERITE_GOLD)
                .addTag(ModTags.TIERS_ARMOR_NETHERITE_EMERALD)
                .addTag(ModTags.TIERS_ARMOR_NETHERITE_DIAMOND);
        getOrCreateTagBuilder(ModTags.TIERS_ARMOR_NETHERITE_IRON)
                .add(ModItems.NETHERITE_IRON_HELMET)
                .add(ModItems.NETHERITE_IRON_CHESTPLATE)
                .add(ModItems.NETHERITE_IRON_LEGGINGS)
                .add(ModItems.NETHERITE_IRON_BOOTS);
        getOrCreateTagBuilder(ModTags.TIERS_ARMOR_NETHERITE_GOLD)
                .add(ModItems.NETHERITE_GOLD_HELMET)
                .add(ModItems.NETHERITE_GOLD_CHESTPLATE)
                .add(ModItems.NETHERITE_GOLD_LEGGINGS)
                .add(ModItems.NETHERITE_GOLD_BOOTS);
        getOrCreateTagBuilder(ModTags.TIERS_ARMOR_NETHERITE_EMERALD)
                .add(ModItems.NETHERITE_EMERALD_HELMET)
                .add(ModItems.NETHERITE_EMERALD_CHESTPLATE)
                .add(ModItems.NETHERITE_EMERALD_LEGGINGS)
                .add(ModItems.NETHERITE_EMERALD_BOOTS);
        getOrCreateTagBuilder(ModTags.TIERS_ARMOR_NETHERITE_DIAMOND)
                .add(ModItems.NETHERITE_DIAMOND_HELMET)
                .add(ModItems.NETHERITE_DIAMOND_CHESTPLATE)
                .add(ModItems.NETHERITE_DIAMOND_LEGGINGS)
                .add(ModItems.NETHERITE_DIAMOND_BOOTS);
        getOrCreateTagBuilder(ModTags.TIERS_TOOLS)
                .addTag(ModTags.TIERS_TOOLS_NETHERITE_IRON)
                .addTag(ModTags.TIERS_TOOLS_NETHERITE_GOLD)
                .addTag(ModTags.TIERS_TOOLS_NETHERITE_EMERALD)
                .addTag(ModTags.TIERS_TOOLS_NETHERITE_DIAMOND);
        getOrCreateTagBuilder(ModTags.TIERS_TOOLS_NETHERITE_IRON)
                .add(ModItems.NETHERITE_IRON_AXE)
                .add(ModItems.NETHERITE_IRON_HOE)
                .add(ModItems.NETHERITE_IRON_PICKAXE)
                .add(ModItems.NETHERITE_IRON_SHOVEL)
                .add(ModItems.NETHERITE_IRON_SWORD);
        getOrCreateTagBuilder(ModTags.TIERS_TOOLS_NETHERITE_GOLD)
                .add(ModItems.NETHERITE_GOLD_AXE)
                .add(ModItems.NETHERITE_GOLD_HOE)
                .add(ModItems.NETHERITE_GOLD_PICKAXE)
                .add(ModItems.NETHERITE_GOLD_SHOVEL)
                .add(ModItems.NETHERITE_GOLD_SWORD);
        getOrCreateTagBuilder(ModTags.TIERS_TOOLS_NETHERITE_EMERALD)
                .add(ModItems.NETHERITE_EMERALD_AXE)
                .add(ModItems.NETHERITE_EMERALD_HOE)
                .add(ModItems.NETHERITE_EMERALD_PICKAXE)
                .add(ModItems.NETHERITE_EMERALD_SHOVEL)
                .add(ModItems.NETHERITE_EMERALD_SWORD);
        getOrCreateTagBuilder(ModTags.TIERS_TOOLS_NETHERITE_DIAMOND)
                .add(ModItems.NETHERITE_DIAMOND_AXE)
                .add(ModItems.NETHERITE_DIAMOND_HOE)
                .add(ModItems.NETHERITE_DIAMOND_PICKAXE)
                .add(ModItems.NETHERITE_DIAMOND_SHOVEL)
                .add(ModItems.NETHERITE_DIAMOND_SWORD);

        // config
        getOrCreateTagBuilder(ModTags.CONFIG_PACIFY_PHANTOMS)
                .addTag(ModTags.TIERS_ARMOR_NETHERITE_IRON);
        getOrCreateTagBuilder(ModTags.CONFIG_PACIFY_PIGLINS)
                .addTag(ModTags.TIERS_ARMOR_NETHERITE_GOLD)
                .addTag(ModTags.TIERS_ARMOR_NETHERITE_DIAMOND);
        getOrCreateTagBuilder(ModTags.CONFIG_PACIFY_ENDERMEN)
                .addTag(ModTags.TIERS_ARMOR_NETHERITE_EMERALD)
                .addTag(ModTags.TIERS_ARMOR_NETHERITE_DIAMOND);


        // Fabric item tags
        getOrCreateTagBuilder(ConventionalItemTags.AXES)
                .add(ModItems.NETHERITE_IRON_AXE)
                .add(ModItems.NETHERITE_GOLD_AXE)
                .add(ModItems.NETHERITE_EMERALD_AXE)
                .add(ModItems.NETHERITE_DIAMOND_AXE);
        getOrCreateTagBuilder(ConventionalItemTags.HOES)
                .add(ModItems.NETHERITE_IRON_HOE)
                .add(ModItems.NETHERITE_GOLD_HOE)
                .add(ModItems.NETHERITE_EMERALD_HOE)
                .add(ModItems.NETHERITE_DIAMOND_HOE);
        getOrCreateTagBuilder(ConventionalItemTags.PICKAXES)
                .add(ModItems.NETHERITE_IRON_PICKAXE)
                .add(ModItems.NETHERITE_GOLD_PICKAXE)
                .add(ModItems.NETHERITE_EMERALD_PICKAXE)
                .add(ModItems.NETHERITE_DIAMOND_PICKAXE);
        getOrCreateTagBuilder(ConventionalItemTags.SHOVELS)
                .add(ModItems.NETHERITE_IRON_SHOVEL)
                .add(ModItems.NETHERITE_GOLD_SHOVEL)
                .add(ModItems.NETHERITE_EMERALD_SHOVEL)
                .add(ModItems.NETHERITE_DIAMOND_SHOVEL);
        getOrCreateTagBuilder(ConventionalItemTags.SWORDS)
                .add(ModItems.NETHERITE_IRON_SWORD)
                .add(ModItems.NETHERITE_GOLD_SWORD)
                .add(ModItems.NETHERITE_EMERALD_SWORD)
                .add(ModItems.NETHERITE_DIAMOND_SWORD);


        // Vanilla item tags
        getOrCreateTagBuilder(ItemTags.BEACON_PAYMENT_ITEMS)
                .addTag(ModTags.NETHERITE_INGOTS);
        getOrCreateTagBuilder(ItemTags.PIGLIN_LOVED)
                .add(ModItems.NETHERITE_GOLD_BLOCK)
                .add(ModItems.NETHERITE_GOLD_INGOT)
                .add(ModItems.NETHERITE_GOLD_HELMET)
                .add(ModItems.NETHERITE_GOLD_CHESTPLATE)
                .add(ModItems.NETHERITE_GOLD_LEGGINGS)
                .add(ModItems.NETHERITE_GOLD_BOOTS)
                .add(ModItems.NETHERITE_GOLD_AXE)
                .add(ModItems.NETHERITE_GOLD_HOE)
                .add(ModItems.NETHERITE_GOLD_PICKAXE)
                .add(ModItems.NETHERITE_GOLD_SHOVEL)
                .add(ModItems.NETHERITE_GOLD_SWORD);
    }
}
