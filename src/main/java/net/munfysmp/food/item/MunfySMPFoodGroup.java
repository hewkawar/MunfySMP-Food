package net.munfysmp.food.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.munfysmp.food.MunfySMPFood;

public class MunfySMPFoodGroup {
    public static final ItemGroup FOOD = FabricItemGroupBuilder.build(new Identifier(MunfySMPFood.MOD_ID, "food"), () -> new ItemStack(MunfySMPFoodItem.COOKED_POCK_INTESTINES));
    public static final ItemGroup KITCHENWARE = FabricItemGroupBuilder.build(new Identifier(MunfySMPFood.MOD_ID, "kitchenware"), () -> new ItemStack(MunfySMPFoodItem.KNIFE));
    public static final ItemGroup MATERIAL = FabricItemGroupBuilder.build(new Identifier(MunfySMPFood.MOD_ID, "material"), () -> new ItemStack(MunfySMPFoodItem.PACKAGE));
}
