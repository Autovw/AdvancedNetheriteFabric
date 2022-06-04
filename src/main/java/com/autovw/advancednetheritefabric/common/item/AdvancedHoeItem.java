package com.autovw.advancednetheritefabric.common.item;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

/**
 * Author: Autovw
 */
public class AdvancedHoeItem extends HoeItem {
    public AdvancedHoeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean isFireproof() {
        return true;
    }
}
