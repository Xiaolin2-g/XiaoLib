package com.xiaolin.xiaolib.world.gen.features;

import net.minecraft.block.Block;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

import java.util.Arrays;

public class ModSimpleBlockFeatures {

    public static ConfiguredFeature<?,?> configureSimpleBlock(Block block){
        return new ConfiguredFeature(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(
                (BlockStateProvider.of(block))));
    }

    public static PlacedFeature placeSimpleBlock(ConfiguredFeature<?,?> configuredFeature, int blocksPerChunk){
        return new PlacedFeature(RegistryEntry.of(configuredFeature),
                Arrays.asList(
                        CountPlacementModifier.of(blocksPerChunk), // tries per chunk
                        SquarePlacementModifier.of(),
                        PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                        BiomePlacementModifier.of()));
    }
}
