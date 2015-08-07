package com.nath99000.toughertools.item.Materials;

import com.nath99000.toughertools.item.ItemTT;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemToolBladeW1 extends ItemTT {
    public ItemToolBladeW1(){
        super();
        setUnlocalizedName("BladeW1");
    }
    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add("Poorly made");
        }
    }
}
