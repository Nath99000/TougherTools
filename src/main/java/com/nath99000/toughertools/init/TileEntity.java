package com.nath99000.toughertools.init;

import com.nath99000.toughertools.tileentity.TileEntitySmelter;
import cpw.mods.fml.common.registry.GameRegistry;

public class TileEntity {
    public static net.minecraft.tileentity.TileEntity smelter = new TileEntitySmelter();

    public static void init(){
        GameRegistry.registerTileEntity(TileEntitySmelter.class, "Smelter");
    }
}
