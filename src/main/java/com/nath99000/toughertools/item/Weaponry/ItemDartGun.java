package com.nath99000.toughertools.item.Weaponry;

import com.nath99000.toughertools.item.ItemTT;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemDartGun extends ItemTT {
    public ItemDartGun() {
        super();
        setUnlocalizedName("DartGun");
        setMaxDamage(43);
        this.setFull3D();
    }

    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
        if (!player.capabilities.isCreativeMode) {
            if (player.inventory.hasItem(Items.arrow)) {
                itemstack.damageItem(1, player);
                world.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
                if (!world.isRemote) {
                    EntityArrow entityarrow = new EntityArrow(world, player, 3F);
                    entityarrow.setIsCritical(true);
                    world.spawnEntityInWorld(entityarrow);
                    player.inventory.consumeInventoryItem(Items.arrow);
                }
                return itemstack;
            }
            return itemstack;
        } else {
            world.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
            if (!world.isRemote) {
                EntityArrow entityarrow = new EntityArrow(world, player, 3F);
                entityarrow.setIsCritical(true);
                world.spawnEntityInWorld(entityarrow);
            }
        }
        return itemstack;
    }
}

