package com.nath99000.toughertools.item.Weaponry.WeaponPyrotechnics;

import com.nath99000.toughertools.Entity.ProjectileBomb;
import com.nath99000.toughertools.item.Wrapper.UniqueTT;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemLandmine extends UniqueTT{

    public ItemLandmine(){
        super();
        setUnlocalizedName("Bomb");
    }

    public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_)
    {
        if (!p_77659_3_.capabilities.isCreativeMode)
        {
            --p_77659_1_.stackSize;
        }

        if (!p_77659_2_.isRemote)
        {
            p_77659_2_.spawnEntityInWorld(new ProjectileBomb(p_77659_2_, p_77659_3_));
        }

        return p_77659_1_;
    }
}
