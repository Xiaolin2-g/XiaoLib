package com.xiaolin.xiaolib.mixin;

import com.google.gson.JsonElement;
import com.xiaolin.xiaolib.util.interfaces.BlockStateModelGeneratorInterface;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

@Mixin(BlockStateModelGenerator.class)
public abstract class BlockStateModelGeneratorMixin implements BlockStateModelGeneratorInterface {

    @Final
    Consumer<BlockStateSupplier> blockStateCollector;

    @Final
    BiConsumer<Identifier, Supplier<JsonElement>> modelCollector;


    public void registerSlab(Block baseBlock, Block slabBlock) {
        TexturedModel texturedModel = TexturedModel.CUBE_ALL.get(baseBlock);

        Identifier identifier_full = ModelIds.getBlockModelId(baseBlock);
        Identifier identifier_bottom = Models.SLAB.upload(slabBlock, texturedModel.getTextures(), this.modelCollector);
        Identifier identifier_top = Models.SLAB_TOP.upload(slabBlock, texturedModel.getTextures(), this.modelCollector);

        this.blockStateCollector.accept(BlockStateModelGenerator.createSlabBlockState(slabBlock, identifier_bottom, identifier_top, identifier_full));
    }


    public void registerStairs(Block baseBlock, Block stairsBlock) {
        TexturedModel texturedModel = TexturedModel.CUBE_ALL.get(baseBlock);

        Identifier identifier_inner = Models.INNER_STAIRS.upload(stairsBlock, texturedModel.getTextures(), this.modelCollector);
        Identifier identifier_full = Models.STAIRS.upload(stairsBlock, texturedModel.getTextures(), this.modelCollector);
        Identifier identifier_outer = Models.OUTER_STAIRS.upload(stairsBlock, texturedModel.getTextures(), this.modelCollector);

        this.blockStateCollector.accept(BlockStateModelGenerator.createStairsBlockState(stairsBlock, identifier_inner, identifier_full, identifier_outer));
    }

    public void registerWalls(Block baseBlock, Block wallsBlock) {
        TexturedModel texturedModel = TexturedModel.CUBE_ALL.get(baseBlock);
        Identifier identifier_post = Models.TEMPLATE_WALL_POST.upload(wallsBlock, texturedModel.getTextures(), this.modelCollector);
        Identifier identifier_side = Models.TEMPLATE_WALL_SIDE.upload(wallsBlock, texturedModel.getTextures(), this.modelCollector);
        Identifier identifier_side_tall = Models.TEMPLATE_WALL_SIDE_TALL.upload(wallsBlock, texturedModel.getTextures(), this.modelCollector);
        Identifier identifier_inventory = Models.WALL_INVENTORY.upload(wallsBlock, texturedModel.getTextures(), this.modelCollector);

        this.blockStateCollector.accept(BlockStateModelGenerator.createWallBlockState(wallsBlock, identifier_post, identifier_side, identifier_side_tall));
        ((BlockStateModelGenerator) (Object) this).registerParentedItemModel(wallsBlock, identifier_inventory);
    }

}