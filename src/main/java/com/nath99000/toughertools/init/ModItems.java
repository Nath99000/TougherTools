package com.nath99000.toughertools.init;

import com.nath99000.toughertools.item.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems
{
    public static final ItemTT LeatherStrips = new ItemLeatherStrips();
    public static final  ItemTT BindingL1 = new ItemBindingL1();
    public static final ItemTT HeadW1 = new ItemToolHeadW1();
    public static Item.ToolMaterial Wood1 = EnumHelper.addToolMaterial("Wood1", 0, 20, 0.5F, 0.0F, 1);
    public static Item PickW1;
    public static final ItemTT StoneCutter = new ItemStoneCutter();

    public static void  init()
    {
        GameRegistry.registerItem(LeatherStrips, "LeatherStrips");
        GameRegistry.registerItem(BindingL1, "BindingL1");
        GameRegistry.registerItem(HeadW1, "HeadW1");
        GameRegistry.registerItem(PickW1 = new ItemPickW1("PickW1", Wood1), "PickW1");
        GameRegistry.registerItem(StoneCutter, "StoneCutter");

    }
}
