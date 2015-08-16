package com.nath99000.toughertools.item.Casts;

import com.nath99000.toughertools.item.Wrapper.CastTT;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class Cast extends CastTT {

    private String type;

    public Cast(String material, String part){
        super();
        setUnlocalizedName("Cast" + part);
        type = material;
    }

    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4){
        {
            par3.add("§7" + type);
        }
    }

}
