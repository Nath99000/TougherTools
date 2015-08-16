package com.nath99000.toughertools.item.Weaponry;

import assets.toughertools.lang.Names;
import com.nath99000.toughertools.item.Wrapper.SchematicTT;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ASchematic extends SchematicTT {

    private String name;

    public ASchematic(String toolName) {
        super();
        setUnlocalizedName("Schematic");
        name = toolName;
    }

    public void addInformation(ItemStack itemStack, EntityPlayer player, List par3, boolean par4) {
        {
            par3.add("§k" + name);
            if(name=="Cleaver"){
                par3.add(Names.legendary);
            }
            if(name=="SnowballLauncher"){
                par3.add(Names.epic);
            }
            if(name=="Dartgun"){
                par3.add(Names.common);
            }
            if(name=="DaggerAssasin"){
                par3.add(Names.rare);
            }
            if(name=="Arcanesword"){
                par3.add(Names.rare);
            }
            if(name=="Plasmablade"){
                par3.add(Names.rare);
            }
            if(name=="LightningStaff"){
                par3.add(Names.godly);
            }
        }
    }
}
