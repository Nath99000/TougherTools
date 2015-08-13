package com.nath99000.toughertools.init;

import com.nath99000.toughertools.item.*;
import com.nath99000.toughertools.item.Ammunition.ItemSnowClip;
import com.nath99000.toughertools.item.Axes.ItemAxeW1;
import com.nath99000.toughertools.item.Axes.ItemAxeW2;
import com.nath99000.toughertools.item.Hoes.*;
import com.nath99000.toughertools.item.Items.*;
import com.nath99000.toughertools.item.Materials.DiamondChunk;
import com.nath99000.toughertools.item.Materials.GoldOre;
import com.nath99000.toughertools.item.Materials.IronOre;
import com.nath99000.toughertools.item.Materials.SteelChunk;
import com.nath99000.toughertools.item.Pickaxes.*;
import com.nath99000.toughertools.item.Pickaxes.NightVision.ItemPickW4NV;
import com.nath99000.toughertools.item.Pickaxes.NightVision.ItemPickW5NV;
import com.nath99000.toughertools.item.Shovels.*;
import com.nath99000.toughertools.item.Tools.*;
import com.nath99000.toughertools.item.Axes.*;
import com.nath99000.toughertools.item.Weaponry.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems
{
    public static final ItemTT LeatherStrips = new ItemLeatherStrips();
    public static final  ItemTT BindingL1 = new ItemBindingL1();
    public static final ItemTT HeadW1 = new ItemToolHeadW1();
    public static Item.ToolMaterial Wood1 = EnumHelper.addToolMaterial("Wood1", 0, 20, 1F, 0.0F, 0);
    public static Item.ToolMaterial Wood2 = EnumHelper.addToolMaterial("Wood1", 0, 35, 2F, 0.5F, 0);
    public static Item.ToolMaterial Wood3 = EnumHelper.addToolMaterial("Wood3", 0, 59, 3F, 0.7F, 0);
    public static Item.ToolMaterial Wood4 = EnumHelper.addToolMaterial("Wood4", 0, 73, 4f, 1.0F, 0);
    public static Item.ToolMaterial Wood5 = EnumHelper.addToolMaterial("Wood5", 0, 100, 5F, 1.3F, 0);
    public static Item.ToolMaterial Stone1 = EnumHelper.addToolMaterial("Stone1", 1, 85, 2F, 1.2F, 0);
    public static Item.ToolMaterial Stone2 = EnumHelper.addToolMaterial("Stone2", 1, 100, 3F, 1.4F, 0);
    public static Item.ToolMaterial Stone3 = EnumHelper.addToolMaterial("Stone3", 1, 110, 4F, 1.6F, 0);
    public static Item.ToolMaterial Stone4 = EnumHelper.addToolMaterial("Stone4", 1, 120, 5F, 1.8F, 0);
    public static Item.ToolMaterial Stone5 = EnumHelper.addToolMaterial("Stone5", 1, 135, 6F, 2.0F, 0);
    public static Item.ToolMaterial cleaver = EnumHelper.addToolMaterial("cleaver", 0, 1500, 0F, 5.0F, 0);
    public static Item PickW1;
    public static final ItemTT StoneCutter = new ItemStoneCutter();
    public static final ItemTT HeadW2 = new ItemToolHeadW2();
    public static final ItemTT BindingL2 = new ItemBindingL2();
    public static Item PickW2;
    public static final ItemTT StoneShard = new ItemStoneShard();
    public static final ItemTT PlateW1 = new ItemToolPlateW1();
    public static final ItemTT PlateW2 = new ItemToolPlateW2();
    public static final ItemTT Scraper = new ItemScraper();
    public static final ItemTT Plank = new ItemPlank();
    public static Item AxeW1;
    public static Item ShovelW1;
    public static Item HoeW1;
    public static ItemTT Snowballlauncher = new ItemSnowBallLauncher();
    public static ItemTT BladeW1 = new ItemToolBladeW1();
    public static ItemTT Snowclip = new ItemSnowClip();
    public static ItemTT WandcoreW1 = new ItemWandcoreW1();
    public static Item SwordW1;
    public static Item ShovelW2;
    public static Item AxeW2;
    public static Item HoeW2;
    public static Item SwordW2;
    public static ItemTT DartGun = new ItemDartGun();
    public static Item SwordW3;
    public static Item SwordW4;
    public static Item SwordW5;
    public static Item PickW3;
    public static Item PickW4;
    public static Item PickW5;
    public static Item HoeW3;
    public static Item HoeW4;
    public static Item HoeW5;
    public static Item AxeW3;
    public static Item AxeW4;
    public static Item AxeW5;
    public static Item ShovelW3;
    public static Item ShovelW4;
    public static Item ShovelW5;
    public static Item PickS1;
    public static Item PickS2;
    public static Item PickS3;
    public static Item PickS4;
    public static Item PickS5;
    public static Item PickW5nv;
    public static Item PickW4nv;
    public static Item Cleaver;
    public static ItemTT IronOre = new IronOre();
    public static ItemTT GoldOre = new GoldOre();
    public static ItemTT DiamondChunk = new DiamondChunk();
    public static ItemTT Crusher = new ItemCrusher();
    public static ItemTT SteelChunk = new SteelChunk();

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
        GameRegistry.registerItem(Plank, "Plank");
        GameRegistry.registerItem(AxeW1 = new ItemAxeW1("AxeW1", Wood1), "AxeW1");
        GameRegistry.registerItem(ShovelW1 = new ItemShovelW1("ShovelW1", Wood1), "ShovelW1");
        GameRegistry.registerItem(HoeW1 = new ItemHoeW1("HoeW1", Wood1), "HoeW1");
        GameRegistry.registerItem(Snowballlauncher, "Snowballlauncher");
        GameRegistry.registerItem(BladeW1, "BladeW1");
        GameRegistry.registerItem(Snowclip, "Snowclip");
        GameRegistry.registerItem(WandcoreW1, "WandcoreW1");
        GameRegistry.registerItem(SwordW1 = new ItemSwordW1("SwordW1", Wood1), "SwordW1");
        GameRegistry.registerItem(ShovelW2 = new ItemShovelW2("ShovelW2", Wood2), "ShovelW2");
        GameRegistry.registerItem(AxeW2 = new ItemAxeW2("AxeW2", Wood2), "AxeW2");
        GameRegistry.registerItem(HoeW2 = new ItemHoeW2("HoeW2", Wood2), "HoeW2");
        GameRegistry.registerItem(SwordW2 = new ItemSwordW2("SwordW2", Wood2), "SwordW2");
        GameRegistry.registerItem(DartGun, "DartGun");
        GameRegistry.registerItem(SwordW3 = new ItemSwordW3("SwordW3", Wood3), "SwordW3");
        GameRegistry.registerItem(SwordW4 = new ItemSwordW4("SwordW4", Wood4), "SwordW4");
        GameRegistry.registerItem(SwordW5 = new ItemSwordW5("SwordW5", Wood5), "SwordW5");
        GameRegistry.registerItem(PickW3 = new ItemPickW3("PickW3", Wood3), "PickW3");
        GameRegistry.registerItem(PickW4 = new ItemPickW4("PickW4", Wood4), "PickW4");
        GameRegistry.registerItem(PickW5 = new ItemPickW5("PickW5", Wood5), "PickW5");
        GameRegistry.registerItem(HoeW3 = new ItemHoeW3("HoeW3", Wood3), "HoeW3");
        GameRegistry.registerItem(HoeW4 = new ItemHoeW4("HoeW4", Wood4), "HoeW4");
        GameRegistry.registerItem(HoeW5 = new ItemHoeW5("HoeW5", Wood5), "HoeW5");
        GameRegistry.registerItem(AxeW3 = new ItemAxeW3("AxeW3", Wood3), "AxeW3");
        GameRegistry.registerItem(AxeW4 = new ItemAxeW4("AxeW4", Wood4), "AxeW4");
        GameRegistry.registerItem(AxeW5 = new ItemAxeW5("AxeW5", Wood5), "AxeW5");
        GameRegistry.registerItem(ShovelW3 = new ItemShovelW3("ShovelW3", Wood3), "ShovelW3");
        GameRegistry.registerItem(ShovelW4 = new ItemShovelW4("ShovelW4", Wood4), "ShovelW4");
        GameRegistry.registerItem(ShovelW5 = new ItemShovelW5("ShovelW5", Wood5), "ShovelW5");
        GameRegistry.registerItem(PickS1 = new ItemPickS1("PickS1", Stone1), "PickS1");
        GameRegistry.registerItem(PickS2 = new ItemPickS2("PickS2", Stone2), "PickS2");
        GameRegistry.registerItem(PickS3 = new ItemPickS3("PickS3", Stone3), "PickS3");
        GameRegistry.registerItem(PickS4 = new ItemPickS4("PickS4", Stone4), "PickS4");
        GameRegistry.registerItem(PickS5 = new ItemPickS5("PickS5", Stone5), "PickS5");
        GameRegistry.registerItem(PickW5nv = new ItemPickW5NV("PickW5nv", Wood5), "PickW5nv");
        GameRegistry.registerItem(PickW4nv = new ItemPickW4NV("PickW4nv", Wood4), "PickW4nv");
        GameRegistry.registerItem(Cleaver = new ItemCleaver("Cleaver", cleaver), "Cleaver");
        GameRegistry.registerItem(IronOre, "IronOre");
        GameRegistry.registerItem(GoldOre, "GoldOre");
        GameRegistry.registerItem(DiamondChunk, "DiamondChunk");
        GameRegistry.registerItem(Crusher, "Crusher");
        GameRegistry.registerItem(SteelChunk, "SteelChunk");
    }
}
