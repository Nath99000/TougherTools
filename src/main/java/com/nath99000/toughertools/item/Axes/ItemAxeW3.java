package com.nath99000.toughertools.item.Axes;

import assets.toughertools.lang.Names;
import com.nath99000.toughertools.Reference.Reference;
import com.nath99000.toughertools.creativetab.TTTab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemAxeW3 extends ItemAxe{
    public ItemAxeW3(String AxeW3, ToolMaterial Wood3) {
        super(Wood3);
        this.setCreativeTab(TTTab.TTTab);
        this.setUnlocalizedName(AxeW3);
        this.setTextureName(Reference.Id + ":" + AxeW3);
    }
    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add(Names.T3);
        }
    }
}
