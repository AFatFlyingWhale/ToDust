package net.afatflyingwhale.todust.util;

import net.afatflyingwhale.todust.ToDust;
import net.afatflyingwhale.todust.block.ModBlocks;
import net.afatflyingwhale.todust.item.ModItems;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModRegistries {
    public static void registerModStuff() {

        registerFuels();
        registerFlammableBlock();
        registerStrippables();
    }

    private static void registerFuels() {
        ToDust.LOGGER.info("Registering Fuels for " + ToDust.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.FIRE_DUST_CRYSTAL, 3200);
        registry.add(ModBlocks.FIRE_DUST_BLOCK, 12800);
        // Twisted Oak
        registry.add(ModBlocks.TWISTED_OAK_SAPLING, 100);
        registry.add(ModBlocks.TWISTED_OAK_LEAVES, 100);
        registry.add(ModBlocks.TWISTED_OAK_PLANKS, 300);
        registry.add(ModBlocks.TWISTED_OAK_LOG, 300);
        registry.add(ModBlocks.TWISTED_OAK_WOOD, 300);
        registry.add(ModBlocks.STRIPPED_TWISTED_OAK_LOG, 300);
        registry.add(ModBlocks.STRIPPED_TWISTED_OAK_WOOD, 300);
        // Magebane
        registry.add(ModBlocks.MAGEBANE_SAPLING, 100);
        registry.add(ModBlocks.MAGEBANE_LEAVES, 100);
        registry.add(ModBlocks.MAGEBANE_PLANKS, 300);
        registry.add(ModBlocks.MAGEBANE_LOG, 300);
        registry.add(ModBlocks.MAGEBANE_WOOD, 300);
        registry.add(ModBlocks.STRIPPED_MAGEBANE_LOG, 300);
        registry.add(ModBlocks.STRIPPED_MAGEBANE_WOOD, 300);
        // Pyrewood
        registry.add(ModBlocks.PYREWOOD_SAPLING, 200);
        registry.add(ModBlocks.PYREWOOD_LEAVES, 200);
        registry.add(ModBlocks.PYREWOOD_PLANKS, 600);
        registry.add(ModBlocks.PYREWOOD_LOG, 600);
        registry.add(ModBlocks.PYREWOOD_WOOD, 600);
        registry.add(ModBlocks.STRIPPED_PYREWOOD_LOG, 600);
        registry.add(ModBlocks.STRIPPED_PYREWOOD_WOOD, 600);
        // Wisewillow
        registry.add(ModBlocks.WISEWILLOW_SAPLING, 100);
        registry.add(ModBlocks.WISEWILLOW_LEAVES, 100);
        registry.add(ModBlocks.WISEWILLOW_PLANKS, 300);
        registry.add(ModBlocks.WISEWILLOW_LOG, 300);
        registry.add(ModBlocks.WISEWILLOW_WOOD, 300);
        registry.add(ModBlocks.STRIPPED_WISEWILLOW_LOG, 300);
        registry.add(ModBlocks.STRIPPED_WISEWILLOW_WOOD, 300);
        // Black Birch
        registry.add(ModBlocks.BLACK_BIRCH_SAPLING, 100);
        registry.add(ModBlocks.BLACK_BIRCH_LEAVES, 100);
        registry.add(ModBlocks.BLACK_BIRCH_PLANKS, 300);
        registry.add(ModBlocks.BLACK_BIRCH_LOG, 300);
        registry.add(ModBlocks.BLACK_BIRCH_WOOD, 300);
        registry.add(ModBlocks.STRIPPED_BLACK_BIRCH_LOG, 300);
        registry.add(ModBlocks.STRIPPED_BLACK_BIRCH_WOOD, 300);
        // Red Heartnut
        registry.add(ModBlocks.RED_HEARTNUT_SAPLING, 100);
        registry.add(ModBlocks.RED_HEARTNUT_LEAVES, 100);
        registry.add(ModBlocks.RED_HEARTNUT_PLANKS, 300);
        registry.add(ModBlocks.RED_HEARTNUT_LOG, 300);
        registry.add(ModBlocks.RED_HEARTNUT_WOOD, 300);
        registry.add(ModBlocks.STRIPPED_RED_HEARTNUT_LOG, 300);
        registry.add(ModBlocks.STRIPPED_RED_HEARTNUT_WOOD, 300);

    }

    private static void registerFlammableBlock() {
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();
        // Twisted Oak
        instance.add(ModBlocks.TWISTED_OAK_LOG, 5,5);
        instance.add(ModBlocks.TWISTED_OAK_WOOD, 5,5);
        instance.add(ModBlocks.STRIPPED_TWISTED_OAK_LOG, 5,5);
        instance.add(ModBlocks.STRIPPED_TWISTED_OAK_WOOD, 5,5);
        instance.add(ModBlocks.TWISTED_OAK_PLANKS, 5,20);
        instance.add(ModBlocks.TWISTED_OAK_LEAVES, 30,60);
        // Magebane
        instance.add(ModBlocks.MAGEBANE_LOG, 5,5);
        instance.add(ModBlocks.MAGEBANE_WOOD, 5,5);
        instance.add(ModBlocks.STRIPPED_MAGEBANE_LOG, 5,5);
        instance.add(ModBlocks.STRIPPED_MAGEBANE_WOOD, 5,5);
        instance.add(ModBlocks.MAGEBANE_PLANKS, 5,20);
        instance.add(ModBlocks.MAGEBANE_LEAVES, 30,60);
        // Pyrewood does not burn
        // Wisewillow
        instance.add(ModBlocks.WISEWILLOW_LOG, 5,5);
        instance.add(ModBlocks.WISEWILLOW_WOOD, 5,5);
        instance.add(ModBlocks.STRIPPED_WISEWILLOW_LOG, 5,5);
        instance.add(ModBlocks.STRIPPED_WISEWILLOW_WOOD, 5,5);
        instance.add(ModBlocks.WISEWILLOW_PLANKS, 5,20);
        instance.add(ModBlocks.WISEWILLOW_LEAVES, 30,60);
        // Black Birch
        instance.add(ModBlocks.BLACK_BIRCH_LOG, 5,5);
        instance.add(ModBlocks.BLACK_BIRCH_WOOD, 5,5);
        instance.add(ModBlocks.STRIPPED_BLACK_BIRCH_LOG, 5,5);
        instance.add(ModBlocks.STRIPPED_BLACK_BIRCH_WOOD, 5,5);
        instance.add(ModBlocks.BLACK_BIRCH_PLANKS, 5,20);
        instance.add(ModBlocks.BLACK_BIRCH_LEAVES, 30,60);
        // Red Heartnut
        instance.add(ModBlocks.RED_HEARTNUT_LOG, 5,5);
        instance.add(ModBlocks.RED_HEARTNUT_WOOD, 5,5);
        instance.add(ModBlocks.STRIPPED_RED_HEARTNUT_LOG, 5,5);
        instance.add(ModBlocks.STRIPPED_RED_HEARTNUT_WOOD, 5,5);
        instance.add(ModBlocks.RED_HEARTNUT_PLANKS, 5,20);
        instance.add(ModBlocks.RED_HEARTNUT_LEAVES, 30,60);

    }

    private static void registerStrippables() {
        // Twisted Oak
        StrippableBlockRegistry.register(ModBlocks.TWISTED_OAK_LOG, ModBlocks.STRIPPED_TWISTED_OAK_LOG);
        StrippableBlockRegistry.register(ModBlocks.TWISTED_OAK_WOOD, ModBlocks.STRIPPED_TWISTED_OAK_WOOD);
        // Magebane
        StrippableBlockRegistry.register(ModBlocks.MAGEBANE_LOG, ModBlocks.STRIPPED_MAGEBANE_LOG);
        StrippableBlockRegistry.register(ModBlocks.MAGEBANE_WOOD, ModBlocks.STRIPPED_MAGEBANE_WOOD);
        // Pyrewood
        StrippableBlockRegistry.register(ModBlocks.PYREWOOD_LOG, ModBlocks.STRIPPED_PYREWOOD_LOG);
        StrippableBlockRegistry.register(ModBlocks.PYREWOOD_WOOD, ModBlocks.STRIPPED_PYREWOOD_WOOD);
        // Wisewillow
        StrippableBlockRegistry.register(ModBlocks.WISEWILLOW_LOG, ModBlocks.STRIPPED_WISEWILLOW_LOG);
        StrippableBlockRegistry.register(ModBlocks.WISEWILLOW_WOOD, ModBlocks.STRIPPED_WISEWILLOW_WOOD);
        // Black Birch
        StrippableBlockRegistry.register(ModBlocks.BLACK_BIRCH_LOG, ModBlocks.STRIPPED_BLACK_BIRCH_LOG);
        StrippableBlockRegistry.register(ModBlocks.BLACK_BIRCH_WOOD, ModBlocks.STRIPPED_BLACK_BIRCH_WOOD);
        // Red Heartnut
        StrippableBlockRegistry.register(ModBlocks.RED_HEARTNUT_LOG, ModBlocks.STRIPPED_RED_HEARTNUT_LOG);
        StrippableBlockRegistry.register(ModBlocks.RED_HEARTNUT_WOOD, ModBlocks.STRIPPED_RED_HEARTNUT_WOOD);
    }

}
