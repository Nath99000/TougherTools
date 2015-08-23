package com.nath99000.toughertools.item.Weaponry;

import com.nath99000.toughertools.Reference.Names;
import com.nath99000.toughertools.init.ModItems;
import com.nath99000.toughertools.item.Wrapper.ItemSwordTT;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import java.util.List;

public class ItemMasamune extends ItemSwordTT {
    public ItemMasamune(ToolMaterial toolMaterial) {
        super(toolMaterial);
        setUnlocalizedName("Masamune");
    }

    public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer player)
    {
        player.setItemInUse(p_77659_1_, 1500);
        player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 1500, 0));
        player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 1500, 0));
        return p_77659_1_;
    }

    public EnumAction getItemUseAction(ItemStack p_77661_1_) {
        return EnumAction.bow;
    }

    @Override
    public void onPlayerStoppedUsing(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer, int par4) {
        par3EntityPlayer.removePotionEffect(Potion.invisibility.id);
        par3EntityPlayer.removePotionEffect(Potion.moveSlowdown.id);
    }

    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add(Names.legendary);
        }
    }
}
