package com.nath99000.toughertools.item.Weaponry;

import assets.toughertools.lang.Names;
import com.nath99000.toughertools.item.Wrapper.ItemSwordTT;
import cpw.mods.fml.common.eventhandler.Event;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.UseHoeEvent;

import java.util.List;

public class ItemScythe extends ItemSwordTT{
    public ItemScythe(ToolMaterial toolMaterial, String name){
        super(toolMaterial);
        setUnlocalizedName(name);
    }

    public boolean hitEntity(ItemStack stack, EntityLivingBase enemy, EntityLivingBase player)
    {
        enemy.addPotionEffect(new PotionEffect(Potion.weakness.id, 0, 5));
        return true;
    }

    public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean par4)
    {
        {
            par3.add(Names.common);
        }
    }

    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
        if (!player.canPlayerEdit(x, y, z, side, stack)) {
            return false;
        } else {
            UseHoeEvent event = new UseHoeEvent(player, stack, world, x, y, z);
            if (MinecraftForge.EVENT_BUS.post(event)) {
                return false;
            }

            if (event.getResult() == Event.Result.ALLOW) {
                stack.damageItem(1, player);
                return true;
            }

            Block block = world.getBlock(x, y, z);

            if (side != 0 && world.getBlock(x, y + 1, z).isAir(world, x, y + 1, z) && (block == Blocks.grass || block == Blocks.dirt)) {
                Block block1 = Blocks.farmland;
                world.playSoundEffect((double)((float)x + 0.5F), (double)((float)y + 0.5F), (double)((float)z + 0.5F), block1.stepSound.getStepResourcePath(), (block1.stepSound.getVolume() + 1.0F) / 2.0F, block1.stepSound.getPitch() * 0.8F);

                if (world.isRemote) {
                    return true;
                } else {
                    world.setBlock(x, y, z, block1);
                    stack.damageItem(1, player);
                    return true;
                }
            } else {
                return false;
            }
        }
    }
}
