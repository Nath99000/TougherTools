package com.nath99000.toughertools.item.Unique.Weaponry;

import com.nath99000.toughertools.Reference.Names;
import com.nath99000.toughertools.creativetab.TTTab;
import com.nath99000.toughertools.item.Wrapper.ItemSwordTT;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import java.util.List;

public class ItemArcaneSword extends ItemSwordTT{
    public ItemArcaneSword(ToolMaterial toolMaterial, String name){
        super(toolMaterial);
        setUnlocalizedName(name);
        setCreativeTab(TTTab.TabMagic);
    }

    @Override
    public void onUpdate(ItemStack stack, World world, Entity entity, int par4, boolean par5) {
        super.onUpdate(stack, world, entity, par4, par5);
        if (entity instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) entity;
            ItemStack equipped = player.getCurrentEquippedItem();
            if (equipped == stack) {
                world.spawnParticle("enchantmenttable", player.posX, player.posY - 0.3d, player.posZ, 0d, 0d, 0d);
                player.addPotionEffect(new PotionEffect(Potion.jump.id, 0, 0));
                player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 0, 1));

            }
        }
    }

    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add(Names.rare);
        }
    }
}
