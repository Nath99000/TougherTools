package com.nath99000.toughertools.init.Particle;

import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.world.World;

public class EntityBlueDustFX extends EntityFX{
    float bluedustParticleScale;

    public EntityBlueDustFX(World p_i1223_1_, double p_i1223_2_, double p_i1223_4_, double p_i1223_6_)
    {
        this(p_i1223_1_, p_i1223_2_, p_i1223_4_, p_i1223_6_, 1.0F);
    }

    public EntityBlueDustFX(World p_i1224_1_, double p_i1224_2_, double p_i1224_4_, double p_i1224_6_, float p_i1224_8_)
    {
        super(p_i1224_1_, p_i1224_2_, p_i1224_4_, p_i1224_6_, 0.0D, 0.0D, 0.0D);
        this.motionX *= 0.10000000149011612D;
        this.motionY *= 0.10000000149011612D;
        this.motionZ *= 0.10000000149011612D;


        float par9red = 110;
        float par10green = 239;
        float par11blue = 241;

        float f4 = (float)Math.random() * 0.4F + 0.6F;
        this.particleRed = 0.320f;
        this.particleGreen = 0.500f;
        this.particleBlue = 0.582f;
        this.particleScale *= 0.75F;
        this.particleScale *= p_i1224_8_;
        this.bluedustParticleScale = this.particleScale;
        this.particleMaxAge = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
        this.particleMaxAge = (int)((float)this.particleMaxAge * p_i1224_8_);
        this.noClip = false;
    }

    public void renderParticle(Tessellator p_70539_1_, float p_70539_2_, float p_70539_3_, float p_70539_4_, float p_70539_5_, float p_70539_6_, float p_70539_7_)
    {
        float f6 = ((float)this.particleAge + p_70539_2_) / (float)this.particleMaxAge * 32.0F;

        if (f6 < 0.0F)
        {
            f6 = 0.0F;
        }

        if (f6 > 1.0F)
        {
            f6 = 1.0F;
        }

        this.particleScale = this.bluedustParticleScale * f6;
        super.renderParticle(p_70539_1_, p_70539_2_, p_70539_3_, p_70539_4_, p_70539_5_, p_70539_6_, p_70539_7_);
    }

    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;

        if (this.particleAge++ >= this.particleMaxAge)
        {
            this.setDead();
        }

        this.setParticleTextureIndex(7 - this.particleAge * 8 / this.particleMaxAge);
        this.moveEntity(this.motionX, this.motionY, this.motionZ);

        if (this.posY == this.prevPosY)
        {
            this.motionX *= 1.1D;
            this.motionZ *= 1.1D;
        }

        this.motionX *= 0.9599999785423279D;
        this.motionY *= 0.9599999785423279D;
        this.motionZ *= 0.9599999785423279D;

        if (this.onGround)
        {
            this.motionX *= 0.699999988079071D;
            this.motionZ *= 0.699999988079071D;
        }
    }
}
