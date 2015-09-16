package com.nath99000.toughertools.tileentity;

import com.nath99000.toughertools.Util.LogHelper;
import net.minecraft.tileentity.TileEntity;

public class TileEntityTable extends TileEntity {

    public int tick;

    public TileEntityTable(){
    }

    @Override
    public void updateEntity()
    {
        if (!worldObj.isRemote)
        {
            tick++;
            if (tick == 10000)
            {
                tick = 0;
                worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
            }
        }
    }
}
