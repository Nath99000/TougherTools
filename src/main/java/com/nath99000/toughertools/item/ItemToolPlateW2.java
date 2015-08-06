package com.nath99000.toughertools.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemToolPlateW2 extends ItemTT{
    public ItemToolPlateW2(){
        super();
        this.setUnlocalizedName("PlateW2");
    }
    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add("Well made");
        }
    }
}
