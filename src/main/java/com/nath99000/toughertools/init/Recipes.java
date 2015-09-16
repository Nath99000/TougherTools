package com.nath99000.toughertools.init;

import com.nath99000.toughertools.crafting.ToolTableCraftingManager;
import com.nath99000.toughertools.item.Miscellaneous.ItemCable;
import com.nath99000.toughertools.item.Miscellaneous.ItemChipset;
import com.nath99000.toughertools.item.Weaponry.ItemLightningStaff;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import javax.annotation.Nullable;

public class Recipes
{
    public static void init() {
        GameRegistry.addRecipe(new ItemStack(ModItems.PickW1), "HBH", " S ", " S ", 'H', new ItemStack(ModItems.HeadW1), 'B', new ItemStack(ModItems.BindingL1), 'S', new ItemStack(Items.stick));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.LeatherStrips), new ItemStack(Items.leather), new ItemStack(Items.flint));
        GameRegistry.addRecipe(new ItemStack(ModItems.BindingL1), "L L", " F ", "L L", 'L', new ItemStack(Items.leather), 'F', new ItemStack(Items.flint));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.HeadW1), new ItemStack(Items.stick), new ItemStack(Items.flint));
        GameRegistry.addRecipe(new ItemStack(ModItems.StoneCutter), " BF", " S ", "C  ", 'B', new ItemStack(ModItems.BindingL1), 'F', new ItemStack(Items.flint), 'S', new ItemStack(Items.stick), 'C', new ItemStack(Items.coal));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.StoneShard, 5), new ItemStack(Blocks.cobblestone), new ItemStack(ModItems.StoneCutter));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.PlateW1), new ItemStack(Blocks.planks), new ItemStack(Blocks.planks), new ItemStack(Items.flint));
        GameRegistry.addRecipe(new ItemStack(ModItems.Scraper), " BR", " S ", "S  ", 'B', new ItemStack(ModItems.BindingL1), 'R', new ItemStack(ModItems.StoneShard), 'S', new ItemStack(Items.stick));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.BindingL2), new ItemStack(ModItems.BindingL1), new ItemStack(ModItems.Scraper));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.HeadW2), new ItemStack(ModItems.HeadW1), new ItemStack(Items.stick), new ItemStack(ModItems.StoneShard));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Plank, 2), new ItemStack(Blocks.planks), new ItemStack(Items.flint));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.PlateW1), new ItemStack(Items.flint), new ItemStack(ModItems.Plank));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.PlateW2), new ItemStack(ModItems.PlateW1), new ItemStack(ModItems.StoneShard), new ItemStack(ModItems.Scraper));
        GameRegistry.addRecipe(new ItemStack(ModItems.PickW2), "HBH", " S ", " S ", 'H', new ItemStack(ModItems.HeadW2), 'B', new ItemStack(ModItems.BindingL2), 'S', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(ModItems.AxeW1), "HB ", "PS ", " S ", 'H', new ItemStack(ModItems.HeadW1), 'B', new ItemStack(ModItems.BindingL1), 'P', new ItemStack(ModItems.PlateW1), 'S', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(ModItems.ShovelW1), " P ", " B ", " S ", 'B', new ItemStack(ModItems.BindingL1), 'P', new ItemStack(ModItems.PlateW1), 'S', new ItemStack(Items.stick));
        GameRegistry.addSmelting(new ItemStack(Items.rotten_flesh), new ItemStack(Items.leather), 1F);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Snowclip), new ItemStack(Items.stick), new ItemStack(Items.stick), new ItemStack(Blocks.snow), new ItemStack(Blocks.snow), new ItemStack(Items.gunpowder));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.BladeW1), new ItemStack(Items.stick), new ItemStack(Items.stick), new ItemStack(Items.flint));
        GameRegistry.addRecipe(new ItemStack(ModItems.SwordW1), " B ", "SLS", " S ", 'B', new ItemStack(ModItems.BladeW1), 'S', new ItemStack(Items.stick), 'L', new ItemStack(ModItems.BindingL1));
        GameRegistry.addRecipe(new ItemStack(ModItems.AxeW2), "HB ", "PS ", " S ", 'H', new ItemStack(ModItems.HeadW2), 'B', new ItemStack(ModItems.BindingL2), 'P', new ItemStack(ModItems.PlateW2), 'S', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(ModItems.ShovelW2), " P ", " B ", " S ", 'B', new ItemStack(ModItems.BindingL2), 'P', new ItemStack(ModItems.PlateW2), 'S', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(ModItems.HoeW1), "HB ", " S ", " S ", 'H', new ItemStack(ModItems.HeadW1), 'B', new ItemStack(ModItems.BindingL1), 'S', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(ModItems.HoeW2), "HB ", " S ", " S ", 'H', new ItemStack(ModItems.HeadW2), 'B', new ItemStack(ModItems.BindingL2), 'S', new ItemStack(Items.stick));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.flint, 4), new ItemStack(Blocks.gravel));
        GameRegistry.addRecipe(new ItemStack(ModItems.DartGun), "  L", "LSL", " LV", 'L', new ItemStack(ModItems.Plank), 'V', new ItemStack(Blocks.leaves), 'S', new ItemStack(ModItems.SchematicDartgun));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.PickW5nv), new ItemStack(ModItems.PickW5), new ItemStack(Items.ender_eye), new ItemStack(Items.golden_carrot));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.PickW4nv), new ItemStack(ModItems.PickW4), new ItemStack(Items.ender_eye), new ItemStack(Items.golden_carrot));
        GameRegistry.addSmelting(new ItemStack(Items.quartz), new ItemStack(ModItems.Crusher), 1.0F);
        //iron ore
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.IronOre, 2), new ItemStack(Blocks.iron_ore), new ItemStack(ModItems.Crusher, 1, 9));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.IronOre, 2), new ItemStack(Blocks.iron_ore), new ItemStack(ModItems.Crusher, 1, 8));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.IronOre, 2), new ItemStack(Blocks.iron_ore), new ItemStack(ModItems.Crusher, 1, 7));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.IronOre, 2), new ItemStack(Blocks.iron_ore), new ItemStack(ModItems.Crusher, 1, 6));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.IronOre, 2), new ItemStack(Blocks.iron_ore), new ItemStack(ModItems.Crusher, 1, 5));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.IronOre, 2), new ItemStack(Blocks.iron_ore), new ItemStack(ModItems.Crusher, 1, 4));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.IronOre, 2), new ItemStack(Blocks.iron_ore), new ItemStack(ModItems.Crusher, 1, 3));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.IronOre, 2), new ItemStack(Blocks.iron_ore), new ItemStack(ModItems.Crusher, 1, 2));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.IronOre, 2), new ItemStack(Blocks.iron_ore), new ItemStack(ModItems.Crusher, 1, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.IronOre, 2), new ItemStack(Blocks.iron_ore), new ItemStack(ModItems.Crusher, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.IronOre, 2), new ItemStack(Blocks.iron_ore), new ItemStack(ModItems.Crusher, 0, 0));
        //gold ore
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.GoldOre, 2), new ItemStack(Blocks.gold_ore), new ItemStack(ModItems.Crusher, 1, 9));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.GoldOre, 2), new ItemStack(Blocks.gold_ore), new ItemStack(ModItems.Crusher, 1, 8));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.GoldOre, 2), new ItemStack(Blocks.gold_ore), new ItemStack(ModItems.Crusher, 1, 7));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.GoldOre, 2), new ItemStack(Blocks.gold_ore), new ItemStack(ModItems.Crusher, 1, 6));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.GoldOre, 2), new ItemStack(Blocks.gold_ore), new ItemStack(ModItems.Crusher, 1, 5));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.GoldOre, 2), new ItemStack(Blocks.gold_ore), new ItemStack(ModItems.Crusher, 0, 4));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.GoldOre, 2), new ItemStack(Blocks.gold_ore), new ItemStack(ModItems.Crusher, 1, 3));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.GoldOre, 2), new ItemStack(Blocks.gold_ore), new ItemStack(ModItems.Crusher, 1, 2));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.GoldOre, 2), new ItemStack(Blocks.gold_ore), new ItemStack(ModItems.Crusher, 1, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.GoldOre, 2), new ItemStack(Blocks.gold_ore), new ItemStack(ModItems.Crusher, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.GoldOre, 2), new ItemStack(Blocks.gold_ore), new ItemStack(ModItems.Crusher, 0, 0));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.Steel), "SSS", "SSS", "SSS", 'S', new ItemStack(ModItems.steel));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.steel, 9), new ItemStack(ModBlocks.Steel));
        GameRegistry.addSmelting(new ItemStack(ModItems.SteelChunk), new ItemStack(ModItems.steel), 1.0F);
        GameRegistry.addSmelting(new ItemStack(ModItems.IronOre), new ItemStack(ModItems.SteelChunk), 1.0F);
        GameRegistry.addRecipe(new ItemStack(ModItems.CastIronInlay), " C ", "CIC", " C ", 'C', new ItemStack(Items.clay_ball), 'I', new ItemStack(ModItems.IronOre));
        GameRegistry.addRecipe(new ItemStack(ModItems.CastGoldInlay), " C ", "CIC", " C ", 'C', new ItemStack(Items.clay_ball), 'I', new ItemStack(ModItems.GoldOre));
        GameRegistry.addRecipe(new ItemStack(ModItems.CastIronplate), "CI ", "IC ", "   ", 'C', new ItemStack(Items.clay_ball), 'I', new ItemStack(ModItems.IronOre));
        GameRegistry.addRecipe(new ItemStack(ModItems.CastGoldplate), "CI ", "IC ", "   ", 'C', new ItemStack(Items.clay_ball), 'I', new ItemStack(ModItems.GoldOre));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockToolTable), "ISI", "SWS", "ISI", 'I', new ItemStack(Items.iron_ingot), 'S', new ItemStack(ModItems.steel), 'W', new ItemStack(Blocks.crafting_table));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.BlockToolTable), "SIS", "IWI", "SIS", 'I', new ItemStack(Items.iron_ingot), 'S', new ItemStack(ModItems.steel), 'W', new ItemStack(Blocks.crafting_table));
        //iron nugget
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ironnugget, 2), new ItemStack(ModItems.IronOre), new ItemStack(ModItems.Crusher, 1, 9));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ironnugget, 2), new ItemStack(ModItems.IronOre), new ItemStack(ModItems.Crusher, 1, 8));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ironnugget, 2), new ItemStack(ModItems.IronOre), new ItemStack(ModItems.Crusher, 1, 7));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ironnugget, 2), new ItemStack(ModItems.IronOre), new ItemStack(ModItems.Crusher, 1, 6));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ironnugget, 2), new ItemStack(ModItems.IronOre), new ItemStack(ModItems.Crusher, 1, 5));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ironnugget, 2), new ItemStack(ModItems.IronOre), new ItemStack(ModItems.Crusher, 1, 4));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ironnugget, 2), new ItemStack(ModItems.IronOre), new ItemStack(ModItems.Crusher, 1, 3));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ironnugget, 2), new ItemStack(ModItems.IronOre), new ItemStack(ModItems.Crusher, 1, 2));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ironnugget, 2), new ItemStack(ModItems.IronOre), new ItemStack(ModItems.Crusher, 1, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ironnugget, 2), new ItemStack(ModItems.IronOre), new ItemStack(ModItems.Crusher, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ironnugget, 2), new ItemStack(ModItems.IronOre), new ItemStack(ModItems.Crusher, 0, 0));
        //diamond chunk
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.DiamondChunk, 2), new ItemStack(Items.diamond), new ItemStack(ModItems.Crusher, 1, 9));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.DiamondChunk, 2), new ItemStack(Items.diamond), new ItemStack(ModItems.Crusher, 1, 8));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.DiamondChunk, 2), new ItemStack(Items.diamond), new ItemStack(ModItems.Crusher, 1, 7));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.DiamondChunk, 2), new ItemStack(Items.diamond), new ItemStack(ModItems.Crusher, 1, 6));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.DiamondChunk, 2), new ItemStack(Items.diamond), new ItemStack(ModItems.Crusher, 1, 5));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.DiamondChunk, 2), new ItemStack(Items.diamond), new ItemStack(ModItems.Crusher, 1, 4));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.DiamondChunk, 2), new ItemStack(Items.diamond), new ItemStack(ModItems.Crusher, 1, 3));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.DiamondChunk, 2), new ItemStack(Items.diamond), new ItemStack(ModItems.Crusher, 1, 2));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.DiamondChunk, 2), new ItemStack(Items.diamond), new ItemStack(ModItems.Crusher, 1, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.DiamondChunk, 2), new ItemStack(Items.diamond), new ItemStack(ModItems.Crusher, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.DiamondChunk, 2), new ItemStack(Items.diamond), new ItemStack(ModItems.Crusher, 0, 0));
        GameRegistry.addRecipe(new ItemStack(Items.iron_ingot), "III", "III", "III", 'I', new ItemStack(ModItems.ironnugget));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ironnugget, 9), new ItemStack(Items.iron_ingot));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ExploderCore), new ItemStack(Items.redstone), new ItemStack(ModItems.DiamondChunk), new ItemStack(Blocks.tnt), new ItemStack(ModItems.DiamondChunk), new ItemStack(Items.redstone), new ItemStack(ModItems.DiamondChunk), new ItemStack(ModItems.SteelChunk));
        GameRegistry.addRecipe(new ItemStack(ModItems.ExploderCore), "RD ", "DTS", "RD ", 'R', new ItemStack(Items.redstone), 'D', new ItemStack(ModItems.DiamondChunk), 'T', new ItemStack(Blocks.tnt), 'S', new ItemStack(ModItems.SteelChunk));
        GameRegistry.addRecipe(new ItemStack(ModItems.Chipset), " I ", "IGI", "NPN", 'I', new ItemStack(ModItems.ironnugget), 'G', new ItemStack(Items.dye, 2), 'N', new ItemStack(Items.gold_nugget), 'P', new ItemStack(Items.paper));
        GameRegistry.addShapelessRecipe(stackIt(new ItemCable()), stackIt(Items.gold_nugget), stackIt(Items.slime_ball), stackIt(Items.gold_nugget), stackIt(Items.gold_nugget));
        shapelesstwo(stackIt(Items.slime_ball), stackIt(Items.water_bucket), stackBlock(Blocks.sand));
        GameRegistry.addRecipe(stackIt(ModItems.Bomb), "CTC", "WMW", "CWC", 'C', stackIt(ModItems.Chipset), 'T', stackIt(Items.clock), 'W', stackIt(new ItemCable()), 'M', stackIt(ModItems.ExploderCore));
        shapelessone(stackIt(new ItemChipset()), stackIt(new ItemCable()));
    }

    public static void toolrecipe(ToolTableCraftingManager craftingManager){
        addVertToolRecipe(ModItems.StaffLightning, new ItemStack(Items.diamond), new ItemStack(Items.iron_ingot), new ItemStack(Items.iron_ingot), ModItems.SchematicLightning);
        craftingManager.addRecipe(new ItemStack(ModItems.Snowballlauncher, 1), new Object[]{"#BBB", "   B", " BBR", '#', new ItemStack(ModItems.SchematicSnowZooka), 'B', new ItemStack(Blocks.obsidian),'R', new ItemStack(Items.blaze_rod)});
        craftingManager.addRecipe(new ItemStack(ModItems.Snowballlauncher, 1), new Object[]{" BBB", "#  B", " BBR", '#', new ItemStack(ModItems.SchematicSnowZooka), 'B', new ItemStack(Blocks.obsidian),'R', new ItemStack(Items.blaze_rod)});
        craftingManager.addRecipe(new ItemStack(ModItems.Snowballlauncher, 1), new Object[]{" BBB", "   B", "#BBR", '#', new ItemStack(ModItems.SchematicSnowZooka), 'B', new ItemStack(Blocks.obsidian),'R', new ItemStack(Items.blaze_rod)});
        addVertToolRecipe(ModItems.PlasmaBlade, new ItemStack(Items.diamond), new ItemStack(Items.iron_ingot), new ItemStack(Items.iron_ingot), ModItems.SchematicPlasmablade);
        craftingManager.addRecipe(new ItemStack(ModItems.squidgunred, 1), new Object[]{"#IIN", "   I", " IIR", '#', new ItemStack(ModItems.SchematicSquid), 'I', new ItemStack(Items.iron_ingot), 'N', new ItemStack(Items.dye, 1, 1), 'R', new ItemStack(Items.blaze_rod)});
        addVertToolRecipe(ModItems.Cleaver, new ItemStack(ModBlocks.Steel), new ItemStack(ModBlocks.Steel), new ItemStack(Items.iron_sword), ModItems.SchematicCleaver);
    }

    public static void oreRecipe(){
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.BlockToolTable), " T ", "TWT", " T ", 'T', "ingotThaumium", 'W', new ItemStack(Blocks.crafting_table)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.BlockToolTable), " T ", "TWT", " T ", 'T', "ingotManasteel", 'W', new ItemStack(Blocks.crafting_table)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.BlockToolTable), " T ", "TWT", " T ", 'T', "ingotTerrasteel", 'W', new ItemStack(Blocks.crafting_table)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.BlockToolTable), " T ", "TWT", " T ", 'T', "ingotElvenElementium", 'W', new ItemStack(Blocks.crafting_table)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.BlockToolTable), " T ", "TWT", " T ", 'T', "ingotEnderium", 'W', new ItemStack(Blocks.crafting_table)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.BlockToolTable), " T ", "TWT", " T ", 'T', "ingotElectrum", 'W', new ItemStack(Blocks.crafting_table)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.BlockToolTable), " T ", "TWT", " T ", 'T', "ingotInvar", 'W', new ItemStack(Blocks.crafting_table)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.BlockToolTable), "ITI", "TWT", "ITI", 'T', "ingotSteel", 'W', new ItemStack(Blocks.crafting_table), 'I', new ItemStack(Items.iron_ingot)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.BlockToolTable), " T ", "TWT", " T ", 'T', "ingotCobalt", 'W', new ItemStack(Blocks.crafting_table)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.BlockToolTable), " T ", "TWT", " T ", 'T', "ingotArdite", 'W', new ItemStack(Blocks.crafting_table)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.BlockToolTable), " T ", "TWT", " T ", 'T', "ingotManyullyn", 'W', new ItemStack(Blocks.crafting_table)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.BotaniaSword), " S ", "BRB", "FTF", 'S', "ingotTerrasteel", 'B', "manaPetalBlack", 'R', "runeWrathB", 'F', "mysticFlowerRed", 'T', "livingwoodTwig"));

    }

    private static void addVertToolRecipe(Item output, ItemStack slot1, ItemStack slot2, ItemStack slot3, Item schematic){
        addUnlocalisedVertToolRecipe(ToolTableCraftingManager.getInstance(), output, slot1, slot2, slot3, schematic);
    }

    private static void addUnlocalisedVertToolRecipe(ToolTableCraftingManager manager, Item output, ItemStack slot1, ItemStack slot2, ItemStack slot3, Item schematic){
        manager.addRecipe(new ItemStack(output, 1), new Object[]{"#1  ", " 2  ", " 3  ", '#', new ItemStack(schematic), '1', slot1, '2', slot2, '3', slot3});
        manager.addRecipe(new ItemStack(output, 1), new Object[]{" 1  ", "#2  ", " 3  ", '#', new ItemStack(schematic), '1', slot1, '2', slot2, '3', slot3});
        manager.addRecipe(new ItemStack(output, 1), new Object[]{" 1  ", " 2  ", "#3  ", '#', new ItemStack(schematic), '1', slot1, '2', slot2, '3', slot3});
        manager.addRecipe(new ItemStack(output, 1), new Object[]{"# 1 ", "  2 ", "  3 ", '#', new ItemStack(schematic), '1', slot1, '2', slot2, '3', slot3});
        manager.addRecipe(new ItemStack(output, 1), new Object[]{"  1 ", "# 2 ", "  3 ", '#', new ItemStack(schematic), '1', slot1, '2', slot2, '3', slot3});
        manager.addRecipe(new ItemStack(output, 1), new Object[]{"# 1 ", "  2 ", "# 3 ", '#', new ItemStack(schematic),'1', slot1, '2', slot2, '3', slot3});
        manager.addRecipe(new ItemStack(output, 1), new Object[]{"#  1", "   2", "   3", '#', new ItemStack(schematic),'1', slot1, '2', slot2, '3', slot3});
        manager.addRecipe(new ItemStack(output, 1), new Object[]{"   1", "#  2", "   3", '#', new ItemStack(schematic),'1', slot1, '2', slot2, '3', slot3});
        manager.addRecipe(new ItemStack(output, 1), new Object[]{"   1", "   2", "   3", '#', new ItemStack(schematic), '1', slot1, '2', slot2, '3', slot3});
    }

    public static ItemStack stackIt(Item item){
        return new ItemStack(item);
    }

    public static ItemStack stackBlock(Block block){
        return new ItemStack(block);
    }

    private static void shapelessone(ItemStack output, ItemStack slot1){
        GameRegistry.addShapelessRecipe(output, slot1);
    }

    private static void shapelesstwo(ItemStack output, ItemStack slot1, ItemStack slot2){
        GameRegistry.addShapelessRecipe(output, slot1, slot2);
    }

    private static void shapelessthree(ItemStack output, ItemStack slot1, ItemStack slot2, ItemStack slot3){
        GameRegistry.addShapelessRecipe(output, slot1, slot2, slot3);
    }

    private static void shapelessfour(ItemStack output, ItemStack slot1, ItemStack slot2, ItemStack slot3, ItemStack slot4){
        GameRegistry.addShapelessRecipe(output, slot1, slot2, slot3, slot4);
    }

    private static void shapelessfive(ItemStack output, ItemStack slot1, ItemStack slot2, ItemStack slot3, ItemStack slot4, ItemStack slot5){
        GameRegistry.addShapelessRecipe(output, slot1, slot2, slot3, slot4, slot5);
    }

    private static void shapelesssix(ItemStack output, ItemStack slot1, ItemStack slot2, ItemStack slot3, ItemStack slot4, ItemStack slot5, ItemStack slot6){
        GameRegistry.addShapelessRecipe(output, slot1, slot2, slot3, slot4, slot5, slot6);
    }

    private static void shapelessseven(ItemStack output, ItemStack slot1, ItemStack slot2, ItemStack slot3, ItemStack slot4, ItemStack slot5, ItemStack slot6, ItemStack slot7){
        GameRegistry.addShapelessRecipe(output, slot1, slot2, slot3, slot4, slot5, slot6, slot7);
    }

    private static void shapelesseight(ItemStack output, ItemStack slot1, ItemStack slot2, ItemStack slot3, ItemStack slot4, ItemStack slot5, ItemStack slot6, ItemStack slot7, ItemStack slot8){
        GameRegistry.addShapelessRecipe(output, slot1, slot2, slot3, slot4, slot5, slot6, slot7, slot8);
    }

    private static void shapelessnine(ItemStack output, ItemStack slot1, ItemStack slot2, ItemStack slot3, ItemStack slot4, ItemStack slot5, ItemStack slot6, ItemStack slot7, ItemStack slot8, ItemStack slot9){
        GameRegistry.addShapelessRecipe(output, slot1, slot2, slot3, slot4, slot5, slot6, slot7, slot8, slot9);
    }


}
