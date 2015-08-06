package com.nath99000.toughertools.item.Weaponry;

import com.nath99000.toughertools.item.ItemTT;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

public class ItemSnowBallLauncher extends ItemTT {
    public ItemSnowBallLauncher(){
        super();
        setUnlocalizedName("Snowballlauncher");
        this.setMaxDamage(1500);
    }
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
        if (player.inventory.hasItem(Items.snowball)) {
            if (!player.capabilities.isCreativeMode) {
                itemstack.damageItem(1, player);
            }

            world.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

            if (!world.isRemote) {
                world.spawnEntityInWorld(new EntitySnowball(world, player));
                world.spawnEntityInWorld(new EntitySnowball(world, player));
                world.spawnEntityInWorld(new EntitySnowball(world, player));
                world.spawnEntityInWorld(new EntitySnowball(world, player));
                world.spawnEntityInWorld(new EntitySnowball(world, player));
                world.spawnEntityInWorld(new EntitySnowball(world, player));
                world.spawnEntityInWorld(new EntitySnowball(world, player));
                world.spawnEntityInWorld(new EntitySnowball(world, player));
                world.createExplosion(player, player.posX, player.posY, player.posZ, 10, false);
                world.spawnEntityInWorld(new EntitySnowball(world, player));
                world.spawnEntityInWorld(new EntitySnowball(world, player));
                world.spawnEntityInWorld(new EntitySnowball(world, player));
                world.spawnEntityInWorld(new EntitySnowball(world, player));
                world.spawnEntityInWorld(new EntitySnowball(world, player));
                world.spawnEntityInWorld(new EntitySnowball(world, player));
                world.spawnEntityInWorld(new EntitySnowball(world, player));
                world.spawnEntityInWorld(new EntitySnowball(world, player));
                world.createExplosion(player, player.posX, player.posY, player.posZ, 10, false);
            }

            return itemstack;
        }
        return itemstack;
    }
    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add("\"Sicarius of flamma\"");
        }
    }
}
