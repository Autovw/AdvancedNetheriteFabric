package com.autovw.advancednetherite.common.item;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

/**
 * Author: Autovw
 */
public class AdvancedAxeItem extends AxeItem {
    // Can't use the vanilla classes on Fabric because the constructors are protected. Very nice.
    public AdvancedAxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean isFireproof() {
        return true;
    }
}
