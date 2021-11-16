package com.autovw.advancednetherite.content.tools;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

/**
 * Author: Autovw
 */
public class ModHoeItem extends HoeItem {
    // Can't use the vanilla classes on Fabric because the constructors are protected. Very nice.
    public ModHoeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
