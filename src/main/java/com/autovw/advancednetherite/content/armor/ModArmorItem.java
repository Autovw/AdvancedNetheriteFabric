package com.autovw.advancednetherite.content.armor;

import com.autovw.advancednetherite.content.Tooltips;
import com.autovw.advancednetherite.core.ModTags;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

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
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (pacifyPhantoms(stack)) tooltip.add(Tooltips.phantomPassiveTooltip);
        if (pacifyPiglins(stack)) tooltip.add(Tooltips.piglinPassiveTooltip);
        if (pacifyEndermen(stack)) tooltip.add(Tooltips.endermaskTooltip);
    }

    public boolean pacifyPhantoms(ItemStack stack) {
        return stack.isIn(ModTags.CONFIG_PACIFY_PHANTOMS);
    }

    public boolean pacifyPiglins(ItemStack stack) {
        return stack.isIn(ModTags.CONFIG_PACIFY_PIGLINS);
    }

    public boolean pacifyEndermen(ItemStack stack) {
        return stack.isIn(ModTags.CONFIG_PACIFY_ENDERMEN);
    }

    @Override
    public boolean hasKnockbackResistance() {
        return getMaterial().getKnockbackResistance() > 0;
    }
}
