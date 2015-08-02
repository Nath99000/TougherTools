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
}
