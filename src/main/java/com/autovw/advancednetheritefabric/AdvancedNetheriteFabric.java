package com.autovw.advancednetheritefabric;

import com.autovw.advancednetheritefabric.core.registry.ModBlocks;
import com.autovw.advancednetheritefabric.core.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Author: Autovw
 */
public class AdvancedNetheriteFabric implements ModInitializer {

	// Logger
	public static final Logger LOGGER = LogManager.getLogger();

	@Override
	public void onInitialize() {
		ModItems.registerItems();
		ModBlocks.registerBlocks();
		AdvancedNetheriteTab.registerTab();
	}
}
