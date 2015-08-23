package com.nath99000.toughertools.init;

import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

public class ChestHandler {


    public static void init(){
        //DUNGEON_CHEST, BONUS_CHEST, VILLAGE_BLACKSMITH, STRONGHOLD_CROSSING, STRONGHOLD_LIBRARY, STRONGHOLD_CORRIDOR, PYRAMID_JUNGLE_CHEST, PYRAMID_DESERT_CHEST, MINESHAFT_CORRIDOR, jungle chest dispenser not included.
        //item, min, max, rarity
        //dungeon
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.SchematicSnowZooka), 1, 1, 12));
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.SchematicDartgun), 1, 1, 20));
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.SchematicCleaver), 1, 1, 11));
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.SchematicPlasmablade), 1, 1, 12));
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.Schematicscythe), 1, 1, 20));
        //mineshaft
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.SchematicSnowZooka), 1, 1, 10));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.SchematicDartgun), 1, 1, 18));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.SchematicCleaver), 1, 1, 11));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.SchematicPlasmablade), 1, 1, 11));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.Schematicscythe), 1, 1, 16));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.SchematicLightning), 1, 1, 4));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.Schematicdaedramace), 1, 1, 3));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.Schematicmasamune), 1, 1, 8));
    }
}
