package net.afatflyingwhale.todust.block;

import com.google.common.collect.ImmutableList;
import net.afatflyingwhale.todust.ToDust;
import net.afatflyingwhale.todust.block.custom.GeodeBuddingBlock;
import net.afatflyingwhale.todust.item.ModItemGroup;
import net.afatflyingwhale.todust.item.ModItems;
import net.afatflyingwhale.todust.sounds.ModBlockSoundGroups;
import net.afatflyingwhale.todust.world.feature.tree.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    // Blocks (Compressed)
    // Metal Blocks
    public static final Block RELIC_IRON_BLOCK = registerBlock("relic_iron_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block RELIC_GOLD_BLOCK = registerBlock("relic_gold_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block MITHRIL_BLOCK = registerBlock("mithril_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block ORICHALCUM_BLOCK = registerBlock("orichalcum_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block ADAMANTINE_BLOCK = registerBlock("adamantine_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroup.TODUST);

    // Raw Ore Blocks
    public static final Block RAW_RELIC_IRON_BLOCK = registerBlock("raw_relic_iron_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block RAW_RELIC_GOLD_BLOCK = registerBlock("raw_relic_gold_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block RAW_MITHRIL_BLOCK = registerBlock("raw_mithril_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block RAW_ORICHALCITE_BLOCK = registerBlock("raw_orichalcite_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block RAW_ADAMANTITE_BLOCK = registerBlock("raw_adamantite_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);

    // Dust Clusters
    // Fire Dust
    public static AmethystClusterBlock FIRE_DUST_CLUSTER = new AmethystClusterBlock(7, 3, FabricBlockSettings.of(Material.AMETHYST, MapColor.BRIGHT_RED).nonOpaque().requiresTool().ticksRandomly().sounds(ModBlockSoundGroups.DUST_CLUSTER).strength(1.5f).luminance((blockState) -> 5));
    public static AmethystClusterBlock LARGE_FIRE_DUST_BUD = new AmethystClusterBlock(5,3, FabricBlockSettings.of(Material.AMETHYST, MapColor.BRIGHT_RED).nonOpaque().requiresTool().ticksRandomly().sounds(ModBlockSoundGroups.LARGE_DUST_BUD).strength(1.5f).luminance((blockState) -> 4));
    public static AmethystClusterBlock MEDIUM_FIRE_DUST_BUD = new AmethystClusterBlock(4,3, FabricBlockSettings.of(Material.AMETHYST, MapColor.BRIGHT_RED).nonOpaque().requiresTool().ticksRandomly().sounds(ModBlockSoundGroups.MEDIUM_DUST_BUD).strength(1.5f).luminance((blockState) -> 2));
    public static AmethystClusterBlock SMALL_FIRE_DUST_BUD = new AmethystClusterBlock(3,4, FabricBlockSettings.of(Material.AMETHYST, MapColor.BRIGHT_RED).nonOpaque().requiresTool().ticksRandomly().sounds(ModBlockSoundGroups.SMALL_DUST_BUD).strength(1.5f).luminance((blockState) -> 1));
    // Air Dust
    public static AmethystClusterBlock AIR_DUST_CLUSTER = new AmethystClusterBlock(7, 3, FabricBlockSettings.of(Material.AMETHYST, MapColor.WHITE).nonOpaque().requiresTool().ticksRandomly().sounds(ModBlockSoundGroups.DUST_CLUSTER).strength(1.5f).luminance((blockState) -> 5));
    public static AmethystClusterBlock LARGE_AIR_DUST_BUD = new AmethystClusterBlock(5,3, FabricBlockSettings.of(Material.AMETHYST, MapColor.WHITE).nonOpaque().requiresTool().ticksRandomly().sounds(ModBlockSoundGroups.LARGE_DUST_BUD).strength(1.5f).luminance((blockState) -> 4));
    public static AmethystClusterBlock MEDIUM_AIR_DUST_BUD = new AmethystClusterBlock(4,3, FabricBlockSettings.of(Material.AMETHYST, MapColor.WHITE).nonOpaque().requiresTool().ticksRandomly().sounds(ModBlockSoundGroups.MEDIUM_DUST_BUD).strength(1.5f).luminance((blockState) -> 2));
    public static AmethystClusterBlock SMALL_AIR_DUST_BUD = new AmethystClusterBlock(3,4, FabricBlockSettings.of(Material.AMETHYST, MapColor.WHITE).nonOpaque().requiresTool().ticksRandomly().sounds(ModBlockSoundGroups.SMALL_DUST_BUD).strength(1.5f).luminance((blockState) -> 1));
    // Earth Dust
    public static AmethystClusterBlock EARTH_DUST_CLUSTER = new AmethystClusterBlock(7, 3, FabricBlockSettings.of(Material.AMETHYST, MapColor.LIME).nonOpaque().requiresTool().ticksRandomly().sounds(ModBlockSoundGroups.DUST_CLUSTER).strength(1.5f).luminance((blockState) -> 5));
    public static AmethystClusterBlock LARGE_EARTH_DUST_BUD = new AmethystClusterBlock(5,3, FabricBlockSettings.of(Material.AMETHYST, MapColor.LIME).nonOpaque().requiresTool().ticksRandomly().sounds(ModBlockSoundGroups.LARGE_DUST_BUD).strength(1.5f).luminance((blockState) -> 4));
    public static AmethystClusterBlock MEDIUM_EARTH_DUST_BUD = new AmethystClusterBlock(4,3, FabricBlockSettings.of(Material.AMETHYST, MapColor.LIME).nonOpaque().requiresTool().ticksRandomly().sounds(ModBlockSoundGroups.MEDIUM_DUST_BUD).strength(1.5f).luminance((blockState) -> 2));
    public static AmethystClusterBlock SMALL_EARTH_DUST_BUD = new AmethystClusterBlock(3,4, FabricBlockSettings.of(Material.AMETHYST, MapColor.LIME).nonOpaque().requiresTool().ticksRandomly().sounds(ModBlockSoundGroups.SMALL_DUST_BUD).strength(1.5f).luminance((blockState) -> 1));
    // Water Dust
    public static AmethystClusterBlock WATER_DUST_CLUSTER = new AmethystClusterBlock(7, 3, FabricBlockSettings.of(Material.AMETHYST, MapColor.BLUE).nonOpaque().requiresTool().ticksRandomly().sounds(ModBlockSoundGroups.DUST_CLUSTER).strength(1.5f).luminance((blockState) -> 5));
    public static AmethystClusterBlock LARGE_WATER_DUST_BUD = new AmethystClusterBlock(5,3, FabricBlockSettings.of(Material.AMETHYST, MapColor.BLUE).nonOpaque().requiresTool().ticksRandomly().sounds(ModBlockSoundGroups.LARGE_DUST_BUD).strength(1.5f).luminance((blockState) -> 4));
    public static AmethystClusterBlock MEDIUM_WATER_DUST_BUD = new AmethystClusterBlock(4,3, FabricBlockSettings.of(Material.AMETHYST, MapColor.BLUE).nonOpaque().requiresTool().ticksRandomly().sounds(ModBlockSoundGroups.MEDIUM_DUST_BUD).strength(1.5f).luminance((blockState) -> 2));
    public static AmethystClusterBlock SMALL_WATER_DUST_BUD = new AmethystClusterBlock(3,4, FabricBlockSettings.of(Material.AMETHYST, MapColor.BLUE).nonOpaque().requiresTool().ticksRandomly().sounds(ModBlockSoundGroups.SMALL_DUST_BUD).strength(1.5f).luminance((blockState) -> 1));
    // Lightning Dust
    public static AmethystClusterBlock LIGHTNING_DUST_CLUSTER = new AmethystClusterBlock(7, 3, FabricBlockSettings.of(Material.AMETHYST, MapColor.YELLOW).nonOpaque().requiresTool().ticksRandomly().sounds(ModBlockSoundGroups.DUST_CLUSTER).strength(1.5f).luminance((blockState) -> 5));
    public static AmethystClusterBlock LARGE_LIGHTNING_DUST_BUD = new AmethystClusterBlock(5,3, FabricBlockSettings.of(Material.AMETHYST, MapColor.YELLOW).nonOpaque().requiresTool().ticksRandomly().sounds(ModBlockSoundGroups.LARGE_DUST_BUD).strength(1.5f).luminance((blockState) -> 4));
    public static AmethystClusterBlock MEDIUM_LIGHTNING_DUST_BUD = new AmethystClusterBlock(4,3, FabricBlockSettings.of(Material.AMETHYST, MapColor.YELLOW).nonOpaque().requiresTool().ticksRandomly().sounds(ModBlockSoundGroups.MEDIUM_DUST_BUD).strength(1.5f).luminance((blockState) -> 2));
    public static AmethystClusterBlock SMALL_LIGHTNING_DUST_BUD = new AmethystClusterBlock(3,4, FabricBlockSettings.of(Material.AMETHYST, MapColor.YELLOW).nonOpaque().requiresTool().ticksRandomly().sounds(ModBlockSoundGroups.SMALL_DUST_BUD).strength(1.5f).luminance((blockState) -> 1));
    // Gravity Dust
    public static AmethystClusterBlock GRAVITY_DUST_CLUSTER = new AmethystClusterBlock(7, 3, FabricBlockSettings.of(Material.AMETHYST, MapColor.BLACK).nonOpaque().requiresTool().ticksRandomly().sounds(ModBlockSoundGroups.DUST_CLUSTER).strength(1.5f).luminance((blockState) -> 5));
    public static AmethystClusterBlock LARGE_GRAVITY_DUST_BUD = new AmethystClusterBlock(5,3, FabricBlockSettings.of(Material.AMETHYST, MapColor.BLACK).nonOpaque().requiresTool().ticksRandomly().sounds(ModBlockSoundGroups.LARGE_DUST_BUD).strength(1.5f).luminance((blockState) -> 4));
    public static AmethystClusterBlock MEDIUM_GRAVITY_DUST_BUD = new AmethystClusterBlock(4,3, FabricBlockSettings.of(Material.AMETHYST, MapColor.BLACK).nonOpaque().requiresTool().ticksRandomly().sounds(ModBlockSoundGroups.MEDIUM_DUST_BUD).strength(1.5f).luminance((blockState) -> 2));
    public static AmethystClusterBlock SMALL_GRAVITY_DUST_BUD = new AmethystClusterBlock(3,4, FabricBlockSettings.of(Material.AMETHYST, MapColor.BLACK).nonOpaque().requiresTool().ticksRandomly().sounds(ModBlockSoundGroups.SMALL_DUST_BUD).strength(1.5f).luminance((blockState) -> 1));

    // Dust Blocks
    public static AmethystBlock FIRE_DUST_BLOCK = new AmethystBlock(FabricBlockSettings.of(Material.AMETHYST, MapColor.BRIGHT_RED).strength(1.5f).sounds(ModBlockSoundGroups.DUST_GEODE).requiresTool());
    public static AmethystBlock AIR_DUST_BLOCK = new AmethystBlock(FabricBlockSettings.of(Material.AMETHYST, MapColor.WHITE).strength(1.5f).sounds(ModBlockSoundGroups.DUST_GEODE).requiresTool());
    public static AmethystBlock EARTH_DUST_BLOCK = new AmethystBlock(FabricBlockSettings.of(Material.AMETHYST, MapColor.LIME).strength(1.5f).sounds(ModBlockSoundGroups.DUST_GEODE).requiresTool());
    public static AmethystBlock WATER_DUST_BLOCK = new AmethystBlock(FabricBlockSettings.of(Material.AMETHYST, MapColor.BLUE).strength(1.5f).sounds(ModBlockSoundGroups.DUST_GEODE).requiresTool());
    public static AmethystBlock LIGHTNING_DUST_BLOCK = new AmethystBlock(FabricBlockSettings.of(Material.AMETHYST, MapColor.YELLOW).strength(1.5f).sounds(ModBlockSoundGroups.DUST_GEODE).requiresTool());
    public static AmethystBlock GRAVITY_DUST_BLOCK = new AmethystBlock(FabricBlockSettings.of(Material.AMETHYST, MapColor.BLACK).strength(1.5f).sounds(ModBlockSoundGroups.DUST_GEODE).requiresTool());
    // Budding Dust Blocks
    public static GeodeBuddingBlock BUDDING_FIRE_DUST = new GeodeBuddingBlock(
            FabricBlockSettings.of(Material.AMETHYST, MapColor.BRIGHT_RED).ticksRandomly().strength(1.5f).sounds(ModBlockSoundGroups.DUST_GEODE).requiresTool(),
            ImmutableList.of(SMALL_FIRE_DUST_BUD, MEDIUM_FIRE_DUST_BUD, LARGE_FIRE_DUST_BUD, FIRE_DUST_CLUSTER));
    public static GeodeBuddingBlock BUDDING_AIR_DUST = new GeodeBuddingBlock(
            FabricBlockSettings.of(Material.AMETHYST, MapColor.WHITE).ticksRandomly().strength(1.5f).sounds(ModBlockSoundGroups.DUST_GEODE).requiresTool(),
            ImmutableList.of(SMALL_AIR_DUST_BUD, MEDIUM_AIR_DUST_BUD, LARGE_AIR_DUST_BUD, AIR_DUST_CLUSTER));
    public static GeodeBuddingBlock BUDDING_EARTH_DUST = new GeodeBuddingBlock(
            FabricBlockSettings.of(Material.AMETHYST, MapColor.LIME).ticksRandomly().strength(1.5f).sounds(ModBlockSoundGroups.DUST_GEODE).requiresTool(),
            ImmutableList.of(SMALL_EARTH_DUST_BUD, MEDIUM_EARTH_DUST_BUD, LARGE_EARTH_DUST_BUD, EARTH_DUST_CLUSTER));
    public static GeodeBuddingBlock BUDDING_WATER_DUST = new GeodeBuddingBlock(
            FabricBlockSettings.of(Material.AMETHYST, MapColor.BLUE).ticksRandomly().strength(1.5f).sounds(ModBlockSoundGroups.DUST_GEODE).requiresTool(),
            ImmutableList.of(SMALL_WATER_DUST_BUD, MEDIUM_WATER_DUST_BUD, LARGE_WATER_DUST_BUD, WATER_DUST_CLUSTER));
    public static GeodeBuddingBlock BUDDING_LIGHTNING_DUST = new GeodeBuddingBlock(
            FabricBlockSettings.of(Material.AMETHYST, MapColor.YELLOW).ticksRandomly().strength(1.5f).sounds(ModBlockSoundGroups.DUST_GEODE).requiresTool(),
            ImmutableList.of(SMALL_LIGHTNING_DUST_BUD, MEDIUM_LIGHTNING_DUST_BUD, LARGE_LIGHTNING_DUST_BUD, LIGHTNING_DUST_CLUSTER));
    public static GeodeBuddingBlock BUDDING_GRAVITY_DUST = new GeodeBuddingBlock(
            FabricBlockSettings.of(Material.AMETHYST, MapColor.BLACK).ticksRandomly().strength(1.5f).sounds(ModBlockSoundGroups.DUST_GEODE).requiresTool(),
            ImmutableList.of(SMALL_GRAVITY_DUST_BUD, MEDIUM_GRAVITY_DUST_BUD, LARGE_GRAVITY_DUST_BUD, GRAVITY_DUST_CLUSTER));


    // Ores & Deepslate Ores
    // Relic Iron
    public static final Block RELIC_IRON_ORE = registerBlock("relic_iron_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.5f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.TODUST);
    public static final Block DEEPSLATE_RELIC_IRON_ORE = registerBlock("deepslate_relic_iron_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.TODUST);
    // Relic Gold
    public static final Block RELIC_GOLD_ORE = registerBlock("relic_gold_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.5f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.TODUST);
    public static final Block DEEPSLATE_RELIC_GOLD_ORE = registerBlock("deepslate_relic_gold_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.TODUST);
    // Mithril
    public static final Block MITHRIL_ORE = registerBlock("mithril_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.5f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.TODUST);
    public static final Block DEEPSLATE_MITHRIL_ORE = registerBlock("deepslate_mithril_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.TODUST);
    // Orichalcite
    public static final Block ORICHALCITE_ORE = registerBlock("orichalcite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.5f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.TODUST);
    public static final Block DEEPSLATE_ORICHALCITE_ORE = registerBlock("deepslate_orichalcite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.TODUST);
    // Adamantite
    public static final Block ADAMANTITE_ORE = registerBlock("adamantite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(1.5f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.TODUST);
    public static final Block DEEPSLATE_ADAMANTITE_ORE = registerBlock("deepslate_adamantite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.TODUST);
    // Trees & Wood
    // Twisted Oak
    public static final Block TWISTED_OAK_LOG = registerBlock("twisted_oak_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).strength(4.0f).requiresTool()), ModItemGroup.TODUST);
    public static final Block TWISTED_OAK_WOOD = registerBlock("twisted_oak_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).strength(4.0f).requiresTool()), ModItemGroup.TODUST);
    public static final Block STRIPPED_TWISTED_OAK_LOG = registerBlock("stripped_twisted_oak_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG).strength(4.0f).requiresTool()), ModItemGroup.TODUST);
    public static final Block STRIPPED_TWISTED_OAK_WOOD = registerBlock("stripped_twisted_oak_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD).strength(4.0f).requiresTool()), ModItemGroup.TODUST);
    public static final Block TWISTED_OAK_PLANKS = registerBlock("twisted_oak_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).strength(4.0f).requiresTool()), ModItemGroup.TODUST);
    public static final Block TWISTED_OAK_LEAVES = registerBlock("twisted_oak_leaves",
            new Block(FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque()), ModItemGroup.TODUST);
    public static final Block TWISTED_OAK_SAPLING = registerBlock("twisted_oak_sapling",
            new SaplingBlock(new TwistedOakSaplingGenerator(),
                    FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ModItemGroup.TODUST);
    // Magebane
    public static final Block MAGEBANE_LOG = registerBlock("magebane_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).strength(4.0f).requiresTool()), ModItemGroup.TODUST);
    public static final Block MAGEBANE_WOOD = registerBlock("magebane_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).strength(4.0f).requiresTool()), ModItemGroup.TODUST);
    public static final Block STRIPPED_MAGEBANE_LOG = registerBlock("stripped_magebane_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG).strength(4.0f).requiresTool()), ModItemGroup.TODUST);
    public static final Block STRIPPED_MAGEBANE_WOOD = registerBlock("stripped_magebane_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD).strength(4.0f).requiresTool()), ModItemGroup.TODUST);
    public static final Block MAGEBANE_PLANKS = registerBlock("magebane_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).strength(4.0f).requiresTool()), ModItemGroup.TODUST);
    public static final Block MAGEBANE_LEAVES = registerBlock("magebane_leaves",
            new Block(FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque()), ModItemGroup.TODUST);
    public static final Block MAGEBANE_SAPLING = registerBlock("magebane_sapling",
            new SaplingBlock(new MagebaneSaplingGenerator(),
                    FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ModItemGroup.TODUST);
    // Pyrewood
    public static final Block PYREWOOD_LOG = registerBlock("pyrewood_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).strength(4.0f).requiresTool()), ModItemGroup.TODUST);
    public static final Block PYREWOOD_WOOD = registerBlock("pyrewood_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).strength(4.0f).requiresTool()), ModItemGroup.TODUST);
    public static final Block STRIPPED_PYREWOOD_LOG = registerBlock("stripped_pyrewood_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG).strength(4.0f).requiresTool()), ModItemGroup.TODUST);
    public static final Block STRIPPED_PYREWOOD_WOOD = registerBlock("stripped_pyrewood_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD).strength(4.0f).requiresTool()), ModItemGroup.TODUST);
    public static final Block PYREWOOD_PLANKS = registerBlock("pyrewood_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).strength(4.0f).requiresTool()), ModItemGroup.TODUST);
    public static final Block PYREWOOD_LEAVES = registerBlock("pyrewood_leaves",
            new Block(FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque()), ModItemGroup.TODUST);
    public static final Block PYREWOOD_SAPLING = registerBlock("pyrewood_sapling",
            new SaplingBlock(new PyrewoodSaplingGenerator(),
                    FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ModItemGroup.TODUST);
    // Wisewillow
    public static final Block WISEWILLOW_LOG = registerBlock("wisewillow_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).strength(4.0f).requiresTool()), ModItemGroup.TODUST);
    public static final Block WISEWILLOW_WOOD = registerBlock("wisewillow_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).strength(4.0f).requiresTool()), ModItemGroup.TODUST);
    public static final Block STRIPPED_WISEWILLOW_LOG = registerBlock("stripped_wisewillow_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG).strength(4.0f).requiresTool()), ModItemGroup.TODUST);
    public static final Block STRIPPED_WISEWILLOW_WOOD = registerBlock("stripped_wisewillow_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD).strength(4.0f).requiresTool()), ModItemGroup.TODUST);
    public static final Block WISEWILLOW_PLANKS = registerBlock("wisewillow_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).strength(4.0f).requiresTool()), ModItemGroup.TODUST);
    public static final Block WISEWILLOW_LEAVES = registerBlock("wisewillow_leaves",
            new Block(FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque()), ModItemGroup.TODUST);
    public static final Block WISEWILLOW_SAPLING = registerBlock("wisewillow_sapling",
            new SaplingBlock(new WisewillowSaplingGenerator(),
                    FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ModItemGroup.TODUST);
    // Black Birch
    public static final Block BLACK_BIRCH_LOG = registerBlock("black_birch_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).strength(4.0f).requiresTool()), ModItemGroup.TODUST);
    public static final Block BLACK_BIRCH_WOOD = registerBlock("black_birch_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).strength(4.0f).requiresTool()), ModItemGroup.TODUST);
    public static final Block STRIPPED_BLACK_BIRCH_LOG = registerBlock("stripped_black_birch_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG).strength(4.0f).requiresTool()), ModItemGroup.TODUST);
    public static final Block STRIPPED_BLACK_BIRCH_WOOD = registerBlock("stripped_black_birch_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD).strength(4.0f).requiresTool()), ModItemGroup.TODUST);
    public static final Block BLACK_BIRCH_PLANKS = registerBlock("black_birch_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).strength(4.0f).requiresTool()), ModItemGroup.TODUST);
    public static final Block BLACK_BIRCH_LEAVES = registerBlock("black_birch_leaves",
            new Block(FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque()), ModItemGroup.TODUST);
    public static final Block BLACK_BIRCH_SAPLING = registerBlock("black_birch_sapling",
            new SaplingBlock(new BlackBirchSaplingGenerator(),
                    FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ModItemGroup.TODUST);
    // Red Heartnut
    public static final Block RED_HEARTNUT_LOG = registerBlock("red_heartnut_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).strength(4.0f).requiresTool()), ModItemGroup.TODUST);
    public static final Block RED_HEARTNUT_WOOD = registerBlock("red_heartnut_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).strength(4.0f).requiresTool()), ModItemGroup.TODUST);
    public static final Block STRIPPED_RED_HEARTNUT_LOG = registerBlock("stripped_red_heartnut_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG).strength(4.0f).requiresTool()), ModItemGroup.TODUST);
    public static final Block STRIPPED_RED_HEARTNUT_WOOD = registerBlock("stripped_red_heartnut_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD).strength(4.0f).requiresTool()), ModItemGroup.TODUST);
    public static final Block RED_HEARTNUT_PLANKS = registerBlock("red_heartnut_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).strength(4.0f).requiresTool()), ModItemGroup.TODUST);
    public static final Block RED_HEARTNUT_LEAVES = registerBlock("red_heartnut_leaves",
            new Block(FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque()), ModItemGroup.TODUST);
    public static final Block RED_HEARTNUT_SAPLING = registerBlock("red_heartnut_sapling",
            new SaplingBlock(new RedHeartnutSaplingGenerator(),
                    FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ModItemGroup.TODUST);

    // MISC BLOCKS
    public static final Block PYRECOAL_BLOCK = registerBlock("pyrecoal_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block GILDED_STEEL_BLOCK = registerBlock("gilded_steel_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block MALICHOR_BLOCK = registerBlock("malichor_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroup.TODUST);

    // PERFECT BLOCKS
        // Resources
    public static final Block PERFECT_COAL_BLOCK = registerBlock("perfect_coal_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block PERFECT_IRON_BLOCK = registerBlock("perfect_iron_block", new Block(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block PERFECT_GOLD_BLOCK = registerBlock("perfect_gold_block", new Block(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block PERFECT_COPPER_BLOCK = registerBlock("perfect_copper_block", new Block(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block PERFECT_DIAMOND_BLOCK = registerBlock("perfect_diamond_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block PERFECT_EMERALD_BLOCK = registerBlock("perfect_emerald_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block PERFECT_REDSTONE_BLOCK = registerBlock("perfect_redstone_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block PERFECT_LAPIS_BLOCK = registerBlock("perfect_lapis_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block PERFECT_NETHERITE_BLOCK = registerBlock("perfect_netherite_block", new Block(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block PERFECT_RELIC_IRON_BLOCK = registerBlock("perfect_relic_iron_block", new Block(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block PERFECT_RELIC_GOLD_BLOCK = registerBlock("perfect_relic_gold_block", new Block(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block PERFECT_MITHRIL_BLOCK = registerBlock("perfect_mithril_block", new Block(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block PERFECT_ORICHALCUM_BLOCK = registerBlock("perfect_orichalcum_block", new Block(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block PERFECT_ADAMANTINE_BLOCK = registerBlock("perfect_adamantine_block", new Block(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block PERFECT_GILDED_STEEL_BLOCK = registerBlock("perfect_gilded_steel_block", new Block(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block PERFECT_MALICHOR_BLOCK = registerBlock("perfect_malichor_block", new Block(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block PERFECT_QUARTZ_BLOCK = registerBlock("perfect_quartz_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block PERFECT_GLOWSTONE_BLOCK = registerBlock("perfect_glowstone_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block PERFECT_AMETHYST_BLOCK = registerBlock("perfect_amethyst_block", new Block(FabricBlockSettings.of(Material.AMETHYST).strength(2f).requiresTool()), ModItemGroup.TODUST);
        // Dust
    public static final Block PERFECT_FIRE_DUST_BLOCK = registerBlock("perfect_fire_dust_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block PERFECT_AIR_DUST_BLOCK = registerBlock("perfect_air_dust_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block PERFECT_EARTH_DUST_BLOCK = registerBlock("perfect_earth_dust_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block PERFECT_WATER_DUST_BLOCK = registerBlock("perfect_water_dust_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block PERFECT_LIGHTNING_DUST_BLOCK = registerBlock("perfect_lightning_dust_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block PERFECT_GRAVITY_DUST_BLOCK = registerBlock("perfect_gravity_dust_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
        // Materials (Compacted)
    public static final Block COMPACT_COBBLESTONE = registerBlock("compact_cobblestone", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block COMPACT_STONE = registerBlock("compact_stone", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block COMPACT_DEEPSLATE = registerBlock("compact_deepslate", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block COMPACT_NETHERRACK = registerBlock("compact_netherrack", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block COMPACT_BLACKSTONE = registerBlock("compact_blackstone", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block COMPACT_BASALT = registerBlock("compact_basalt", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block COMPACT_CALCITE = registerBlock("compact_calcite", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block COMPACT_ANDESITE = registerBlock("compact_andesite", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block COMPACT_GRANITE = registerBlock("compact_granite", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block COMPACT_DIORITE = registerBlock("compact_diorite", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block COMPACT_DIRT = registerBlock("compact_dirt", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block COMPACT_SAND = registerBlock("compact_sand", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block COMPACT_GRAVEL = registerBlock("compact_gravel", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block COMPACT_ICE = registerBlock("compact_ice", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block COMPACT_MUD = registerBlock("compact_mud", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block COMPACT_SOUL_SAND = registerBlock("compact_soul_sand", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block COMPACT_CLAY = registerBlock("compact_clay", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block COMPACT_OBSIDIAN = registerBlock("compact_obsidian", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block COMPACT_END_STONE = registerBlock("compact_end_stone", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
        // Materials (Double Compacted)
    public static final Block DOUBLE_COMPACT_COBBLESTONE = registerBlock("double_compact_cobblestone", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block DOUBLE_COMPACT_STONE = registerBlock("double_compact_stone", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block DOUBLE_COMPACT_DEEPSLATE = registerBlock("double_compact_deepslate", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block DOUBLE_COMPACT_NETHERRACK = registerBlock("double_compact_netherrack", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block DOUBLE_COMPACT_BLACKSTONE = registerBlock("double_compact_blackstone", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block DOUBLE_COMPACT_BASALT = registerBlock("double_compact_basalt", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block DOUBLE_COMPACT_CALCITE = registerBlock("double_compact_calcite", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block DOUBLE_COMPACT_ANDESITE = registerBlock("double_compact_andesite", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block DOUBLE_COMPACT_GRANITE = registerBlock("double_compact_granite", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block DOUBLE_COMPACT_DIORITE = registerBlock("double_compact_diorite", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block DOUBLE_COMPACT_DIRT = registerBlock("double_compact_dirt", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block DOUBLE_COMPACT_SAND = registerBlock("double_compact_sand", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block DOUBLE_COMPACT_GRAVEL = registerBlock("double_compact_gravel", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block DOUBLE_COMPACT_ICE = registerBlock("double_compact_ice", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block DOUBLE_COMPACT_MUD = registerBlock("double_compact_mud", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block DOUBLE_COMPACT_SOUL_SAND = registerBlock("double_compact_soul_sand", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block DOUBLE_COMPACT_CLAY = registerBlock("double_compact_clay", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block DOUBLE_COMPACT_OBSIDIAN = registerBlock("double_compact_obsidian", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);
    public static final Block DOUBLE_COMPACT_END_STONE = registerBlock("double_compact_end_stone", new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.TODUST);


// REGISTRY CODE
    public static void registerDustBlocks() {
        registerBeta("fire_dust_block", FIRE_DUST_BLOCK);
        registerBeta("budding_fire_dust", BUDDING_FIRE_DUST);
        registerBeta("fire_dust_cluster", FIRE_DUST_CLUSTER);
        registerBeta("large_fire_dust_bud", LARGE_FIRE_DUST_BUD);
        registerBeta("medium_fire_dust_bud", MEDIUM_FIRE_DUST_BUD);
        registerBeta("small_fire_dust_bud", SMALL_FIRE_DUST_BUD);

        registerBeta("air_dust_block", AIR_DUST_BLOCK);
        registerBeta("budding_air_dust", BUDDING_AIR_DUST);
        registerBeta("air_dust_cluster", AIR_DUST_CLUSTER);
        registerBeta("large_air_dust_bud", LARGE_AIR_DUST_BUD);
        registerBeta("medium_air_dust_bud", MEDIUM_AIR_DUST_BUD);
        registerBeta("small_air_dust_bud", SMALL_AIR_DUST_BUD);

        registerBeta("earth_dust_block", EARTH_DUST_BLOCK);
        registerBeta("budding_earth_dust", BUDDING_EARTH_DUST);
        registerBeta("earth_dust_cluster", EARTH_DUST_CLUSTER);
        registerBeta("large_earth_dust_bud", LARGE_EARTH_DUST_BUD);
        registerBeta("medium_earth_dust_bud", MEDIUM_EARTH_DUST_BUD);
        registerBeta("small_earth_dust_bud", SMALL_EARTH_DUST_BUD);

        registerBeta("water_dust_block", WATER_DUST_BLOCK);
        registerBeta("budding_water_dust", BUDDING_WATER_DUST);
        registerBeta("water_dust_cluster", WATER_DUST_CLUSTER);
        registerBeta("large_water_dust_bud", LARGE_WATER_DUST_BUD);
        registerBeta("medium_water_dust_bud", MEDIUM_WATER_DUST_BUD);
        registerBeta("small_water_dust_bud", SMALL_WATER_DUST_BUD);

        registerBeta("lightning_dust_block", LIGHTNING_DUST_BLOCK);
        registerBeta("budding_lightning_dust", BUDDING_LIGHTNING_DUST);
        registerBeta("lightning_dust_cluster", LIGHTNING_DUST_CLUSTER);
        registerBeta("large_lightning_dust_bud", LARGE_LIGHTNING_DUST_BUD);
        registerBeta("medium_lightning_dust_bud", MEDIUM_LIGHTNING_DUST_BUD);
        registerBeta("small_lightning_dust_bud", SMALL_LIGHTNING_DUST_BUD);

        registerBeta("gravity_dust_block", GRAVITY_DUST_BLOCK);
        registerBeta("budding_gravity_dust", BUDDING_GRAVITY_DUST);
        registerBeta("gravity_dust_cluster", GRAVITY_DUST_CLUSTER);
        registerBeta("large_gravity_dust_bud", LARGE_GRAVITY_DUST_BUD);
        registerBeta("medium_gravity_dust_bud", MEDIUM_GRAVITY_DUST_BUD);
        registerBeta("small_gravity_dust_bud", SMALL_GRAVITY_DUST_BUD);
    }


// REQUIRED CODE
    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK,
                new Identifier(ToDust.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM,
                new Identifier(ToDust.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    private static void registerBeta(String name, Block block) {
        Registry.register(Registry.BLOCK, new Identifier(ToDust.MOD_ID, name), block);
    }

    public static void registerModBlocks() {
        ToDust.LOGGER.debug("Registering Modblocks for " + ToDust.MOD_ID);
    }
}
