package com.nath99000.toughertools.item.Items;

import com.nath99000.toughertools.item.Wrapper.ItemTT;
import net.minecraft.item.Item;

public class ItemCrafting extends ItemTT{

    public ItemCrafting(String type, String material, String tier){
        super();
        setUnlocalizedName(type + material + tier);
    }

    public Item setMaxStack(int num){
        if (num > 64){
            num = 64;
        } else if (num < 1){
            num = 1;
        }
        this.setMaxStackSize(num);
        return this;
    }
}
