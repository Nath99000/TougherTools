package com.nath99000.toughertools.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes
{
    public static void init(){
        GameRegistry.addRecipe(new ItemStack(ModItems.PickW1), "HBH", " S ", " S ", 'H', new ItemStack(ModItems.HeadW1), 'B', new ItemStack(ModItems.BindingL1), 'S', new ItemStack(Items.stick));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.LeatherStrips), new ItemStack(Items.leather), new ItemStack(Items.flint));
        GameRegistry.addRecipe(new ItemStack(ModItems.BindingL1), "L L", " F ", "L L", 'L', new ItemStack(Items.leather), 'F', new ItemStack(Items.flint));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.HeadW1), new ItemStack(Items.stick), new ItemStack(Items.flint));
        GameRegistry.addRecipe(new ItemStack(ModItems.StoneCutter), " BF", " S ", "C  ", 'B', new ItemStack(ModItems.BindingL1), 'F', new ItemStack(Items.flint), 'S', new ItemStack(Items.stick), 'C', new ItemStack(Items.coal));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.StoneShard, 5), new ItemStack(Blocks.cobblestone), new ItemStack(ModItems.StoneCutter));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.PlateW1), new ItemStack(Blocks.planks), new ItemStack(Blocks.planks), new ItemStack(Items.flint));
        GameRegistry.addRecipe(new ItemStack(ModItems.Scraper), " BR", " S ", "S  ", 'B', new ItemStack(ModItems.BindingL1), 'R', new ItemStack(ModItems.StoneShard), 'S', new ItemStack(Items.stick));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.BindingL2), new ItemStack(ModItems.BindingL1), new ItemStack(ModItems.Scraper));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.HeadW2), new ItemStack(ModItems.HeadW1), new ItemStack(Items.stick), new ItemStack(ModItems.StoneShard));
    }
}
