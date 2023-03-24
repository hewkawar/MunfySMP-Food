package net.munfysmp.food.block.crop;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.munfysmp.food.item.MunfySMPFoodItem;

public class GoldenNeedleMushroomCropBlock extends CropBlock {
    public static final IntProperty AGE = IntProperty.of("age",0,6);

    public GoldenNeedleMushroomCropBlock(Settings settings) {super(settings);}

    @Override
    protected ItemConvertible getSeedsItem() { return MunfySMPFoodItem.GOLDEN_NEEDLE_MUSHROOM_SEEDS;}

    @Override
    public int getMaxAge() {return 6;}

    @Override
    public IntProperty getAgeProperty() {return AGE;}

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {builder.add(AGE);}
}