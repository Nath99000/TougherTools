package com.nath99000.toughertools.item.Items;

import com.nath99000.toughertools.item.Wrapper.ItemTT;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemWandcoreW1 extends ItemTT {
    public ItemWandcoreW1(){
        super();
        setUnlocalizedName("WandcoreW1");
    }
    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add("Poorly made");
        }
    }
}
