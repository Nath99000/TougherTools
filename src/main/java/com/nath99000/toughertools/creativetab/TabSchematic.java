package com.nath99000.toughertools.creativetab;

import com.nath99000.toughertools.Reference.Reference;
import com.nath99000.toughertools.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabSchematic {
    public static final CreativeTabs TabSchematic = new CreativeTabs(Reference.Id)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.SchematicCleaver;
        }
        @Override
        public String getTranslatedTabLabel()
        {
            return "TougherTools Schematics";
        }
    };
}
