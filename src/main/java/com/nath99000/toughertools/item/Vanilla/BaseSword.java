package com.nath99000.toughertools.item.Vanilla;

import com.nath99000.toughertools.Reference.Reference;
import com.nath99000.toughertools.creativetab.TTTab;
import com.nath99000.toughertools.item.Wrapper.ItemSwordTT;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class BaseSword extends ItemSword {
    public BaseSword(String material, String tier, ToolMaterial Toolmaterial){
        super(Toolmaterial);
        setUnlocalizedName("Sword" + material + tier);
        this.setCreativeTab(TTTab.TTTab);
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
}