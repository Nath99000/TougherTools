package com.nath99000.toughertools.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import scala.Function;
import scala.reflect.internal.Constants;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

public class Reference
{
    public static final String Client = "com.nath99000.toughertools.proxy.ClientProxy";
    public static final String Server = "com.nath99000.toughertools.proxy.ServerProxy";
    public static final String Id = "TougherTools";
    public static final String Name = "Tougher Tools";
    public static final String Version = "1.7.10-10";
    //public static Function tag = public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4) {{par3.add("Well made");}}
}
