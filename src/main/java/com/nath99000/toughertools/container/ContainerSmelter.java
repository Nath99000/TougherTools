package com.nath99000.toughertools.container;

import com.nath99000.toughertools.init.TileEntity;
import com.nath99000.toughertools.tileentity.TileEntitySmelter;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;

public class ContainerSmelter extends Container{

    private TileEntitySmelter smelter;
    public int lastburnTime;
    public int lastcurrentItemBurnTime;
    public int lastcookTime;

    public ContainerSmelter(InventoryPlayer inventoryPlayer, TileEntitySmelter entity) {
        this.smelter = entity;
        this.addSlotToContainer(new Slot(entity, 0, 56, 35));
        this.addSlotToContainer(new Slot(entity, 1, 8, 62));
        this.addSlotToContainer(new SlotFurnace(inventoryPlayer.player, entity, 2, 116, 35));

        for (int i = 0; i < 3; i++) {
            for(int j =0;j<9;j++){
                this.addSlotToContainer(new Slot(inventoryPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
        for (int i =0; i <9; i++){
            this.addSlotToContainer(new Slot(inventoryPlayer, i, 8+i*18, 142));
        }
    }

    public void addCraftingtoCrafters (ICrafting icrafting){
        super.addCraftingToCrafters(icrafting);
        icrafting.sendProgressBarUpdate(this, 0, this.smelter.cookTime);
        icrafting.sendProgressBarUpdate(this, 1, this.smelter.burnTime);
        icrafting.sendProgressBarUpdate(this, 2, this.smelter.currentItemBurnTime);
    }

    public void detectAndSendChanges(){
        super.detectAndSendChanges();
        for(int i =0; i < this.crafters.size(); i++){
            ICrafting icrafting = (ICrafting) this.crafters.get(i);

            if(this.lastcookTime != this.smelter.cookTime){
                icrafting.sendProgressBarUpdate(this, 0, this.smelter.cookTime);
            }
            if(this.lastcookTime != this.smelter.burnTime){
                icrafting.sendProgressBarUpdate(this, 1, this.smelter.burnTime);
            }
            if(this.lastcurrentItemBurnTime != this.smelter.currentItemBurnTime){
                icrafting.sendProgressBarUpdate(this, 3, this.smelter.currentItemBurnTime);
            }
        }
        this.lastcookTime = this.smelter.cookTime;
                this.lastburnTime = this.smelter.burnTime;
        this.lastcurrentItemBurnTime = this.smelter.currentItemBurnTime;
    }

    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int slot, int newValue){

    }

    public boolean canInteractWith(EntityPlayer player) {
        return true;
    }
}
