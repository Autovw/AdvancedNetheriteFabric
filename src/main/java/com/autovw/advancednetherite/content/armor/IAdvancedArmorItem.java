package com.autovw.advancednetherite.content.armor;

/**
 * Author: Autovw
 * <br>
 * Reference: {@link com.autovw.advancednetherite.mixin.ArmorItemMixin} and {@link ModArmorItem}
 */
public interface IAdvancedArmorItem {
    default boolean hasKnockbackResistance() {
        return false;
    }
}
