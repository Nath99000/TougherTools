package com.nath99000.toughertools.init;

import com.nath99000.toughertools.Entity.EntityCaveMite;
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
        createEntity(EntityCaveMite.class, "CaveMite", 0x333333, 0x555555, BiomeGenBase.stoneBeach, EnumCreatureType.monster);
        createProjectile(ProjectileLightning.class, "ProjectileLightning");
    }

    public static void createEntity(Class entityclass, String entityname, int solidColor, int  spotColor, BiomeGenBase biome, EnumCreatureType type){
        int randomId = EntityRegistry.findGlobalUniqueEntityId();
        EntityRegistry.registerGlobalEntityID(entityclass, entityname, randomId);
        EntityRegistry.registerModEntity(entityclass, entityname, randomId, TougherTools.instance, 32, 1, true);
        EntityRegistry.addSpawn(entityclass, 1, 0, 1, type, biome);
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
