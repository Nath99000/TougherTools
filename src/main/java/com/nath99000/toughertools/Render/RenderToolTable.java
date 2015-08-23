package com.nath99000.toughertools.Render;

import assets.toughertools.models.ModelToolTable;
import com.nath99000.toughertools.Reference.Reference;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderToolTable extends TileEntitySpecialRenderer{

    private static final ResourceLocation texture = new ResourceLocation(Reference.Id + ":textures/blocks/ToolTable.png");

    private ModelToolTable model;

    public RenderToolTable(){
        this.model = new ModelToolTable();
    }

    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f) {
        GL11.glPushMatrix();
         GL11.glTranslatef((float) x + 0.5f, (float) y + 1.5f, (float) z + 0.5f);
         GL11.glRotatef(180, 0f, 0f, 1f);
         this.bindTexture(texture);
         GL11.glPushMatrix();
          this.model.renderModel(0.0625f);
         GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
