package net.afatflyingwhale.todust.block;

import net.afatflyingwhale.todust.ToDust;
import net.afatflyingwhale.todust.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
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
