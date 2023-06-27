package com.xiaolin.xiaolib.world.gen.generation;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;

public class ModOreGeneration {

    public static void addOreToTheEnd(RegistryKey<PlacedFeature> key){
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.UNDERGROUND_ORES, key);
    }

    public static void addOreToSoulSandValley(RegistryKey<PlacedFeature> key){
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SOUL_SAND_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, key);
    }

    public static void addOreToBeach(RegistryKey<PlacedFeature> key){
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BEACH),
                GenerationStep.Feature.UNDERGROUND_ORES, key);
    }
}
