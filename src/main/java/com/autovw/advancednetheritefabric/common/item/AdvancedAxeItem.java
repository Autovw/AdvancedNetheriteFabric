package com.autovw.advancednetheritefabric.common.item;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

/**
 * Author: Autovw
 */
public class AdvancedAxeItem extends AxeItem {
    public AdvancedAxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean isFireproof() {
        return true;
    }
}
