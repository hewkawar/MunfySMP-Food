package net.munfysmp.food.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.munfysmp.food.MunfySMPFood;
import net.munfysmp.food.block.crop.CornCropBlock;
import net.munfysmp.food.block.crop.GoldenNeedleMushroomCropBlock;
import net.munfysmp.food.block.crop.MushroomCropBlock;

public class MunfySMPFoodBlocks {

    public static final Block CORN_CROP = registerBlockWithoutItem("corn_crop",
            new CornCropBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque()));
    public static final Block MUSHROOM_CROP = registerBlockWithoutItem("mushroom_crop",
            new MushroomCropBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque()));
    public static final Block GOLDEN_NEEDLE_MUSHROOM_CROP = registerBlockWithoutItem("golden_needle_mushroom_crop",
            new GoldenNeedleMushroomCropBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque()));




    //อย่าไปยุ่งกับมัน
    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(MunfySMPFood.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(MunfySMPFood.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block, ItemGroup tab) {
        Registry.register(Registry.ITEM, new Identifier(MunfySMPFood.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        MunfySMPFood.LOGGER.debug("Registering ModBlocks for " + MunfySMPFood.MOD_ID);
    }
}
