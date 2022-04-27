package com.autovw.advancednetherite.core;

import com.autovw.advancednetherite.Reference;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

/**
 * Author: Autovw
 */
public class ModTags {
    // BLOCK TAGS
    public static final TagKey<Block> NETHERITE_BLOCKS = blockTag("netherite_blocks");

    private static TagKey<Block> blockTag(String path) {
        return TagKey.of(Registry.BLOCK_KEY, new Identifier(Reference.MOD_ID, path));
    }

    // ITEM TAGS
    public static final TagKey<Item> NETHERITE_INGOTS = itemTag("netherite_ingots");
    public static final TagKey<Item> UPGRADE_TO_NETHERITE_DIAMOND = itemTag("upgrade_to_netherite_diamond");
    public static final TagKey<Item> UPGRADE_TO_NETHERITE_EMERALD = itemTag("upgrade_to_netherite_emerald");
    public static final TagKey<Item> UPGRADE_TO_NETHERITE_GOLD = itemTag("upgrade_to_netherite_gold");
    public static final TagKey<Item> UPGRADE_TO_NETHERITE_IRON = itemTag("upgrade_to_netherite_iron");

    public static final TagKey<Item> AXES_NETHERITE_DIAMOND = itemTag("axes/netherite_diamond");
    public static final TagKey<Item> AXES_NETHERITE_EMERALD = itemTag("axes/netherite_emerald");
    public static final TagKey<Item> AXES_NETHERITE_GOLD = itemTag("axes/netherite_gold");
    public static final TagKey<Item> AXES_NETHERITE_IRON = itemTag("axes/netherite_iron");
    public static final TagKey<Item> AXES_NETHERITE = itemTag("axes/netherite");
    public static final TagKey<Item> AXES_UPGRADE_TO_NETHERITE_DIAMOND = itemTag("axes/upgrade_to_netherite_diamond");
    public static final TagKey<Item> AXES_UPGRADE_TO_NETHERITE_EMERALD = itemTag("axes/upgrade_to_netherite_emerald");
    public static final TagKey<Item> AXES_UPGRADE_TO_NETHERITE_GOLD = itemTag("axes/upgrade_to_netherite_gold");
    public static final TagKey<Item> AXES_UPGRADE_TO_NETHERITE_IRON = itemTag("axes/upgrade_to_netherite_iron");

    public static final TagKey<Item> BOOTS_NETHERITE_DIAMOND = itemTag("boots/netherite_diamond");
    public static final TagKey<Item> BOOTS_NETHERITE_EMERALD = itemTag("boots/netherite_emerald");
    public static final TagKey<Item> BOOTS_NETHERITE_GOLD = itemTag("boots/netherite_gold");
    public static final TagKey<Item> BOOTS_NETHERITE_IRON = itemTag("boots/netherite_iron");
    public static final TagKey<Item> BOOTS_NETHERITE = itemTag("boots/netherite");
    public static final TagKey<Item> BOOTS_UPGRADE_TO_NETHERITE_DIAMOND = itemTag("boots/upgrade_to_netherite_diamond");
    public static final TagKey<Item> BOOTS_UPGRADE_TO_NETHERITE_EMERALD = itemTag("boots/upgrade_to_netherite_emerald");
    public static final TagKey<Item> BOOTS_UPGRADE_TO_NETHERITE_GOLD = itemTag("boots/upgrade_to_netherite_gold");
    public static final TagKey<Item> BOOTS_UPGRADE_TO_NETHERITE_IRON = itemTag("boots/upgrade_to_netherite_iron");

    public static final TagKey<Item> CHESTPLATES_NETHERITE_DIAMOND = itemTag("chestplates/netherite_diamond");
    public static final TagKey<Item> CHESTPLATES_NETHERITE_EMERALD = itemTag("chestplates/netherite_emerald");
    public static final TagKey<Item> CHESTPLATES_NETHERITE_GOLD = itemTag("chestplates/netherite_gold");
    public static final TagKey<Item> CHESTPLATES_NETHERITE_IRON = itemTag("chestplates/netherite_iron");
    public static final TagKey<Item> CHESTPLATES_NETHERITE = itemTag("chestplates/netherite");
    public static final TagKey<Item> CHESTPLATES_UPGRADE_TO_NETHERITE_DIAMOND = itemTag("chestplates/upgrade_to_netherite_diamond");
    public static final TagKey<Item> CHESTPLATES_UPGRADE_TO_NETHERITE_EMERALD = itemTag("chestplates/upgrade_to_netherite_emerald");
    public static final TagKey<Item> CHESTPLATES_UPGRADE_TO_NETHERITE_GOLD = itemTag("chestplates/upgrade_to_netherite_gold");
    public static final TagKey<Item> CHESTPLATES_UPGRADE_TO_NETHERITE_IRON = itemTag("chestplates/upgrade_to_netherite_iron");

    public static final TagKey<Item> HELMETS_NETHERITE_DIAMOND = itemTag("helmets/netherite_diamond");
    public static final TagKey<Item> HELMETS_NETHERITE_EMERALD = itemTag("helmets/netherite_emerald");
    public static final TagKey<Item> HELMETS_NETHERITE_GOLD = itemTag("helmets/netherite_gold");
    public static final TagKey<Item> HELMETS_NETHERITE_IRON = itemTag("helmets/netherite_iron");
    public static final TagKey<Item> HELMETS_NETHERITE = itemTag("helmets/netherite");
    public static final TagKey<Item> HELMETS_UPGRADE_TO_NETHERITE_DIAMOND = itemTag("helmets/upgrade_to_netherite_diamond");
    public static final TagKey<Item> HELMETS_UPGRADE_TO_NETHERITE_EMERALD = itemTag("helmets/upgrade_to_netherite_emerald");
    public static final TagKey<Item> HELMETS_UPGRADE_TO_NETHERITE_GOLD = itemTag("helmets/upgrade_to_netherite_gold");
    public static final TagKey<Item> HELMETS_UPGRADE_TO_NETHERITE_IRON = itemTag("helmets/upgrade_to_netherite_iron");

    public static final TagKey<Item> HOES_NETHERITE_DIAMOND = itemTag("hoes/netherite_diamond");
    public static final TagKey<Item> HOES_NETHERITE_EMERALD = itemTag("hoes/netherite_emerald");
    public static final TagKey<Item> HOES_NETHERITE_GOLD = itemTag("hoes/netherite_gold");
    public static final TagKey<Item> HOES_NETHERITE_IRON = itemTag("hoes/netherite_iron");
    public static final TagKey<Item> HOES_NETHERITE = itemTag("hoes/netherite");
    public static final TagKey<Item> HOES_UPGRADE_TO_NETHERITE_DIAMOND = itemTag("hoes/upgrade_to_netherite_diamond");
    public static final TagKey<Item> HOES_UPGRADE_TO_NETHERITE_EMERALD = itemTag("hoes/upgrade_to_netherite_emerald");
    public static final TagKey<Item> HOES_UPGRADE_TO_NETHERITE_GOLD = itemTag("hoes/upgrade_to_netherite_gold");
    public static final TagKey<Item> HOES_UPGRADE_TO_NETHERITE_IRON = itemTag("hoes/upgrade_to_netherite_iron");

    public static final TagKey<Item> INGOTS_NETHERITES_DIAMOND = itemTag("ingots/netherites_diamond");
    public static final TagKey<Item> INGOTS_NETHERITES_EMERALD = itemTag("ingots/netherites_emerald");
    public static final TagKey<Item> INGOTS_NETHERITES_GOLD = itemTag("ingots/netherites_gold");
    public static final TagKey<Item> INGOTS_NETHERITES_IRON = itemTag("ingots/netherites_iron");
    public static final TagKey<Item> INGOTS_NETHERITES = itemTag("ingots/netherites");
    public static final TagKey<Item> INGOTS_UPGRADE_TO_NETHERITE_DIAMOND = itemTag("ingots/upgrade_to_netherite_diamond");
    public static final TagKey<Item> INGOTS_UPGRADE_TO_NETHERITE_EMERALD = itemTag("ingots/upgrade_to_netherite_emerald");
    public static final TagKey<Item> INGOTS_UPGRADE_TO_NETHERITE_GOLD = itemTag("ingots/upgrade_to_netherite_gold");
    public static final TagKey<Item> INGOTS_UPGRADE_TO_NETHERITE_IRON = itemTag("ingots/upgrade_to_netherite_iron");

    public static final TagKey<Item> LEGGINGS_NETHERITE_DIAMOND = itemTag("leggings/netherite_diamond");
    public static final TagKey<Item> LEGGINGS_NETHERITE_EMERALD = itemTag("leggings/netherite_emerald");
    public static final TagKey<Item> LEGGINGS_NETHERITE_GOLD = itemTag("leggings/netherite_gold");
    public static final TagKey<Item> LEGGINGS_NETHERITE_IRON = itemTag("leggings/netherite_iron");
    public static final TagKey<Item> LEGGINGS_NETHERITE = itemTag("leggings/netherite");
    public static final TagKey<Item> LEGGINGS_UPGRADE_TO_NETHERITE_DIAMOND = itemTag("leggings/upgrade_to_netherite_diamond");
    public static final TagKey<Item> LEGGINGS_UPGRADE_TO_NETHERITE_EMERALD = itemTag("leggings/upgrade_to_netherite_emerald");
    public static final TagKey<Item> LEGGINGS_UPGRADE_TO_NETHERITE_GOLD = itemTag("leggings/upgrade_to_netherite_gold");
    public static final TagKey<Item> LEGGINGS_UPGRADE_TO_NETHERITE_IRON = itemTag("leggings/upgrade_to_netherite_iron");

    public static final TagKey<Item> PICKAXES_NETHERITE_DIAMOND = itemTag("pickaxes/netherite_diamond");
    public static final TagKey<Item> PICKAXES_NETHERITE_EMERALD = itemTag("pickaxes/netherite_emerald");
    public static final TagKey<Item> PICKAXES_NETHERITE_GOLD = itemTag("pickaxes/netherite_gold");
    public static final TagKey<Item> PICKAXES_NETHERITE_IRON = itemTag("pickaxes/netherite_iron");
    public static final TagKey<Item> PICKAXES_NETHERITE = itemTag("pickaxes/netherite");
    public static final TagKey<Item> PICKAXES_UPGRADE_TO_NETHERITE_DIAMOND = itemTag("pickaxes/upgrade_to_netherite_diamond");
    public static final TagKey<Item> PICKAXES_UPGRADE_TO_NETHERITE_EMERALD = itemTag("pickaxes/upgrade_to_netherite_emerald");
    public static final TagKey<Item> PICKAXES_UPGRADE_TO_NETHERITE_GOLD = itemTag("pickaxes/upgrade_to_netherite_gold");
    public static final TagKey<Item> PICKAXES_UPGRADE_TO_NETHERITE_IRON = itemTag("pickaxes/upgrade_to_netherite_iron");

    public static final TagKey<Item> SHOVELS_NETHERITE_DIAMOND = itemTag("shovels/netherite_diamond");
    public static final TagKey<Item> SHOVELS_NETHERITE_EMERALD = itemTag("shovels/netherite_emerald");
    public static final TagKey<Item> SHOVELS_NETHERITE_GOLD = itemTag("shovels/netherite_gold");
    public static final TagKey<Item> SHOVELS_NETHERITE_IRON = itemTag("shovels/netherite_iron");
    public static final TagKey<Item> SHOVELS_NETHERITE = itemTag("shovels/netherite");
    public static final TagKey<Item> SHOVELS_UPGRADE_TO_NETHERITE_DIAMOND = itemTag("shovels/upgrade_to_netherite_diamond");
    public static final TagKey<Item> SHOVELS_UPGRADE_TO_NETHERITE_EMERALD = itemTag("shovels/upgrade_to_netherite_emerald");
    public static final TagKey<Item> SHOVELS_UPGRADE_TO_NETHERITE_GOLD = itemTag("shovels/upgrade_to_netherite_gold");
    public static final TagKey<Item> SHOVELS_UPGRADE_TO_NETHERITE_IRON = itemTag("shovels/upgrade_to_netherite_iron");

    public static final TagKey<Item> SWORDS_NETHERITE_DIAMOND = itemTag("swords/netherite_diamond");
    public static final TagKey<Item> SWORDS_NETHERITE_EMERALD = itemTag("swords/netherite_emerald");
    public static final TagKey<Item> SWORDS_NETHERITE_GOLD = itemTag("swords/netherite_gold");
    public static final TagKey<Item> SWORDS_NETHERITE_IRON = itemTag("swords/netherite_iron");
    public static final TagKey<Item> SWORDS_NETHERITE = itemTag("swords/netherite");
    public static final TagKey<Item> SWORDS_UPGRADE_TO_NETHERITE_DIAMOND = itemTag("swords/upgrade_to_netherite_diamond");
    public static final TagKey<Item> SWORDS_UPGRADE_TO_NETHERITE_EMERALD = itemTag("swords/upgrade_to_netherite_emerald");
    public static final TagKey<Item> SWORDS_UPGRADE_TO_NETHERITE_GOLD = itemTag("swords/upgrade_to_netherite_gold");
    public static final TagKey<Item> SWORDS_UPGRADE_TO_NETHERITE_IRON = itemTag("swords/upgrade_to_netherite_iron");

    // "tiers" tags
    public static final TagKey<Item> TIERS_ARMOR = itemTag("tiers/armor");
    public static final TagKey<Item> TIERS_TOOLS = itemTag("tiers/tools");

    public static final TagKey<Item> TIERS_ARMOR_NETHERITE_DIAMOND = itemTag("tiers/armor/netherite_diamond");
    public static final TagKey<Item> TIERS_ARMOR_NETHERITE_EMERALD = itemTag("tiers/armor/netherite_emerald");
    public static final TagKey<Item> TIERS_ARMOR_NETHERITE_GOLD = itemTag("tiers/armor/netherite_gold");
    public static final TagKey<Item> TIERS_ARMOR_NETHERITE_IRON = itemTag("tiers/armor/netherite_iron");

    public static final TagKey<Item> TIERS_TOOLS_NETHERITE_DIAMOND = itemTag("tiers/tools/netherite_diamond");
    public static final TagKey<Item> TIERS_TOOLS_NETHERITE_EMERALD = itemTag("tiers/tools/netherite_emerald");
    public static final TagKey<Item> TIERS_TOOLS_NETHERITE_GOLD = itemTag("tiers/tools/netherite_gold");
    public static final TagKey<Item> TIERS_TOOLS_NETHERITE_IRON = itemTag("tiers/tools/netherite_iron");

    private static TagKey<Item> itemTag(String path) {
        return TagKey.of(Registry.ITEM_KEY, new Identifier(Reference.MOD_ID, path));
    }
}
