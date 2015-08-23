package com.nath99000.toughertools.item.Weaponry;

import com.nath99000.toughertools.Reference.Names;
import com.nath99000.toughertools.item.Wrapper.ItemSwordTT;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemDagger extends ItemSwordTT{
    public ItemDagger(ToolMaterial toolMaterial, String name){
        super(toolMaterial);
        setUnlocalizedName(name);
    }

    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4){
        {
            par3.add(Names.common);
        }
    }
}
