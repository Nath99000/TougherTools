package com.nath99000.toughertools.Entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class ProjectileBomb extends EntityThrowable {

    private static final String __OBFID = "CL_00001722";
    private static int tick = 0;

    public ProjectileBomb(World p_i1773_1_)
    {
        super(p_i1773_1_);
    }

    public ProjectileBomb(World p_i1774_1_, EntityLivingBase p_i1774_2_)
    {
        super(p_i1774_1_, p_i1774_2_);
    }

    @Override
    public void onUpdate(){
        if(!this.worldObj.isRemote){
            tick++;
            if (tick == 160){
                tick = 0;
                worldObj.createExplosion(this, this.posX, this.posY - 1, this.posZ, 2.7f, true);
                this.setDead();
            }
        }
    }

    public ProjectileBomb(World p_i1775_1_, double p_i1775_2_, double p_i1775_4_, double p_i1775_6_)
    {
        super(p_i1775_1_, p_i1775_2_, p_i1775_4_, p_i1775_6_);
    }

    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    protected void onImpact(MovingObjectPosition p_70184_1_)
    {

    }
}
