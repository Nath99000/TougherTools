package com.nath99000.toughertools.item.Weaponry;

import assets.toughertools.lang.Names;
import com.nath99000.toughertools.Entity.ProjectileLightning;
import com.nath99000.toughertools.item.Wrapper.ItemTT;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

public class ItemLightningStaff extends ItemTT{
    public ItemLightningStaff(){
        super();
        setUnlocalizedName("LightningStaff");
        this.setFull3D();
        setMaxDamage(15);
    }

    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
    {
        world.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!world.isRemote)
        {
            world.spawnEntityInWorld(new ProjectileLightning(world, player));
            stack.damageItem(1, player);
        }

        return stack;
    }

    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add(Names.godly);
        }
    }

}
