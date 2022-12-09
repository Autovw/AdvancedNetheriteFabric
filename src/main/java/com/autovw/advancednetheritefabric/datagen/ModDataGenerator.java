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
        FabricDataGenerator.Pack pack = generator.createPack();

        pack.addProvider(ModBlockStatesProvider::new);
        pack.addProvider(ModBlockLootTablesProvider::new);

        pack.addProvider(ModBlockTagsProvider::new);
        pack.addProvider(ModItemTagsProvider::new);
    }
}
