package com.nath99000.toughertools.item.Weaponry;

import com.nath99000.toughertools.Reference.Reference;
import com.nath99000.toughertools.creativetab.TTTab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

import java.util.List;

public class ItemSwordW1 extends ItemSword{
    public ItemSwordW1(String SwordW1, ToolMaterial Wood1) {
        super(Wood1);
        this.setCreativeTab(TTTab.TTTab);
        this.setUnlocalizedName(SwordW1);
        this.setTextureName(Reference.Id + ":" + SwordW1);
    }
    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add("Poorly made");
        }
    }
}
