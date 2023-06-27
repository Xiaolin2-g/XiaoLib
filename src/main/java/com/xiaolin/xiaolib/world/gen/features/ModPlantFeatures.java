package com.xiaolin.xiaolib.world.gen.features;

import net.minecraft.block.Block;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.CountMultilayerPlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

import java.util.List;

public class ModPlantFeatures {

    public static RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> configureFlower(String id, Block flower){

        return ConfiguredFeatures.register(
                id, Feature.FLOWER,
                new RandomPatchFeatureConfig(12, 6, 2, // i: tries, j: x and z spread, k: y spread
                        PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig
                                (BlockStateProvider.of(flower)))));
    }

    public static RegistryEntry<PlacedFeature> placeFlower(String id, RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> configuredFeature, int triesPerChunk){
        return PlacedFeatures.register(id, configuredFeature,
                List.of(
                        RarityFilterPlacementModifier.of(triesPerChunk), // tries per chunk
                        SquarePlacementModifier.of(),
                        PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                        BiomePlacementModifier.of()));
    }

    public static RegistryEntry<PlacedFeature> placeTulip(String id, RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> configuredFeature){
        return placeFlower(id, configuredFeature, 16);
    }

    public static RegistryEntry<ConfiguredFeature<NetherForestVegetationFeatureConfig, ?>> configureSprouts(String id, Block sprouts){

        return ConfiguredFeatures.register
                (id, Feature.NETHER_FOREST_VEGETATION,
                        new NetherForestVegetationFeatureConfig
                                (BlockStateProvider.of(sprouts),
                                        8, 4));
    }

    public static RegistryEntry<PlacedFeature> placeSprouts(String id, RegistryEntry<ConfiguredFeature<NetherForestVegetationFeatureConfig,?>> configuredFeature){
        return PlacedFeatures.register(id, configuredFeature,
                CountMultilayerPlacementModifier.of(4),
                BiomePlacementModifier.of());
    }
}
