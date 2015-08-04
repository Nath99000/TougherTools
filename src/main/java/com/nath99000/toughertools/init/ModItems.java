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
    public static Item.ToolMaterial Wood2 = EnumHelper.addToolMaterial("Wood1", 0, 35, 01.0F, 0.5F, 3);
    public static Item PickW1;
    public static final ItemTT StoneCutter = new ItemStoneCutter();
    public static final ItemTT HeadW2 = new ItemToolHeadW2();
    public static final ItemTT BindingL2 = new ItemBindingL2();
    public static Item PickW2;
    public static final ItemTT StoneShard = new ItemStoneShard();
    public static final ItemTT PlateW1 = new ItemToolPlateW1();
    public static final ItemTT PlateW2 = new ItemToolPlateW2();
    public static final ItemTT Scraper = new ItemScraper();



    public static void  init()
    {
        GameRegistry.registerItem(LeatherStrips, "LeatherStrips");
        GameRegistry.registerItem(BindingL1, "BindingL1");
        GameRegistry.registerItem(HeadW1, "HeadW1");
        GameRegistry.registerItem(PickW1 = new ItemPickW1("PickW1", Wood1), "PickW1");
        GameRegistry.registerItem(StoneCutter, "StoneCutter");
        GameRegistry.registerItem(HeadW2, "HeadW2");
        GameRegistry.registerItem(BindingL2, "BindingL2");
        GameRegistry.registerItem(PickW2 = new ItemPickW2("PickW2", Wood2), "PickW2");
        GameRegistry.registerItem(StoneShard, "StoneShard");
        GameRegistry.registerItem(PlateW1, "PlateW1");
        GameRegistry.registerItem(PlateW2, "PlateW2");
        GameRegistry.registerItem(Scraper, "Scraper");
    }
}
