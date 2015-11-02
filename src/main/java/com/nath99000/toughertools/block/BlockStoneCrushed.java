package com.nath99000.toughertools.block;

import com.nath99000.toughertools.creativetab.TTTab;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;

public class BlockStoneCrushed extends BlockFallingTT{
    public BlockStoneCrushed(){
        super(Material.ground);
        setBlockName("BlockCrushedStone");
    }
}
