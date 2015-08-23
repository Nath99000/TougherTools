package com.nath99000.toughertools.item.Weaponry;

import com.nath99000.toughertools.Reference.Names;
import com.nath99000.toughertools.item.Wrapper.ItemSwordTT;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemBotaniaSword extends ItemSwordTT{
    public ItemBotaniaSword(ToolMaterial material){
        super(material);
        setUnlocalizedName("BotaniaSword");
    }


    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4){
        {
            par3.add(Names.epic);
            par3.add(Names.botania);
        }
    }
}
