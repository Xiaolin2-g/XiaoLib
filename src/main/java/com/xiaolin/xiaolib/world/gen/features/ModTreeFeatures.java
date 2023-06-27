package com.xiaolin.xiaolib.world.gen.features;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ModTreeFeatures {
    
    public static RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> configureTree(String id, TreeFeatureConfig.Builder tree){
        return ConfiguredFeatures.register(id, Feature.TREE, tree.build());
    }

    public static RegistryEntry<PlacedFeature> checkTree(String id, RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> configuredFeature, Block sapling){
        return PlacedFeatures.register(id, configuredFeature, PlacedFeatures.wouldSurvive(sapling));
    }

    public static RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> configureTreeSpawn(String id, RegistryEntry<PlacedFeature> checkedFeature, float spawnChance){
        return ConfiguredFeatures.register(id, Feature.RANDOM_SELECTOR,
                new RandomFeatureConfig(List.of(new RandomFeatureEntry(checkedFeature, spawnChance)),
                        checkedFeature));
    }

    public static RegistryEntry<PlacedFeature> placeTree(String id, RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> spawnedConfiguredFeature, int count, float extraChance, int extraCount){
        return PlacedFeatures.register(id, spawnedConfiguredFeature, VegetationPlacedFeatures.modifiers(
                PlacedFeatures.createCountExtraModifier(count, extraChance, extraCount)));
    }

    public static TreeFeatureConfig.Builder builder(Block log, Block leaves, int baseHeight, int firstRandomHeight, int secondRandomHeight, int radius) {
        return new TreeFeatureConfig.Builder(BlockStateProvider.of(log), new StraightTrunkPlacer(baseHeight, firstRandomHeight, secondRandomHeight), BlockStateProvider.of(leaves), new BlobFoliagePlacer(ConstantIntProvider.create(radius), ConstantIntProvider.create(0), 3), new TwoLayersFeatureSize(1, 0, 1));
    }

    public static TreeFeatureConfig.Builder birch() {
        return builder(Blocks.BIRCH_LOG, Blocks.BIRCH_LEAVES, 5, 2, 0, 2).ignoreVines();
    }
}
