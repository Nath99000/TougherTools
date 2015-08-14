package com.nath99000.toughertools.item;

import assets.toughertools.lang.Names;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemSchematic extends SchematicTT {

    public ItemSchematic(String toolName) {
        super();
        setUnlocalizedName("Schematic");
    }

    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4) {
        {
            par3.add("§kNoinfo4u!");
        }
    }
}
