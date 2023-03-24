package net.munfysmp.food;

import net.fabricmc.api.ModInitializer;

import net.munfysmp.food.block.MunfySMPFoodBlocks;
import net.munfysmp.food.item.MunfySMPFoodItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MunfySMPFood implements ModInitializer {
	public static final String MOD_ID = "munfysmp-food";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		MunfySMPFoodItem.registerModItem();
		MunfySMPFoodBlocks.registerModBlocks();

		LOGGER.info("MunfySMPFood Installed!");
	}
}