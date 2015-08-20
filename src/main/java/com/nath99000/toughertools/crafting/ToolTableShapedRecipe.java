package com.nath99000.toughertools.crafting;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class ToolTableShapedRecipe implements IRecipe
{
    /** How many horizontal slots this recipe is wide. */
    public final int recipeWidth;
    /** How many vertical slots this recipe uses. */
    public final int recipeHeight;
    /** Is a array of ItemStack that composes the recipe. */
    public final ItemStack[] recipeItems;
    /** Is the ItemStack that you get when craft the recipe. */
    private ItemStack recipeOutput;
    private boolean field_92101_f;
    private static final String __OBFID = "CL_00000093";

    public ToolTableShapedRecipe(int recipeWidth, int recipeHeight, ItemStack[] RecipeItems, ItemStack recipeOutput)
    {
        this.recipeWidth = recipeWidth;
        this.recipeHeight = recipeHeight;
        this.recipeItems = RecipeItems;
        this.recipeOutput = recipeOutput;
    }

    public ItemStack getRecipeOutput()
    {
        return this.recipeOutput;
    }

    /**
     * Used to check if a recipe matches current crafting inventory
     */
    public boolean matches(InventoryCrafting crafting, World world)
    {
        for (int i = 0; i <= 4 - this.recipeWidth; ++i)
        {
            for (int j = 0; j <= 3 - this.recipeHeight; ++j)
            {
                if (this.checkMatch(crafting, i, j, true))
                {
                    return true;
                }

                if (this.checkMatch(crafting, i, j, false))
                {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Checks if the region of a crafting inventory is match for the recipe.
     */
    private boolean checkMatch(InventoryCrafting inventoryCrafting, int p_77573_2_, int p_77573_3_, boolean bool)
    {
        for (int k = 0; k < 4; ++k)
        {
            for (int l = 0; l < 3; ++l)
            {
                int i1 = k - p_77573_2_;
                int j1 = l - p_77573_3_;
                ItemStack itemstack = null;

                if (i1 >= 0 && j1 >= 0 && i1 < this.recipeWidth && j1 < this.recipeHeight)
                {
                    if (bool)
                    {
                        itemstack = this.recipeItems[this.recipeWidth - i1 - 1 + j1 * this.recipeWidth];
                    }
                    else
                    {
                        itemstack = this.recipeItems[i1 + j1 * this.recipeWidth];
                    }
                }

                ItemStack itemstack1 = inventoryCrafting.getStackInRowAndColumn(k, l);

                if (itemstack1 != null || itemstack != null)
                {
                    if (itemstack1 == null && itemstack != null || itemstack1 != null && itemstack == null)
                    {
                        return false;
                    }

                    if (itemstack.getItem() != itemstack1.getItem())
                    {
                        return false;
                    }

                    if (itemstack.getItemDamage() != 32767 && itemstack.getItemDamage() != itemstack1.getItemDamage())
                    {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    /**
     * Returns an Item that is the result of this recipe
     */
    public ItemStack getCraftingResult(InventoryCrafting p_77572_1_)
    {
        ItemStack itemstack = this.getRecipeOutput().copy();

        if (this.field_92101_f)
        {
            for (int i = 0; i < p_77572_1_.getSizeInventory(); ++i)
            {
                ItemStack itemstack1 = p_77572_1_.getStackInSlot(i);

                if (itemstack1 != null && itemstack1.hasTagCompound())
                {
                    itemstack.setTagCompound((NBTTagCompound)itemstack1.stackTagCompound.copy());
                }
            }
        }

        return itemstack;
    }

    /**
     * Returns the size of the recipe area
     */
    public int getRecipeSize()
    {
        return this.recipeWidth * this.recipeHeight;
    }

    public ToolTableShapedRecipe func_92100_c()
    {
        this.field_92101_f = true;
        return this;
    }
}