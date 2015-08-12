package com.nath99000.toughertools.item.Pickaxes.NightVision;

import assets.toughertools.lang.Names;
import com.nath99000.toughertools.Reference.Reference;
import com.nath99000.toughertools.creativetab.TTTab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import java.util.List;

public class ItemPickW4NV extends ItemPickaxe{
    public ItemPickW4NV(String PickW4, ToolMaterial Wood4) {
        super(Wood4);
        this.setCreativeTab(TTTab.TTTab);
        this.setUnlocalizedName(PickW4);
        this.setTextureName(Reference.Id + ":" + PickW4);
    }
    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add(Names.T4);
            par3.add(Names.NightVision);
        }
    }

    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player){
        player.addPotionEffect((new PotionEffect(Potion.nightVision.getId(), 500, 1)));
        itemStack.damageItem(1, player);
        return itemStack;
    }
}
