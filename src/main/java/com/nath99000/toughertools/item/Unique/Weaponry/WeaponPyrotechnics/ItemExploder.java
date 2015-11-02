package com.nath99000.toughertools.item.Unique.Weaponry.WeaponPyrotechnics;

import com.nath99000.toughertools.Entity.ProjectileExplosion;
import com.nath99000.toughertools.item.Wrapper.UniqueTT;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemExploder extends UniqueTT{

    public ItemExploder(){
        super();
        setUnlocalizedName("Exploder");
        setMaxDamage(3);
    }

    public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_)
    {
        if (!p_77659_3_.capabilities.isCreativeMode)
        {
            p_77659_1_.damageItem(1, p_77659_3_);
        }

        if (!p_77659_2_.isRemote)
        {
            p_77659_2_.spawnEntityInWorld(new ProjectileExplosion(p_77659_2_, p_77659_3_));
        }

        return p_77659_1_;
    }
}
