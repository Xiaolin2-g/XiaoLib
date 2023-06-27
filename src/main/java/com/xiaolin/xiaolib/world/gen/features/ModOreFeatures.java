package com.xiaolin.xiaolib.world.gen.features;

import net.minecraft.block.Block;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

import java.util.List;

public class ModOreFeatures {

    public static RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> configureOre(String id, RuleTest ruleTest,
                                                                                     Block block, int veinSize){
        return ConfiguredFeatures.register
                (id, Feature.ORE,
                        new OreFeatureConfig(
                                ruleTest,
                                block.getDefaultState(),
                                veinSize));
    }


    public static RegistryEntry<PlacedFeature> placeOre(String id, RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> configuredFeature,
                                                        int veinsPerChunk, YOffset bottomYLevel, YOffset topYLevel){

        return PlacedFeatures.register(
                id, configuredFeature, List.of(
                        CountPlacementModifier.of(veinsPerChunk), // number of veins per chunk
                        SquarePlacementModifier.of(), // spreading horizontally
                        HeightRangePlacementModifier.uniform(bottomYLevel, topYLevel))); // bottom Y level, top Y level
    }

}
