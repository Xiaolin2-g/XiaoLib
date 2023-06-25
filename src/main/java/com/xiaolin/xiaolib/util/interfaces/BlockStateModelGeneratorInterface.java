package com.xiaolin.xiaolib.util.interfaces;

import net.minecraft.block.Block;

public interface BlockStateModelGeneratorInterface {

    void registerSlab(Block baseBlock, Block slabBlock);

    void registerStairs(Block baseBlock, Block stairsBlock);

    void registerWalls(Block baseBlock, Block wallsBlock);
}
