package com.nath99000.toughertools.item.Tools;

import com.nath99000.toughertools.item.Wrapper.ItemTT;
import net.minecraft.item.ItemStack;

public class ItemEngraver extends ItemTT{
    public ItemEngraver(){
        super();
        setUnlocalizedName("Engraver");
        setMaxDamage(59);
        setMaxStackSize(1);
        this.setMaxStackSize(1);
        canRepair = false;
        setFull3D();
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
