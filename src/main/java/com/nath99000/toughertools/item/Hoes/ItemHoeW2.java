package com.nath99000.toughertools.item.Hoes;

import assets.toughertools.lang.Names;
import com.nath99000.toughertools.Reference.Reference;
import com.nath99000.toughertools.creativetab.TTTab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemHoeW2 extends ItemHoe{
    public ItemHoeW2(String HoeW2, ToolMaterial Wood2) {
        super(Wood2);
        this.setCreativeTab(TTTab.TTTab);
        this.setUnlocalizedName(HoeW2);
        this.setTextureName(Reference.Id + ":" + HoeW2);
    }
    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add(Names.T2);
        }
    }
}
