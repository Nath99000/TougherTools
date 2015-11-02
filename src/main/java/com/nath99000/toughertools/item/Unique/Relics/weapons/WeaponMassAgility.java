package com.nath99000.toughertools.item.Unique.Relics.weapons;

import com.nath99000.toughertools.Reference.Language;
import com.nath99000.toughertools.Reference.Names;
import com.nath99000.toughertools.item.Wrapper.ItemSwordTT;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import java.util.List;

public class WeaponMassAgility extends ItemSwordTT{
    public WeaponMassAgility(){
        super(ToolMaterial.EMERALD);
        setUnlocalizedName("WeaponMassAgility");
        setMaxStackSize(1);
        setMaxDamage(0);
    }

    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        if (stack.stackTagCompound == null){
            stack.stackTagCompound = new NBTTagCompound();
            stack.stackTagCompound.setInteger("Mana1", 7);
            stack.stackTagCompound.setInteger("Mana2", 7);
            stack.stackTagCompound.setInteger("Mana3", 7);
            stack.stackTagCompound.setInteger("Mana4", 7);
            stack.stackTagCompound.setInteger("currentlyActive", 0);
        } else {
            int mana0 = stack.stackTagCompound.getInteger("Mana1");
            int mana1 = stack.stackTagCompound.getInteger("Mana2");
            int mana2 = stack.stackTagCompound.getInteger("Mana3");
            int mana3 = stack.stackTagCompound.getInteger("Mana4");
            int current = stack.stackTagCompound.getInteger("currentlyActive");
            if (player.isSneaking()){
                if (current <= 3){
                    stack.stackTagCompound.setInteger("currentlyActive", 0);
                } else {
                    stack.stackTagCompound.setInteger("currentlyActive", (current+1));
                }
            } else {
                
            }
        }
        return stack;
    }


        public void addInformation(ItemStack stack, EntityPlayer player, List par3, boolean par4)
    {
        if (stack.stackTagCompound == null){
            par3.add(Language.tooltip("inactive"));
            par3.add(Language.tooltip("activate"));
        } else {

        }
    }
}
