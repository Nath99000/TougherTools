package com.nath99000.toughertools.Entity.Render;

import com.nath99000.toughertools.Entity.EntityCaveMite;
import com.nath99000.toughertools.Reference.Reference;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderEntity extends RenderLiving {

    private static final ResourceLocation mobTextures = new ResourceLocation(Reference.Id + ":textures/entity/CaveMite.png");

    public RenderEntity(ModelBase par1, float par2) {
        super(par1, par2);
    }

    protected ResourceLocation getEntityTexture(EntityCaveMite par1){
        return mobTextures;
    }

    protected ResourceLocation getEntityTexture(Entity par1){
        return this.getEntityTexture((EntityCaveMite)par1);
    }
}
