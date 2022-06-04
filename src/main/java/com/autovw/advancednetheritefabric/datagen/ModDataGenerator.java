package com.autovw.advancednetheritefabric.datagen;

import com.autovw.advancednetheritefabric.datagen.providers.ModBlockStatesProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

/**
 * Author: Autovw
 */
public class ModDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        generator.addProvider(ModBlockStatesProvider::new);
    }
}
