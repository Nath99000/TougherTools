package com.nath99000.toughertools.item.Axes;

import assets.toughertools.lang.Names;
import com.nath99000.toughertools.Reference.Reference;
import com.nath99000.toughertools.creativetab.TTTab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemAxeW1 extends ItemAxe{
    public ItemAxeW1(String AxeW1, ToolMaterial Wood1) {
        super(Wood1);
        this.setCreativeTab(TTTab.TTTab);
        this.setUnlocalizedName(AxeW1);
        this.setTextureName(Reference.Id + ":" + AxeW1);
    }
    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add(Names.T1);
        }
    }
}
