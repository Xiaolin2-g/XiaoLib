package com.xiaolin.xiaolib.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.impl.datagen.FabricTagBuilder;
import net.minecraft.block.Block;
import net.minecraft.tag.BlockTags;

public class ModBlockTagsProvider extends FabricTagProvider.BlockTagProvider {

    public ModBlockTagsProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateTags() {

    }

    protected void addToPickaxeTag(Block block){
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
    }

    protected void addToAxeTag(Block block){
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE).add(block);
    }

    protected void addToShovelTag(Block block){
        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE).add(block);
    }

    protected void addToHoeTag(Block block){
        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE).add(block);
    }

    protected void addToSoulSpeedBlocksTag(Block block){
        getOrCreateTagBuilder(BlockTags.SOUL_SPEED_BLOCKS).add(block);
    }

    protected void addToNeedsStoneToolTag(Block block){
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL).add(block);
    }

    protected void addToNeedsIronToolTag(Block block){
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL).add(block);
    }

    protected void addToNeedsDiamondToolTag(Block block){
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL).add(block);
    }

    protected void addToSlabsTag(Block block){
        getOrCreateTagBuilder(BlockTags.SLABS).add(block);
    }

    protected void addToStairsTag(Block block){
        getOrCreateTagBuilder(BlockTags.STAIRS).add(block);
    }

    protected void addToWallsTag(Block block){
        getOrCreateTagBuilder(BlockTags.WALLS).add(block);
    }

    protected void addToSmallFlowersTag(Block block){
        getOrCreateTagBuilder(BlockTags.SMALL_FLOWERS).add(block);
    }

    protected void addToSoulFireBaseTag(Block block){
        getOrCreateTagBuilder(BlockTags.SOUL_FIRE_BASE_BLOCKS).add(block);
    }

    protected void addToInfiniburnTag(Block block){
        getOrCreateTagBuilder(BlockTags.INFINIBURN_OVERWORLD).add(block);
        getOrCreateTagBuilder(BlockTags.INFINIBURN_NETHER).add(block);
        getOrCreateTagBuilder(BlockTags.INFINIBURN_END).add(block);
    }

    protected void addToLeavesTag(Block block){
        getOrCreateTagBuilder(BlockTags.LEAVES).add(block);
    }
}
