package com.nath99000.toughertools.Render;


import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

public class ItemRenderToolTable implements IItemRenderer{

    private TileEntity entity;
    TileEntitySpecialRenderer render;

    public ItemRenderToolTable(TileEntitySpecialRenderer render, TileEntity entity){
        this.entity = entity;
        this.render = render;
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        if(type == ItemRenderType.ENTITY){
            GL11.glTranslatef(-0.5f, 0f, -0.5f);
            this.render.renderTileEntityAt(this.entity, 0d, 0d, 0d, 0f);
        }
    }
}
