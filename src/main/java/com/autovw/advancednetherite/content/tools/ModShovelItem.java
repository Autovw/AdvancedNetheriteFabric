package com.autovw.advancednetherite.content.tools;

import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

/**
 * Author: Autovw
 */
public class ModShovelItem extends ShovelItem {
    // Can't use the vanilla classes on Fabric because the constructors are protected. Very nice.
    public ModShovelItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean isFireproof() {
        return true;
    }
}
