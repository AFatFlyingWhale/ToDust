package net.afatflyingwhale.todust.block;

import net.afatflyingwhale.todust.ToDust;
import net.afatflyingwhale.todust.item.ModItemGroup;
import net.afatflyingwhale.todust.world.feature.tree.TwistedOakSaplingGenerator;
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

    // Ore Blocks
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

    // Dust Blocks
    //Fire Dust
    public static final Block FIRE_DUST_BLOCK = registerBlock("fire_dust_block",
            new Block(FabricBlockSettings.of(Material.AMETHYST).strength(1f).requiresTool()), ModItemGroup.TODUST);
    public static final Block BUDDING_FIRE_DUST = registerBlock("budding_fire_dust",
            new Block(FabricBlockSettings.of(Material.AMETHYST).strength(1f).requiresTool()), ModItemGroup.TODUST);
    //Air Dust
    public static final Block AIR_DUST_BLOCK = registerBlock("air_dust_block",
            new Block(FabricBlockSettings.of(Material.AMETHYST).strength(1f).requiresTool()), ModItemGroup.TODUST);
    public static final Block BUDDING_AIR_DUST = registerBlock("budding_air_dust",
            new Block(FabricBlockSettings.of(Material.AMETHYST).strength(1f).requiresTool()), ModItemGroup.TODUST);
    //Earth Dust
    public static final Block EARTH_DUST_BLOCK = registerBlock("earth_dust_block",
            new Block(FabricBlockSettings.of(Material.AMETHYST).strength(1f).requiresTool()), ModItemGroup.TODUST);
    public static final Block BUDDING_EARTH_DUST = registerBlock("budding_earth_dust",
            new Block(FabricBlockSettings.of(Material.AMETHYST).strength(1f).requiresTool()), ModItemGroup.TODUST);
    //Water Dust
    public static final Block WATER_DUST_BLOCK = registerBlock("water_dust_block",
            new Block(FabricBlockSettings.of(Material.AMETHYST).strength(1f).requiresTool()), ModItemGroup.TODUST);
    public static final Block BUDDING_WATER_DUST = registerBlock("budding_water_dust",
            new Block(FabricBlockSettings.of(Material.AMETHYST).strength(1f).requiresTool()), ModItemGroup.TODUST);
    //Lightning Dust
    public static final Block LIGHTNING_DUST_BLOCK = registerBlock("lightning_dust_block",
            new Block(FabricBlockSettings.of(Material.AMETHYST).strength(1f).requiresTool()), ModItemGroup.TODUST);
    public static final Block BUDDING_LIGHTNING_DUST = registerBlock("budding_lightning_dust",
            new Block(FabricBlockSettings.of(Material.AMETHYST).strength(1f).requiresTool()), ModItemGroup.TODUST);
    //Gravity Dust
    public static final Block GRAVITY_DUST_BLOCK = registerBlock("gravity_dust_block",
            new Block(FabricBlockSettings.of(Material.AMETHYST).strength(1f).requiresTool()), ModItemGroup.TODUST);
    public static final Block BUDDING_GRAVITY_DUST = registerBlock("budding_gravity_dust",
            new Block(FabricBlockSettings.of(Material.AMETHYST).strength(1f).requiresTool()), ModItemGroup.TODUST);

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
            new SaplingBlock(new TwistedOakSaplingGenerator(),
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
            new SaplingBlock(new TwistedOakSaplingGenerator(),
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
            new SaplingBlock(new TwistedOakSaplingGenerator(),
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
            new SaplingBlock(new TwistedOakSaplingGenerator(),
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
            new SaplingBlock(new TwistedOakSaplingGenerator(),
                    FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ModItemGroup.TODUST);


    // TEMPORARY TEST BLOCKS
    public static final Block FIRE_DUST_CLUSTER = registerBlock("fire_dust_cluster",
            new Block(FabricBlockSettings.of(Material.AMETHYST).strength(1f).requiresTool().nonOpaque().breakInstantly().collidable(false).luminance(7)), ModItemGroup.TODUST);


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

    public static void registerModBlocks() {
        ToDust.LOGGER.debug("Registering Modblocks for " + ToDust.MOD_ID);
    }
}
