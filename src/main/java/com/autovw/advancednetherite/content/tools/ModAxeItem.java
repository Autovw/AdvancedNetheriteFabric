package com.autovw.advancednetherite.content.tools;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

/**
 * Author: Autovw
 */
public class ModAxeItem extends AxeItem {
    // Can't use the vanilla classes on Fabric because the constructors are protected. Very nice.
    public ModAxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean isFireproof() {
        return true;
    }
}
