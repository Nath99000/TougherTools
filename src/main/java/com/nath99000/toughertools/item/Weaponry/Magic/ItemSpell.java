package com.nath99000.toughertools.item.Weaponry.Magic;

import com.nath99000.toughertools.Reference.Magic;
import com.nath99000.toughertools.Reference.Names;
import com.nath99000.toughertools.item.Wrapper.UniqueTT;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import java.util.List;

public class ItemSpell extends UniqueTT{

    public static int maxMana2 = 10;
    public static int mana2 = maxMana2;
    public static String name2;
    public static EntityPlayer method2;

    public ItemSpell(String name, EntityPlayer method){
        super();
        name = name2;
        method = method2;
        setUnlocalizedName("Spell" + name);
        maxStackSize = 1;
    }

    @Override
    public void onUpdate(ItemStack par1ItemStack, World world, Entity par3Entity, int par4, boolean par5){
        if (par3Entity instanceof EntityPlayer) {
            if (mana2 == 0) {
                ((EntityPlayer) par3Entity).inventory.consumeInventoryItem(this);
                world.spawnParticle("cloud", par3Entity.posX, par3Entity.posY, par3Entity.posZ, 0d, 0d,0d);
            }
            if(mana2 > maxMana2){
                ((EntityPlayer) par3Entity).inventory.consumeInventoryItem(this);
            }
        }
    }

    public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_)
    {
        EntityPlayer Method = method2;
        Method.addPotionEffect(new PotionEffect(Potion.hunger.id, 3, 150));
        return p_77659_1_;
    }

    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4){
        {
            par3.add(StatCollector.translateToLocal("toughertools.tooltip.mana") + mana2);
        }
    }
}
