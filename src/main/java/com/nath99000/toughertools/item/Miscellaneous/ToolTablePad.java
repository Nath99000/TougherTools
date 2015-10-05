package com.nath99000.toughertools.item.Miscellaneous;

import com.nath99000.toughertools.TougherTools;
import com.nath99000.toughertools.init.ModBlocks;
import com.nath99000.toughertools.item.Wrapper.ItemTT;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ToolTablePad extends ItemTT{
    public ToolTablePad(){
        super();
        setUnlocalizedName("ToolTablePad");
    }

    @Override
    public boolean onItemUse(ItemStack itemStack, EntityPlayer entityPlayer, World world, int x, int y, int z, int sideHit, float hitVecX, float hitVecY, float hitVecZ) {

        if (world.isRemote) {
            entityPlayer.openGui(TougherTools.instance, ModBlocks.guiIDToolTable, world, x, y, z);
        }
        return true;
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer) {

        if (!world.isRemote) {
            entityPlayer.openGui(TougherTools.instance, ModBlocks.guiIDToolTable, entityPlayer.worldObj, (int) entityPlayer.posX, (int) entityPlayer.posY, (int) entityPlayer.posZ);
        }

        return itemStack;
    }
    // player.openGui(TougherTools.instance, ModBlocks.guiIDToolTable, world, x, y, z);
}
