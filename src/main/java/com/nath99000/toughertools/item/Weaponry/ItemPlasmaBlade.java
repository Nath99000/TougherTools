package com.nath99000.toughertools.item.Weaponry;

import com.nath99000.toughertools.Reference.Names;
import com.nath99000.toughertools.item.Wrapper.ItemSwordTT;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemPlasmaBlade extends ItemSwordTT{
    public ItemPlasmaBlade(ToolMaterial material, String name){
        super(material);
        setUnlocalizedName(name);
    }

    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add(Names.rare);
        }
    }

    public boolean hitEntity(ItemStack stack, EntityLivingBase enemy, EntityLivingBase player)
    {
        enemy.setFire(50);
        return true;
    }
}
