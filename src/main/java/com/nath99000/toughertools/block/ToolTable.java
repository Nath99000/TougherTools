package com.nath99000.toughertools.block;

import com.nath99000.toughertools.Reference.Reference;
import com.nath99000.toughertools.TougherTools;
import com.nath99000.toughertools.init.ModBlocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class ToolTable extends BlockTT {

    @SideOnly(Side.CLIENT)
    private IIcon ToolTableTop;

    public ToolTable() {
        super(Material.anvil);
        setBlockName("ToolTable");
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metadata) {
        return side == 1 ? this.ToolTableTop : this.blockIcon;
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon(Reference.Id + ":ToolTableSide");
        this.ToolTableTop = iconRegister.registerIcon(Reference.Id + ":ToolTableTop");
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par1, float A, float B, float C) {
        if (!player.isSneaking()) {
            player.openGui(TougherTools.instance, ModBlocks.guiIDToolTable, world, x, y, z);
            return true;
        } else {
            return false;
        }
    }
}
