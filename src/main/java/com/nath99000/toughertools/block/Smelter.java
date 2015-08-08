package com.nath99000.toughertools.block;

import com.nath99000.toughertools.Reference.Reference;
import com.nath99000.toughertools.TougherTools;
import com.nath99000.toughertools.init.ModBlocks;
import com.nath99000.toughertools.tileentity.TileEntitySmelter;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class Smelter extends BlockContainer{

    private final boolean isActive;
    private static boolean keepInventory;

    @SideOnly(Side.CLIENT)
    private IIcon iconFront;

    @SideOnly(Side.CLIENT)
    private IIcon iconTop;

    public Smelter(boolean isActive){
        super(Material.rock);
        this.isActive = isActive;
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){
        this.blockIcon = iconRegister.registerIcon(Reference.Id + ":" + "SmelterSide");
        this.iconFront = iconRegister.registerIcon(Reference.Id + ":" + (this.isActive ? "SmelterActive" : "SmelterIdle"));
        this.iconTop = iconRegister.registerIcon(Reference.Id + ":" + "SmelterSide");
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metadata){
        return side ==1?this.iconTop:(side==0?this.iconTop:(side!=metadata?this.blockIcon:this.iconFront));
    }

    public Item getItemDropped(World world ,int x, int y, int z){
        return Item.getItemFromBlock(ModBlocks.SmelterIdle);
    }

    public void onBlockAdded(World world, int x, int y, int z){
        super.onBlockAdded(world, x, y, z);
        this.setDefaultDirection(world, x, y, z);
    }

    private void setDefaultDirection(World world, int x, int y, int z) {
        if (!world.isRemote){
            Block b1 = world.getBlock(x, y, z-1);
            Block b2 = world.getBlock(x, y, z+1);
            Block b3 = world.getBlock(x-1, y ,z);
            Block b4 = world.getBlock(x+1, y, z);
           // Block b5 = world.getBlock(x, y-1, z);
           // Block b6 = world.getBlock(x, y+1, z);

            byte b0 = 3;
            if (b1.func_149730_j() && b2.func_149730_j()){
                b0 = 3;
            }
            if (b2.func_149730_j() && b1.func_149730_j()){
                b0 = 2;
            }
            if (b3.func_149730_j() && b4.func_149730_j()){
                b0 = 5;
            }
            if (b4.func_149730_j() && b3.func_149730_j()){
                b0 = 4;
            }
            world.setBlockMetadataWithNotify(x,y, z, b0, 2);
        }
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitx, float hity, float hitz){
        if(!world.isRemote){
            FMLNetworkHandler.openGui(player, TougherTools.instance, ModBlocks.guiIDSmelter, world, x, y, z);
        }
        return true;
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new TileEntitySmelter();
    }

    //ToDo:randomDisplayTick

    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase player, ItemStack itemstack){
        int l = MathHelper.floor_double((double)(player.rotationYaw * 4.0f / 360.f) + 0.5d) & 3;
        if (l == 0){
            world.setBlockMetadataWithNotify(x,y, z, 2, 2);
        }
        if (l == 1){
            world.setBlockMetadataWithNotify(x,y, z, 5, 2);
        }
        if (l == 2){
            world.setBlockMetadataWithNotify(x,y, z, 3, 2);
        }
        if (l == 3){
            world.setBlockMetadataWithNotify(x,y, z, 4, 2);
        }
        if(itemstack.hasDisplayName()){
            ((TileEntitySmelter)world.getTileEntity(x, y, z)).setGuiDisplayName(itemstack.getDisplayName());
        }
    }

    public static void updateSmelterBlockState(boolean isActive, World world, int x, int y, int z) {
        int i = world.getBlockMetadata(x, y, z);
        TileEntity tileEntity = world.getTileEntity(x, y, z);
        keepInventory = true;
                if (isActive){
                    world.setBlock(x, y, z, ModBlocks.SmelterActive);
                }
        else{
                    world.setBlock(x, y, z, ModBlocks.SmelterIdle);
                }
        keepInventory = false;
        world.setBlockMetadataWithNotify(x, y, z, i, 2);
        if(tileEntity != null){
            tileEntity.validate();
            world.setTileEntity(x, y, z, tileEntity);
        }
    }
}
