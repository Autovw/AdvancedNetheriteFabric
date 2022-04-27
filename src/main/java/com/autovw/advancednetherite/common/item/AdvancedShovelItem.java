package com.autovw.advancednetherite.common.item;

import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

/**
 * Author: Autovw
 */
public class AdvancedShovelItem extends ShovelItem {
    // Can't use the vanilla classes on Fabric because the constructors are protected. Very nice.
    public AdvancedShovelItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean isFireproof() {
        return true;
    }
}
