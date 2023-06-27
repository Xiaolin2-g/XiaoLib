package com.xiaolin.xiaolib.item;

import net.minecraft.item.Item;
import org.jetbrains.annotations.Nullable;

public class DontConsumeOnCraftItem extends Item {
    public DontConsumeOnCraftItem(Item.Settings settings) {
        super(settings);
    }

    @Nullable
    @Override
    public Item getRecipeRemainder() {
        return this;
    }

    @Override
    public boolean hasRecipeRemainder() {
        return true;
    }
}
