package com.nath99000.toughertools.item.Pickaxes;

import com.nath99000.toughertools.Reference.Names;
import com.nath99000.toughertools.Reference.Reference;
import com.nath99000.toughertools.creativetab.TTTab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemPickW4 extends ItemPickaxe{
    public ItemPickW4(String PickW4, ToolMaterial Wood4) {
        super(Wood4);
        this.setCreativeTab(TTTab.TTTab);
        this.setUnlocalizedName(PickW4);
        this.setTextureName(Reference.Id + ":" + PickW4);
    }
    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add(Names.T4);
            par3.add(Names.modifier);
        }
    }
}
