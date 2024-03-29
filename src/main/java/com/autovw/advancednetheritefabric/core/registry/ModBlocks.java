package com.autovw.advancednetheritefabric.core.registry;

import com.autovw.advancednetheritefabric.Reference;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

/**
 * @author Autovw
 */
public final class ModBlocks {

    // Blocks
    public static final Block NETHERITE_IRON_BLOCK = new Block(FabricBlockSettings.copy(Blocks.NETHERITE_BLOCK));
    public static final Block NETHERITE_GOLD_BLOCK = new Block(FabricBlockSettings.copy(Blocks.NETHERITE_BLOCK));
    public static final Block NETHERITE_EMERALD_BLOCK = new Block(FabricBlockSettings.copy(Blocks.NETHERITE_BLOCK));
    public static final Block NETHERITE_DIAMOND_BLOCK = new Block(FabricBlockSettings.copy(Blocks.NETHERITE_BLOCK));

    public static void registerBlocks() {
        Registry.register(Registries.BLOCK, new Identifier(Reference.MOD_ID, "netherite_iron_block"), NETHERITE_IRON_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(Reference.MOD_ID, "netherite_gold_block"), NETHERITE_GOLD_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(Reference.MOD_ID, "netherite_emerald_block"), NETHERITE_EMERALD_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(Reference.MOD_ID, "netherite_diamond_block"), NETHERITE_DIAMOND_BLOCK);
    }
}
