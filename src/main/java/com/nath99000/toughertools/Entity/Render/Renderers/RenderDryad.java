package com.nath99000.toughertools.Entity.Render.Renderers;

import com.nath99000.toughertools.Entity.EntityDryad;
import com.nath99000.toughertools.Reference.Reference;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderDryad extends RenderLiving {

    private static final ResourceLocation dryad = new ResourceLocation(Reference.Id + ":textures/entity/Dryad.png");

    public RenderDryad(ModelBase par1, float par2) {
        super(par1, par2);
    }

    protected ResourceLocation textureDryad(EntityDryad par1){
        return dryad;
    }

    protected ResourceLocation getEntityTexture(Entity par1) {
        return this.textureDryad((EntityDryad) par1);
    }
}