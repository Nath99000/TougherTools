package com.nath99000.toughertools.crafting;

import net.minecraft.item.crafting.IRecipe;

import java.util.Comparator;

public class ToolTableRecipeSorter implements Comparator {

    final ToolTableCraftingManager tooltable;

    public ToolTableRecipeSorter(ToolTableCraftingManager ToolTable){
        this.tooltable = ToolTable;
    }

    public int compareRecipes(IRecipe irecipe1, IRecipe irecipe2){
        return irecipe1 instanceof ToolTableShapelessRecipes && irecipe2 instanceof ToolTableShapedRecipe ? 1: (irecipe2 instanceof ToolTableShapelessRecipes && irecipe1 instanceof ToolTableShapedRecipe ? -1 : (irecipe2.getRecipeSize() < irecipe1.getRecipeSize() ? -1 :(irecipe2.getRecipeSize() > irecipe1.getRecipeSize() ? 1 : 0)));
    }

    @Override
    public int compare(Object o1, Object o2) {
        return this.compareRecipes((IRecipe)o1, (IRecipe)o2);
    }
}
