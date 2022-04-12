package com.autovw.advancednetherite.content;

import com.autovw.advancednetherite.Reference;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;

/**
 * Author: Autovw
 */
public class Tooltips {

    public static final TranslatableText endermaskTooltip = tooltip("endermask_armor.perk_one", Formatting.DARK_GREEN);
    public static final TranslatableText piglinPassiveTooltip = tooltip("piglinpassive_armor.perk_one", Formatting.GOLD);
    public static final TranslatableText phantomPassiveTooltip = tooltip("phantompassive_armor.perk_one", Formatting.GRAY);

    // Helper method used to create tooltips
    private static TranslatableText tooltip(String tooltipName, Formatting tooltipFormat) {
        return (TranslatableText) new TranslatableText("tooltip." + Reference.MOD_ID + "." + tooltipName).formatted(tooltipFormat);
    }
}
