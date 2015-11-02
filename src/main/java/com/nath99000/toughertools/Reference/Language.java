package com.nath99000.toughertools.Reference;

import net.minecraft.util.StatCollector;

public class Language {

    public static String tooltip(String bit){
        return StatCollector.translateToLocal("toughertools.tooltip." + bit) + " ";
    }
}
