package com.nath99000.toughertools.gui;

import com.nath99000.toughertools.Reference.Reference;
import com.nath99000.toughertools.container.ContainerSmelter;
import com.nath99000.toughertools.tileentity.TileEntitySmelter;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class GuiSmelter extends GuiContainer {

    public static final ResourceLocation bground = new ResourceLocation(Reference.Id + ":textures/gui/GuiSmelter.png");

    public TileEntitySmelter smelter;

    public GuiSmelter(InventoryPlayer inventoryPlayer, TileEntitySmelter entity) {
        super(new ContainerSmelter(inventoryPlayer, entity));

        this.smelter = entity;

        this.xSize=176;
        this.ySize=166;
    }

    public void drawGuiContainerForegroundLayer(int par1, int par2){
       String name = this.smelter.hasCustomInventoryName()? this.smelter.getInventoryName(): I18n.format(this.smelter.getInventoryName(), new Object[0]);
        this.fontRendererObj.drawString(name, this.xSize / 2 - this.fontRendererObj.getStringWidth(name) / 2, 6, 4210752);
        this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 120, this.ySize - 96 + 2, 4210752);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_) {
        GL11.glColor4f(1F, 1F, 1F, 1F);
        Minecraft.getMinecraft().getTextureManager().bindTexture(bground);
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
    }
}
