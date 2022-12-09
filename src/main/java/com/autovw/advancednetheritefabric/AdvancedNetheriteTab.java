package com.autovw.advancednetheritefabric;

import com.autovw.advancednetheritefabric.core.registry.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

/**
 * @author Autovw
 */
public class AdvancedNetheriteTab {

    /**
     * Creative tab for Advanced Netherite
     */
    public static void registerTab() {
        FabricItemGroup.builder(new Identifier(Reference.MOD_ID, "tab"))
                .icon(() -> new ItemStack(ModItems.NETHERITE_GOLD_INGOT))
                .displayName(Text.translatable("itemGroup." + Reference.MOD_ID + ".tab"))
                .entries((enabledFeatures, entries, operatorEnabled) -> {
                    // Ingots
                    entries.add(ModItems.NETHERITE_IRON_INGOT);
                    entries.add(ModItems.NETHERITE_GOLD_INGOT);
                    entries.add(ModItems.NETHERITE_EMERALD_INGOT);
                    entries.add(ModItems.NETHERITE_DIAMOND_INGOT);

                    // Armor
                    entries.add(ModItems.NETHERITE_IRON_HELMET);
                    entries.add(ModItems.NETHERITE_IRON_CHESTPLATE);
                    entries.add(ModItems.NETHERITE_IRON_LEGGINGS);
                    entries.add(ModItems.NETHERITE_IRON_BOOTS);

                    entries.add(ModItems.NETHERITE_GOLD_HELMET);
                    entries.add(ModItems.NETHERITE_GOLD_CHESTPLATE);
                    entries.add(ModItems.NETHERITE_GOLD_LEGGINGS);
                    entries.add(ModItems.NETHERITE_GOLD_BOOTS);

                    entries.add(ModItems.NETHERITE_EMERALD_HELMET);
                    entries.add(ModItems.NETHERITE_EMERALD_CHESTPLATE);
                    entries.add(ModItems.NETHERITE_EMERALD_LEGGINGS);
                    entries.add(ModItems.NETHERITE_EMERALD_BOOTS);

                    entries.add(ModItems.NETHERITE_DIAMOND_HELMET);
                    entries.add(ModItems.NETHERITE_DIAMOND_CHESTPLATE);
                    entries.add(ModItems.NETHERITE_DIAMOND_LEGGINGS);
                    entries.add(ModItems.NETHERITE_DIAMOND_BOOTS);

                    // Axes
                    entries.add(ModItems.NETHERITE_IRON_AXE);
                    entries.add(ModItems.NETHERITE_GOLD_AXE);
                    entries.add(ModItems.NETHERITE_EMERALD_AXE);
                    entries.add(ModItems.NETHERITE_DIAMOND_AXE);

                    // Hoes
                    entries.add(ModItems.NETHERITE_IRON_HOE);
                    entries.add(ModItems.NETHERITE_GOLD_HOE);
                    entries.add(ModItems.NETHERITE_EMERALD_HOE);
                    entries.add(ModItems.NETHERITE_DIAMOND_HOE);

                    // Pickaxes
                    entries.add(ModItems.NETHERITE_IRON_PICKAXE);
                    entries.add(ModItems.NETHERITE_GOLD_PICKAXE);
                    entries.add(ModItems.NETHERITE_EMERALD_PICKAXE);
                    entries.add(ModItems.NETHERITE_DIAMOND_PICKAXE);

                    // Shovels
                    entries.add(ModItems.NETHERITE_IRON_SHOVEL);
                    entries.add(ModItems.NETHERITE_GOLD_SHOVEL);
                    entries.add(ModItems.NETHERITE_EMERALD_SHOVEL);
                    entries.add(ModItems.NETHERITE_DIAMOND_SHOVEL);

                    // Swords
                    entries.add(ModItems.NETHERITE_IRON_SWORD);
                    entries.add(ModItems.NETHERITE_GOLD_SWORD);
                    entries.add(ModItems.NETHERITE_EMERALD_SWORD);
                    entries.add(ModItems.NETHERITE_DIAMOND_SWORD);

                    // Blocks
                    entries.add(ModItems.NETHERITE_IRON_BLOCK);
                    entries.add(ModItems.NETHERITE_GOLD_BLOCK);
                    entries.add(ModItems.NETHERITE_EMERALD_BLOCK);
                    entries.add(ModItems.NETHERITE_DIAMOND_BLOCK);
                })
                .build();
    }
}
