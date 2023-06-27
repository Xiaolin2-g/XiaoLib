package com.xiaolin.xiaolib.world.gen.generation;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;

public class ModPlantGeneration {

    public static void addToFlowerForest(RegistryKey<PlacedFeature> key){
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, key);
    }

    public static void addToBirchForest(RegistryKey<PlacedFeature> key){
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BIRCH_FOREST, BiomeKeys.OLD_GROWTH_BIRCH_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, key);
    }

    public static void addToNether(RegistryKey<PlacedFeature> key){
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),
                GenerationStep.Feature.VEGETAL_DECORATION, key);
    }

    public static void addToEnd(RegistryKey<PlacedFeature> key){
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.VEGETAL_DECORATION, key);
    }

    public static void addToCrimsonForest(RegistryKey<PlacedFeature> key){
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.CRIMSON_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, key);
    }
}
