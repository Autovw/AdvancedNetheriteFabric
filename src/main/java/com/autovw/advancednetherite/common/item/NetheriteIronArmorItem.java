package com.autovw.advancednetherite.common.item;

import com.autovw.advancednetherite.common.Tooltips;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Author: Autovw
 */
public class NetheriteIronArmorItem extends ModArmorItem {
    public NetheriteIronArmorItem(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Tooltips.phantomPassiveTooltip);
    }
}
