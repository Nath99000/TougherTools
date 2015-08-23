package com.nath99000.toughertools.item.Weaponry;

import com.nath99000.toughertools.Reference.Names;
import com.nath99000.toughertools.Reference.Reference;
import com.nath99000.toughertools.creativetab.TTTab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

import java.util.List;

public class ItemSwordW5 extends ItemSword{
    public ItemSwordW5(String SwordW5, ToolMaterial Wood5) {
        super(Wood5);
        this.setCreativeTab(TTTab.TTTab);
        this.setUnlocalizedName(SwordW5);
        this.setTextureName(Reference.Id + ":" + SwordW5);
    }
    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add(Names.T5);
            par3.add(Names.modifier);
        }
    }
}
