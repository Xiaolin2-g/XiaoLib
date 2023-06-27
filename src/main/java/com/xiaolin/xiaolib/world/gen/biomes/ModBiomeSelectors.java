package com.xiaolin.xiaolib.world.gen.biomes;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.dimension.DimensionOptions;

import java.util.function.Predicate;

public class ModBiomeSelectors {

    public static Predicate<BiomeSelectionContext> foundInTheOverworldExceptUnderground(){
        return context -> context.canGenerateIn(DimensionOptions.OVERWORLD)
                && !Biome.getCategory(context.getBiomeRegistryEntry()).equals(Biome.Category.UNDERGROUND);
    }

}
