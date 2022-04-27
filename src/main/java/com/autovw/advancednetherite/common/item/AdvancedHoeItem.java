package com.autovw.advancednetherite.common.item;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

/**
 * Author: Autovw
 */
public class AdvancedHoeItem extends HoeItem {
    // Can't use the vanilla classes on Fabric because the constructors are protected. Very nice.
    public AdvancedHoeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean isFireproof() {
        return true;
    }
}
