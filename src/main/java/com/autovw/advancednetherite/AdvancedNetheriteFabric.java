package com.autovw.advancednetherite;

import com.autovw.advancednetherite.core.ModBlocks;
import com.autovw.advancednetherite.core.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Author: Autovw
 */
public class AdvancedNetheriteFabric implements ModInitializer {

	// Logger
	public static final Logger LOGGER = LogManager.getLogger();

	// Creative tab thingy
	public static final ItemGroup CREATIVE_TAB = FabricItemGroupBuilder.create(new Identifier(
			Reference.MOD_ID, "tab")).icon(() -> new ItemStack(ModItems.NETHERITE_GOLD_INGOT)).build();

	@Override
	public void onInitialize() {
		ModItems.registerItems();
		ModBlocks.registerBlocks();
	}
}
