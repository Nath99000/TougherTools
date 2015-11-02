package com.nath99000.toughertools.Entity;

import com.nath99000.toughertools.Reference.Particles;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class ProjectileBullet extends EntityThrowable{

        public ProjectileBullet(World world)
        {
            super(world);
        }

        public ProjectileBullet(World world, EntityLivingBase entity)
        {
            super(world, entity);
        }

        public ProjectileBullet(World world, double x, double y, double z)
        {
            super(world, x, y, z);
        }

        /**
         * Called when this EntityThrowable hits a block or entity.
         */
    protected void onImpact(MovingObjectPosition position)
    {
        if (position.entityHit != null)
        {
            byte b0 = (byte)(worldObj.rand.nextInt()-5);

            position.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float)b0);
            worldObj.spawnParticle(Particles.reddust, posX + worldObj.rand.nextDouble(), posY + worldObj.rand.nextDouble(), posZ + worldObj.rand.nextDouble(), 0, 0, 0);
            worldObj.spawnParticle(Particles.reddust, posX-worldObj.rand.nextDouble(), posY+worldObj.rand.nextDouble(), posZ-worldObj.rand.nextDouble(), 0, 0, 0);
        }

        for (int i = 0; i < 8; ++i)
        {
            this.worldObj.spawnParticle("smoke", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
        }

        if (!this.worldObj.isRemote)
        {
            this.setDead();
        }
    }

    @Override
    protected float getGravityVelocity()
    {
        return 0F;
    }
}
