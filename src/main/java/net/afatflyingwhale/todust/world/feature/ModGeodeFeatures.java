package net.afatflyingwhale.todust.world.feature;

import net.afatflyingwhale.todust.tags.ModBiomeTags;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

import java.util.Objects;

public class ModGeodeFeatures {

    public static void placeGeodesInBiomes() {
        BiomeModifications.addFeature
                (
                    BiomeSelectors.tag(ModBiomeTags.HAS_FIRE_GEODE),
                    GenerationStep.Feature.UNDERGROUND_DECORATION,
                    Objects.requireNonNull(ModPlacedFeatures.FIRE_DUST_GEODE.getKey().orElse(null))
                );
        BiomeModifications.addFeature
                (
                        BiomeSelectors.tag(ModBiomeTags.HAS_AIR_GEODE),
                        GenerationStep.Feature.UNDERGROUND_DECORATION,
                        Objects.requireNonNull(ModPlacedFeatures.AIR_DUST_GEODE.getKey().orElse(null))
                );
        BiomeModifications.addFeature
                (
                        BiomeSelectors.tag(ModBiomeTags.HAS_EARTH_GEODE),
                        GenerationStep.Feature.UNDERGROUND_DECORATION,
                        Objects.requireNonNull(ModPlacedFeatures.EARTH_DUST_GEODE.getKey().orElse(null))
                );
        BiomeModifications.addFeature
                (
                        BiomeSelectors.tag(ModBiomeTags.HAS_WATER_GEODE),
                        GenerationStep.Feature.UNDERGROUND_DECORATION,
                        Objects.requireNonNull(ModPlacedFeatures.WATER_DUST_GEODE.getKey().orElse(null))
                );
        BiomeModifications.addFeature
                (
                        BiomeSelectors.tag(ModBiomeTags.HAS_LIGHTNING_GEODE),
                        GenerationStep.Feature.UNDERGROUND_DECORATION,
                        Objects.requireNonNull(ModPlacedFeatures.LIGHTNING_DUST_GEODE.getKey().orElse(null))
                );
        BiomeModifications.addFeature
                (
                        BiomeSelectors.tag(ModBiomeTags.HAS_GRAVITY_GEODE),
                        GenerationStep.Feature.UNDERGROUND_DECORATION,
                        Objects.requireNonNull(ModPlacedFeatures.GRAVITY_DUST_GEODE.getKey().orElse(null))
                );
    }
}
