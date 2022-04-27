package com.autovw.advancednetherite.common.item;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

/**
 * Author: Autovw
 */
public class AdvancedPickaxeItem extends PickaxeItem {
    // Can't use the vanilla classes on Fabric because the constructors are protected. Very nice.
    public AdvancedPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean isFireproof() {
        return true;
    }
}
