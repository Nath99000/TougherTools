package com.nath99000.toughertools.item.Unique.Miscellaneous;

import com.nath99000.toughertools.item.Wrapper.UniqueTT;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.Month;

public class ItemParsel extends UniqueTT {
    public ItemParsel() {
        super();
        setUnlocalizedName("Parsel");
        setMaxStackSize(1);

    }

    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        LocalDateTime time = LocalDateTime.now();
        if (time.getMonth() == Month.OCTOBER && time.getDayOfMonth() == 29 && player.getDisplayName().equals("Nath99000")){
            //Happy birthday to me. Yay.
            ItemStack apple = new ItemStack(Items.golden_apple).setStackDisplayName(StatCollector.translateToLocal("parsel.bday"));
            apple.addEnchantment(Enchantment.fortune, 10);
            player.inventory.addItemStackToInventory(apple);
        } else if (time.getMonth() == Month.OCTOBER && time.getDayOfMonth() == 31) {
            ItemStack pumkin = new ItemStack(Blocks.pumpkin).setStackDisplayName(StatCollector.translateToLocal("parsel.halloween"));
            pumkin.addEnchantment(Enchantment.smite, 10);
            player.setCurrentItemOrArmor(4, pumkin);
        } else if (time.getMonth() == Month.DECEMBER && time.getDayOfMonth() == 25){
            ItemStack tree = new ItemStack(Blocks.sapling, 1, 3).setStackDisplayName("parsel.tree");
            tree.addEnchantment(Enchantment.sharpness, 10);
            player.inventory.addItemStackToInventory(tree);
        }

        if (!player.capabilities.isCreativeMode) {
            --stack.stackSize;
        }

        return stack;
    }
}
