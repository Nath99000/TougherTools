package com.nath99000.toughertools.init;

import com.nath99000.toughertools.Entity.EntityMerchant;
import com.nath99000.toughertools.Entity.ProjectileInk;
import com.nath99000.toughertools.Entity.ProjectileLightning;
import com.nath99000.toughertools.TougherTools;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class ModEntity {

    public static void register(){
        registerEntity();
    }

    public static void registerEntity() {
        createEntity(EntityMerchant.class, "Merchant", 0xFFFFFF, 0xAA1111, BiomeGenBase.plains);
        createProjectile(ProjectileLightning.class, "ProjectileLightning");
        createProjectile(ProjectileInk.class, "InkRed");
    }

    public static void createEntity(Class entityclass, String entityname, int solidColor, int  spotColor, BiomeGenBase biome){
        int randomId = EntityRegistry.findGlobalUniqueEntityId();
        EntityRegistry.registerGlobalEntityID(entityclass, entityname, randomId);
        EntityRegistry.registerModEntity(entityclass, entityname, randomId, TougherTools.instance, 32, 1, true);
        EntityRegistry.addSpawn(entityclass, 1, 0, 1, EnumCreatureType.creature, biome);
        createEgg(randomId, solidColor, spotColor);
    }

    public static void createProjectile(Class entityclass, String entityname){
        int randomId = EntityRegistry.findGlobalUniqueEntityId();
        EntityRegistry.registerGlobalEntityID(entityclass, entityname, randomId);
        EntityRegistry.registerModEntity(entityclass, entityname, randomId, TougherTools.instance, 32, 1, true);
    }
    
    private static void createEgg(int randomId,int solidColor,int spotColor){
        EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
    }
}
