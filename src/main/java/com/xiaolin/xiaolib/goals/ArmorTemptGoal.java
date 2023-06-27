package com.xiaolin.xiaolib.goals;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.TemptGoal;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;

public class ArmorTemptGoal extends TemptGoal {

    public Ingredient armor;

    public ArmorTemptGoal(PathAwareEntity entity, double speed, Ingredient armor, boolean canBeScared) {
        super(entity, speed, armor, canBeScared);
        this.armor = armor;
    }

    @Override
    protected boolean isTemptedBy(LivingEntity entity) {
        Iterable<ItemStack> iterableArmor = entity.getArmorItems();

        for (ItemStack itemStack : iterableArmor){

            if(!armor.test(itemStack)) continue;
            return true;

        }

        return false;
    }
}
