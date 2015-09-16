package com.nath99000.toughertools.item.Weaponry;

import com.nath99000.toughertools.Entity.ProjectileInk;
import com.nath99000.toughertools.Entity.ProjectileLightning;
import com.nath99000.toughertools.Reference.Names;
import com.nath99000.toughertools.Reference.Reference;
import com.nath99000.toughertools.item.Wrapper.UniqueTT;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

import java.util.List;

//Blaster weapon-Splatoon  --good game, 8/10
public class ItemInkBlaster extends UniqueTT {

    public String c;

    public ItemInkBlaster(String color) {
        super();
        setUnlocalizedName("Blaster" + color);
        c = color;
        setFull3D();
        setMaxDamage(697);
        setMaxStackSize(1);
    }

    @Override
    public EnumAction getItemUseAction(ItemStack p_77661_1_) {
        return EnumAction.bow;
    }

   public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
        if(!player.capabilities.isCreativeMode) {

            itemStack.damageItem(1, player);
            world.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
            if (!world.isRemote) {
                world.spawnEntityInWorld(new ProjectileInk(world, player, c));
            }
        }
        else {
            world.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
            if (!world.isRemote) {
                world.spawnEntityInWorld(new ProjectileInk(world, player, c));
            }
        }
        return itemStack;
    }


    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add(c);
        }
    }

    @SideOnly(Side.CLIENT)
    public boolean shouldRotateAroundWhenRendering()
    {
        return true;
    }
}
