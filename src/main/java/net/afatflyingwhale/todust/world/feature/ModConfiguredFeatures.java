package net.afatflyingwhale.todust.world.feature;

import net.afatflyingwhale.todust.ToDust;
import net.afatflyingwhale.todust.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.ThreeLayersFeatureSize;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.trunk.*;

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
                    new ForkingTrunkPlacer(6,3,2),
                    BlockStateProvider.of(ModBlocks.MAGEBANE_LEAVES),
                    new AcaciaFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0)),
                    new TwoLayersFeatureSize(1,0,2)).ignoreVines().build());

    public static final RegistryEntry<PlacedFeature> MAGEBANE_CHECKED =
            PlacedFeatures.register("magebane_checked", MAGEBANE_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.MAGEBANE_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> MAGEBANE_SPAWN =
            ConfiguredFeatures.register("magebane_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(MAGEBANE_CHECKED, 0.5f)),
                            MAGEBANE_CHECKED));
    // PYREWOOD
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> PYREWOOD_TREE =
            ConfiguredFeatures.register("pyrewood_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.PYREWOOD_LOG),
                    new LargeOakTrunkPlacer(3,11,0),
                    BlockStateProvider.of(ModBlocks.PYREWOOD_LEAVES),
                    new LargeOakFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(4), 4),
                    new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().build());

    public static final RegistryEntry<PlacedFeature> PYREWOOD_CHECKED =
            PlacedFeatures.register("pyrewood_checked", PYREWOOD_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.PYREWOOD_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> PYREWOOD_SPAWN =
            ConfiguredFeatures.register("pyrewood_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(PYREWOOD_CHECKED, 0.5f)),
                            PYREWOOD_CHECKED));
    // WISEWILLOW
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> WISEWILLOW_TREE =
            ConfiguredFeatures.register("wisewillow_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.WISEWILLOW_LOG),
                    new BendingTrunkPlacer(5,2,1,3, UniformIntProvider.create(1, 2)),
                    BlockStateProvider.of(ModBlocks.WISEWILLOW_LEAVES),
                    new RandomSpreadFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(2), 50),
                    new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());

    public static final RegistryEntry<PlacedFeature> WISEWILLOW_CHECKED =
            PlacedFeatures.register("wisewillow_checked", WISEWILLOW_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.WISEWILLOW_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> WISEWILLOW_SPAWN =
            ConfiguredFeatures.register("wisewillow_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(WISEWILLOW_CHECKED, 0.5f)),
                            WISEWILLOW_CHECKED));
    // BLACK BIRCH
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> BLACK_BIRCH_TREE =
            ConfiguredFeatures.register("black_birch_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.BLACK_BIRCH_LOG),
                    new StraightTrunkPlacer(5,2,1),
                    BlockStateProvider.of(ModBlocks.BLACK_BIRCH_LEAVES),
                    new PineFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(1), UniformIntProvider.create(3, 4)),
                    new TwoLayersFeatureSize(4, 3, 2)).ignoreVines().build());

    public static final RegistryEntry<PlacedFeature> BLACK_BIRCH_CHECKED =
            PlacedFeatures.register("black_birch_checked", BLACK_BIRCH_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.BLACK_BIRCH_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> BLACK_BIRCH_SPAWN =
            ConfiguredFeatures.register("black_birch_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(BLACK_BIRCH_CHECKED, 0.5f)),
                            BLACK_BIRCH_CHECKED));
    // RED HEARTNUT
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> RED_HEARTNUT_TREE =
            ConfiguredFeatures.register("red_heartnut_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.RED_HEARTNUT_LOG),
                    new DarkOakTrunkPlacer(8,3,1),
                    BlockStateProvider.of(ModBlocks.RED_HEARTNUT_LEAVES),
                    new DarkOakFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0)),
                    new ThreeLayersFeatureSize(1,2, 0, 1,2, OptionalInt.empty())).ignoreVines().build());

    public static final RegistryEntry<PlacedFeature> RED_HEARTNUT_CHECKED =
            PlacedFeatures.register("red_heartnut_checked", RED_HEARTNUT_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.RED_HEARTNUT_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> RED_HEARTNUT_SPAWN =
            ConfiguredFeatures.register("red_heartnut_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(RED_HEARTNUT_CHECKED, 0.5f)),
                            RED_HEARTNUT_CHECKED));

    //--------------------------------------
    // ORE GENERATION
    //--------------------------------------
    // Relic Iron
    public static final List<OreFeatureConfig.Target> OVERWORLD_RELIC_IRON_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.RELIC_IRON_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.DEEPSLATE_RELIC_IRON_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> RELIC_IRON_ORE =
            ConfiguredFeatures.register("relic_iron_ore",Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_RELIC_IRON_ORES, 9));
    // Relic Gold
    public static final List<OreFeatureConfig.Target> OVERWORLD_RELIC_GOLD_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.RELIC_GOLD_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.DEEPSLATE_RELIC_GOLD_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> RELIC_GOLD_ORE =
            ConfiguredFeatures.register("relic_gold_ore",Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_RELIC_GOLD_ORES, 9));
    // Mithril
    public static final List<OreFeatureConfig.Target> OVERWORLD_MITHRIL_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.MITHRIL_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.DEEPSLATE_MITHRIL_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> MITHRIL_ORE =
            ConfiguredFeatures.register("mithril_ore",Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_MITHRIL_ORES, 5));
    // Orichalcite
    public static final List<OreFeatureConfig.Target> OVERWORLD_ORICHALCITE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.ORICHALCITE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.DEEPSLATE_ORICHALCITE_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ORICHALCITE_ORE =
            ConfiguredFeatures.register("orichalcite_ore",Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_ORICHALCITE_ORES, 3));
    // Adamantite
    public static final List<OreFeatureConfig.Target> OVERWORLD_ADAMANTITE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.ADAMANTITE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.DEEPSLATE_ADAMANTITE_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ADAMANTITE_ORE =
            ConfiguredFeatures.register("adamantite_ore",Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_ADAMANTITE_ORES, 3));
    //------------------
    // GEODES
    //------------------
    public static final RegistryEntry<ConfiguredFeature<?, ?>> FIRE_GEODE;
    public static final RegistryEntry<ConfiguredFeature<?, ?>> AIR_GEODE;
    public static final RegistryEntry<ConfiguredFeature<?, ?>> EARTH_GEODE;
    public static final RegistryEntry<ConfiguredFeature<?, ?>> WATER_GEODE;
    public static final RegistryEntry<ConfiguredFeature<?, ?>> LIGHTNING_GEODE;
    public static final RegistryEntry<ConfiguredFeature<?, ?>> GRAVITY_GEODE;

    private static RegistryEntry<ConfiguredFeature<?, ?>> register(String id, ConfiguredFeature<?, ?> configuredFeature) {
        return BuiltinRegistries.add(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(ToDust.MOD_ID, id), configuredFeature);
    }

    static {
        FIRE_GEODE = register("fire_geode", new ConfiguredFeature<>(Feature.GEODE, new GeodeFeatureConfig
                (
                        new GeodeLayerConfig
                                (
                                        SimpleBlockStateProvider.of(Blocks.AIR.getDefaultState()),
                                        SimpleBlockStateProvider.of(ModBlocks.FIRE_DUST_BLOCK.getDefaultState()),
                                        SimpleBlockStateProvider.of(ModBlocks.BUDDING_FIRE_DUST.getDefaultState()),
                                        SimpleBlockStateProvider.of(Blocks.MAGMA_BLOCK.getDefaultState()),
                                        SimpleBlockStateProvider.of(Blocks.SMOOTH_BASALT.getDefaultState()),
                                        ModBlocks.BUDDING_FIRE_DUST.getClusterStates(),
                                        BlockTags.FEATURES_CANNOT_REPLACE,
                                        BlockTags.GEODE_INVALID_BLOCKS),
                        new GeodeLayerThicknessConfig(1.7D, 2.2D, 3.2D, 4.2D),
                        new GeodeCrackConfig(0.95D, 2.0D, 2),
                        0.35D, 0.083D, true,
                        UniformIntProvider.create(4, 6),
                        UniformIntProvider.create(3, 4),
                        UniformIntProvider.create(1, 2),
                        -16, 16, 0.05D, 1
        )));

        AIR_GEODE = register("air_geode", new ConfiguredFeature<>(Feature.GEODE, new GeodeFeatureConfig
                (
                        new GeodeLayerConfig
                                (
                                        SimpleBlockStateProvider.of(Blocks.AIR.getDefaultState()),
                                        SimpleBlockStateProvider.of(ModBlocks.AIR_DUST_BLOCK.getDefaultState()),
                                        SimpleBlockStateProvider.of(ModBlocks.BUDDING_AIR_DUST.getDefaultState()),
                                        SimpleBlockStateProvider.of(Blocks.TERRACOTTA.getDefaultState()),
                                        SimpleBlockStateProvider.of(Blocks.SMOOTH_SANDSTONE.getDefaultState()),
                                        ModBlocks.BUDDING_AIR_DUST.getClusterStates(),
                                        BlockTags.FEATURES_CANNOT_REPLACE,
                                        BlockTags.GEODE_INVALID_BLOCKS),
                        new GeodeLayerThicknessConfig(1.7D, 2.2D, 3.2D, 4.2D),
                        new GeodeCrackConfig(0.95D, 2.0D, 2),
                        0.35D, 0.083D, true,
                        UniformIntProvider.create(4, 6),
                        UniformIntProvider.create(3, 4),
                        UniformIntProvider.create(1, 2),
                        -16, 16, 0.05D, 1
                )));

        EARTH_GEODE = register("earth_geode", new ConfiguredFeature<>(Feature.GEODE, new GeodeFeatureConfig
                (
                        new GeodeLayerConfig
                                (
                                        SimpleBlockStateProvider.of(Blocks.AIR.getDefaultState()),
                                        SimpleBlockStateProvider.of(ModBlocks.EARTH_DUST_BLOCK.getDefaultState()),
                                        SimpleBlockStateProvider.of(ModBlocks.BUDDING_EARTH_DUST.getDefaultState()),
                                        SimpleBlockStateProvider.of(Blocks.CLAY.getDefaultState()),
                                        SimpleBlockStateProvider.of(Blocks.MUD.getDefaultState()),
                                        ModBlocks.BUDDING_EARTH_DUST.getClusterStates(),
                                        BlockTags.FEATURES_CANNOT_REPLACE,
                                        BlockTags.GEODE_INVALID_BLOCKS),
                        new GeodeLayerThicknessConfig(1.7D, 2.2D, 3.2D, 4.2D),
                        new GeodeCrackConfig(0.95D, 2.0D, 2),
                        0.35D, 0.083D, true,
                        UniformIntProvider.create(4, 6),
                        UniformIntProvider.create(3, 4),
                        UniformIntProvider.create(1, 2),
                        -16, 16, 0.05D, 1
                )));

        WATER_GEODE = register("water_geode", new ConfiguredFeature<>(Feature.GEODE, new GeodeFeatureConfig
                (
                        new GeodeLayerConfig
                                (
                                        SimpleBlockStateProvider.of(Blocks.AIR.getDefaultState()),
                                        SimpleBlockStateProvider.of(ModBlocks.WATER_DUST_BLOCK.getDefaultState()),
                                        SimpleBlockStateProvider.of(ModBlocks.BUDDING_WATER_DUST.getDefaultState()),
                                        SimpleBlockStateProvider.of(Blocks.BLUE_ICE.getDefaultState()),
                                        SimpleBlockStateProvider.of(Blocks.PRISMARINE.getDefaultState()),
                                        ModBlocks.BUDDING_WATER_DUST.getClusterStates(),
                                        BlockTags.FEATURES_CANNOT_REPLACE,
                                        BlockTags.GEODE_INVALID_BLOCKS),
                        new GeodeLayerThicknessConfig(1.7D, 2.2D, 3.2D, 4.2D),
                        new GeodeCrackConfig(0.95D, 2.0D, 2),
                        0.35D, 0.083D, true,
                        UniformIntProvider.create(4, 6),
                        UniformIntProvider.create(3, 4),
                        UniformIntProvider.create(1, 2),
                        -16, 16, 0.05D, 1
                )));

        LIGHTNING_GEODE = register("lightning_geode", new ConfiguredFeature<>(Feature.GEODE, new GeodeFeatureConfig
                (
                        new GeodeLayerConfig
                                (
                                        SimpleBlockStateProvider.of(Blocks.AIR.getDefaultState()),
                                        SimpleBlockStateProvider.of(ModBlocks.LIGHTNING_DUST_BLOCK.getDefaultState()),
                                        SimpleBlockStateProvider.of(ModBlocks.BUDDING_LIGHTNING_DUST.getDefaultState()),
                                        SimpleBlockStateProvider.of(Blocks.TUFF.getDefaultState()),
                                        SimpleBlockStateProvider.of(Blocks.BLACKSTONE.getDefaultState()),
                                        ModBlocks.BUDDING_LIGHTNING_DUST.getClusterStates(),
                                        BlockTags.FEATURES_CANNOT_REPLACE,
                                        BlockTags.GEODE_INVALID_BLOCKS),
                        new GeodeLayerThicknessConfig(1.7D, 2.2D, 3.2D, 4.2D),
                        new GeodeCrackConfig(0.95D, 2.0D, 2),
                        0.35D, 0.083D, true,
                        UniformIntProvider.create(4, 6),
                        UniformIntProvider.create(3, 4),
                        UniformIntProvider.create(1, 2),
                        -16, 16, 0.05D, 1
                )));

        GRAVITY_GEODE = register("gravity_geode", new ConfiguredFeature<>(Feature.GEODE, new GeodeFeatureConfig
                (
                        new GeodeLayerConfig
                                (
                                        SimpleBlockStateProvider.of(Blocks.AIR.getDefaultState()),
                                        SimpleBlockStateProvider.of(ModBlocks.GRAVITY_DUST_BLOCK.getDefaultState()),
                                        SimpleBlockStateProvider.of(ModBlocks.BUDDING_GRAVITY_DUST.getDefaultState()),
                                        SimpleBlockStateProvider.of(Blocks.CALCITE.getDefaultState()),
                                        SimpleBlockStateProvider.of(Blocks.OBSIDIAN.getDefaultState()),
                                        ModBlocks.BUDDING_GRAVITY_DUST.getClusterStates(),
                                        BlockTags.FEATURES_CANNOT_REPLACE,
                                        BlockTags.GEODE_INVALID_BLOCKS),
                        new GeodeLayerThicknessConfig(1.7D, 2.2D, 3.2D, 4.2D),
                        new GeodeCrackConfig(0.95D, 2.0D, 2),
                        0.35D, 0.083D, true,
                        UniformIntProvider.create(4, 6),
                        UniformIntProvider.create(3, 4),
                        UniformIntProvider.create(1, 2),
                        -16, 16, 0.05D, 1
                )));
    }


    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + ToDust.MOD_ID);
    }

}
