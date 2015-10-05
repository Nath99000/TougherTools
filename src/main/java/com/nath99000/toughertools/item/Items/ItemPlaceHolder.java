
package com.nath99000.toughertools.item.Items;

import com.nath99000.toughertools.Reference.Reference;
import com.nath99000.toughertools.item.Wrapper.*;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;


//PlaceHolders for other mods. Hooray!
public class ItemPlaceHolder extends com.nath99000.toughertools.item.Wrapper.ItemPlaceHolder{

    private String phname;
    private String modname;
    public ItemPlaceHolder(String name, String mod){
        super();
        setUnlocalizedName("PlaceHolder");
        phname = name;
        modname = mod;
    }

    public void addInformation(ItemStack itemStack, EntityPlayer player, List par3, boolean par4) {
        par3.add(phname);
        par3.add(modname);
    }
}