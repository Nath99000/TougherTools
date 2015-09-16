package com.nath99000.toughertools.init;

import com.nath99000.toughertools.block.*;
import com.nath99000.toughertools.creativetab.TTTab;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlocks {
    public static Block SmelterIdle;
    public static Block SmelterActive;
    public static final int guiIDSmelter = 0;
    public static BlockTT Steel = new BlockSteel();
    public static Block BlockToolTable;
    public static final int guiIDToolTable = 1;
    public static Block inkred = new BlockInk("Red");

    public static void init(){
        SmelterIdle = new Smelter(false).setBlockName("SmelterIdle").setCreativeTab(TTTab.TTTab).setHardness(3.5F);
        SmelterActive = new Smelter(true).setBlockName("SmelterActive").setLightLevel(0.625F).setHardness(3.5F);
        BlockToolTable = new ToolTable();
        GameRegistry.registerBlock(SmelterIdle, "SmelterIdle");
        GameRegistry.registerBlock(SmelterActive, "SmelterActive");
        GameRegistry.registerBlock(Steel, "Steel");
        GameRegistry.registerBlock(BlockToolTable, "ModelToolTable");
        //GameRegistry.registerBlock(inkred, "inkred");
    }
}
