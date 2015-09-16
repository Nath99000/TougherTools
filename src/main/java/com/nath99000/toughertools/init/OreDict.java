package com.nath99000.toughertools.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import java.lang.reflect.Method;

public class OreDict {

    public OreDict(){

    }

    public static void init(){
        OreDictionary.registerOre("ingotThaumium", new ItemStack(ModItems.thaumsteel));
        OreDictionary.registerOre("ingotManasteel", new ItemStack(ModItems.botaniasteel));
        OreDictionary.registerOre("ingotTerrasteel", new ItemStack(ModItems.botaniaterra));
        OreDictionary.registerOre("ingotElvenElementium", new ItemStack(ModItems.botanianelven));
        OreDictionary.registerOre("crystalFluix", new ItemStack(ModItems.ae2fluix));
        OreDictionary.registerOre("ingotEnderium", new ItemStack(ModItems.theEnderium));
        OreDictionary.registerOre("ingotElectrum", new ItemStack(ModItems.theElectrum));
        OreDictionary.registerOre("ingotInvar", new ItemStack(ModItems.theInvar));
        OreDictionary.registerOre("ingotSteel", new ItemStack(ModItems.steel));
        OreDictionary.registerOre("ingotManyullyn", new ItemStack(ModItems.tcManyullyn));
        OreDictionary.registerOre("ingotCobalt", new ItemStack(ModItems.tcCobalt));
        OreDictionary.registerOre("ingotArdite", new ItemStack(ModItems.tcArdite));
        OreDictionary.registerOre("gaiaIngot", new ItemStack(ModItems.botaniagaia));
        OreDictionary.registerOre("runeWrathB", new ItemStack(ModItems.botaniawrathrune));
        OreDictionary.registerOre("mysticFlowerRed", new ItemStack(ModItems.botaniaflowerred));
        OreDictionary.registerOre("livingwoodTwig", new ItemStack(ModItems.botaniastick));
        OreDictionary.registerOre("manaPetalBlack", new ItemStack(ModItems.botaniapetalblack));
        OreDictionary.registerOre("circuitPyrotechnic", new ItemStack(ModItems.ExploderCore));
    }
}
