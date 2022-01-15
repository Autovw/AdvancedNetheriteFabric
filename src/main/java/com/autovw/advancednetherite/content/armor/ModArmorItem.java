package com.autovw.advancednetherite.content.armor;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;

/**
 * Author: Autovw
 */
public class ModArmorItem extends ArmorItem {
    public ModArmorItem(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }

    @Override
    public boolean isFireproof() {
        return true;
    }
}
