package com.autovw.advancednetheritefabric.datagen.providers;

import com.autovw.advancednetheritefabric.core.registry.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

/**
 * Author: Autovw
 */
public class ModBlockLootTablesProvider extends FabricBlockLootTableProvider {
    public ModBlockLootTablesProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.NETHERITE_IRON_BLOCK);
        addDrop(ModBlocks.NETHERITE_GOLD_BLOCK);
        addDrop(ModBlocks.NETHERITE_EMERALD_BLOCK);
        addDrop(ModBlocks.NETHERITE_DIAMOND_BLOCK);
    }
}
