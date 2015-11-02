package com.nath99000.toughertools.item.Unique.Relics;

import com.nath99000.toughertools.creativetab.TTTab;
import com.nath99000.toughertools.item.Wrapper.UniqueTT;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemLightStone extends UniqueTT{
    public ItemLightStone(){
        super();
        setUnlocalizedName("LightStone");
        setMaxStackSize(1);
        setCreativeTab(TTTab.TabMagic);
    }

    @Override
    public void onHeldUpdate(ItemStack stack, World world, EntityPlayer player){
        if (world.isDaytime() && world.canBlockSeeTheSky((int) Math.round(player.posX), ((int) Math.round(player.posY)), (int) Math.round(player.posZ))){
            player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 0, 0));
            player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 0, 0));
            player.addPotionEffect(new PotionEffect(Potion.jump.id, 0, 0));
            if (stack.stackTagCompound == null){
                stack.stackTagCompound = new NBTTagCompound();
                stack.stackTagCompound.setBoolean("isEnchanted", true);
            } else {
                stack.stackTagCompound.setBoolean("isEnchanted", true);
            }

        } else {
            if (stack.stackTagCompound == null){
                stack.stackTagCompound = new NBTTagCompound();
                stack.stackTagCompound.setBoolean("isEnchanted", false);
            }
            stack.stackTagCompound.setBoolean("isEnchanted", false);
        }
    }

    @Override
    public boolean hasEffect(ItemStack stack, int pass) {
        return stack.stackTagCompound != null && stack.stackTagCompound.getBoolean("isEnchanted");
    }
}
