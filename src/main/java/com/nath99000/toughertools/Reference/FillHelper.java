/**
package com.nath99000.toughertools.Reference;

import net.minecraft.world.World;

public class FillHelper {
    //this is a basic helper for filling an area with particles. Planned use only...

    public static void drawLine(String particle, World world, float bigX, float bigY, float bigZ, float littleX, float littleY, float littleZ){
        world.spawnParticle(particle, bigX, bigY, bigZ, 0d, 0d, 0d);
        world.spawnParticle(particle, littleX, littleY, littleZ, 0 , 0, 0);
        for(bigX != littleX && bigY != littleY && bigZ != littleZ){
            float x = moveTowards(bigX, littleX);
            float y =  moveTowards(bigY, littleY);
            float z =  moveTowards(bigZ, littleZ);
            world.spawnParticle(particle, x, y, z, 0d, 0d, 0d);
            bigX = x;
            bigY = y;
            bigZ = z;
        }
    }

    public static float moveTowards(float toBeMovedFrom, float toBeMovedTo){
        if (toBeMovedFrom == toBeMovedTo){
            return toBeMovedFrom;
        } else if (toBeMovedFrom > toBeMovedTo){
            return (toBeMovedFrom - 0.1f);
        } else {
            return (toBeMovedFrom + 0.1f);
        }
    }
}
\**\/**/