package com.nath99000.toughertools.item.Hoes;

import assets.toughertools.lang.Names;
import com.nath99000.toughertools.Reference.Reference;
import com.nath99000.toughertools.creativetab.TTTab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemHoeW5 extends ItemHoe{
    public ItemHoeW5(String HoeW5, ToolMaterial Wood5) {
        super(Wood5);
        this.setCreativeTab(TTTab.TTTab);
        this.setUnlocalizedName(HoeW5);
        this.setTextureName(Reference.Id + ":" + HoeW5);
    }
    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add(Names.T5);
        }
    }
}
