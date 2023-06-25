package com.xiaolin.xiaolib.datagen;

import com.xiaolin.xiaolib.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.tag.BlockTags;
import net.minecraft.tag.ItemTags;
import org.jetbrains.annotations.Nullable;

public class ModItemTagsProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagsProvider(FabricDataGenerator dataGenerator, @Nullable FabricTagProvider.BlockTagProvider blockTagProvider) {
        super(dataGenerator, blockTagProvider);
    }

    @Override
    protected void generateTags() {

    }

    protected void taggedAsSlab(){
        copy(BlockTags.SLABS, ItemTags.SLABS);
    }

    protected void taggedAsStairs(){
        copy(BlockTags.STAIRS, ItemTags.STAIRS);
    }

    protected void addToFishTag(Item item){
        getOrCreateTagBuilder(ItemTags.FISHES).add(item);
    }

    protected void addToStoneMaterialsTag(Item item){
        getOrCreateTagBuilder(ItemTags.STONE_CRAFTING_MATERIALS).add(item);
        getOrCreateTagBuilder(ItemTags.STONE_TOOL_MATERIALS).add(item);
    }

    protected void taggedAsTripwireHook(){
        copy(ModTags.Blocks.TRIPWIRE_HOOKS, ModTags.Items.TRIPWIRE_HOOKS);
    }

    protected void addToHoeTag(Item item){
        getOrCreateTagBuilder(ModTags.Items.HOES).add(item);
    }

    protected void addToSwordTag(Item item){
        getOrCreateTagBuilder(ModTags.Items.SWORDS).add(item);
    }
}
