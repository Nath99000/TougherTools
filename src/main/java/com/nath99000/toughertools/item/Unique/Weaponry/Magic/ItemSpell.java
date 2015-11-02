package com.nath99000.toughertools.item.Unique.Weaponry.Magic;

import com.nath99000.toughertools.Reference.*;
import com.nath99000.toughertools.creativetab.TTTab;
import com.nath99000.toughertools.init.ModItems;
import com.nath99000.toughertools.item.Wrapper.UniqueTT;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import java.util.List;

public class ItemSpell extends UniqueTT{

    private EnumMagic magic;
    private int text = 0;

    public ItemSpell(EnumMagic method) {
        super();
        magic = method;
        setUnlocalizedName("Spell" + method.name());
        maxStackSize = 1;
        setCreativeTab(TTTab.TabMagic);
    }

    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        if (stack.getTagCompound() == null) {
            stack.stackTagCompound = new NBTTagCompound();
            stack.stackTagCompound.setInteger("Mana", 10);
            stack.stackTagCompound.setInteger("X", (int)Math.round(player.posX));
            stack.stackTagCompound.setInteger("Y", (int)Math.round(player.posY));
            stack.stackTagCompound.setInteger("Z", (int)Math.round(player.posZ));
            stack.stackTagCompound.setBoolean("isHyper", false);
            stack.stackTagCompound.setInteger("HyperTick", 1);
            if (magic == EnumMagic.Ender) {
                stack.stackTagCompound.setInteger("PlayerX", (int) Math.round(player.posX));
                stack.stackTagCompound.setInteger("PlayerY", (int)Math.round(player.posY));
                stack.stackTagCompound.setInteger("PlayerZ", (int)Math.round(player.posZ));
                stack.stackTagCompound.setInteger("PlayerNextX", (int) Math.round(player.posX));
                stack.stackTagCompound.setInteger("PlayerNextY", (int)Math.round(player.posY));
                stack.stackTagCompound.setInteger("PlayerNextZ", (int)Math.round(player.posZ));
            }
            world.spawnParticle(Particles.note, player.posX, player.posY + 0.999, player.posZ, 0, 0, 0);
            text = text + 1;
            if (text >= 2) {
                LogHelper.spell("Player " + player.getDisplayName() + " has activated a " + magic.name() + " spell at : " + Math.round(player.posX) + ", " + Math.round(player.posY) + ", " + Math.round(player.posZ));
                text = 0;
            }
        } else {

            int mana = stack.stackTagCompound.getInteger("Mana");
            int x = stack.stackTagCompound.getInteger("X");
            int y = stack.stackTagCompound.getInteger("Y");
            int z = stack.stackTagCompound.getInteger("Z");
            boolean isHyper = stack.stackTagCompound.getBoolean("isHyper");
            int HyperTick = stack.stackTagCompound.getInteger("HyperTick");

            if (player.inventory.hasItem(ModItems.hyperCatalyst) && !isHyper){
                player.inventory.consumeInventoryItem(ModItems.hyperCatalyst);
                stack.stackTagCompound.setInteger("HyperTick", Reference.MintoTick(1) + Reference.SectoTick(0));
                stack.stackTagCompound.setBoolean("isHyper", false);
                text = text+1;
                if(text >= 2) {
                    LogHelper.spell(player.getDisplayName() + "'s spell has gone HYPER!");
                }
            } else if (player.inventory.hasItem(ModItems.uberCatalyst) && !isHyper){
                player.inventory.consumeInventoryItem(ModItems.uberCatalyst);
                stack.stackTagCompound.setInteger("HyperTick", Reference.MintoTick(2) + Reference.SectoTick(0));
                stack.stackTagCompound.setBoolean("isHyper", false);
                text = text+1;
                if(text >= 2) {
                    LogHelper.spell(player.getDisplayName() + "'s spell has gone HYPER!");
                }
            } else if (player.inventory.hasItem(ModItems.infiniteCatalyst) && !isHyper){
                stack.stackTagCompound.setInteger("HyperTick", Reference.MintoTick(2) + Reference.SectoTick(0));
                stack.stackTagCompound.setBoolean("isHyper", false);
                text = text+1;
                if(text >= 2) {
                    LogHelper.spell(player.getDisplayName() + "'s spell has gone HYPER!");
                }
            }

            text = text + 1;
            player.addPotionEffect(new PotionEffect(Potion.hunger.id, 3, 500));
            player.swingItem();
            if (Math.round(player.posX) == x && Math.round(player.posY) == y && Math.round(player.posZ) == z){
                doMagic(magic, player, world, stack);
                player.addPotionEffect(new PotionEffect(Potion.field_76443_y.id, 2, 500));
                if (text == 2) {
                    if (!isHyper) {
                        LogHelper.spell("Player " + player.getDisplayName() + " has used the enhanced spell " + magic.name() + " at its home coordinates :" + Math.round(player.posX) + ", " + Math.round(player.posY) + ", " + Math.round(player.posZ));
                        if (magic != EnumMagic.Ender && !player.isSneaking()) {
                            stack.getTagCompound().setInteger("Mana", mana - 1);
                        }
                    }
                text = 0;
                }
            } else {
                doMagic(magic, player, world, stack);

                if (text == 2) {
                    if (!isHyper) {
                        LogHelper.spell("Player " + player.getDisplayName() + " has used the spell " + magic.name() + ", at the coordinates : " + Math.round(player.posX) + ", " + Math.round(player.posY) + ", " + Math.round(player.posZ));
                        if (magic != EnumMagic.Ender && !player.isSneaking()) {
                            stack.getTagCompound().setInteger("Mana", mana - 1);
                        }
                    }
                    text = 0;
                }
            }
        }
        return stack;
    }

    public void onUpdate(ItemStack stack, World world, Entity player, int par4, boolean par5) {
        if (player instanceof EntityPlayer) {
            if (stack.stackTagCompound != null) {

                int mana = stack.stackTagCompound.getInteger("Mana");
                boolean isHyper = stack.stackTagCompound.getBoolean("isHyper");
                int HyperTick = stack.stackTagCompound.getInteger("HyperTick");

                if (mana <= 0) {
                    ((EntityPlayer) player).inventory.consumeInventoryItem(this);
                    world.spawnParticle("cloud", player.posX, player.posY, player.posZ, 0d, 0d, 0d);
                    ((EntityPlayer) player).inventory.addItemStackToInventory(new ItemStack(ModItems.spellBase));
                }

                if (mana > 10) {
                    mana = 10;
                }

                if (HyperTick >= 1){
                    stack.stackTagCompound.setBoolean("isHyper", true);
                }

                if (isHyper){
                    if (HyperTick <= 0){
                        stack.stackTagCompound.setBoolean("isHyper", false);
                    } else {
                        stack.stackTagCompound.setInteger("HyperTick", (HyperTick-1));
                    }

                    if (HyperTick <= 2 && isHyper){
                        LogHelper.spell(((EntityPlayer) player).getDisplayName() + "'s " + magic.name() + " spell has ended a hyper period.");
                    }

                    if (mana != 10){
                        mana = 10;
                    }
                }
            }
        }
    }

    public void addInformation(ItemStack stack, EntityPlayer par2, List par3, boolean par4) {
        if (stack.stackTagCompound != null) {
            int mana = stack.stackTagCompound.getInteger("Mana");
            int x = stack.stackTagCompound.getInteger("X");
            int y = stack.stackTagCompound.getInteger("Y");
            int z = stack.stackTagCompound.getInteger("Z");
            boolean isHyper = stack.stackTagCompound.getBoolean("isHyper");
            int HyperTick = stack.stackTagCompound.getInteger("HyperTick");
            {
                par3.add(Language.tooltip("mana") + mana);
                par3.add(Language.tooltip("home") + x + ", " + y + ", " + z);
                if (isHyper){
                    par3.add(Language.tooltip("hyper") + HyperTick);
                }
            }
        } else {
            par3.add(Language.tooltip("inactive"));
            par3.add(Language.tooltip("activate"));
        }
    }

    private static void doMagic(EnumMagic magic, EntityPlayer player, World world, ItemStack stack){
        if (magic == EnumMagic.Null) {
            Magic.spellBase(player, world);
        } else if (magic == EnumMagic.Spectator) {
            Magic.spellSpectator(player, world);
        } else if (magic == EnumMagic.Rain) {
            Magic.spellRain(player, world);
        } else if (magic == EnumMagic.Shout) {
            Magic.spellBattleCry(player, world);
        } else if (magic == EnumMagic.Heal) {
            Magic.spellHeal(player, world);
        } else if (magic == EnumMagic.Juggernaut) {
            Magic.spellJuggernaut(player, world);
        } else if (magic == EnumMagic.Diffuse) {
            Magic.spellDiffuse(player, world);
        } else if (magic == EnumMagic.Whirlwind) {
            Magic.spellWhirlwind(player, world);
        } else if (magic == EnumMagic.Disorient) {
            Magic.spellDisorient(player, world);
        } else if (magic == EnumMagic.Fireball){
            Magic.spellFireball(player, world);
        } else if (magic == EnumMagic.Wither){
            Magic.spellWither(player, world);
        } else if (magic == EnumMagic.Burst){
            Magic.spellBurst(player, world);
        } else if (magic == EnumMagic.ReBurst){
            Magic.spellReBurst(player, world);
        } else if (magic == EnumMagic.Explode){
            Magic.spellExplode(player, world, stack);
        } else if (magic == EnumMagic.Sunlight){
            Magic.spellSun(player, world);
        } else if (magic == EnumMagic.Moonlight){
            Magic.spellMoon(player, world);
        } else if (magic == EnumMagic.Ender){
            Magic.spellEnder(player, world, stack);
        }



        else {
            Magic.spellBase(player, world);
        }
    }
}