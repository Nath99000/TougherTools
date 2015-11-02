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
    public static final String Name = "TougherTools";
    public static final String Version = "1.7.10-10";

    public static int[] getPosition(EntityPlayer player){
        int[] location = new int[2];
        location[0] = (int)Math.round(player.posX);
        location[1] = (int)Math.round(player.posY);
        location[2] = (int)Math.round(player.posZ);
        return location;
    }

    public static int SectoTick(int sec){
        return (sec * 20);
    }

    public static int TicktoSec(int tick){
        return (int)Math.round((tick/20));
    }

    public static int MintoTick(int min){
        return SectoTick((min * 60));
    }

    public static int TicktoMin(int tick){
        return (int)Math.round((tick/1200));
    }
}
