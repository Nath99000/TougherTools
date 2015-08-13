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
import java.util.Map;

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
            //armor
            if (itemStack != null && itemStack.getItem() == Items.leather_boots)
                remover.remove();
            if (itemStack != null && itemStack.getItem() == Items.leather_helmet)
                remover.remove();
            if (itemStack != null && itemStack.getItem() == Items.leather_chestplate)
                remover.remove();
            if (itemStack != null && itemStack.getItem() == Items.leather_leggings)
                remover.remove();
            if (itemStack != null && itemStack.getItem() == Items.iron_boots)
                remover.remove();
            if (itemStack != null && itemStack.getItem() == Items.iron_leggings)
                remover.remove();
            if (itemStack != null && itemStack.getItem() == Items.iron_chestplate)
                remover.remove();
            if (itemStack != null && itemStack.getItem() == Items.iron_helmet)
                remover.remove();
            if (itemStack != null && itemStack.getItem() == Items.golden_boots)
                remover.remove();
            if (itemStack != null && itemStack.getItem() == Items.golden_leggings)
                remover.remove();
            if (itemStack != null && itemStack.getItem() == Items.golden_chestplate)
                remover.remove();
            if (itemStack != null && itemStack.getItem() == Items.golden_helmet)
                remover.remove();
            if (itemStack != null && itemStack.getItem() == Items.diamond_helmet)
                remover.remove();
            if (itemStack != null && itemStack.getItem() == Items.diamond_chestplate)
                remover.remove();
            if (itemStack != null && itemStack.getItem() == Items.diamond_leggings)
                remover.remove();
            if (itemStack != null && itemStack.getItem() == Items.diamond_boots)
                remover.remove();
            if (itemStack != null && itemStack.getItem() == Items.chainmail_boots)
                remover.remove();
            if (itemStack != null && itemStack.getItem() == Items.chainmail_chestplate)
                remover.remove();
            if (itemStack != null && itemStack.getItem() == Items.chainmail_helmet)
                remover.remove();
            if (itemStack != null && itemStack.getItem() == Items.chainmail_leggings)
                remover.remove();

        }
    }
    public static void removeFurnaceRecipe (ItemStack resultItem)
    {
        Map<ItemStack, ItemStack> recipes = FurnaceRecipes.smelting().getSmeltingList();
        for (Iterator<Map.Entry<ItemStack,ItemStack>> entries = recipes.entrySet().iterator(); entries.hasNext(); ){
            Map.Entry<ItemStack,ItemStack> entry = entries.next();
            ItemStack result = entry.getValue();
            if (ItemStack.areItemStacksEqual(result, resultItem)){ // If the output matches the specified ItemStack,
                entries.remove(); // Remove the recipe
            }
        }
    }

    public static void smelting(){
        VanillaHandler.removeFurnaceRecipe(new ItemStack(Items.iron_ingot));
        VanillaHandler.removeFurnaceRecipe(new ItemStack(Items.gold_ingot));
        VanillaHandler.removeFurnaceRecipe(new ItemStack(Items.diamond));
        VanillaHandler.removeFurnaceRecipe(new ItemStack(Items.emerald));
        VanillaHandler.removeFurnaceRecipe(new ItemStack(Items.coal));
        VanillaHandler.removeFurnaceRecipe(new ItemStack(Items.redstone));
        VanillaHandler.removeFurnaceRecipe(new ItemStack(Items.quartz));
    }
}
