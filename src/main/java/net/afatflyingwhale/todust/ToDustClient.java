package net.afatflyingwhale.todust;

import net.afatflyingwhale.todust.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class ToDustClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        //BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FIRE_DUST_CLUSTER, RenderLayer.getCutout());
    }
}
