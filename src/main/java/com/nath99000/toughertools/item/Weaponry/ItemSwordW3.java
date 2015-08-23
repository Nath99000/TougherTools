package com.nath99000.toughertools.item.Weaponry;

import com.nath99000.toughertools.Reference.Names;
import com.nath99000.toughertools.Reference.Reference;
import com.nath99000.toughertools.creativetab.TTTab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

import java.util.List;

public class ItemSwordW3 extends ItemSword{
    public ItemSwordW3(String SwordW3, ToolMaterial Wood3) {
        super(Wood3);
        this.setCreativeTab(TTTab.TTTab);
        this.setUnlocalizedName(SwordW3);
        this.setTextureName(Reference.Id + ":" + SwordW3);
    }
    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add(Names.T3);
        }
    }
}
