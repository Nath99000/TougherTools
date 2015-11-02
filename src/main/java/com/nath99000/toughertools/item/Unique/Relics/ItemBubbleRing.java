package com.nath99000.toughertools.item.Unique.Relics;

import com.nath99000.toughertools.creativetab.TTTab;
import com.nath99000.toughertools.init.ModItems;
import com.nath99000.toughertools.item.Wrapper.UniqueTT;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBubbleRing extends UniqueTT{
    public ItemBubbleRing(){
        super();
        setUnlocalizedName("BubbleRing");
        setMaxStackSize(1);
        setCreativeTab(TTTab.TabMagic);
    }

    public void onHeldUpdate(ItemStack stack, World world, EntityPlayer player) {

        if (player.isSneaking()) {
            player.motionY = player.motionY - 0.02;
        } else {
            player.motionY = player.motionY + 0.05;
        }
    }

    @Override
    public boolean hasEffect(ItemStack par1ItemStack, int pass)
    {
        return true;
    }
}
