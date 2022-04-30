package com.autovw.advancednetherite.common;

import com.autovw.advancednetherite.Reference;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

/**
 * Author: Autovw
 */
public class Tooltips {

    public static final MutableText endermaskTooltip = tooltip("armor.enderman_passive", Formatting.DARK_GREEN);
    public static final MutableText piglinPassiveTooltip = tooltip("armor.piglin_passive", Formatting.GOLD);
    public static final MutableText phantomPassiveTooltip = tooltip("armor.phantom_passive", Formatting.GRAY);

    // Helper method used to create tooltips
    private static MutableText tooltip(String tooltipName, Formatting tooltipFormat) {
        return Text.translatable("tooltip." + Reference.MOD_ID + "." + tooltipName).formatted(tooltipFormat);
    }
}
