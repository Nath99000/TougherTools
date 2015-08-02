package com.nath99000.toughertools.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes
{
    public static void init(){
        GameRegistry.addRecipe(new ItemStack(ModItems.PickW1), "HBH", " S ", " S ", 'H', new ItemStack(ModItems.HeadW1), 'B', new ItemStack(ModItems.BindingL1), 'S', new ItemStack(Items.stick));
    }
}
