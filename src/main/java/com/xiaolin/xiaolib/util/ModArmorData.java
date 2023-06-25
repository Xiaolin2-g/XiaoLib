package com.xiaolin.xiaolib.util;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class ModArmorData {

    public String NAME;
    public final int DURABILITY_MULTIPLIER;
    public final int HELMET_PROTECTION;
    public final int CHESTPLATE_PROTECTION;
    public final int LEGGINGS_PROTECTION;
    public final int BOOTS_PROTECTION;
    public final int[] PROTECTION_ARRAY;
    public final int ENCHANTABILITY;
    public final int ARMOR_TOUGHNESS;
    public final int KNOCKBACK_RESISTANCE;
    public final SoundEvent EQUIP_SOUND;
    public final Item REPAIR_INGREDIENT;

    public ModArmorData(String name, int durability_multiplier, int helmet_protection, int chestplate_protection,
                        int leggings_protection, int boots_protection, int enchantability,
                        int armor_toughness, int knockback_resistance, SoundEvent equip_sound,
                        Item repair_ingredient){

        NAME = name;
        DURABILITY_MULTIPLIER = durability_multiplier;
        HELMET_PROTECTION = helmet_protection;
        CHESTPLATE_PROTECTION = chestplate_protection;
        LEGGINGS_PROTECTION = leggings_protection;
        BOOTS_PROTECTION = boots_protection;
        PROTECTION_ARRAY = new int[]{BOOTS_PROTECTION, LEGGINGS_PROTECTION, CHESTPLATE_PROTECTION, HELMET_PROTECTION};
        ENCHANTABILITY = enchantability;
        ARMOR_TOUGHNESS = armor_toughness;
        KNOCKBACK_RESISTANCE = knockback_resistance;
        EQUIP_SOUND = equip_sound;
        REPAIR_INGREDIENT = repair_ingredient;
    }

}
