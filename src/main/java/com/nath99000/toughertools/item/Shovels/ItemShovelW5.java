package com.nath99000.toughertools.item.Shovels;

import com.nath99000.toughertools.Reference.Names;
import com.nath99000.toughertools.Reference.Reference;
import com.nath99000.toughertools.creativetab.TTTab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemShovelW5 extends ItemSpade{
    public ItemShovelW5(String ShovelW5, ToolMaterial Wood5) {
        super(Wood5);
        this.setCreativeTab(TTTab.TTTab);
        this.setUnlocalizedName(ShovelW5);
        this.setTextureName(Reference.Id + ":" + ShovelW5);
    }
    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add(Names.T5);
            par3.add(Names.modifier);
        }
    }
}
