package com.nath99000.toughertools.item.Unique.Weaponry;

import com.nath99000.toughertools.Reference.Names;
import com.nath99000.toughertools.item.Wrapper.ItemSwordTT;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import java.util.List;

public class ItemAssasinDagger extends ItemSwordTT{

    public ItemAssasinDagger(ToolMaterial toolMaterial, String name){
        super(toolMaterial);
        setUnlocalizedName(name);
    }

    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
        player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 250, 50, true));
        return itemstack;
    }

    @Override
    public void onUpdate(ItemStack stack, World world, Entity entity, int par4, boolean par5) {
        super.onUpdate(stack, world, entity, par4, par5);
        if (entity instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) entity;
            ItemStack equipped = player.getCurrentEquippedItem();
            if (equipped == stack) {
                player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 0, 1, true));
                world.spawnParticle("largesmoke", player.posX, player.posY - 2, player.posZ, 0d, 0d, 0d);
            }
        }
    }

    public boolean hitEntity(ItemStack stack, EntityLivingBase enemy, EntityLivingBase player)
    {
        enemy.addPotionEffect(new PotionEffect(Potion.wither.id, 20 * 6, 2));
        return true;
    }

    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add(Names.rare);
        }
    }
}
