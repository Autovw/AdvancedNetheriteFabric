package com.autovw.advancednetheritefabric.common.item;

import com.autovw.advancednetheritefabric.core.util.ModTooltips;
import com.autovw.advancednetheritefabric.core.util.ModTags;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Implementation of {@link ArmorItem} which fixes Knockback resistance not applying to armor (See: {@link com.autovw.advancednetheritefabric.mixin.ArmorItemMixin})
 * and compatibility with armor perks added by Advanced Netherite.
 * @since 1.5.0
 * @author Autovw
 */
public class AdvancedArmorItem extends ArmorItem {
    public AdvancedArmorItem(ArmorMaterial material, ArmorItem.Type armorType, Settings settings) {
        super(material, armorType, settings);
    }

    @Override
    public boolean isFireproof() {
        return true;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (pacifyPhantoms(stack)) tooltip.add(ModTooltips.phantomPassiveTooltip);
        if (pacifyPiglins(stack)) tooltip.add(ModTooltips.piglinPassiveTooltip);
        if (pacifyEndermen(stack)) tooltip.add(ModTooltips.endermaskTooltip);
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
}
