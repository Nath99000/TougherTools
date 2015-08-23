package com.nath99000.toughertools.gui;

import com.nath99000.toughertools.Reference.Reference;
import com.nath99000.toughertools.container.ContainerToolTable;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

public class GuiToolTable extends GuiContainer{

    private ResourceLocation texture = new ResourceLocation(Reference.Id + ":textures/gui/ModelToolTable.png");
    public GuiToolTable(InventoryPlayer inventoryPlayer, World world, int x, int y, int z){
        super(new ContainerToolTable(inventoryPlayer, world, x, y, z));
        this.xSize = 176;
        this.ySize = 166;
    }

    public void onGuiClosed(){
        super.onGuiClosed();
    }

    protected void drawGuiContainerForegroundLayer(int par1, int par2){
       this.fontRendererObj.drawString(StatCollector.translateToLocal("Tool Table"), 100, 5, 0x210000);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
        GL11.glColor4f(1f, 1f, 1f, 1f);
        Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
    }
}
