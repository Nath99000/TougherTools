package com.nath99000.toughertools.block;

import com.nath99000.toughertools.Reference.Reference;
import com.nath99000.toughertools.TougherTools;
import com.nath99000.toughertools.creativetab.TTTab;
import com.nath99000.toughertools.init.ModBlocks;
import com.nath99000.toughertools.tileentity.TileEntityTable;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class ToolTable extends BlockContainer{

    @SideOnly(Side.CLIENT)
    private IIcon ToolTableTop;

    public ToolTable() {
        super(Material.anvil);
        setBlockName("toughertools:ToolTable");
        setCreativeTab(TTTab.TTTab);
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par1, float A, float B, float C) {
        if (!player.isSneaking()) {
            player.openGui(TougherTools.instance, ModBlocks.guiIDToolTable, world, x, y, z);
            return true;
        } else {
            return false;
        }
    }

    public int getRenderType(){
        return -1;
    }

    public boolean isOpaqueCube(){
        return false;
    }

    public boolean renderAsNormalBlock(){
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new TileEntityTable();
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconregister){
        this.blockIcon = iconregister.registerIcon(Reference.Id + ":SteelBlock");
    }
}
