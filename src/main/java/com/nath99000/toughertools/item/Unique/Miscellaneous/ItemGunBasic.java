package com.nath99000.toughertools.item.Unique.Miscellaneous;

import com.nath99000.toughertools.Entity.ProjectileBullet;
import com.nath99000.toughertools.creativetab.TTTab;
import com.nath99000.toughertools.item.Wrapper.UniqueTT;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class ItemGunBasic extends UniqueTT {
    public ItemGunBasic(String name) {
        super();
        setUnlocalizedName("Gun" + name);
        setCreativeTab(TTTab.TabTech);
        setFull3D();
    }

    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        player.swingItem();
        EntityThrowable bullet = new ProjectileBullet(world);
        Vec3 look = player.getLookVec();
        bullet.setPosition(
                player.posX + look.xCoord * 5,
                (player.posY + look.yCoord * 5) + 1,
                player.posZ + look.zCoord * 5);
        bullet.motionX = (look.xCoord*4);
        bullet.motionY = look.yCoord*4;
        bullet.motionZ = (look.zCoord*4);
        if (!world.isRemote) {
            world.spawnEntityInWorld(bullet);
        }
        return stack;
    }
}
