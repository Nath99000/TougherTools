package com.nath99000.toughertools.proxy;

import com.nath99000.toughertools.Entity.EntityCaveMite;
import com.nath99000.toughertools.Entity.EntityDireWolf;
import com.nath99000.toughertools.Entity.EntityDryad;
import com.nath99000.toughertools.Entity.ProjectileBullet;
import com.nath99000.toughertools.Entity.Render.ModelCaveMite;
import com.nath99000.toughertools.Entity.Render.ModelDirewolf;
import com.nath99000.toughertools.Entity.Render.ModelDryad;
import com.nath99000.toughertools.Entity.Render.Renderers.RenderCaveMite;
import com.nath99000.toughertools.Entity.Render.Renderers.RenderDireWolf;
import com.nath99000.toughertools.Entity.Render.Renderers.RenderDryad;
import com.nath99000.toughertools.Render.ItemRenderToolTable;
import com.nath99000.toughertools.Render.RenderToolTable;
import com.nath99000.toughertools.init.ModBlocks;
import com.nath99000.toughertools.init.ModItems;
import com.nath99000.toughertools.tileentity.TileEntityTable;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy
{
    public void registerRenderThings(){
        TileEntitySpecialRenderer renderer = new RenderToolTable();
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTable.class, renderer);
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.BlockToolTable), new ItemRenderToolTable(renderer, new TileEntityTable()));
        RenderingRegistry.registerEntityRenderingHandler(EntityCaveMite.class, new RenderCaveMite(new ModelCaveMite(), 0.5f));
        RenderingRegistry.registerEntityRenderingHandler(EntityDryad.class, new RenderDryad(new ModelDryad(), 0.5f));
        RenderingRegistry.registerEntityRenderingHandler(EntityDireWolf.class, new RenderDireWolf(new ModelDirewolf(), 0.5f, 1.5f));
        RenderingRegistry.registerEntityRenderingHandler(ProjectileBullet.class, new RenderSnowball(ModItems.bullet));
    }
}
