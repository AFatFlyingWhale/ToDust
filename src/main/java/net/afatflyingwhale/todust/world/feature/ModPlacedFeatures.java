package net.afatflyingwhale.todust.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;

public class ModPlacedFeatures {
    //---------------------
    // Trees
    //---------------------
    // Twisted Oak
    public static final RegistryEntry<PlacedFeature> TWISTED_OAK_PLACED = PlacedFeatures.register("twisted_oak_placed",
            ModConfiguredFeatures.TWISTED_OAK_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(1,0.5f,2)));
    // Magebane
    public static final RegistryEntry<PlacedFeature> MAGEBANE_PLACED = PlacedFeatures.register("magebane_placed",
            ModConfiguredFeatures.MAGEBANE_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(1,0.5f,2)));
    // Pyrewood
    public static final RegistryEntry<PlacedFeature> PYREWOOD_PLACED = PlacedFeatures.register("pyrewood_placed",
            ModConfiguredFeatures.PYREWOOD_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(1,0.5f,2)));
    // Wisewillow
    public static final RegistryEntry<PlacedFeature> WISEWILLOW_PLACED = PlacedFeatures.register("wisewillow_placed",
            ModConfiguredFeatures.WISEWILLOW_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(1,0.5f,2)));
    // Black Birch
    public static final RegistryEntry<PlacedFeature> BLACK_BIRCH_PLACED = PlacedFeatures.register("black_birch_placed",
            ModConfiguredFeatures.BLACK_BIRCH_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(1,0.5f,2)));
    // Red Heartnut
    public static final RegistryEntry<PlacedFeature> RED_HEARTNUT_PLACED = PlacedFeatures.register("red_heartnut_placed",
            ModConfiguredFeatures.RED_HEARTNUT_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(1,0.5f,2)));
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
}
