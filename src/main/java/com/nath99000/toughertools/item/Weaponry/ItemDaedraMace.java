package com.nath99000.toughertools.item.Weaponry;

import assets.toughertools.lang.Names;
import com.nath99000.toughertools.item.Wrapper.ItemSwordTT;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import java.util.List;

public class ItemDaedraMace extends ItemSwordTT{
    public ItemDaedraMace(ToolMaterial toolMaterial){
        super(toolMaterial);
        setUnlocalizedName("DaedraMace");
    }

    @Override
    public void onUpdate(ItemStack stack, World world, Entity entity, int par4, boolean par5) {
        super.onUpdate(stack, world, entity, par4, par5);
        if (entity instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) entity;
            ItemStack equipped = player.getCurrentEquippedItem();
            if (equipped == stack) {
                player.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 3, 6, true));
                player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 3, 1, true));
            }
        }
    }

    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add(Names.godly);
        }
    }

    public boolean hitEntity(ItemStack stack, EntityLivingBase enemy, EntityLivingBase player)
    {
        enemy.addPotionEffect(new PotionEffect(Potion.weakness.id, 0, 7, false));
        return true;
    }
}

