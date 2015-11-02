package com.nath99000.toughertools.item.Unique.Weaponry;

import com.nath99000.toughertools.item.Wrapper.SchematicTT;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ASchematic extends SchematicTT {

    private String name;
    private String tag;

    public ASchematic(String toolName, String tagtext) {
        super();
        setUnlocalizedName("Schematic");
        name = toolName;
        tag = tagtext;
    }

    public void addInformation(ItemStack itemStack, EntityPlayer player, List par3, boolean par4) {
        {
            par3.add("§k" + name);
            par3.add(tag);
        }
    }
}
