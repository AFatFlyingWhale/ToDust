package net.afatflyingwhale.todust;

import net.afatflyingwhale.todust.block.Cutouts;
import net.afatflyingwhale.todust.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class ToDustClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ToDust.LOGGER.info("Beginning To Dust client initialization");
        Cutouts.registerCutouts();
        ToDust.LOGGER.info("To Dust client initialized!");
        //BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FIRE_DUST_GLASS, RenderLayer.getTranslucent());

    }
}
