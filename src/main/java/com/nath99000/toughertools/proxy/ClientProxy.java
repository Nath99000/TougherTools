package com.nath99000.toughertools.proxy;

import com.nath99000.toughertools.Render.ItemRenderToolTable;
import com.nath99000.toughertools.Render.RenderToolTable;
import com.nath99000.toughertools.init.ModBlocks;
import com.nath99000.toughertools.tileentity.TileEntityTable;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy
{
    public void registerRenderThings(){
        TileEntitySpecialRenderer renderer = new RenderToolTable();
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTable.class, renderer);
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.BlockToolTable), new ItemRenderToolTable(renderer, new TileEntityTable()));
    }

    public void registerTileEntitySpecialRenderer(){

    }
}
