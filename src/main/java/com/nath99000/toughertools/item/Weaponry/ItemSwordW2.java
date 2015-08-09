package com.nath99000.toughertools.item.Weaponry;

import assets.toughertools.lang.Names;
import com.nath99000.toughertools.Reference.Reference;
import com.nath99000.toughertools.creativetab.TTTab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

import java.util.List;

public class ItemSwordW2 extends ItemSword{
    public ItemSwordW2(String SwordW2, ToolMaterial Wood2) {
        super(Wood2);
        this.setCreativeTab(TTTab.TTTab);
        this.setUnlocalizedName(SwordW2);
        this.setTextureName(Reference.Id + ":" + SwordW2);
    }
    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add(Names.T2);
        }
    }
}
