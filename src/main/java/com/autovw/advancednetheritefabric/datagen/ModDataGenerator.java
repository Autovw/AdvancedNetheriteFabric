package com.autovw.advancednetheritefabric.datagen;

import com.autovw.advancednetheritefabric.datagen.providers.ModBlockLootTablesProvider;
import com.autovw.advancednetheritefabric.datagen.providers.ModBlockStatesProvider;
import com.autovw.advancednetheritefabric.datagen.providers.ModBlockTagsProvider;
import com.autovw.advancednetheritefabric.datagen.providers.ModItemTagsProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

/**
 * Author: Autovw
 */
public class ModDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        generator.addProvider(ModBlockStatesProvider::new);
        generator.addProvider(ModBlockLootTablesProvider::new);

        ModBlockTagsProvider blockTagsProvider = generator.addProvider(ModBlockTagsProvider::new);
        generator.addProvider(new ModItemTagsProvider(generator, blockTagsProvider));
    }
}
