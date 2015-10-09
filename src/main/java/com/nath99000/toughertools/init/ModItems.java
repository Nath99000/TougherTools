package com.nath99000.toughertools.init;

import com.nath99000.toughertools.Reference.Magic;
import com.nath99000.toughertools.Reference.Names;
import com.nath99000.toughertools.item.Ammunition.ItemExploderCore;
import com.nath99000.toughertools.item.Ammunition.ItemSnowClip;
import com.nath99000.toughertools.item.Casts.Cast;
import com.nath99000.toughertools.item.Items.*;
import com.nath99000.toughertools.item.Items.ItemPlaceHolder;
import com.nath99000.toughertools.item.Materials.*;
import com.nath99000.toughertools.item.Miscellaneous.ItemCable;
import com.nath99000.toughertools.item.Miscellaneous.ItemChipset;
import com.nath99000.toughertools.item.Miscellaneous.ItemSteelIngot;
import com.nath99000.toughertools.item.Miscellaneous.ToolTablePad;
import com.nath99000.toughertools.item.Tools.*;
import com.nath99000.toughertools.item.Vanilla.*;
import com.nath99000.toughertools.item.Weaponry.Magic.ItemSpell;
import com.nath99000.toughertools.item.Weaponry.WeaponPyrotechnics.ItemLandmine;
import com.nath99000.toughertools.item.Weaponry.*;
import com.nath99000.toughertools.item.Weaponry.ASchematic;
import com.nath99000.toughertools.item.Weaponry.WeaponPyrotechnics.ItemExploder;
import com.nath99000.toughertools.item.Wrapper.ItemSwordTT;
import com.nath99000.toughertools.item.Wrapper.ItemTT;
import com.nath99000.toughertools.item.Wrapper.UniqueTT;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

    public static Item.ToolMaterial cleaver = EnumHelper.addToolMaterial("cleaver", 0, 1500, 0F, 5.0F, 0);
    public static Item.ToolMaterial Dagger = EnumHelper.addToolMaterial("Dagger", 0, 150, 0F, 1.8F, 0);
    public static Item.ToolMaterial Arcanesword = EnumHelper.addToolMaterial("Arcanesword", 0, 325, 0f, 3.1F, 0);
    public static Item.ToolMaterial Plasmablade = EnumHelper.addToolMaterial("Plasmablade", 0, 525, 0f, 3F, 0);
    public static Item.ToolMaterial daedramace = EnumHelper.addToolMaterial("daedramace", 0, 750, 0f, 4.3f, 0);
    public static Item.ToolMaterial masamune = EnumHelper.addToolMaterial("masamune", 0, 825, 0f, 4f, 0);
    public static Item.ToolMaterial botaniaterrasteel = EnumHelper.addToolMaterial("botaniaterrasteel", 4, 2300, 9F, 3F, 0);

    public static final ItemTT LeatherStrips = new ItemCrafting("Leather", "Strips", "");
    public static final ItemTT BindingL1 = new ItemCrafting("Binding", "L", "1");
    public static final ItemTT HeadW1 = new ItemCrafting("ToolHead", "W", "1");
    public static final ItemTT StoneCutter = new ItemStoneCutter();
    public static final ItemTT HeadW2 = new ItemCrafting("ToolHead", "W", "1");
    public static final ItemTT BindingL2 = new ItemCrafting("Binding", "L", "2");
    public static final ItemTT StoneShard = new ItemCrafting("Stone", "shard", "");
    public static final ItemTT PlateW1 = new ItemCrafting("Plate", "W", "1");
    public static final ItemTT PlateW2 = new ItemCrafting("Plate", "W", "2");
    public static final ItemTT Scraper = new ItemScraper();
    public static final ItemTT Plank = new ItemCrafting("Plank", "", "");
    public static UniqueTT Snowballlauncher = new ItemSnowBallLauncher();
    public static ItemTT BladeW1 = new ItemCrafting("Blade", "W", "1");
    public static ItemTT Snowclip = new ItemSnowClip();
    public static ItemTT WandcoreW1 = new ItemCrafting("Wandcore", "W", "1");
    public static UniqueTT DartGun = new ItemDartGun();
    public static Item Cleaver;
    public static ItemTT IronOre = new IronOre();
    public static ItemTT GoldOre = new GoldOre();
    public static ItemTT DiamondChunk = new DiamondChunk();
    public static ItemTT Crusher = new ItemCrusher();
    public static ItemTT SteelChunk = new SteelChunk();

    public static ItemTT steel = new ItemSteelIngot();
    public static Item dagger;
    public static Item daggerAssasin;

    public static Item CastIronInlay = new Cast("Iron", "Inlay");
    public static Item CastGoldInlay = new Cast("Gold", "Inlay");
    public static Item CastIronplate = new Cast("Iron", "Plate");
    public static Item CastGoldplate = new Cast("Gold", "Plate");
    public static ItemSwordTT arcanesword;

    public static Item PlasmaBlade;

    public static Item StaffLightning = new ItemLightningStaff();

    public static Item Scythe = new ItemScythe(Dagger, "Scythe");
    public static Item Daedramace = new ItemDaedraMace(daedramace);
    public static Item Masamune = new ItemMasamune(masamune);
    public static final ItemTT ironnugget = new IronNugget();
    public static Item thaumsteel = new ItemPlaceHolder("Thaumium", StatCollector.translateToLocal("toughertools.tooltip.thaumic"));
    public static Item botaniasteel = new ItemPlaceHolder("Manasteel", StatCollector.translateToLocal("toughertools.tooltip.botanical"));
    public static Item botaniaterra = new ItemPlaceHolder("Terrasteel", StatCollector.translateToLocal("toughertools.tooltip.botanical"));
    public static Item botanianelven = new ItemPlaceHolder("Elementium", StatCollector.translateToLocal("toughertools.tooltip.botanical"));
    public static Item ae2fluix = new ItemPlaceHolder("Fluix", Names.ae2);
    public static Item theEnderium = new ItemPlaceHolder("Enderium", Names.thermal);
    public static Item theElectrum = new ItemPlaceHolder("Electrum", Names.thermal);
    public static Item theInvar = new ItemPlaceHolder("Invar", Names.thermal);
    public static Item tcManyullyn = new ItemPlaceHolder("Manyullyn", Names.tconstruct);
    public static Item tcCobalt = new ItemPlaceHolder("Cobalt", Names.tconstruct);
    public static Item tcArdite = new ItemPlaceHolder("Ardite", Names.tconstruct);
    public static Item botaniagaia = new ItemPlaceHolder("Gaia ingot", StatCollector.translateToLocal("toughertools.tooltip.botanical"));
    public static Item botaniawrathrune = new ItemPlaceHolder("Rune of wrath", StatCollector.translateToLocal("toughertools.tooltip.botanical"));
    public static Item botaniaflowerred = new ItemPlaceHolder("Red mystical flower", StatCollector.translateToLocal("toughertools.tooltip.botanical"));
    public static Item botaniastick = new ItemPlaceHolder("Livingwood twig", StatCollector.translateToLocal("toughertools.tooltip.botanical"));
    public static Item botaniapetalblack = new ItemPlaceHolder("Black mana petal", StatCollector.translateToLocal("toughertools.tooltip.botanical"));
    public static Item BotaniaSword = new ItemBotaniaSword(botaniaterrasteel);
    public static Item ae2certus = new ItemPlaceHolder("Certus quartz", Names.ae2);
    public static Item realPlaceHolder = new ItemPlaceHolder("Thread of reality", StatCollector.translateToLocal("toughertools.tooltip.quasar"));
    public static Item Bomb = new ItemLandmine();
    public static Item Exploder = new ItemExploder();
    public static Item ExploderCore = new ItemExploderCore();
    public static Item Chipset = new ItemChipset();
    public static Item Wire = new ItemCable();
    public static Item tooltable = new ToolTablePad();
    public static Item spellSpectator = new ItemSpell("Spectator", Magic.spellSpectator());


    public static Item SchematicScythe;
    public static Item SchematicDemonMace;
    public static Item SchematicMasamune;
    public static Item SchematicCleaver;
    public static Item SchematicSnowballGun;
    public static Item SchematicDartgun;
    public static Item SchematicArcaneSword;
    public static Item SchematicLightning;
    public static Item SchematicPlasmaBlade;
    public static Item SchematicAssasin;
    public static Item SchematicScythe2;
    public static Item SchematicDemonMace2;
    public static Item SchematicMasamune2;
    public static Item SchematicCleaver2;
    public static Item SchematicSnowballGun2;
    public static Item SchematicDartgun2;
    public static Item SchematicArcaneSword2;
    public static Item SchematicLightning2;
    public static Item SchematicPlasmaBlade2;
    public static Item SchematicAssasin2;

    public static Item[] picks = new Item[6];
    public static Item[] axes = new Item[6];
    public static Item[] shovels = new Item[6];
    public static Item[] swords = new Item[6];
    public static Item[] hoes = new Item[6];
    public static Item.ToolMaterial[] stone = new Item.ToolMaterial[6];

    public static Item[] pickw = new Item[6];
    public static Item[] axew = new Item[6];
    public static Item[] shovelw = new Item[6];
    public static Item[] swordw = new Item[6];
    public static Item[] hoew = new Item[6];
    public static Item.ToolMaterial[] wood = new Item.ToolMaterial[6];

    public static void init() {
        registerToolSet(pickw, axew, shovelw, swordw, hoew, wood, "W", 0, 16, 0f, 0f);
        registerToolSet(picks, axes, shovels, swords, hoes, stone, "S", 1, 21, 0.2f, 0.2f);
        GameRegistry.registerItem(LeatherStrips, "LeatherStrips");
        GameRegistry.registerItem(BindingL1, "BindingL1");
        GameRegistry.registerItem(HeadW1, "HeadW1");
        GameRegistry.registerItem(StoneCutter, "StoneCutter");
        GameRegistry.registerItem(HeadW2, "HeadW2");
        GameRegistry.registerItem(BindingL2, "BindingL2");
        GameRegistry.registerItem(StoneShard, "StoneShard");
        GameRegistry.registerItem(PlateW1, "PlateW1");
        GameRegistry.registerItem(PlateW2, "PlateW2");
        GameRegistry.registerItem(Scraper, "Scraper");
        GameRegistry.registerItem(Plank, "Plank");
        GameRegistry.registerItem(Snowballlauncher, "Snowballlauncher");
        GameRegistry.registerItem(BladeW1, "BladeW1");
        GameRegistry.registerItem(Snowclip, "Snowclip");
        GameRegistry.registerItem(WandcoreW1, "WandcoreW1");
        GameRegistry.registerItem(DartGun, "DartGun");
        GameRegistry.registerItem(Cleaver = new ItemCleaver("Cleaver", cleaver), "Cleaver");
        GameRegistry.registerItem(IronOre, "IronOre");
        GameRegistry.registerItem(GoldOre, "GoldOre");
        GameRegistry.registerItem(DiamondChunk, "DiamondChunk");
        GameRegistry.registerItem(Crusher, "Crusher");
        GameRegistry.registerItem(SteelChunk, "SteelChunk");
        GameRegistry.registerItem(steel, "steel");
        GameRegistry.registerItem(dagger = new ItemDagger(Dagger, "Dagger"), "Dagger");
        GameRegistry.registerItem(daggerAssasin = new ItemAssasinDagger(Dagger, "DaggerAssasin"), "DaggerAssasin");

        GameRegistry.registerItem(CastIronInlay, "CastIronInlay");
        GameRegistry.registerItem(CastGoldInlay, "CastGoldInlay");
        GameRegistry.registerItem(CastIronplate, "CastIronplate");
        GameRegistry.registerItem(CastGoldplate, "CastGoldplate");
        GameRegistry.registerItem(arcanesword = new ItemArcaneSword(Arcanesword, "Arcanesword"), "Arcanesword");
        GameRegistry.registerItem(PlasmaBlade = new ItemPlasmaBlade(Plasmablade, "PlasmaBlade"), "PlasmaBlade");
        GameRegistry.registerItem(StaffLightning, "StaffLightning");
        GameRegistry.registerItem(Scythe, "Scythe");
        GameRegistry.registerItem(Daedramace, "Daedramace");
        GameRegistry.registerItem(Masamune, "Masamune");
        GameRegistry.registerItem(ironnugget, "Ironnugget");
        GameRegistry.registerItem(thaumsteel, "thaumsteel");
        GameRegistry.registerItem(botaniasteel, "botaniasteel");
        GameRegistry.registerItem(botaniaterra, "botaniaterra");
        GameRegistry.registerItem(botanianelven, "botanianelven");
        GameRegistry.registerItem(ae2fluix, "ae2fluix");
        GameRegistry.registerItem(theEnderium, "theEnderium");
        GameRegistry.registerItem(theElectrum, "theElectrum");
        GameRegistry.registerItem(theInvar, "theInvar");
        GameRegistry.registerItem(tcManyullyn, "tcManyullyn");
        GameRegistry.registerItem(tcCobalt, "tcCobalt");
        GameRegistry.registerItem(tcArdite, "tcArdite");
        GameRegistry.registerItem(botaniagaia, "botaniagaia");
        GameRegistry.registerItem(botaniawrathrune, "botaniawrathrune");
        GameRegistry.registerItem(botaniaflowerred, "botaniaflowerred");
        GameRegistry.registerItem(botaniastick, "botaniastick");
        GameRegistry.registerItem(botaniapetalblack, "botaniapetalblack");
        GameRegistry.registerItem(BotaniaSword, "BotaniaSword");
        GameRegistry.registerItem(ae2certus, "ae2certus");
        GameRegistry.registerItem(Bomb, "Bomb");
        GameRegistry.registerItem(Exploder, "Exploder");
        GameRegistry.registerItem(ExploderCore, "ExploderCore");
        GameRegistry.registerItem(Chipset, "Chipset");
        GameRegistry.registerItem(Wire, "Cable");
        GameRegistry.registerItem(realPlaceHolder, "realPlaceHolder");
        GameRegistry.registerItem(tooltable, "tooltable");
        registerSchematic(SchematicArcaneSword, SchematicArcaneSword2, "ArcaneSword", Names.rare, false);
        registerSchematic(SchematicAssasin, SchematicAssasin2, "AssasinDagger", Names.rare, false);
        registerSchematic(SchematicSnowballGun, SchematicSnowballGun2, "SnowZooka", Names.epic, false);
        registerSchematic(SchematicPlasmaBlade, SchematicPlasmaBlade2, "PlasmaBlade", Names.rare, false);
        registerSchematic(SchematicCleaver, SchematicCleaver2, "Cleaver", Names.legendary, false);
        registerSchematic(SchematicLightning, SchematicLightning2, "LightningStaff", Names.godly, false); //scythe mace, masamune, dartgun
        registerSchematic(SchematicScythe, SchematicScythe2, "Scythe", Names.common, false);
        registerSchematic(SchematicDemonMace, SchematicDemonMace2, "DemonicMace", Names.godly, false);
        registerSchematic(SchematicMasamune, SchematicMasamune2, "Masamune", Names.legendary, false);
        registerSchematic(SchematicDartgun, SchematicDartgun2, "DartGun", Names.common, false);
        GameRegistry.registerItem(spellSpectator, "spellSpectator");
    }

    private static void registerToolSet(Item[] picks, Item[] axes, Item[] shovels, Item[] swords, Item[] hoes, Item.ToolMaterial[] materials, String type, int harvestLevel, int maxUses, float efficiency, float damage){
        maxUses = maxUses-13;
        efficiency = efficiency-2;
        damage = damage-3;
        for(int i = 1; i<6; ++i){
            maxUses = maxUses+8;
            efficiency = efficiency+3;
            damage=damage+3;
            materials[i] = EnumHelper.addToolMaterial("Material" + type, harvestLevel, maxUses, efficiency, damage, 0);
            picks[i] = new BasePick(type, ""+i, materials[i]);
            axes[i] = new BaseAxe(type, ""+i, materials[i]);
            shovels[i] = new BaseShovel(type, ""+i, materials[i]);
            swords[i] = new BaseSword(type, ""+i, materials[i]);
            hoes[i] = new BaseHoe(type, ""+i, materials[i]);
            GameRegistry.registerItem(picks[i], picks[i].getUnlocalizedName());
            GameRegistry.registerItem(axes[i], axes[i].getUnlocalizedName());
            GameRegistry.registerItem(shovels[i], shovels[i].getUnlocalizedName());
            GameRegistry.registerItem(swords[i], swords[i].getUnlocalizedName());
            GameRegistry.registerItem(hoes[i], hoes[i].getUnlocalizedName());
        }
    }

    private static void registerSchematic(Item schem1, Item schem2, String name, String tag, boolean usesAltRecipe){
        schem1 = new ASchematic(name, tag);
        schem2 = new BSchematic(name, tag);
        GameRegistry.registerItem(schem1, "Schematic"+name);
        GameRegistry.registerItem(schem2, "FinalSchematic" + name);
        if(usesAltRecipe){
            GameRegistry.addShapelessRecipe(new ItemStack(schem2), new ItemStack(schem1), new ItemStack(Items.feather), new ItemStack(Items.dye, 1, 0));
        } else {
            GameRegistry.addShapelessRecipe(new ItemStack(schem2), new ItemStack(schem1), new ItemStack(Items.feather), new ItemStack(Items.dye, 1, 0), new ItemStack(ModItems.DiamondChunk));
        }
    }
}