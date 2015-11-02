package com.nath99000.toughertools.item.Wrapper;

import com.nath99000.toughertools.Reference.Reference;
import com.nath99000.toughertools.creativetab.TTTab;
import com.nath99000.toughertools.init.ModItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemFoodTT extends ItemFood{

    private boolean isDrink = false;

    public ItemFoodTT(int heal, String name) {
        this(heal, 0.6f, name);
    }

    public ItemFoodTT(int heal, float saturation, String name) {
        super(heal, saturation, false);
        setCreativeTab(TTTab.TTTab);
        setUnlocalizedName(name);
    }

    @Override
    public EnumAction getItemUseAction(ItemStack itemstack) {
        if (isDrink) {
            return EnumAction.drink;
        } else {
            return EnumAction.eat;
        }
    }

    public ItemFoodTT setIsDrink() {
        isDrink = true;
        return this;
    }

    public Item setNotDrink(){
        isDrink = false;
        return this;
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.Id.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.Id.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

    public ItemStack onEaten(ItemStack p_77654_1_, World p_77654_2_, EntityPlayer player)
    {
        if (this.getUnlocalizedName().equals("CaveMiteEye")){
            player.inventory.addItemStackToInventory(new ItemStack(ModItems.gelatin));
            player.addPotionEffect(new PotionEffect(Potion.confusion.id, 10, 10));
            player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 10, 10));
        }
        super.onEaten(p_77654_1_, p_77654_2_, player);
        return p_77654_1_;
    }
}
