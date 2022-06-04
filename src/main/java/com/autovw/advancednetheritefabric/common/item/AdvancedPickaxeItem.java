package com.autovw.advancednetheritefabric.common.item;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

/**
 * Author: Autovw
 */
public class AdvancedPickaxeItem extends PickaxeItem {
    public AdvancedPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean isFireproof() {
        return true;
    }
}
