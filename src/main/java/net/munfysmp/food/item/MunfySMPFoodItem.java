package net.munfysmp.food.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.munfysmp.food.MunfySMPFood;
import net.munfysmp.food.block.MunfySMPFoodBlocks;

public class MunfySMPFoodItem {
    //เครื่องครัว
    public static final Item KNIFE = registerItem("knife" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.KITCHENWARE).maxCount(1)));
    public static final Item FORK = registerItem("fork" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.KITCHENWARE)));
    public static final Item SPOON = registerItem("spoon" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.KITCHENWARE)));
    public static final Item MORTAR_AND_PESTLE = registerItem("mortar_and_pestle" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.KITCHENWARE).maxCount(1)));
    public static final Item POT = registerItem("pot" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.KITCHENWARE).maxCount(1)));
    public static final Item PAN = registerItem("pan" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.KITCHENWARE).maxCount(1)));
    public static final Item GLASS = registerItem("glass" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.KITCHENWARE).maxCount(16)));

    public static final Item MORTAR = registerItem("mortar" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.MATERIAL)));
    public static final Item PESTLE = registerItem("pestle" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.MATERIAL)));


    //วัสดุ
    public static final Item FLOUR = registerItem("flour" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.MATERIAL)));
    public static final Item SAUCE = registerItem("sauce" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.MATERIAL)));
    public static final Item MAMA_SAUCE = registerItem("mama_sauce" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.MATERIAL)));
    public static final Item PACKAGE = registerItem("package" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.MATERIAL)));
    public static final Item PACK = registerItem("pack" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.MATERIAL)));


    //วัสดุของหม่าล่า ดิบ
    public static final Item BANANA_SQUID = registerItem("banana_squid" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.RAW_BANANA_SQUID)));
    public static final Item CARB_STICK = registerItem("crab_stick" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.RAW_CARB_STICK)));
    public static final Item CARB_STICK_WITH_BACON = registerItem("crab_stick_with_bacon" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.RAW_CARB_STICK_WITH_BACON)));
    public static final Item CHEESE_HOT_DOG = registerItem("cheese_hot_dog" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.RAW_CHEESE_HOT_DOG)));
    public static final Item CHICKEN_FEET = registerItem("chicken_feet" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.RAW_CHICKEN_FEET)));
    public static final Item CORN = registerItem("corn" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.RAW_CORN)));
    public static final Item CRISPY_SKIN_HOT_DOG = registerItem("crispy_skin_hot_dog" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.RAW_CRISPY_SKIN_HOT_DOG)));
    public static final Item CUCUMBER = registerItem("cucumber" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.RAW_CUCUMBER)));
    public static final Item GOLDEN_NEEDLE_MUSHROOM = registerItem("golden_needle_mushroom" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.RAW_GOLDEN_NEEDLE_MUSHROOM)));
    public static final Item GOLDEN_NEEDLE_MUSHROOM_WITH_BACON = registerItem("golden_needle_mushroom_with_bacon" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.RAW_GOLDEN_NEEDLE_MUSHROOM_WITH_BACON)));
    public static final Item LEAN_PORK = registerItem("lean_pork" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.RAW_LEAN_POCK)));
    public static final Item MEAT_BALL = registerItem("meat_ball" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.RAW_MEAT_BALL)));
    public static final Item PORK_BALL = registerItem("pork_ball" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.RAW_POCK_BALL)));
    public static final Item PORK_INTESTINES = registerItem("pork_intestines" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.RAW_POCK_INTESTINES)));
    public static final Item SHRIMP = registerItem("shrimp" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.RAW_SHRIMP)));
    public static final Item SQUID = registerItem("squid" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.RAW_SQUID)));
    public static final Item TOFU = registerItem("tofu" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.RAW_TOFU)));




    //วัสดุของหม่าล่า สุก
    public static final Item COOKED_BANANA_SQUID = registerItem("cooked_banana_squid" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_BANANA_SQUID)));
    public static final Item COOKED_CARB_STICK = registerItem("cooked_crab_stick" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_CARB_STICK)));
    public static final Item COOKED_CARB_STICK_WITH_BACON = registerItem("cooked_crab_stick_with_bacon" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_CARB_STICK_WITH_BACON)));
    public static final Item COOKED_CHEESE_HOT_DOG = registerItem("cooked_cheese_hot_dog" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_CHEESE_HOT_DOG)));
    public static final Item COOKED_CHICKEN_FEET = registerItem("cooked_chicken_feet" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_CHICKEN_FEET)));
    public static final Item COOKED_CORN = registerItem("cooked_corn" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_CORN)));
    public static final Item COOKED_CUCUMBER = registerItem("cooked_cucumber" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_CUCUMBER)));
    public static final Item COOKED_CRISPY_SKIN_HOT_DOG = registerItem("cooked_crispy_skin_hot_dog" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_CRISPY_SKIN_HOT_DOG)));
    public static final Item COOKED_FISH = registerItem("cooked_fish" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_FISH)));
    public static final Item COOKED_GOLDEN_NEEDLE_MUSHROOM = registerItem("cooked_golden_needle_mushroom" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_GOLDEN_NEEDLE_MUSHROOM)));
    public static final Item COOKED_GOLDEN_NEEDLE_MUSHROOM_WITH_BACON = registerItem("cooked_golden_needle_mushroom_with_bacon" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_GOLDEN_NEEDLE_MUSHROOM_WITH_BACON)));
    public static final Item COOKED_LEAN_POCK = registerItem("cooked_lean_pock" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_LEAN_POCK)));
    public static final Item COOKED_MEAT_BALL = registerItem("cooked_meat_ball" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_MEAT_BALL)));
    public static final Item COOKED_MUSHROOM = registerItem("cooked_mushroom" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_MUSHROOM)));
    public static final Item COOKED_POCK = registerItem("cooked_pock" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_POCK)));
    public static final Item COOKED_POCK_BALL = registerItem("cooked_pock_ball" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_POCK_BALL)));
    public static final Item COOKED_POCK_INTESTINES = registerItem("cooked_pock_intestines" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_POCK_INTESTINES)));
    public static final Item COOKED_SHRIMP = registerItem("cooked_shrimp" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_SHRIMP)));
    public static final Item COOKED_SQUID = registerItem("cooked_squid" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_SQUID)));
    public static final Item COOKED_TOFU = registerItem("cooked_tofu" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_TOFU)));









    //อาหาร
    public static final Item KFC_BUCKET = registerItem("kfc_bucket" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD)));


    //มาม่าซอง ดิบ
    public static final Item MAMA_TOMYUMKUNG = registerItem("mama_tomyumkung" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.MAMA)));
    public static final Item MAMA_MUSAB = registerItem("mama_musab" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.MAMA)));
    public static final Item MAMA_GANGKEAWWAN = registerItem("mama_gangkeawwan" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.MAMA)));
    public static final Item MAMA_MUNOMTOG = registerItem("mama_munomtog" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.MAMA)));
    public static final Item MAMA_TOMZAB = registerItem("mama_tomzab" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.MAMA)));
    public static final Item MAMA_TOMYUMKUNGNOMKON = registerItem("mama_tomyumkungnomkon" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.MAMA)));
    public static final Item MAMA_YENTAFO = registerItem("mama_yentafo" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.MAMA)));
    public static final Item MAMA_PEDPALO = registerItem("mama_pedpalo" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.MAMA)));
    public static final Item MAMA_TOMZABNOMKON = registerItem("mama_tomzabnomkon" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.MAMA)));


    //มาม่าซอง สุก
    public static final Item COOKED_MAMA_TOMYUMKUNG = registerItem("cooked_mama_tomyumkung" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_MAMA)));
    public static final Item COOKED_MAMA_MUSAB = registerItem("cooked_mama_musab" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_MAMA)));
    public static final Item COOKED_MAMA_GANGKEAWWAN = registerItem("cooked_mama_gangkeawwan" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_MAMA)));
    public static final Item COOKED_MAMA_MUNOMTOG = registerItem("cooked_mama_munomtog" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_MAMA)));
    public static final Item COOKED_MAMA_TOMZAB = registerItem("cooked_mama_tomzab" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_MAMA)));
    public static final Item COOKED_MAMA_TOMYUMKUNGNOMKON = registerItem("cooked_mama_tomyumkungnomkon" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_MAMA)));
    public static final Item COOKED_MAMA_YENTAFO = registerItem("cooked_mama_yentafo" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_MAMA)));
    public static final Item COOKED_MAMA_PEDPALO = registerItem("cooked_mama_pedpalo" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_MAMA)));
    public static final Item COOKED_MAMA_TOMZABNOMKON = registerItem("cooked_mama_tomzabnomkon" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_MAMA)));


    //หมาล่าดิบ
    public static final Item RAW_MALA_POCK = registerItem("raw_mala_pock" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.RAW_MALA_POCK)));
    public static final Item RAW_MALA_LEAN_POCK = registerItem("raw_mala_lean_pock" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.RAW_MALA_LEAN_POCK)));
    public static final Item RAW_MALA_CORN = registerItem("raw_mala_corn" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.RAW_MALA_CORN)));
    public static final Item RAW_MALA_MUSHROOM = registerItem("raw_mala_mushroom" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.RAW_MALA_MUSHROOM)));
    public static final Item RAW_MALA_GOLDEN_NEEDLE_MUSHROOM = registerItem("raw_mala_golden_needle_mushroom" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.RAW_MALA_GOLDEN_NEEDLE_MUSHROOM)));
    public static final Item RAW_MALA_GOLDEN_NEEDLE_MUSHROOM_WITH_BACON = registerItem("raw_mala_golden_needle_mushroom_with_bacon" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.RAW_MALA_GOLDEN_NEEDLE_MUSHROOM_WITH_BACON)));
    public static final Item RAW_MALA_CUCUMBER = registerItem("raw_mala_cucumber" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.RAW_MALA_CUCUMBER)));
    public static final Item RAW_MALA_CRAB_STICK = registerItem("raw_mala_crab_stick" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.RAW_MALA_CARB_STICK)));
    public static final Item RAW_MALA_CRAB_STICK_WITH_BACON = registerItem("raw_mala_crab_stick_with_bacon" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.RAW_MALA_CARB_STICK_WITH_BACON)));
    public static final Item RAW_MALA_TOFU = registerItem("raw_mala_tofu" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.RAW_MALA_TOFU)));
    public static final Item RAW_MALA_MEAT_BALLS = registerItem("raw_mala_meat_balls" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.RAW_MALA_MEAT_BALL)));
    public static final Item RAW_MALA_PORK_BALLS = registerItem("raw_mala_pork_balls" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.RAW_MALA_POCK_BALL)));
    public static final Item RAW_MALA_CRISPY_SKIN_HOT_DOG = registerItem("raw_mala_crispy_skin_hot_dog" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.RAW_MALA_CRISPY_SKIN_HOT_DOG)));
    public static final Item RAW_MALA_CHEESE_HOT_DOG = registerItem("raw_mala_cheese_hot_dog" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.RAW_MALA_CHEESE_HOT_DOG)));
    public static final Item RAW_MALA_PORK_INTESTINES = registerItem("raw_mala_pork_intestines" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.RAW_MALA_POCK_INTESTINES)));
    public static final Item RAW_MALA_SQUID = registerItem("raw_mala_squid" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.RAW_MALA_SQUID)));
    public static final Item RAW_MALA_BANANA_SQUID = registerItem("raw_mala_banana_squid" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.RAW_MALA_BANANA_SQUID)));
    public static final Item RAW_MALA_SHRIMP = registerItem("raw_mala_shrimp" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.RAW_MALA_SHRIMP)));
    public static final Item RAW_MALA_FISH = registerItem("raw_mala_fish" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.RAW_MALA_FISH)));
    public static final Item RAW_MALA_CHICKEN_FEET = registerItem("raw_mala_chicken_feet" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.RAW_MALA_CHICKEN_FEET)));

    //หม่าล่าสุก
    public static final Item COOKED_MALA_POCK = registerItem("cooked_mala_pock" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_MALA_POCK)));
    public static final Item COOKED_MALA_LEAN_POCK = registerItem("cooked_mala_lean_pock" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_MALA_LEAN_POCK)));
    public static final Item COOKED_MALA_CORN = registerItem("cooked_mala_corn" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_MALA_CORN)));
    public static final Item COOKED_MALA_MUSHROOM = registerItem("cooked_mala_mushroom" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_MALA_MUSHROOM)));
    public static final Item COOKED_MALA_GOLDEN_NEEDLE_MUSHROOM = registerItem("cooked_mala_golden_needle_mushroom" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_MALA_GOLDEN_NEEDLE_MUSHROOM)));
    public static final Item COOKED_MALA_GOLDEN_NEEDLE_MUSHROOM_WITH_BACON = registerItem("cooked_mala_golden_needle_mushroom_with_bacon" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_MALA_GOLDEN_NEEDLE_MUSHROOM_WITH_BACON)));
    public static final Item COOKED_MALA_CUCUMBER = registerItem("cooked_mala_cucumber" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_MALA_CUCUMBER)));
    public static final Item COOKED_MALA_CRAB_STICK = registerItem("cooked_mala_crab_stick" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_MALA_CARB_STICK)));
    public static final Item COOKED_MALA_CRAB_STICK_WITH_BACON = registerItem("cooked_mala_crab_stick_with_bacon" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_MALA_CARB_STICK_WITH_BACON)));
    public static final Item COOKED_MALA_TOFU = registerItem("cooked_mala_tofu" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_MALA_TOFU)));
    public static final Item COOKED_MALA_MEAT_BALLS = registerItem("cooked_mala_meat_balls" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_MALA_MEAT_BALL)));
    public static final Item COOKED_MALA_PORK_BALLS = registerItem("cooked_mala_pork_balls" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_MALA_POCK_BALL)));
    public static final Item COOKED_MALA_CRISPY_SKIN_HOT_DOG = registerItem("cooked_mala_crispy_skin_hot_dog" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_MALA_CRISPY_SKIN_HOT_DOG)));
    public static final Item COOKED_MALA_CHEESE_HOT_DOG = registerItem("cooked_mala_cheese_hot_dog" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_MALA_CHEESE_HOT_DOG)));
    public static final Item COOKED_MALA_PORK_INTESTINES = registerItem("cooked_mala_pork_intestines" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_MALA_POCK_INTESTINES)));
    public static final Item COOKED_MALA_SQUID = registerItem("cooked_mala_squid" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_MALA_SQUID)));
    public static final Item COOKED_MALA_BANANA_SQUID = registerItem("cooked_mala_banana_squid" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_MALA_BANANA_SQUID)));
    public static final Item COOKED_MALA_SHRIMP = registerItem("cooked_mala_shrimp" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_MALA_SHRIMP)));
    public static final Item COOKED_MALA_FISH = registerItem("cooked_mala_fish" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_MALA_FISH)));
    public static final Item COOKED_MALA_CHICKEN_FEET = registerItem("cooked_mala_chicken_feet" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(MunfySMPFoodComponents.COOKED_MALA_CHICKEN_FEET)));



    public static final Item BACON = registerItem("bacon" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).build())));
    public static final Item COOKED_BACON = registerItem("cooked_bacon" , new Item(new FabricItemSettings().group(MunfySMPFoodGroup.FOOD).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build())));

    //Crop Seeds
    public static final Item CORN_SEEDS = registerItem("corn_seeds", new AliasedBlockItem(MunfySMPFoodBlocks.CORN_CROP,new FabricItemSettings().group(MunfySMPFoodGroup.MATERIAL)));
    public static final Item MUSHROOM_SEEDS = registerItem("mushroom_seeds", new AliasedBlockItem(MunfySMPFoodBlocks.MUSHROOM_CROP,new FabricItemSettings().group(MunfySMPFoodGroup.MATERIAL)));
    public static final Item GOLDEN_NEEDLE_MUSHROOM_SEEDS = registerItem("golden_needle_mushroom_seeds", new AliasedBlockItem(MunfySMPFoodBlocks.GOLDEN_NEEDLE_MUSHROOM_CROP,new FabricItemSettings().group(MunfySMPFoodGroup.MATERIAL)));


    //Crop Fruits



    //อย่าไปยุ่งกับมัน
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MunfySMPFood.MOD_ID, name), item);
    }
    public static void registerModItem() {
        MunfySMPFood.LOGGER.debug("Registering Mod Item for " + MunfySMPFood.MOD_ID);
    }

}
