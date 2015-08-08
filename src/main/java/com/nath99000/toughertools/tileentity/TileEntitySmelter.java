package com.nath99000.toughertools.tileentity;

import com.nath99000.toughertools.block.Smelter;
import com.nath99000.toughertools.init.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.tileentity.TileEntity;

public class TileEntitySmelter extends TileEntity implements ISidedInventory {

    private String localizedName;
    private ItemStack[] slots = new ItemStack[3];

    public int furnaceSpeed = 150;
    public int burnTime;
    public int currentItemBurnTime;
    public int cookTime;



    public void setGuiDisplayName(String DisplayName) {
        this.localizedName = DisplayName;
    }

    public String getInventoryName() {
        return this.hasCustomInventoryName() ? this.localizedName : "container.smelter";
    }

    public boolean hasCustomInventoryName() {
        return this.localizedName != null && this.localizedName.length() > 0;
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer player) {
        return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : player.getDistanceSq((double)this.xCoord + 0.5d, (double)this.yCoord + 0.5d, (double)this.zCoord + 0.5d) <=64.0d;
    }

    @Override
    public void openInventory() {

    }

    @Override
    public void closeInventory() {

    }

    @Override
    public boolean isItemValidForSlot(int par1, ItemStack itemstack) {
        return false;
    }

    public static boolean isItemFuel(ItemStack itemstack) {
        return getItemBurnTime(itemstack) > 0;
    }

    private static int getItemBurnTime(ItemStack itemStack) {
        if (itemStack == null) {
            return 1;
        } else {
            Item item = itemStack.getItem();
            if (item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.air) {
                Block block = Block.getBlockFromItem(item);

                if (item == ModItems.Plank) return 50;
                if (item == Items.lava_bucket) return 20000;
            }
            return GameRegistry.getFuelValue(itemStack);
        }
    }

    public void updateEntity() {
        boolean flag = this.burnTime > 0;
        boolean flag1 = false;

        if (this.isBurning()) {
            this.burnTime--;
        }
        if (!this.worldObj.isRemote) {
            if (this.burnTime == 0 && this.canSmelt()) {
                this.currentItemBurnTime = this.burnTime = getItemBurnTime(this.slots[1]);

                if (this.isBurning()) {
                    flag1 = true;

                    if (this.slots[1] != null) {
                        this.slots[1].stackSize--;

                        if (this.slots[1].stackSize == 0) {
                            this.slots[1] = this.slots[1].getItem().getContainerItem(this.slots[1]);
                        }
                    }
                }
            }
            if (this.isBurning() && this.canSmelt()) {
                this.cookTime++;

                if (this.cookTime == this.furnaceSpeed) {
                    this.cookTime = 0;
                    this.smeltItem();
                    flag1 = true;
                }
            } else {
                this.cookTime = 0;
            }

            if (flag != this.isBurning()) {
                flag1 = true;
                Smelter.updateSmelterBlockState(this.burnTime > 0, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
            }
        }
        if (flag1) {
            this.markDirty();
        }
    }

    public boolean isBurning() {
        return this.burnTime > 0;
    }

    public boolean canSmelt() {
        if (this.slots[0] == null) {
            return false;
        } else {
            ItemStack itemStack = FurnaceRecipes.smelting().getSmeltingResult(this.slots[0]);
            if (itemStack == null) {
                return false;
            }
            if (this.slots[2] == null) {
                return true;
            }
            if (!this.slots[2].isItemEqual(itemStack)) return false;

            int result = this.slots[2].stackSize + itemStack.stackSize;
            return (result <= getInventoryStackLimit() && result <= itemStack.getMaxStackSize());
        }
    }
    public void smeltItem() {
        if (this.canSmelt()) {
            ItemStack itemStack = FurnaceRecipes.smelting().getSmeltingResult(this.slots[0]);

            if (this.slots[2] == null) {
                this.slots[2] = itemStack.copy();
            } else if (this.slots[2].isItemEqual(itemStack)) {
                this.slots[2].stackSize += itemStack.stackSize;
            }

            this.slots[0].stackSize--;

            if (this.slots[0].stackSize <= 0) {
                this.slots[0] = null;
            }
        }
    }



    public int getSizeInventory(){
        return this.slots.length;
    }

    @Override
    public ItemStack getStackInSlot(int par1) {
        return this.slots[par1];
        //probably using the "parx" naming convention wrong, but oh, well...
    }

    @Override
    public ItemStack decrStackSize(int par1, int par2) {
        if(this.slots[par1] != null){
            ItemStack itemStack;

            if(this.slots[par1].stackSize <= par2){
                itemStack = this.slots[par1];
                this.slots[par1] = null;
                return itemStack;
            }
            else{
                itemStack = this.slots[par1].splitStack(par2);
                if (this.slots[par1].stackSize == 0){
                    this.slots[par1] = null;
                }
            }
        }
        return null;
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int par1) {
        if(this.slots[par1] != null){
            ItemStack itemStack = this.slots[par1];
            this.slots[par1] = null;
            return itemStack;
        }
        return null;
    }

    @Override
    public void setInventorySlotContents(int par1, ItemStack itemstack) {
        this.slots[par1] = itemstack;

                if (itemstack != null && itemstack.stackSize > this.getInventoryStackLimit()){
                    itemstack.stackSize = this.getInventoryStackLimit();
                }
    }

    @Override
    public int[] getAccessibleSlotsFromSide(int par1) {
        return new int[0];
    }

    @Override
    public boolean canInsertItem(int par1, ItemStack itemstack, int par2) {
        return false;
    }

    @Override
    public boolean canExtractItem(int par1, ItemStack itemstack, int par2) {
        return false;
    }

    public int getBurnTimeRemainingScaled(int i){
        if(this.currentItemBurnTime == 0){
            this.currentItemBurnTime = this.furnaceSpeed;
        }
        return this.burnTime*i / this.currentItemBurnTime;
    }

    public int getCookProgressScaled(int i){
        return this.cookTime*i / this.furnaceSpeed;
    }
}
