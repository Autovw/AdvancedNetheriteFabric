package com.autovw.advancednetherite.content.armor;

import com.autovw.advancednetherite.content.Tooltips;
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
public class NetheriteEmeraldArmorItem extends ModArmorItem {
    public NetheriteEmeraldArmorItem(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Tooltips.endermaskTooltip);
    }
}
