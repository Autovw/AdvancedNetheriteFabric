package com.autovw.advancednetheritefabric.common.item;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

/**
 * Author: Autovw
 */
public class AdvancedSwordItem extends SwordItem {
    public AdvancedSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean isFireproof() {
        return true;
    }
}
