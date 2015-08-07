package com.nath99000.toughertools;

import com.nath99000.toughertools.Reference.Reference;
import com.nath99000.toughertools.Util.LogHelper;
import com.nath99000.toughertools.init.ModItems;
import com.nath99000.toughertools.init.Recipes;
import com.nath99000.toughertools.init.VanillaHandler;
import com.nath99000.toughertools.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.crafting.FurnaceRecipes;

@Mod(modid = Reference.Id, name = Reference.Name, version = Reference.Version)
public class TougherTools {

    @Mod.Instance("TougherTools")
    public static TougherTools instance;

    @SidedProxy(clientSide = Reference.Client, serverSide = Reference.Server)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent preinit){
        LogHelper.info("PreInitialization beginning!");
        //
        ModItems.init();
        VanillaHandler.init();
        Recipes.init();
        LogHelper.info("PreInitalization complete!");
    }
    @Mod.EventHandler
    public void Init(FMLInitializationEvent init){
        LogHelper.info("Initialization beginning!");
        //
        LogHelper.info("Initialization complete!");
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent postInit){
        LogHelper.info("PostInitialization beginning!");
        //
        LogHelper.info("PostInitialization complete!");
    }
}
