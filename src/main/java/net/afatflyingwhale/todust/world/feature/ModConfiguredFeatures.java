package net.afatflyingwhale.todust.world.feature;

import net.afatflyingwhale.todust.ToDust;
import net.afatflyingwhale.todust.block.ModBlocks;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.ThreeLayersFeatureSize;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.DarkOakFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.BendingTrunkPlacer;
import net.minecraft.world.gen.trunk.DarkOakTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;
import java.util.OptionalInt;

public class ModConfiguredFeatures {
    // TWISTED OAK
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> TWISTED_OAK_TREE =
            ConfiguredFeatures.register("twisted_oak_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.TWISTED_OAK_LOG),
                    new DarkOakTrunkPlacer(6,2,1),
                    BlockStateProvider.of(ModBlocks.TWISTED_OAK_LEAVES),
                    new DarkOakFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0)),
                    new ThreeLayersFeatureSize(1,1, 0, 1,2, OptionalInt.empty())).ignoreVines().build());

    public static final RegistryEntry<PlacedFeature> TWISTED_OAK_CHECKED =
            PlacedFeatures.register("twisted_oak_checked", TWISTED_OAK_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.TWISTED_OAK_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> TWISTED_OAK_SPAWN =
            ConfiguredFeatures.register("twisted_oak_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(TWISTED_OAK_CHECKED, 0.5f)),
                            TWISTED_OAK_CHECKED));


    // MAGEBANE
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> MAGEBANE_TREE =
            ConfiguredFeatures.register("magebane_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.MAGEBANE_LOG),
                    new DarkOakTrunkPlacer(6,2,1),
                    BlockStateProvider.of(ModBlocks.MAGEBANE_LEAVES),
                    new DarkOakFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0)),
                    new ThreeLayersFeatureSize(1,1, 0, 1,2, OptionalInt.empty())).ignoreVines().build());

    public static final RegistryEntry<PlacedFeature> MAGEBANE_CHECKED =
            PlacedFeatures.register("magebane_checked", MAGEBANE_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.MAGEBANE_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> MAGEBANE_SPAWN =
            ConfiguredFeatures.register("magebane_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(MAGEBANE_CHECKED, 0.5f)),
                            MAGEBANE_CHECKED));
    // PYREWOOD

    // WISEWILLOW

    // BLACK BIRCH

    // RED HEARTNUT
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> RED_HEARTNUT_TREE =
            ConfiguredFeatures.register("red_heartnut_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.RED_HEARTNUT_LOG),
                    new DarkOakTrunkPlacer(6,2,1),
                    BlockStateProvider.of(ModBlocks.RED_HEARTNUT_LEAVES),
                    new DarkOakFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0)),
                    new ThreeLayersFeatureSize(1,1, 0, 1,2, OptionalInt.empty())).ignoreVines().build());

    public static final RegistryEntry<PlacedFeature> RED_HEARTNUT_CHECKED =
            PlacedFeatures.register("red_heartnut_checked", RED_HEARTNUT_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.RED_HEARTNUT_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> RED_HEARTNUT_SPAWN =
            ConfiguredFeatures.register("red_heartnut_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(RED_HEARTNUT_CHECKED, 0.5f)),
                            RED_HEARTNUT_CHECKED));

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + ToDust.MOD_ID);
    }

}
