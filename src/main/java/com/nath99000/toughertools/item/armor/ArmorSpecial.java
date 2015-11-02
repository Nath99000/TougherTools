package com.nath99000.toughertools.item.armor;

import com.nath99000.toughertools.Reference.Particles;
import com.nath99000.toughertools.Reference.Reference;
import com.nath99000.toughertools.init.ModItems;
import com.nath99000.toughertools.init.ModParticle;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class ArmorSpecial extends ItemArmor{

    public String textureName;
    private ItemStack helm;
    private ItemStack chest;
    private ItemStack legs;
    private ItemStack boot;

    public ArmorSpecial(ArmorMaterial material, int type, String name, CreativeTabs tab) {
        super(material, 0, type);
        textureName = name;
        setUnlocalizedName("toughertools:" + name);
        setTextureName(Reference.Id + ":" + name);
        setCreativeTab(tab);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        return Reference.Id + ":textures/armor/" + this.textureName + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack stack) {

        GameSettings gameSettings = Minecraft.getMinecraft().gameSettings;
        ItemStack helmet = player.getCurrentArmor(3);
        ItemStack chestplate = player.getCurrentArmor(2);
        ItemStack leggings = player.getCurrentArmor(1);
        ItemStack boots = player.getCurrentArmor(0);
        helm = helmet;
        chest = chestplate;
        legs = leggings;
        boot = boots;

        if (player.getCurrentArmor(3) != null ) {
            //Helmet
            if (player.getCurrentArmor(3).getItem() == ModItems.aerialCrown) {
                if(chestIsNull() && legsAreNull() && bootsAreNull()) {
                    if (GameSettings.isKeyDown(gameSettings.keyBindJump)) {
                        if (GameSettings.isKeyDown(gameSettings.keyBindSneak)) {
                            player.motionY = 0;
                        } else if (!GameSettings.isKeyDown(gameSettings.keyBindSneak)) {
                            player.motionY = player.motionY + 0.09;
                            player.getCurrentArmor(3).damageItem(1, player);
                            player.fallDistance = 0.0F;
                            world.spawnParticle("happyVillager", player.posX + world.rand.nextFloat(), player.posY - 1.4, player.posZ, 0, 0, 0);
                            world.spawnParticle("happyVillager", player.posX - world.rand.nextFloat(), player.posY - 1.4, player.posZ, 0, 0, 0);
                            world.spawnParticle("happyVillager", player.posX, player.posY - 1.4, player.posZ + world.rand.nextFloat(), 0, 0, 0);
                            world.spawnParticle("happyVillager", player.posX, player.posY - 1.4, player.posZ - world.rand.nextFloat(), 0, 0, 0);
                            //ModParticle.spawnParticle("blueDust", player.posX, player.posY - 1.4, player.posZ);
                        }
                    }
                }
            }
        }
            //Chestplate
            int use = 0;
        if (player.getCurrentArmor(2) != null) {
            if (player.getCurrentArmor(2).getItem() == ModItems.fireGauntlets) {
                if (helmIsNull() && legsAreNull() && bootsAreNull()) {
                    if (player.isSneaking() && player.getHeldItem() == null) {
                        if (GameSettings.isKeyDown(gameSettings.keyBindUseItem)) {
                            use = use + 1;

                            if (use <= 2) {
                                EntityLargeFireball fireball = new EntityLargeFireball(world, player, 0.1, 0.1, 0.1);
                                Vec3 look = player.getLookVec();
                                fireball.setPosition(
                                        player.posX + look.xCoord * 5,
                                        player.posY + look.yCoord * 5,
                                        player.posZ + look.zCoord * 5);
                                fireball.accelerationX = look.xCoord * 0.1;
                                fireball.accelerationY = look.yCoord * 0.1;
                                fireball.accelerationZ = look.zCoord * 0.1;
                                player.getCurrentArmor(2).damageItem(5, player);
                                world.spawnEntityInWorld(fireball);
                                use = 0;
                            }
                        }
                    }
                }
            }
        }

        if (player.getCurrentArmor(1) != null){
            if (player.getCurrentArmor(1).getItem() == ModItems.waterPants) {
                if (helmIsNull() && chestIsNull() && bootsAreNull()) {
                    if (world.getBlock((int) Math.round(player.posX), (int) Math.round(player.posY) - 1, (int) Math.round(player.posZ)) == Blocks.water) {
                        player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 0, 0, true));
                        player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 0, 0, true));
                    }
                }
            }
        }

        //Boots
        if (player.getCurrentArmor(0) != null){
            if (player.getCurrentArmor(0).getItem() == ModItems.EarthBoots) {
                if (helmIsNull() && chestIsNull() && legsAreNull()) {
                    player.fallDistance = 0;
                }
            }
        }
    }

    private boolean helmIsNull() {
        return helm == null || helm.getItem() != ModItems.aerialCrown;
    }

    private boolean chestIsNull(){
        return chest == null || chest.getItem() != ModItems.fireGauntlets;
    }

    private boolean legsAreNull(){
        return legs == null || legs.getItem() != ModItems.waterPants;
    }

    private boolean bootsAreNull(){
        return boot == null || boot.getItem() != ModItems.EarthBoots;
    }
}
