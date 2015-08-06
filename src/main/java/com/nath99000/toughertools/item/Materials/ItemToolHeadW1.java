package com.nath99000.toughertools.item.Materials;

import com.nath99000.toughertools.item.ItemTT;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemToolHeadW1 extends ItemTT {
    public ItemToolHeadW1(){
        super();
        this.setUnlocalizedName("ToolHeadW1");
    }
    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add("Poorly made");
        }
    }
}
