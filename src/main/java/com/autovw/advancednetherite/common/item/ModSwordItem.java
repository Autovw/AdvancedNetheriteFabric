package com.autovw.advancednetherite.common.item;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

/**
 * Author: Autovw
 */
public class ModSwordItem extends SwordItem {
    // Can't use the vanilla classes on Fabric because the constructors are protected. Very nice.
    public ModSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean isFireproof() {
        return true;
    }
}
