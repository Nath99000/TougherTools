package com.nath99000.toughertools.item.Unique.Miscellaneous;

import com.nath99000.toughertools.Entity.EntityDryad;
import com.nath99000.toughertools.Reference.LogHelper;
import com.nath99000.toughertools.Reference.Particles;
import com.nath99000.toughertools.init.ModItems;
import com.nath99000.toughertools.init.TTDamageSources;
import com.nath99000.toughertools.item.Wrapper.ItemTT;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class ItemSacrificeDagger extends ItemTT {
    public ItemSacrificeDagger() {
        super();
        setUnlocalizedName("SacrificeDagger");
        setMaxDamage(41);
        setFull3D();
    }

    public ItemStack onItemRightClick(ItemStack p_77659_1_, World par2World, EntityPlayer par3EntityPlayer) {
        par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.wither.id, 10, 3, true));
        par2World.spawnParticle(Particles.reddust, par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, 0d, 0d, 0d);
        par2World.spawnParticle(Particles.reddust, par3EntityPlayer.posX + 0.1, par3EntityPlayer.posY, par3EntityPlayer.posZ, 0d, 0d, 0d);
        par2World.spawnParticle(Particles.reddust, par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ + 0.1, 0d, 0d, 0d);
        par2World.spawnParticle(Particles.reddust, par3EntityPlayer.posX - 0.1, par3EntityPlayer.posY, par3EntityPlayer.posZ, 0d, 0d, 0d);
        par2World.spawnParticle(Particles.reddust, par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ - 0.1, 0d, 0d, 0d);
        par2World.spawnParticle(Particles.reddust, par3EntityPlayer.posX, par3EntityPlayer.posY - 0.1, par3EntityPlayer.posZ, 0d, 0d, 0d);
        if (par3EntityPlayer.inventory.hasItem(Items.glass_bottle)) {
            par3EntityPlayer.inventory.consumeInventoryItem(Items.glass_bottle);
            par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModItems.bloodbottle));
        }
        p_77659_1_.damageItem(1, par3EntityPlayer);
        return p_77659_1_;
    }

    public boolean hitEntity(ItemStack stack, EntityLivingBase enemy, EntityLivingBase player)
    {
        if (player instanceof EntityPlayer){
            if (((EntityPlayer) player).inventory.hasItemStack(new ItemStack(Items.glass_bottle))) {
                ((EntityPlayer) player).inventory.consumeInventoryItem(Items.glass_bottle);
                if (enemy instanceof EntityMagmaCube){
                    ((EntityPlayer) player).inventory.addItemStackToInventory(new ItemStack(ModItems.magmablood));
                } else if (enemy instanceof EntitySlime){
                    ((EntityPlayer) player).inventory.addItemStackToInventory(new ItemStack(ModItems.slimebottle));
                } else if (enemy instanceof EntitySkeleton){
                    ((EntityPlayer) player).inventory.addItemStackToInventory(new ItemStack(ModItems.marrowbottle));
                } else if (enemy instanceof EntityDragon){
                    ((EntityPlayer) player).inventory.addItemStackToInventory(new ItemStack(ModItems.dragonblood));
                } else if (enemy instanceof EntityWither){
                    ((EntityPlayer) player).inventory.addItemStackToInventory(new ItemStack(ModItems.witherblood));
                } else if (enemy instanceof EntityEnderman){
                    ((EntityPlayer) player).inventory.addItemStackToInventory(new ItemStack(ModItems.enderblood));
                } else if (enemy instanceof EntityGhast){
                    ((EntityPlayer) player).inventory.addItemStackToInventory(new ItemStack(ModItems.ghastlyblood));
                } else if (enemy instanceof EntitySquid){
                    ((EntityPlayer) player).inventory.addItemStackToInventory(new ItemStack(ModItems.inkblood));
                }


                else {
                    ((EntityPlayer) player).inventory.addItemStackToInventory(new ItemStack(ModItems.mobbloodbottle));
                }
            }
            LogHelper.weapon("Player " + ((EntityPlayer) player).getDisplayName() + " has drawn blood from an enemy" + " at" + ((EntityPlayer) player).posX + ", " + ((EntityPlayer) player).posY + ", " + ((EntityPlayer) player).posZ);
        }
        return true;
    }
}
