package com.nath99000.toughertools.Entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class ProjectileLightning extends EntityThrowable {
    private static final String __OBFID = "CL_00001722";

    public ProjectileLightning(World p_i1773_1_)
    {
        super(p_i1773_1_);
    }

    public ProjectileLightning(World p_i1774_1_, EntityLivingBase p_i1774_2_)
    {
        super(p_i1774_1_, p_i1774_2_);
    }

    public ProjectileLightning(World p_i1775_1_, double p_i1775_2_, double p_i1775_4_, double p_i1775_6_)
    {
        super(p_i1775_1_, p_i1775_2_, p_i1775_4_, p_i1775_6_);
    }

    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    protected void onImpact(MovingObjectPosition p_70184_1_)
    {
        for (int i = 0; i < 8; ++i)
        {
            worldObj.spawnEntityInWorld(new EntityLightningBolt(worldObj, this.posX, this.posY, this.posZ));
        }

        if (!this.worldObj.isRemote)
        {
            this.setDead();
        }
    }
}
