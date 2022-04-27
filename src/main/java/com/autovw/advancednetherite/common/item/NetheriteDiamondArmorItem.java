package com.autovw.advancednetherite.common.item;

import com.autovw.advancednetherite.common.Tooltips;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

/**
 * Author: Autovw
 */
public class NetheriteDiamondArmorItem extends ModArmorItem {
    public NetheriteDiamondArmorItem(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Tooltips.endermaskTooltip);
        tooltip.add(Tooltips.piglinPassiveTooltip);
    }
}
