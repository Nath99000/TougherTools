package com.nath99000.toughertools.item.Pickaxes;

import assets.toughertools.lang.Names;
import com.nath99000.toughertools.Reference.Reference;
import com.nath99000.toughertools.creativetab.TTTab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemPickS3 extends ItemPickaxe
{
    public ItemPickS3(String PickS1, ToolMaterial Stone1) {
        super(Stone1);
        this.setCreativeTab(TTTab.TTTab);
        this.setUnlocalizedName(PickS1);
        this.setTextureName(Reference.Id + ":" + PickS1);
    }
    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add(Names.T3);
        }
    }
}
