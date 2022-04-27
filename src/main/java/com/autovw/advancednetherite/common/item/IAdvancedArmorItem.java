package com.autovw.advancednetherite.common.item;

/**
 * Author: Autovw
 * <br>
 * Reference: {@link com.autovw.advancednetherite.mixin.ArmorItemMixin} and {@link AdvancedArmorItem}
 */
public interface IAdvancedArmorItem {
    default boolean hasKnockbackResistance() {
        return false;
    }
}
