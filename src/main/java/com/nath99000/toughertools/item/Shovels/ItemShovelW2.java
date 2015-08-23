package com.nath99000.toughertools.item.Shovels;

import com.nath99000.toughertools.Reference.Names;
import com.nath99000.toughertools.Reference.Reference;
import com.nath99000.toughertools.creativetab.TTTab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemShovelW2 extends ItemSpade{
    public ItemShovelW2(String ShovelW2, ToolMaterial Wood2) {
        super(Wood2);
        this.setCreativeTab(TTTab.TTTab);
        this.setUnlocalizedName(ShovelW2);
        this.setTextureName(Reference.Id + ":" + ShovelW2);
    }
    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add(Names.T2);
        }
    }
}
