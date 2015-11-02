package com.nath99000.toughertools.creativetab;

import com.nath99000.toughertools.Reference.Reference;
import com.nath99000.toughertools.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.StatCollector;

public class TTTab
{
    public static final CreativeTabs TTTab = new CreativeTabs(Reference.Id)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.pickw[1];
        }
        @Override
    public String getTranslatedTabLabel()
        {
            return StatCollector.translateToLocal("toughertools.tab.normal");
        }
        @Override
        public boolean hasSearchBar()
        {
            return true;
        }
    };

    public static final CreativeTabs TabMagic = new CreativeTabs(Reference.Id)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.spellRain;
        }
        @Override
        public String getTranslatedTabLabel()
        {
            return StatCollector.translateToLocal("toughertools.tab.magic");
        }
    };

    public static final CreativeTabs TabTech = new CreativeTabs(Reference.Id)
{
    @Override
    public Item getTabIconItem()
    {
        return ModItems.Bomb;
    }
    @Override
    public String getTranslatedTabLabel()
    {
        return StatCollector.translateToLocal("toughertools.tab.tech");
    }
};
}
