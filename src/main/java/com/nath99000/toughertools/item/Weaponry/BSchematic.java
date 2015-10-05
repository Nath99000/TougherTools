package com.nath99000.toughertools.item.Weaponry;

import com.nath99000.toughertools.Reference.Names;
import com.nath99000.toughertools.item.Wrapper.SchematicTT;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class BSchematic extends SchematicTT {

    private String name;
    private String tag;

    public BSchematic(String toolName, String tagtext) {
        super();
        setUnlocalizedName("Schematic");
        name = toolName;
        tagtext = tag;
    }

    public void addInformation(ItemStack itemStack, EntityPlayer player, List par3, boolean par4) {
        {
            par3.add(name);
            par3.add(tag);
        }
    }
}
