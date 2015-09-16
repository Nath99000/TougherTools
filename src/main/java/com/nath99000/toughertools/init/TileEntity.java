package com.nath99000.toughertools.init;

import com.nath99000.toughertools.tileentity.TileEntityInk;
import com.nath99000.toughertools.tileentity.TileEntitySmelter;
import com.nath99000.toughertools.tileentity.TileEntityTable;
import cpw.mods.fml.common.registry.GameRegistry;

public class TileEntity {
    public static net.minecraft.tileentity.TileEntity smelter = new TileEntitySmelter();

    public static void init(){
        GameRegistry.registerTileEntity(TileEntitySmelter.class, "Smelter");
        GameRegistry.registerTileEntity(TileEntityTable.class, "ToolTable");
        GameRegistry.registerTileEntity(TileEntityInk.class, "Ink");
    }
}
