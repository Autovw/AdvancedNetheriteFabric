package com.autovw.advancednetheritefabric.datagen.providers;

import com.autovw.advancednetheritefabric.Reference;
import com.autovw.advancednetheritefabric.core.registry.ModBlocks;
import com.autovw.advancednetheritefabric.core.registry.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.util.Identifier;

/**
 * Author: Autovw
 */
public class ModBlockStatesProvider extends FabricModelProvider {
    public ModBlockStatesProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHERITE_IRON_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHERITE_GOLD_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHERITE_EMERALD_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHERITE_DIAMOND_BLOCK);

        blockStateModelGenerator.registerParentedItemModel(ModBlocks.NETHERITE_IRON_BLOCK, new Identifier(Reference.MOD_ID, "block/netherite_iron_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.NETHERITE_GOLD_BLOCK, new Identifier(Reference.MOD_ID, "block/netherite_gold_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.NETHERITE_EMERALD_BLOCK, new Identifier(Reference.MOD_ID, "block/netherite_emerald_block"));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.NETHERITE_DIAMOND_BLOCK, new Identifier(Reference.MOD_ID, "block/netherite_diamond_block"));
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.NETHERITE_IRON_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_GOLD_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_EMERALD_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_DIAMOND_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.NETHERITE_IRON_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_IRON_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_IRON_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_IRON_BOOTS, Models.GENERATED);

        itemModelGenerator.register(ModItems.NETHERITE_GOLD_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_GOLD_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_GOLD_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_GOLD_BOOTS, Models.GENERATED);

        itemModelGenerator.register(ModItems.NETHERITE_EMERALD_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_EMERALD_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_EMERALD_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_EMERALD_BOOTS, Models.GENERATED);

        itemModelGenerator.register(ModItems.NETHERITE_DIAMOND_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_DIAMOND_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_DIAMOND_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_DIAMOND_BOOTS, Models.GENERATED);

        itemModelGenerator.register(ModItems.NETHERITE_IRON_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_IRON_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_IRON_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_IRON_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_IRON_SWORD, Models.HANDHELD);

        itemModelGenerator.register(ModItems.NETHERITE_GOLD_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_GOLD_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_GOLD_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_GOLD_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_GOLD_SWORD, Models.HANDHELD);

        itemModelGenerator.register(ModItems.NETHERITE_EMERALD_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_EMERALD_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_EMERALD_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_EMERALD_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_EMERALD_SWORD, Models.HANDHELD);

        itemModelGenerator.register(ModItems.NETHERITE_DIAMOND_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_DIAMOND_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_DIAMOND_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_DIAMOND_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_DIAMOND_SWORD, Models.HANDHELD);
    }
}
