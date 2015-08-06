package com.nath99000.toughertools.item.Materials;

import com.nath99000.toughertools.item.ItemTT;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemToolHeadW2 extends ItemTT {
    public ItemToolHeadW2(){
        super();
        this.setUnlocalizedName("ToolHeadW2");
    }
    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add("Well made");
        }
    }
}
