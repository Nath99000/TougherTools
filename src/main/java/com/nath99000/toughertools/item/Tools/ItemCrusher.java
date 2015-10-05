package com.nath99000.toughertools.item.Tools;

import com.nath99000.toughertools.init.ModItems;
import com.nath99000.toughertools.item.Weaponry.ItemScythe;
import com.nath99000.toughertools.item.Wrapper.ItemTT;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemCrusher extends ItemTT {

    public ItemCrusher() {
        super();
        setUnlocalizedName("Crusher");
        setMaxDamage(7);
        setMaxStackSize(1);
        this.setMaxStackSize(1);
        canRepair = false;
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return stack.getItemDamage() < 59;
    }

    @Override
    public ItemStack getContainerItem(ItemStack stack) {
        if (stack.attemptDamageItem(2, itemRand)) {
            return null;
        }
        return stack;
    }
}
