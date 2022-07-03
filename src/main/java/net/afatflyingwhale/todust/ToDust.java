package net.afatflyingwhale.todust;

import net.afatflyingwhale.todust.block.ModBlocks;
import net.afatflyingwhale.todust.item.ModItems;
import net.afatflyingwhale.todust.util.ModRegistries;
import net.afatflyingwhale.todust.world.feature.ModConfiguredFeatures;
import net.afatflyingwhale.todust.world.gen.ModWorldGen;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ToDust implements ModInitializer {
	public static final String MOD_ID = "todust";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModRegistries.registerModStuff();

		ModWorldGen.generateModWorldGen();
	}
}
