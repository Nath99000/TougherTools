package com.nath99000.toughertools.container;

import com.nath99000.toughertools.block.ToolTable;
import com.nath99000.toughertools.crafting.ToolTableCraftingManager;
import com.nath99000.toughertools.init.ModBlocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.*;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ContainerToolTable extends Container{

    public InventoryCrafting crafting;
    public IInventory craftResult;
    private World worldObj;
    private int posX;
    private int posY;
    private int posZ;

    public ContainerToolTable(InventoryPlayer inventoryPlayer,World world, int x, int y, int z){
        crafting = new InventoryCrafting(this, 4, 3);
        craftResult = new InventoryCraftResult();
        worldObj = world;
        posX = x;
        posY = y;
        posZ = z;

        //output slot
        this.addSlotToContainer(new SlotCrafting(inventoryPlayer.player, crafting, craftResult, 0, 124, 35));

        //crafting slots
        for(int i = 0; i < 3; i++){
            for(int k = 0; k < 4; k++){
                this.addSlotToContainer(new Slot(crafting, k + i * 4, 12 + k * 18, 17 + i * 18));
            }
        }
        //schematic slot(now unused)
        //this.addSlotToContainer(new Slot(crafting, 11, 11, 35));

        //player inventory
        for(int i = 0; i < 3; i++){
            for(int k = 0; k < 9; k++){
                this.addSlotToContainer(new Slot(inventoryPlayer, k + i * 9 + 9, 8 + k * 18, 84 + i * 18));
            }
        }

        //player hotbar
        for(int i = 0; i<9; i++){
            addSlotToContainer(new Slot(inventoryPlayer, i, 8 + i * 18, 142));
        }

        onCraftMatrixChanged(crafting);
    }


    @Override
    public boolean canInteractWith(EntityPlayer player) {
        if(worldObj.getBlock(posX, posY, posZ) != ModBlocks.BlockToolTable){
            return false;
        }else {
            return player.getDistanceSq((double)posX + 0.5d, (double)posY+ 0.5d, (double)posZ+ 0.5d)<=64.0d;
        }
    }

    public void onCraftMatrixChanged(IInventory iinventory){
        craftResult.setInventorySlotContents(0, ToolTableCraftingManager.getInstance().findMatchingRecipe(crafting, worldObj));
    }

    public ItemStack transferStackInSlot(EntityPlayer p_82846_1_, int p_82846_2_)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(p_82846_2_);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (p_82846_2_ == 0)
            {
                if (!this.mergeItemStack(itemstack1, 10, 46, true))
                {
                    return null;
                }

                slot.onSlotChange(itemstack1, itemstack);
            }
            else if (p_82846_2_ >= 10 && p_82846_2_ < 37)
            {
                if (!this.mergeItemStack(itemstack1, 37, 46, false))
                {
                    return null;
                }
            }
            else if (p_82846_2_ >= 37 && p_82846_2_ < 46)
            {
                if (!this.mergeItemStack(itemstack1, 10, 37, false))
                {
                    return null;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 10, 46, false))
            {
                return null;
            }

            if (itemstack1.stackSize == 0)
            {
                slot.putStack((ItemStack)null);
            }
            else
            {
                slot.onSlotChanged();
            }

            if (itemstack1.stackSize == itemstack.stackSize)
            {
                return null;
            }

            slot.onPickupFromSlot(p_82846_1_, itemstack1);
        }

        return itemstack;
    }

    public void onContainerClosed(EntityPlayer p_75134_1_)
    {
        super.onContainerClosed(p_75134_1_);

        if (!this.worldObj.isRemote)
        {
            for (int i = 0; i < 9; ++i)
            {
                ItemStack itemstack = this.crafting.getStackInSlotOnClosing(i);

                if (itemstack != null)
                {
                    p_75134_1_.dropPlayerItemWithRandomChoice(itemstack, false);
                }
            }
        }
    }
}
