package com.nath99000.toughertools.block;

import net.minecraft.block.material.Material;

public class BlockClear  extends BlockTT{
    public BlockClear(){
        super(Material.glass);
        setBlockName("Clear");
    }

    @Override
    public boolean isOpaqueCube(){
        return false;
    }

    @Override
    public boolean renderAsNormalBlock(){
        return false;
    }

    @Override
    public int getRenderType(){
        return -2;
    }
}
