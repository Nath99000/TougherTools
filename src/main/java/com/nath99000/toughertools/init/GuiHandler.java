package com.nath99000.toughertools.init;

import com.nath99000.toughertools.container.ContainerSmelter;
import com.nath99000.toughertools.gui.GuiSmelter;
import com.nath99000.toughertools.tileentity.TileEntitySmelter;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler{
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity entity = world.getTileEntity(x, y, z);

        if(entity!=null){
            switch(ID){
                case ModBlocks.guiIDSmelter:
                    if(entity instanceof TileEntitySmelter){
                        return new ContainerSmelter(player.inventory, (TileEntitySmelter) entity);
                    }
            }
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity entity = world.getTileEntity(x, y, z);

        if(entity!=null){
            switch(ID){
                case ModBlocks.guiIDSmelter:
                    if(entity instanceof TileEntitySmelter){
                        return new GuiSmelter(player.inventory, (TileEntitySmelter) entity);
                    }
            }
        }
        return null;
    }
}
