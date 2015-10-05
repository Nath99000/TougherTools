package com.nath99000.toughertools.item.Items;

import com.nath99000.toughertools.item.Wrapper.ItemTT;

public class ItemCrafting extends ItemTT{

    public ItemCrafting(String type, String material, String tier){
        super();
        setUnlocalizedName(type + material + tier);
    }
}
