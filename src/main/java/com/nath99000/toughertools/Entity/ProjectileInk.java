package com.nath99000.toughertools.Entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class ProjectileInk  extends EntityThrowable
{
    private static final String __OBFID = "CL_00001722";

    public ProjectileInk(World p_i1773_1_)
    {
        super(p_i1773_1_);
    }

    private static String Color;

    public ProjectileInk(World p_i1774_1_, EntityLivingBase p_i1774_2_, String color)
    {
        super(p_i1774_1_, p_i1774_2_);
        Color = color;
    }

    public ProjectileInk(World world, double x, double y, double z)
    {
        super(world, x, y, z);
    }

    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    protected void onImpact(MovingObjectPosition p_70184_1_)
    {
        if (p_70184_1_.entityHit != null)
        {
            byte b0 = 7;

            p_70184_1_.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float)b0);
        }

        for (int i = 0; i < 8; ++i)
        {
            this.worldObj.spawnParticle("snowballpoof", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
        }

        if (!this.worldObj.isRemote)
        {
            this.setDead();
        }
    }
}
