package com.nath99000.toughertools.item.Unique.Weaponry.Magic;

import com.nath99000.toughertools.Reference.Particles;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.entity.projectile.EntityWitherSkull;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

import java.lang.reflect.Method;

public class Magic{

    public static void spellSpectator(EntityPlayer player, World world){
        player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 5000, 0, true));
        player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5000, 100, true));
        player.addPotionEffect(new PotionEffect(Potion.weakness.id, 5000, 100, true));
        player.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 5000, 100, true));
        player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 5000, 0, true));
    }

    public static void spellRain(EntityPlayer player, World world){
        if (!world.isRemote) {
            world.setRainStrength(10.0F);
            world.isRaining();
            world.updateWeatherBody();
        }
        player.addPotionEffect(new PotionEffect(Potion.weakness.id, 50, 0, true));
        player.addPotionEffect(new PotionEffect(Potion.blindness.id, 2, 0, true));
        player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 2, 0, true));
    }

    private static float pitch = 35.5f;
    private static Float yaw = 24f;
    public static void spellBattleCry(EntityPlayer player, World world){
        player.cameraPitch = player.cameraPitch + pitch;
        player.rotationPitch = player.rotationPitch - pitch;
        player.playSound("mob.enderdragon.growl", 1f, 1f);
        player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1250, 1, true));
        player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 1050, 0, true));
        player.addPotionEffect(new PotionEffect(Potion.jump.id, 1050, 0, true));
    }

    public static void spellHeal(EntityPlayer player, World world){
        player.addPotionEffect(new PotionEffect(Potion.heal.id, 1, 2, true));
    }

    public static void spellJuggernaut(EntityPlayer player, World world){
        player.addPotionEffect(new PotionEffect(Potion.resistance.id, 350, 5, true));
        potion(Potion.moveSlowdown, player, 500, 5);
        potion(Potion.damageBoost, player, 350, 5);
    }

    public static void spellBase(EntityPlayer player, World world){
        world.spawnParticle(Particles.crit, player.posX, player.posY, player.posZ, 0d, 0d, 0d);
    }

    public static void spellDiffuse(EntityPlayer player, World world){
        for (int i = -1; i < 128; i++){
            player.removePotionEffect(i);
        }
    }

    public static void spellWhirlwind(EntityPlayer player, World world){
        potion(Potion.moveSpeed, player, 1200, 2);
        potion(Potion.jump, player, 1200, 2);
        potion(Potion.digSpeed, player, 1200, 2);
    }

    public static void spellDisorient(EntityPlayer player, World world){
        player.cameraYaw = player.cameraYaw + (world.getSeed()/12);
        player.rotationYaw = player.rotationYaw + (world.getSeed()/12);
        player.cameraYaw = player.cameraYaw - (world.getSeed()/7);
        player.rotationYaw = player.rotationYaw - (world.getSeed()/7);
        player.cameraYaw = player.cameraYaw + (world.getSeed()/21);
        player.rotationYaw = player.rotationYaw + (world.getSeed()/21);
        player.cameraYaw = player.cameraYaw - (world.getSeed()/19);
        player.rotationYaw = player.rotationYaw - (world.getSeed()/19);
        player.cameraYaw = player.cameraYaw - (world.getSeed()/32);
        player.rotationYaw = player.rotationYaw - (world.getSeed()/32);
    }

    public static void potion(Potion potion, EntityPlayer player, int duration, int lvl){
        player.addPotionEffect(new PotionEffect(potion.id, duration, lvl, true));
    }

    public static int use  = 0;
    public static void spellFireball(EntityPlayer player, World world){
            EntitySmallFireball skull = new EntitySmallFireball(world, player, 0.1, 0.1, 0.1);
            Vec3 look = player.getLookVec();
            skull.setPosition(
            player.posX + look.xCoord * 5,
            (player.posY + look.yCoord * 5) + 0.8,
            player.posZ + look.zCoord * 5);
            skull.accelerationX = look.xCoord * 0.1;
            skull.accelerationY = look.yCoord * 0.1;
            skull.accelerationZ = look.zCoord * 0.1;
        if (!world.isRemote) {
            world.spawnEntityInWorld(skull);
        }
    }

    public static void spellBurst(EntityPlayer player, World world){
        player.playSound("mob.creeper.death", 1, 1);
        world.spawnParticle(Particles.largeExplode, player.posX, player.posY, player.posZ, 0, 0, 0);
        Vec3 look = player.getLookVec();
        player.motionX = look.xCoord * 5.2;
        player.motionY = look.yCoord * 2.5;
        player.motionZ = look.zCoord * 5.2;
    }

    public static void spellReBurst(EntityPlayer player, World world){
        player.playSound("mob.creeper.death", 1, 1);
        world.spawnParticle(Particles.largeExplode, player.posX, player.posY, player.posZ, 0, 0, 0);
        Vec3 look = player.getLookVec();
        player.motionX = -look.xCoord * 5.2;
        player.motionY = -look.yCoord * 2.5;
        player.motionZ = -look.zCoord * 5.2;
    }

    public static void spellWither(EntityPlayer player, World world){

        player.playSound("mob.wither.idle", 1f, 1f);
        EntityWitherSkull skull = new EntityWitherSkull(world, player, 0.1, 0.1, 0.1);
        Vec3 look = player.getLookVec();
        skull.setPosition(
                player.posX + look.xCoord * 5,
                (player.posY + look.yCoord * 5) + 0.8,
                player.posZ + look.zCoord * 5);
        skull.accelerationX = look.xCoord * 0.1;
        skull.accelerationY = look.yCoord * 0.1;
        skull.accelerationZ = look.zCoord * 0.1;
        if (!world.isRemote) {
           world.spawnEntityInWorld(skull);
        }
    }

    public static void spellExplode(EntityPlayer player, World world, ItemStack stack){
        world.newExplosion(player, player.posX, player.posY, player.posZ, 8, true, true);
        if (stack.stackTagCompound != null){
            int mana = stack.stackTagCompound.getInteger("Mana");
            stack.stackTagCompound.setInteger("Mana", mana - 1);
        }
    }

    public static void spellSun(EntityPlayer player, World world){
        world.setWorldTime(6000);
    }

    public static void spellMoon(EntityPlayer player, World world){
        world.setWorldTime(18000);
    }

    public static void spellEnder(EntityPlayer player, World world, ItemStack stack){
        if (player.isSneaking()){
            int fromX = stack.stackTagCompound.getInteger("PlayerX");
            int fromY = stack.stackTagCompound.getInteger("PlayerY");
            int fromZ = stack.stackTagCompound.getInteger("PlayerZ");
            int toX = stack.stackTagCompound.getInteger("PlayerNextX");
            int toY = stack.stackTagCompound.getInteger("PlayerNextY");
            int toZ = stack.stackTagCompound.getInteger("PlayerNextZ");
            stack.stackTagCompound.setInteger("PlayerNextX", (int)Math.round(player.posX));
            stack.stackTagCompound.setInteger("PlayerNextY", (int)Math.round(player.posY));
            stack.stackTagCompound.setInteger("PlayerNextZ", (int)Math.round(player.posZ));
        } else {
            int fromX = stack.stackTagCompound.getInteger("PlayerX");
            int fromY = stack.stackTagCompound.getInteger("PlayerY");
            int fromZ = stack.stackTagCompound.getInteger("PlayerZ");
            int toX = stack.stackTagCompound.getInteger("PlayerNextX");
            int toY = stack.stackTagCompound.getInteger("PlayerNextY");
            int toZ = stack.stackTagCompound.getInteger("PlayerNextZ");
            if (!world.isRemote){
                player.setPositionAndUpdate(toX, toY, toZ);
            }
            player.playSound("mob.enderman.say", 1, 1);
            int mana = stack.stackTagCompound.getInteger("Mana");
            stack.stackTagCompound.setInteger("PlayerNextX", fromX);
            stack.stackTagCompound.setInteger("PlayerNextY", fromY);
            stack.stackTagCompound.setInteger("PlayerNextZ", fromZ);
            stack.stackTagCompound.setInteger("PlayerX", (int)Math.round(player.posX));
            stack.stackTagCompound.setInteger("PlayerY", (int)Math.round(player.posY));
            stack.stackTagCompound.setInteger("PlayerZ", (int)Math.round(player.posZ));
            stack.stackTagCompound.setInteger("Mana", (mana-1));
        }
    }
}
