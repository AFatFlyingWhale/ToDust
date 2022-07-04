package net.afatflyingwhale.todust.world.feature;

import net.afatflyingwhale.todust.ToDust;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    //---------------------
    // Trees
    //---------------------
    // Twisted Oak
    public static final RegistryEntry<PlacedFeature> TWISTED_OAK_PLACED = PlacedFeatures.register("twisted_oak_placed",
            ModConfiguredFeatures.TWISTED_OAK_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(0,0.01f,1)));
    // Magebane
    public static final RegistryEntry<PlacedFeature> MAGEBANE_PLACED = PlacedFeatures.register("magebane_placed",
            ModConfiguredFeatures.MAGEBANE_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(0,0.01f,1)));
    // Pyrewood
    public static final RegistryEntry<PlacedFeature> PYREWOOD_PLACED = PlacedFeatures.register("pyrewood_placed",
            ModConfiguredFeatures.PYREWOOD_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(0,0.01f,1)));
    // Wisewillow
    public static final RegistryEntry<PlacedFeature> WISEWILLOW_PLACED = PlacedFeatures.register("wisewillow_placed",
            ModConfiguredFeatures.WISEWILLOW_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(0,0.01f,1)));
    // Black Birch
    public static final RegistryEntry<PlacedFeature> BLACK_BIRCH_PLACED = PlacedFeatures.register("black_birch_placed",
            ModConfiguredFeatures.BLACK_BIRCH_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(0,0.01f,1)));
    // Red Heartnut
    public static final RegistryEntry<PlacedFeature> RED_HEARTNUT_PLACED = PlacedFeatures.register("red_heartnut_placed",
            ModConfiguredFeatures.RED_HEARTNUT_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(0,0.01f,1)));
    //---------------------
    // Ores
    //---------------------
    // Relic Iron
    public static final RegistryEntry<PlacedFeature> RELIC_IRON_PLACED = PlacedFeatures.register("relic_iron_placed",
            ModConfiguredFeatures.RELIC_IRON_ORE, ModOreFeatures.modifiersWithCount(30,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(100))));
    // Relic Gold
    public static final RegistryEntry<PlacedFeature> RELIC_GOLD_PLACED = PlacedFeatures.register("relic_gold_placed",
            ModConfiguredFeatures.RELIC_GOLD_ORE, ModOreFeatures.modifiersWithCount(25,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    // Mithril
    public static final RegistryEntry<PlacedFeature> MITHRIL_PLACED = PlacedFeatures.register("mithril_placed",
            ModConfiguredFeatures.MITHRIL_ORE, ModOreFeatures.modifiersWithCount(10,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    // Orichalcite
    public static final RegistryEntry<PlacedFeature> ORICHALCITE_PLACED = PlacedFeatures.register("orichalcite_placed",
            ModConfiguredFeatures.ORICHALCITE_ORE, ModOreFeatures.modifiersWithCount(7,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-40), YOffset.aboveBottom(40))));
    // Adamantite
    public static final RegistryEntry<PlacedFeature> ADAMANTITE_PLACED = PlacedFeatures.register("adamantite_placed",
            ModConfiguredFeatures.ADAMANTITE_ORE, ModOreFeatures.modifiersWithCount(7,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-40), YOffset.aboveBottom(40))));
    //------------------
    // Geodes
    //------------------
    public static final RegistryEntry<PlacedFeature> FIRE_DUST_GEODE;
    public static final RegistryEntry<PlacedFeature> AIR_DUST_GEODE;
    public static final RegistryEntry<PlacedFeature> EARTH_DUST_GEODE;
    public static final RegistryEntry<PlacedFeature> WATER_DUST_GEODE;
    public static final RegistryEntry<PlacedFeature> LIGHTNING_DUST_GEODE;
    public static final RegistryEntry<PlacedFeature> GRAVITY_DUST_GEODE;

    private static RegistryEntry<PlacedFeature> register(String id, PlacedFeature placedFeature) {
        return BuiltinRegistries.add(BuiltinRegistries.PLACED_FEATURE, new Identifier(ToDust.MOD_ID, id), placedFeature);
    }

    static {
        FIRE_DUST_GEODE = register("fire_dust_geode", new PlacedFeature(ModConfiguredFeatures.FIRE_GEODE,
                List.of(
                        RarityFilterPlacementModifier.of(55),
                        SquarePlacementModifier.of(),
                        HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6), YOffset.fixed(64)),
                        BiomePlacementModifier.of()
                )));
        AIR_DUST_GEODE = register("air_dust_geode", new PlacedFeature(ModConfiguredFeatures.AIR_GEODE,
                List.of(
                        RarityFilterPlacementModifier.of(55),
                        SquarePlacementModifier.of(),
                        HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6), YOffset.fixed(64)),
                        BiomePlacementModifier.of()
                )));
        EARTH_DUST_GEODE = register("earth_dust_geode", new PlacedFeature(ModConfiguredFeatures.EARTH_GEODE,
                List.of(
                        RarityFilterPlacementModifier.of(55),
                        SquarePlacementModifier.of(),
                        HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6), YOffset.fixed(64)),
                        BiomePlacementModifier.of()
                )));
        WATER_DUST_GEODE = register("water_dust_geode", new PlacedFeature(ModConfiguredFeatures.WATER_GEODE,
                List.of(
                        RarityFilterPlacementModifier.of(55),
                        SquarePlacementModifier.of(),
                        HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6), YOffset.fixed(64)),
                        BiomePlacementModifier.of()
                )));
        LIGHTNING_DUST_GEODE = register("lightning_dust_geode", new PlacedFeature(ModConfiguredFeatures.LIGHTNING_GEODE,
                List.of(
                        RarityFilterPlacementModifier.of(55),
                        SquarePlacementModifier.of(),
                        HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6), YOffset.fixed(64)),
                        BiomePlacementModifier.of()
                )));
        GRAVITY_DUST_GEODE = register("gravity_dust_geode", new PlacedFeature(ModConfiguredFeatures.GRAVITY_GEODE,
                List.of(
                        RarityFilterPlacementModifier.of(55),
                        SquarePlacementModifier.of(),
                        HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6), YOffset.fixed(64)),
                        BiomePlacementModifier.of()
                )));
    }


}
