package net.afatflyingwhale.todust.util;

import net.afatflyingwhale.todust.ToDust;
import net.afatflyingwhale.todust.block.ModBlocks;
import net.afatflyingwhale.todust.item.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModRegistries {
    public static void registerModStuff() {
        registerFuels();
    }

    private static void registerFuels() {
        ToDust.LOGGER.info("Registering Fuels for " + ToDust.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.FIRE_DUST_CRYSTAL, 3200);
        registry.add(ModBlocks.FIRE_DUST_BLOCK, 12800);
    }
}
