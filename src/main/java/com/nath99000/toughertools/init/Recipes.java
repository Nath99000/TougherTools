package com.nath99000.toughertools.init;

import com.nath99000.toughertools.crafting.ToolTableCraftingManager;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

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
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.IronOre, 2), new ItemStack(Blocks.iron_ore), new ItemStack(ModItems.Crusher));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.IronOre, 2), new ItemStack(Blocks.iron_ore), new ItemStack(ModItems.Crusher, 1, 2));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.IronOre, 2), new ItemStack(Blocks.iron_ore), new ItemStack(ModItems.Crusher, 1, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.IronOre, 2), new ItemStack(Blocks.iron_ore), new ItemStack(ModItems.Crusher, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.IronOre, 2), new ItemStack(Blocks.iron_ore), new ItemStack(ModItems.Crusher, 0, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.GoldOre, 2), new ItemStack(Blocks.gold_ore), new ItemStack(ModItems.Crusher));
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
    }

    public static void toolrecipe(ToolTableCraftingManager craftingManager){
        craftingManager.addRecipe(new ItemStack(ModItems.StaffLightning, 1), new Object[]{"#  D", "   I", "   I", 'D', new ItemStack(Items.diamond), 'I', new ItemStack(Items.iron_ingot), '#', new ItemStack(ModItems.SchematicLightning)});
        craftingManager.addRecipe(new ItemStack(ModItems.StaffLightning, 1), new Object[]{"   D", "#  I", "   I", 'D', new ItemStack(Items.diamond), 'I', new ItemStack(Items.iron_ingot), '#', new ItemStack(ModItems.SchematicLightning)});
        craftingManager.addRecipe(new ItemStack(ModItems.StaffLightning, 1), new Object[]{"   D", "   I", "#  I", 'D', new ItemStack(Items.diamond), 'I', new ItemStack(Items.iron_ingot), '#', new ItemStack(ModItems.SchematicLightning)});
        craftingManager.addRecipe(new ItemStack(ModItems.StaffLightning, 1), new Object[]{"  D ", "  I ", "# I ", 'D', new ItemStack(Items.diamond), 'I', new ItemStack(Items.iron_ingot), '#', new ItemStack(ModItems.SchematicLightning)});
        craftingManager.addRecipe(new ItemStack(ModItems.StaffLightning, 1), new Object[]{"# D ", "  I ", "  I ", 'D', new ItemStack(Items.diamond), 'I', new ItemStack(Items.iron_ingot), '#', new ItemStack(ModItems.SchematicLightning)});
        craftingManager.addRecipe(new ItemStack(ModItems.StaffLightning, 1), new Object[]{"  D ", "# I ", "  I ", 'D', new ItemStack(Items.diamond), 'I', new ItemStack(Items.iron_ingot), '#', new ItemStack(ModItems.SchematicLightning)});
        craftingManager.addRecipe(new ItemStack(ModItems.StaffLightning, 1), new Object[]{"#D  ", " I  ", " I  ", 'D', new ItemStack(Items.diamond), 'I', new ItemStack(Items.iron_ingot), '#', new ItemStack(ModItems.SchematicLightning)});
        craftingManager.addRecipe(new ItemStack(ModItems.StaffLightning, 1), new Object[]{" D  ", "#I  ", " I  ", 'D', new ItemStack(Items.diamond), 'I', new ItemStack(Items.iron_ingot), '#', new ItemStack(ModItems.SchematicLightning)});
        craftingManager.addRecipe(new ItemStack(ModItems.StaffLightning, 1), new Object[]{" D  ", " I  ", "#I  ", 'D', new ItemStack(Items.diamond), 'I', new ItemStack(Items.iron_ingot), '#', new ItemStack(ModItems.SchematicLightning)});
    }
}
