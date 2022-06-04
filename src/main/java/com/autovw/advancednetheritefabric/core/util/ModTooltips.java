package com.autovw.advancednetheritefabric.core.util;

import com.autovw.advancednetheritefabric.Reference;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;

/**
 * Author: Autovw
 */
public class ModTooltips {

    public static final TranslatableText endermaskTooltip = tooltip("armor.enderman_passive", Formatting.DARK_GREEN);
    public static final TranslatableText piglinPassiveTooltip = tooltip("armor.piglin_passive", Formatting.GOLD);
    public static final TranslatableText phantomPassiveTooltip = tooltip("armor.phantom_passive", Formatting.GRAY);

    // Helper method used to create tooltips
    private static TranslatableText tooltip(String tooltipName, Formatting tooltipFormat) {
        return (TranslatableText) new TranslatableText("tooltip." + Reference.MOD_ID + "." + tooltipName).formatted(tooltipFormat);
    }
}
