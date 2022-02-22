package com.autovw.advancednetherite.core;

import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

/**
 * Author: Autovw
 */
public enum ModToolTiers implements ToolMaterial {
    NETHERITE_IRON(4, 2281, 11.0F, 4.0F, 15, ModItems.NETHERITE_IRON_INGOT),
    NETHERITE_GOLD(4, 2313, 13.0F, 4.0F, 25, ModItems.NETHERITE_GOLD_INGOT),
    NETHERITE_EMERALD(4, 2651, 15.0F, 5.0F, 20, ModItems.NETHERITE_EMERALD_INGOT),
    NETHERITE_DIAMOND(4, 3092, 17.0F, 5.0F, 15, ModItems.NETHERITE_DIAMOND_INGOT);

    private final float speed, attackDamage;
    private final int level, durability, enchantability;
    private final Item repairIngredient;

    private ModToolTiers(int level, int durability, float speed, float attackDamage, int enchantability, Item repairIngredient) {
        this.level = level;
        this.durability = durability;
        this.speed = speed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.speed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.level;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofStacks(this.repairIngredient.getDefaultStack());
    }
}
