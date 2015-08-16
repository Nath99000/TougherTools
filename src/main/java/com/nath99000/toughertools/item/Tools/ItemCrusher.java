package com.nath99000.toughertools.item.Tools;

import com.nath99000.toughertools.item.Wrapper.ItemTT;
import net.minecraft.item.ItemStack;

public class ItemCrusher extends ItemTT {
    public ItemCrusher() {
        super();
        setUnlocalizedName("Crusher");
        setMaxDamage(3);
        this.setMaxStackSize(1);
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return stack.getItemDamage() < 59;
    }

    @Override
    public ItemStack getContainerItem(ItemStack stack) {
        if (stack.attemptDamageItem(1, itemRand)) {
            return null;
        }
        return stack;
    }
}
