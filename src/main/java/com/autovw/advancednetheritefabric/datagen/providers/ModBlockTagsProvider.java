package com.autovw.advancednetheritefabric.datagen.providers;

import com.autovw.advancednetheritefabric.core.registry.ModBlocks;
import com.autovw.advancednetheritefabric.core.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

/**
 * Author: Autovw
 */
public class ModBlockTagsProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagsProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(dataOutput, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        // Mod block tags
        getOrCreateTagBuilder(ModTags.NETHERITE_BLOCKS)
                .add(ModBlocks.NETHERITE_IRON_BLOCK)
                .add(ModBlocks.NETHERITE_GOLD_BLOCK)
                .add(ModBlocks.NETHERITE_EMERALD_BLOCK)
                .add(ModBlocks.NETHERITE_DIAMOND_BLOCK);


        // Vanilla block tags
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .addTag(ModTags.NETHERITE_BLOCKS);
        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
                .addTag(ModTags.NETHERITE_BLOCKS);
        getOrCreateTagBuilder(BlockTags.GUARDED_BY_PIGLINS)
                .add(ModBlocks.NETHERITE_GOLD_BLOCK);
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .addTag(ModTags.NETHERITE_BLOCKS);
    }
}
