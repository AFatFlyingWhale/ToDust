package net.afatflyingwhale.todust.world.gen;

import net.afatflyingwhale.todust.world.feature.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;

public class ModTreeGeneration {
    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.TWISTED_OAK_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.MAGEBANE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PYREWOOD_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.WISEWILLOW_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BLACK_BIRCH_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.RED_HEARTNUT_PLACED.getKey().get());
    }
}
