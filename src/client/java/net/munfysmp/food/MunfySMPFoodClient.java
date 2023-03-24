package net.munfysmp.food;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.munfysmp.food.block.MunfySMPFoodBlocks;

public class MunfySMPFoodClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(MunfySMPFoodBlocks.CORN_CROP, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MunfySMPFoodBlocks.MUSHROOM_CROP, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(MunfySMPFoodBlocks.GOLDEN_NEEDLE_MUSHROOM_CROP, RenderLayer.getCutout());
	}
}