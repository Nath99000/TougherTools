package com.nath99000.toughertools.item.Unique.Relics;

import com.nath99000.toughertools.item.Wrapper.UniqueTT;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import java.util.List;

public class ItemWaterStone extends UniqueTT{
    public ItemWaterStone(){
        super();
        setUnlocalizedName("WaterStone");
        setMaxStackSize(1);
    }

    @Override
    public void onHeldUpdate(ItemStack stack, World world, EntityPlayer player) {
        {
            if (world.isRaining() && world.canBlockSeeTheSky((int) Math.round(player.posX), ((int) Math.round(player.posY)) - 1, (int) Math.round(player.posZ))) {
                player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 0, 0));
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
                player.removePotionEffect(Potion.regeneration.id);
            }
        }
    }

    @Override
    public boolean hasEffect(ItemStack stack, int pass) {
        return stack.stackTagCompound != null && stack.stackTagCompound.getBoolean("isEnchanted");
    }

    @Override
    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4){
        {
            par3.add(StatCollector.translateToLocal("toughertools.tooltip.waterstone"));
        }
    }
}
