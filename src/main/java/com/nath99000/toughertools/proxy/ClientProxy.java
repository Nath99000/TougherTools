package com.nath99000.toughertools.proxy;

import com.nath99000.toughertools.Render.RenderToolTable;
import com.nath99000.toughertools.tileentity.TileEntityTable;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy
{
    public void registerRenderThings(){
        TileEntitySpecialRenderer renderer = new RenderToolTable();
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTable.class, renderer);
    }

    public void registerTileEntitySpecialRenderer(){

    }
}
