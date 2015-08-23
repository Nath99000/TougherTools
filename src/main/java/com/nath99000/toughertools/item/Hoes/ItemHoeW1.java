package com.nath99000.toughertools.item.Hoes;

import com.nath99000.toughertools.Reference.Names;
import com.nath99000.toughertools.Reference.Reference;
import com.nath99000.toughertools.creativetab.TTTab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemHoeW1 extends ItemHoe{
    public ItemHoeW1(String HoeW1, ToolMaterial Wood1) {
        super(Wood1);
        this.setCreativeTab(TTTab.TTTab);
        this.setUnlocalizedName(HoeW1);
        this.setTextureName(Reference.Id + ":" + HoeW1);
    }
    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add(Names.T1);
        }
    }
}
