package com.nath99000.toughertools.item;

import com.nath99000.toughertools.Reference.Reference;
import com.nath99000.toughertools.creativetab.TTTab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemPickW2 extends ItemPickaxe{
    public ItemPickW2(String PickW2, ToolMaterial Wood1) {
        super(Wood1);
        this.setCreativeTab(TTTab.TTTab);
        this.setUnlocalizedName(PickW2);
        this.setTextureName(Reference.Id + ":" + PickW2);
    }
    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add("Well made");
        }
    }
}
