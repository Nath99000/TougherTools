package com.nath99000.toughertools.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

import java.lang.reflect.Method;

public class Magic{
    public static World world;
    public static EntityPlayer player;

    public static EntityPlayer spellSpectator(){
        player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 1, 250));
        player.addPotionEffect(new PotionEffect(Potion.resistance.id, 100, 250));
        player.addPotionEffect(new PotionEffect(Potion.weakness.id, 100, 250));

        return player;
    }

    public static EntityPlayer spellBase(){
        world.spawnParticle(Particles.crit, player.posX, player.posY, player.posZ, 0d, 0d, 0d);
        return player;
    }
}
