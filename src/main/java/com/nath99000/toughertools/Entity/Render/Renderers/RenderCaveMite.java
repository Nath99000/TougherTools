package com.nath99000.toughertools.Entity.Render.Renderers;

import com.nath99000.toughertools.Entity.EntityCaveMite;
import com.nath99000.toughertools.Entity.EntityDryad;
import com.nath99000.toughertools.Reference.Reference;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderCaveMite extends RenderLiving {

    private static final ResourceLocation cavemite = new ResourceLocation(Reference.Id + ":textures/entity/CaveMite.png");

    public RenderCaveMite(ModelBase par1, float par2) {
        super(par1, par2);
    }

    protected ResourceLocation textureCaveMite(EntityCaveMite par1){
        return cavemite;
    }

    protected ResourceLocation getEntityTexture(Entity par1){
        return this.textureCaveMite((EntityCaveMite) par1);
    }
}
