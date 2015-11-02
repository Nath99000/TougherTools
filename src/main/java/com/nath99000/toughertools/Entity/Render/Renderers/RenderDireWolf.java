package com.nath99000.toughertools.Entity.Render.Renderers;

import com.nath99000.toughertools.Entity.EntityDireWolf;
import com.nath99000.toughertools.Reference.Reference;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityGiantZombie;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderDireWolf extends RenderLiving{

    private float scale;
    private static final ResourceLocation direwolf = new ResourceLocation(Reference.Id + ":textures/entity/DireWolf.png");
    private static final ResourceLocation tamedWolfTextures = new ResourceLocation(Reference.Id + ":textures/entity/DireWolfTame.png");
    private static final ResourceLocation anrgyWolfTextures = new ResourceLocation(Reference.Id + ":textures/entity/DireWolfAngry.png");
    private static final ResourceLocation wolfCollarTextures = new ResourceLocation(Reference.Id + ":textures/entity/collar.png");

    public RenderDireWolf(ModelBase par1, float par2, float size) {
        super(par1, par2*size);
        this.scale = size;
    }

    /**
     * Defines what float the third param in setRotationAngles of ModelBase is
     */
    protected float handleRotationFloat(EntityDireWolf p_77044_1_, float p_77044_2_)
    {
        return p_77044_1_.getTailRotation();
    }

    /**
     * Queries whether should render the specified pass or not.
     */
    protected int shouldRenderPass(EntityDireWolf p_77032_1_, int p_77032_2_, float p_77032_3_)
    {
        if (p_77032_2_ == 0 && p_77032_1_.getWolfShaking())
        {
            float f1 = p_77032_1_.getBrightness(p_77032_3_) * p_77032_1_.getShadingWhileShaking(p_77032_3_);
            this.bindTexture(direwolf);
            GL11.glColor3f(f1, f1, f1);
            return 1;
        }
        else
        {
            return -1;
        }
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityDireWolf p_110775_1_)
    {
        return p_110775_1_.isTamed() ? tamedWolfTextures : (p_110775_1_.isAngry() ? anrgyWolfTextures : direwolf);
    }

    /**
     * Queries whether should render the specified pass or not.
     */
    protected int shouldRenderPass(EntityLivingBase p_77032_1_, int p_77032_2_, float p_77032_3_)
    {
        return this.shouldRenderPass((EntityDireWolf)p_77032_1_, p_77032_2_, p_77032_3_);
    }

    /**
     * Defines what float the third param in setRotationAngles of ModelBase is
     */
    protected float handleRotationFloat(EntityLivingBase p_77044_1_, float p_77044_2_)
    {
        return this.handleRotationFloat((EntityDireWolf) p_77044_1_, p_77044_2_);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity p_110775_1_)
    {
        return this.getEntityTexture((EntityDireWolf) p_110775_1_);
    }

    protected void preRenderCallback(EntityDireWolf p_77041_1_, float p_77041_2_)
    {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }

    protected void preRenderCallback(EntityLivingBase p_77041_1_, float p_77041_2_)
    {
        this.preRenderCallback((EntityDireWolf) p_77041_1_, p_77041_2_);
    }
}
