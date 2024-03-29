package com.autovw.advancednetheritefabric.core.util;

import com.autovw.advancednetheritefabric.Reference;
import com.autovw.advancednetheritefabric.core.registry.ModItems;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

/**
 * @author Autovw
 */
public enum ModArmorTiers implements ArmorMaterial {
    NETHERITE_IRON("netherite_iron", 39, new int[] { 4, 6, 8, 4 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            3.5F, 0.1F, ModItems.NETHERITE_IRON_INGOT),
    NETHERITE_GOLD("netherite_gold", 41, new int[] { 4, 7, 9, 4 }, 25, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            3.5F, 0.1F, ModItems.NETHERITE_GOLD_INGOT),
    NETHERITE_EMERALD("netherite_emerald", 43, new int[] { 4, 7, 9, 4 }, 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            3.5F, 0.1F, ModItems.NETHERITE_EMERALD_INGOT),
    NETHERITE_DIAMOND("netherite_diamond", 47, new int[] { 5, 7, 9, 5 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            4.0F, 0.1F, ModItems.NETHERITE_DIAMOND_INGOT);

    private static final int[] HEALTH_PER_SLOT = new int[] { 13, 15, 16, 11 };
    private final String name;
    private final int durability, enchantability;
    private final int[] slotProtections;
    private final SoundEvent sound;
    private final float toughness, knockbackResistance;
    private final Item repairIngredient;

    private ModArmorTiers(String name, int durability, int[] slotProtections, int enchantability, SoundEvent sound, float toughness, float knockbackResistance, Item repairIngredient) {
        this.name = name;
        this.durability = durability;
        this.slotProtections = slotProtections;
        this.enchantability = enchantability;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability(ArmorItem.Type type) {
        return HEALTH_PER_SLOT[type.getEquipmentSlot().getEntitySlotId()] * this.durability;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return this.slotProtections[type.getEquipmentSlot().getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.sound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofStacks(this.repairIngredient.getDefaultStack());
    }

    @Override
    public String getName() {
        return Reference.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
