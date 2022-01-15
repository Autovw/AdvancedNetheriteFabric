package com.autovw.advancednetherite.content.armor;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;

/**
 * Author: Autovw
 */
public class ModArmorItem extends ArmorItem implements IAdvancedArmorItem {
    public ModArmorItem(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }

    @Override
    public boolean isFireproof() {
        return true;
    }

    @Override
    public boolean hasKnockbackResistance() {
        return getMaterial().getKnockbackResistance() > 0;
    }
}
