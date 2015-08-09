package com.nath99000.toughertools.item.Shovels;

import assets.toughertools.lang.Names;
import com.nath99000.toughertools.Reference.Reference;
import com.nath99000.toughertools.creativetab.TTTab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemShovelW4 extends ItemSpade{
    public ItemShovelW4(String ShovelW4, ToolMaterial Wood4) {
        super(Wood4);
        this.setCreativeTab(TTTab.TTTab);
        this.setUnlocalizedName(ShovelW4);
        this.setTextureName(Reference.Id + ":" + ShovelW4);
    }
    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add(Names.T4);
            par3.add(Names.modifier);
        }
    }
}
