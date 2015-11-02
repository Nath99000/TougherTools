package com.nath99000.toughertools;

import com.nath99000.toughertools.Handler.EventHandler;
import com.nath99000.toughertools.Reference.Reference;
import com.nath99000.toughertools.Reference.LogHelper;
import com.nath99000.toughertools.crafting.ToolTableCraftingManager;
import com.nath99000.toughertools.init.*;
import com.nath99000.toughertools.proxy.IProxy;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

@Mod(modid = Reference.Id, name = Reference.Name, version = Reference.Version)
public class TougherTools {

    @Mod.Instance("TougherTools")
    public static TougherTools instance;

    @SidedProxy(clientSide = Reference.Client, serverSide = Reference.Server)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent preinit){
        LogHelper.info("PreInitialization beginning!");
        ModItems.init();
        ModItems.initTech();
        ModItems.initMagic();
        VanillaHandler.smelting();
        //
        ModEntity.register();
        ModBlocks.init();
        OreDict.init();
        VanillaHandler.init();
        Recipes.oreRecipe();
        Recipes.toolrecipe(ToolTableCraftingManager.getInstance());
        ChestHandler.init();
        proxy.registerRenderThings();
        LogHelper.info("PreInitalization complete!");
    }
    @Mod.EventHandler
    public void Init(FMLInitializationEvent init){
        LogHelper.info("Initialization beginning!");
        //
        com.nath99000.toughertools.init.TileEntity.init();
        NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
        Recipes.init();
        Object eventHook = new EventHandler();
        FMLCommonHandler.instance().bus().register(eventHook);
        LogHelper.info("Initialization complete!");
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent postInit){
        LogHelper.info("PostInitialization beginning!");
        //
        LogHelper.info("PostInitialization complete!");
    }
}
