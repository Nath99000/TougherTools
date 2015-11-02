package com.nath99000.toughertools.item.Unique.Weaponry;

import com.nath99000.toughertools.item.Wrapper.ItemSwordTT;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class WeaponInstaKill extends ItemSwordTT{

    private static Class theEntity;

    public WeaponInstaKill(Class entityLivingBase){
        super(ToolMaterial.STONE);
        setUnlocalizedName(entityLivingBase + "Killer");
        setMaxStackSize(1);
        theEntity = entityLivingBase;
    }

    public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity)
    {
        Class compare = entity.getClass();
        if (entity instanceof EntityLivingBase && theEntity == compare){
            if (player.worldObj.rand.nextFloat() == 0.5 || player.worldObj.rand.nextFloat() == 0.6 || player.worldObj.rand.nextFloat() == 0.7){
                ((EntityLivingBase) entity).setHealth(0);
            }
        }
        return false;
    }
}
