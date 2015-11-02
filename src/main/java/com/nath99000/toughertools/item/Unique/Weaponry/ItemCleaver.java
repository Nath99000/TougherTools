package com.nath99000.toughertools.item.Unique.Weaponry;

import com.nath99000.toughertools.Reference.Names;
import com.nath99000.toughertools.item.Wrapper.ItemSwordTT;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import java.util.List;

public class ItemCleaver extends ItemSwordTT {
    public ItemCleaver(String name, ToolMaterial toolMaterial) {
        super(toolMaterial);
        this.setUnlocalizedName(name);
    }

    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add(Names.legendary);
        }
    }

    public EnumAction getItemUseAction(ItemStack itemStack)
    {
        return EnumAction.block;
    }

    @Override
    public void onUpdate(ItemStack stack, World world, Entity entity, int par4, boolean par5) {
        super.onUpdate(stack, world, entity, par4, par5);
        if (entity instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) entity;
            ItemStack equipped = player.getCurrentEquippedItem();
            if (equipped == stack) {
                player.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 2, 5, true));
                player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 2, 0, true));
            }
        }
    }
}
