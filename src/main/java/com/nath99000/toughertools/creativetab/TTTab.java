package com.nath99000.toughertools.creativetab;

import com.nath99000.toughertools.Reference.Reference;
import com.nath99000.toughertools.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TTTab
{
    public static final CreativeTabs TTTab = new CreativeTabs(Reference.Id)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.PickW1;
        }
        @Override
    public String getTranslatedTabLabel()
        {
            return "TougherTools";
        }
    };

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

    public static final CreativeTabs TabCasts = new CreativeTabs(Reference.Id)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.CastIronInlay;
        }
        @Override
        public String getTranslatedTabLabel()
        {
            return "TougherTools Casts";
        }
    };

    public static final CreativeTabs TabPlaceHolder = new CreativeTabs(Reference.Id)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.thaumsteel;
        }
        @Override
        public String getTranslatedTabLabel()
        {
            return "TougherTools Placeholders";
        }
    };

    public static final CreativeTabs TabUnique = new CreativeTabs(Reference.Id) {
        @Override
        public Item getTabIconItem() {
            return ModItems.Cleaver;
        }
        @Override
    public String getTranslatedTabLabel(){
            return "TougherTools Unique";
        }
    };
}
