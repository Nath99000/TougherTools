package com.nath99000.toughertools.init;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.crafting.IRecipe;
import java.util.Iterator;
import java.util.List;

public class VanillaHandler {


    public static void init(){
        List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();

        Iterator<IRecipe> remover = recipes.iterator();

        while (remover.hasNext()){
            ItemStack itemStack = remover.next().getRecipeOutput();
            //Pickaxes
            if (itemStack != null && itemStack.getItem() == Items.wooden_pickaxe)
                remover.remove();
            if (itemStack != null && itemStack.getItem() == Items.stone_pickaxe)
                remover.remove();
            if (itemStack != null && itemStack.getItem() == Items.iron_pickaxe)
                remover.remove();
            if (itemStack != null && itemStack.getItem() == Items.golden_pickaxe)
                remover.remove();
            if (itemStack != null && itemStack.getItem() == Items.diamond_pickaxe)
                remover.remove();
            //Axes
            if (itemStack != null && itemStack.getItem() == Items.wooden_axe)
                remover.remove();
            if (itemStack != null && itemStack.getItem() == Items.stone_axe)
                remover.remove();
            if (itemStack != null && itemStack.getItem() == Items.iron_axe)
                remover.remove();
            if (itemStack != null && itemStack.getItem() == Items.golden_axe)
                remover.remove();
            if (itemStack != null && itemStack.getItem() == Items.diamond_axe)
                remover.remove();
            //shovels
            if (itemStack != null && itemStack.getItem() == Items.wooden_shovel)
                remover.remove();
            if (itemStack != null && itemStack.getItem() == Items.stone_shovel)
                remover.remove();
            if (itemStack != null && itemStack.getItem() == Items.iron_shovel)
                remover.remove();
            if (itemStack != null && itemStack.getItem() == Items.golden_shovel)
                remover.remove();
            if (itemStack != null && itemStack.getItem() == Items.diamond_shovel)
                remover.remove();
            //sword
            if (itemStack != null && itemStack.getItem() == Items.wooden_sword)
                remover.remove();
            if (itemStack != null && itemStack.getItem() == Items.stone_sword)
                remover.remove();
            if (itemStack != null && itemStack.getItem() == Items.iron_sword)
                remover.remove();
            if (itemStack != null && itemStack.getItem() == Items.golden_sword)
                remover.remove();
            if (itemStack != null && itemStack.getItem() == Items.diamond_sword)
                remover.remove();
            //hoes
            if (itemStack != null && itemStack.getItem() == Items.wooden_hoe)
                remover.remove();
            if (itemStack != null && itemStack.getItem() == Items.stone_hoe)
                remover.remove();
            if (itemStack != null && itemStack.getItem() == Items.iron_hoe)
                remover.remove();
            if (itemStack != null && itemStack.getItem() == Items.golden_hoe)
                remover.remove();
            if (itemStack != null && itemStack.getItem() == Items.diamond_hoe)
                remover.remove();
            //miscellaneous

        }
    }
}
