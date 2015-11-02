package com.nath99000.toughertools.init;

import com.nath99000.toughertools.Reference.Names;
import com.nath99000.toughertools.creativetab.TTTab;
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
import com.nath99000.toughertools.item.Unique.Miscellaneous.ItemGunBasic;
import com.nath99000.toughertools.item.Unique.Miscellaneous.ItemParsel;
import com.nath99000.toughertools.item.Unique.Miscellaneous.ItemSacrificeDagger;
import com.nath99000.toughertools.item.Unique.Relics.ItemBubbleRing;
import com.nath99000.toughertools.item.Unique.Relics.ItemDarkStone;
import com.nath99000.toughertools.item.Unique.Relics.ItemLightStone;
import com.nath99000.toughertools.item.Unique.Relics.ItemWaterStone;
import com.nath99000.toughertools.item.Vanilla.*;
import com.nath99000.toughertools.item.Unique.Weaponry.Magic.EnumMagic;
import com.nath99000.toughertools.item.Unique.Weaponry.Magic.ItemSpell;
import com.nath99000.toughertools.item.Unique.Weaponry.WeaponPyrotechnics.ItemLandmine;
import com.nath99000.toughertools.item.Unique.Weaponry.*;
import com.nath99000.toughertools.item.Unique.Weaponry.ASchematic;
import com.nath99000.toughertools.item.Unique.Weaponry.WeaponPyrotechnics.ItemExploder;
import com.nath99000.toughertools.item.Wrapper.ItemFoodTT;
import com.nath99000.toughertools.item.Wrapper.ItemSwordTT;
import com.nath99000.toughertools.item.Wrapper.ItemTT;
import com.nath99000.toughertools.item.Wrapper.UniqueTT;
import com.nath99000.toughertools.item.armor.ArmorSpecial;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

    //TT-Vanilla                                                         ==================================
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
    public static ItemTT BladeW1 = new ItemCrafting("Blade", "W", "1");
    public static ItemTT Snowclip = new ItemSnowClip();
    public static ItemTT WandcoreW1 = new ItemCrafting("Wandcore", "W", "1");
    public static Item Cleaver;
    public static ItemTT IronOre = new IronOre();
    public static ItemTT GoldOre = new GoldOre();
    public static ItemTT DiamondChunk = new DiamondChunk();
    public static ItemTT Crusher = new ItemCrusher();
    public static ItemTT SteelChunk = new SteelChunk();
    public static ItemTT steel = new ItemSteelIngot();
    public static Item CastIronInlay = new Cast("Iron", "Inlay");
    public static Item CastGoldInlay = new Cast("Gold", "Inlay");
    public static Item CastIronplate = new Cast("Iron", "Plate");
    public static Item CastGoldplate = new Cast("Gold", "Plate");
    public static final ItemTT ironnugget = new IronNugget();
    public static Item Bomb = new ItemLandmine().setCreativeTab(TTTab.TabTech);
    public static Item Exploder = new ItemExploder().setCreativeTab(TTTab.TabTech);
    public static Item ExploderCore = new ItemExploderCore().setCreativeTab(TTTab.TabTech);
    public static Item Chipset = new ItemChipset().setCreativeTab(TTTab.TabTech);
    public static Item Wire = new ItemCable().setCreativeTab(TTTab.TabTech);
    public static Item caveEye = new ItemFoodTT(1, 1, "CaveMiteEye").setIsDrink();
    public static Item gelatin = new ItemCrafting("Gel", "atin", "");
    public static Item engraver = new ItemEngraver();
    public static Item wolfPelt = new ItemCrafting("Wolf", "Pelt", "");
    //Materials                                                         ==================================
    public static Item.ToolMaterial cleaver = EnumHelper.addToolMaterial("cleaver", 0, 1500, 0F, 5.0F, 0);
    public static Item.ToolMaterial Dagger = EnumHelper.addToolMaterial("Dagger", 0, 150, 0F, 1.8F, 0);
    public static Item.ToolMaterial Arcanesword = EnumHelper.addToolMaterial("Arcanesword", 0, 325, 0f, 3.1F, 0);
    public static Item.ToolMaterial Plasmablade = EnumHelper.addToolMaterial("Plasmablade", 0, 525, 0f, 3F, 0);
    public static Item.ToolMaterial daedramace = EnumHelper.addToolMaterial("daedramace", 0, 750, 0f, 4.3f, 0);
    public static Item.ToolMaterial masamune = EnumHelper.addToolMaterial("masamune", 0, 825, 0f, 4f, 0);
    public static Item.ToolMaterial botaniaterrasteel = EnumHelper.addToolMaterial("botaniaterrasteel", 4, 2300, 9F, 3F, 0);
    public static ItemArmor.ArmorMaterial aerial = EnumHelper.addArmorMaterial("Aerial", 895, new int[]{0, 0, 0, 0}, 0);
    public static ItemArmor.ArmorMaterial fireGloves = EnumHelper.addArmorMaterial("fireGloves", 100, new int[]{0, 0, 0, 0}, 0);
    public static ItemArmor.ArmorMaterial earthBoots = EnumHelper.addArmorMaterial("earthBoots", 75, new int[]{0, 0, 0, 0}, 0);
    //Tools&Weapons                                                         ==================================
    public static Item Scythe = new ItemScythe(Dagger, "Scythe");
    public static Item Daedramace = new ItemDaedraMace(daedramace).setCreativeTab(TTTab.TabMagic);
    public static Item Masamune = new ItemMasamune(masamune);
    public static Item BotaniaSword = new ItemBotaniaSword(botaniaterrasteel).setCreativeTab(TTTab.TabMagic);
    public static UniqueTT Snowballlauncher = new ItemSnowBallLauncher();
    public static UniqueTT DartGun = new ItemDartGun();
    public static Item daggerAssasin = new ItemAssasinDagger(Dagger, "daggerAssasin");
    public static Item dagger = new ItemDagger(Dagger, "dagger");
    public static ItemSwordTT arcanesword = new ItemArcaneSword(Arcanesword, "ArcaneSword");
    public static Item PlasmaBlade = new ItemPlasmaBlade(Plasmablade, "PlasmaBlade").setCreativeTab(TTTab.TabTech);
    public static Item StaffLightning = new ItemLightningStaff().setCreativeTab(TTTab.TabMagic);
    //PlaceHolders                                                         ==================================
    public static Item thaumsteel = new ItemPlaceHolder("Thaumium", StatCollector.translateToLocal("toughertools.tooltip.thaumic")).setCreativeTab(TTTab.TabMagic);
    public static Item botaniasteel = new ItemPlaceHolder("Manasteel", StatCollector.translateToLocal("toughertools.tooltip.botanical")).setCreativeTab(TTTab.TabMagic);
    public static Item botaniaterra = new ItemPlaceHolder("Terrasteel", StatCollector.translateToLocal("toughertools.tooltip.botanical")).setCreativeTab(TTTab.TabMagic);
    public static Item botanianelven = new ItemPlaceHolder("Elementium", StatCollector.translateToLocal("toughertools.tooltip.botanical")).setCreativeTab(TTTab.TabMagic);
    public static Item ae2fluix = new ItemPlaceHolder("Fluix", Names.ae2);
    public static Item theEnderium = new ItemPlaceHolder("Enderium", Names.thermal);
    public static Item theElectrum = new ItemPlaceHolder("Electrum", Names.thermal);
    public static Item theInvar = new ItemPlaceHolder("Invar", Names.thermal);
    public static Item tcManyullyn = new ItemPlaceHolder("Manyullyn", Names.tconstruct);
    public static Item tcCobalt = new ItemPlaceHolder("Cobalt", Names.tconstruct);
    public static Item tcArdite = new ItemPlaceHolder("Ardite", Names.tconstruct);
    public static Item botaniagaia = new ItemPlaceHolder("Gaia ingot", StatCollector.translateToLocal("toughertools.tooltip.botanical")).setCreativeTab(TTTab.TabMagic);
    public static Item botaniawrathrune = new ItemPlaceHolder("Rune of wrath", StatCollector.translateToLocal("toughertools.tooltip.botanical")).setCreativeTab(TTTab.TabMagic);
    public static Item botaniaflowerred = new ItemPlaceHolder("Red mystical flower", StatCollector.translateToLocal("toughertools.tooltip.botanical")).setCreativeTab(TTTab.TabMagic);
    public static Item botaniastick = new ItemPlaceHolder("Livingwood twig", StatCollector.translateToLocal("toughertools.tooltip.botanical")).setCreativeTab(TTTab.TabMagic);
    public static Item botaniapetalblack = new ItemPlaceHolder("Black mana petal", StatCollector.translateToLocal("toughertools.tooltip.botanical")).setCreativeTab(TTTab.TabMagic);
    public static Item ae2certus = new ItemPlaceHolder("Certus quartz", Names.ae2);
    public static Item realPlaceHolder = new ItemPlaceHolder("Thread of reality", StatCollector.translateToLocal("toughertools.tooltip.quasar")).setCreativeTab(TTTab.TabMagic);
    //Schematics                                                         ==================================
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
    //Stone tool types                                                         ==================================
    public static Item[] picks = new Item[6];
    public static Item[] axes = new Item[6];
    public static Item[] shovels = new Item[6];
    public static Item[] swords = new Item[6];
    public static Item[] hoes = new Item[6];
    public static Item.ToolMaterial[] stone = new Item.ToolMaterial[6];
    //Wood tool types                                                         ==================================
    public static Item[] pickw = new Item[6];
    public static Item[] axew = new Item[6];
    public static Item[] shovelw = new Item[6];
    public static Item[] swordw = new Item[6];
    public static Item[] hoew = new Item[6];
    public static Item.ToolMaterial[] wood = new Item.ToolMaterial[6];
    //Spells                                                         ==================================
    public static Item spellSpectator = new ItemSpell(EnumMagic.Spectator);
    public static Item spellRain = new ItemSpell(EnumMagic.Rain);
    public static Item spellShout = new ItemSpell(EnumMagic.Shout);
    public static Item spellHeal = new ItemSpell(EnumMagic.Heal);
    public static Item spellJuggernaut = new ItemSpell(EnumMagic.Juggernaut);
    public static Item spellBase = new ItemCrafting("Spell", "null", "").setCreativeTab(TTTab.TabMagic);
    public static Item spellDiffuse = new ItemSpell(EnumMagic.Diffuse);
    public static Item spellWhirlwind = new ItemSpell(EnumMagic.Whirlwind);
    public static Item spellDisorient = new ItemSpell(EnumMagic.Disorient);//do not use
    public static Item spellFireball = new ItemSpell(EnumMagic.Fireball);
    public static Item spellWither = new ItemSpell(EnumMagic.Wither);
    public static Item spellBurst = new ItemSpell(EnumMagic.Burst);
    public static Item spellReBurst = new ItemSpell(EnumMagic.ReBurst);
    public static Item spellExplode = new ItemSpell(EnumMagic.Explode);
    public static Item spellSunlight = new ItemSpell(EnumMagic.Sunlight);
    public static Item spellMoonlight = new ItemSpell(EnumMagic.Moonlight);
    public static Item spellEnder = new ItemSpell(EnumMagic.Ender);
    //Misc magic stuff                                                         ==================================
    public static Item lightstone = new ItemLightStone();
    public static Item darkstone = new ItemDarkStone();
    public static Item waterstone = new ItemWaterStone().setCreativeTab(TTTab.TabMagic);
    public static Item orb = new ItemCrafting("Orb", "", "").setCreativeTab(TTTab.TabMagic);
    public static Item hyperCatalyst = new ItemCrafting("Hyper", "Catalyst", "").setCreativeTab(TTTab.TabMagic).setMaxStackSize(1);
    public static Item uberCatalyst = new ItemCrafting("Uber", "Catalyst", "").setCreativeTab(TTTab.TabMagic).setMaxStackSize(1);
    public static Item infiniteCatalyst = new ItemCrafting("In", "finite", "Catalyst").setCreativeTab(TTTab.TabMagic).setMaxStackSize(1);
    public static Item bubbleRing = new ItemBubbleRing();
    public static Item runeWater = new ItemCrafting("rune", "Water", "").setCreativeTab(TTTab.TabMagic);
    public static Item runeFire = new ItemCrafting("rune", "Fire", "").setCreativeTab(TTTab.TabMagic);
    public static Item runeAir = new ItemCrafting("rune", "Wind", "").setCreativeTab(TTTab.TabMagic);
    public static Item runeEarth = new ItemCrafting("rune", "Earth", "").setCreativeTab(TTTab.TabMagic);

    //Bloods                                                         ==================================
    public static Item daggerSacrifice = new ItemSacrificeDagger().setCreativeTab(TTTab.TabMagic);
    public static Item bloodbottle = new ItemCrafting("Blood", "Bottle", "").setMaxStack(16).setCreativeTab(TTTab.TabMagic);
    public static Item mobbloodbottle = new ItemCrafting("Blood", "Bottle", "Mob").setMaxStack(16).setCreativeTab(TTTab.TabMagic);
    public static Item slimebottle = new ItemCrafting("Slime", "Bottle", "").setMaxStack(16).setCreativeTab(TTTab.TabMagic);
    public static Item marrowbottle = new ItemCrafting("Bottled", "Marrow", "").setMaxStack(16).setCreativeTab(TTTab.TabMagic);
    public static Item witherblood = new ItemCrafting("Wither", "Blood", "Bottle").setMaxStack(16).setCreativeTab(TTTab.TabMagic);
    public static Item dragonblood = new ItemCrafting("Dragon", "Blood", "Bottle").setMaxStack(16).setCreativeTab(TTTab.TabMagic);
    public static Item enderblood = new ItemCrafting("Ender", "Blood", "Bottle").setMaxStack(16).setCreativeTab(TTTab.TabMagic);
    public static Item magmablood = new ItemCrafting("Magma", "Cream", "Bottle").setMaxStack(16).setCreativeTab(TTTab.TabMagic);
    public static Item ghastlyblood = new ItemCrafting("Ghastly", "Blood", "").setCreativeTab(TTTab.TabMagic);
    public static Item inkblood = new ItemCrafting("InkBottle", "", "").setCreativeTab(TTTab.TabMagic);
    //Tech-stuff
    public static Item bullet = new ItemCrafting("Bullet", "", "").setCreativeTab(null);
    public static Item handGun = new ItemGunBasic("Hand");
    public static Item parsel = new ItemParsel();
    public static Item enderBane = new WeaponInstaKill(EntityEnderman.class);
    public static Item creeperBane = new WeaponInstaKill(EntityCreeper.class);

    //Armor
    public static Item aerialCrown = new ArmorSpecial(aerial, 0, "AerialCrown", TTTab.TabMagic);
    public static Item fireGauntlets = new ArmorSpecial(fireGloves, 1, "FireGloves", TTTab.TabMagic);
    public static Item waterPants = new ArmorSpecial(aerial, 2, "WaterGreaves", TTTab.TabMagic);
    public static Item EarthBoots = new ArmorSpecial(earthBoots, 3, "EarthBoots", TTTab.TabMagic);

    public static void init() {
        //Tools
        registerToolSet(pickw, axew, shovelw, swordw, hoew, wood, "W", 0, 16, 0f, 0f);
        registerToolSet(picks, axes, shovels, swords, hoes, stone, "S", 1, 21, 0.2f, 0.2f);
        GameRegistry.registerItem(Crusher, "Crusher");
        GameRegistry.registerItem(engraver, "engraver");
        GameRegistry.registerItem(parsel, "parsel");

        //weapons
        GameRegistry.registerItem(Snowballlauncher, "Snowballlauncher");
        GameRegistry.registerItem(DartGun, "DartGun");
        GameRegistry.registerItem(Cleaver = new ItemCleaver("Cleaver", cleaver), "Cleaver");
        GameRegistry.registerItem(dagger, "Dagger");
        GameRegistry.registerItem(daggerAssasin,"DaggerAssasin");
        GameRegistry.registerItem(Scythe, "Scythe");
        GameRegistry.registerItem(Masamune, "Masamune");

        //Loot
        GameRegistry.registerItem(caveEye, "caveEye");
        GameRegistry.registerItem(wolfPelt, "wolfPelt");

        //crafting
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
        GameRegistry.registerItem(BladeW1, "BladeW1");
        GameRegistry.registerItem(Snowclip, "Snowclip");
        GameRegistry.registerItem(WandcoreW1, "WandcoreW1");

        GameRegistry.registerItem(IronOre, "IronOre");
        GameRegistry.registerItem(GoldOre, "GoldOre");
        GameRegistry.registerItem(DiamondChunk, "DiamondChunk");
        GameRegistry.registerItem(SteelChunk, "SteelChunk");
        GameRegistry.registerItem(steel, "steel");
        GameRegistry.registerItem(ironnugget, "Ironnugget");
        //placeholders

        //schematics

        //Armor

        //PlaceHolder
        GameRegistry.registerItem(realPlaceHolder, "realPlaceHolder");

        //Schematics
        registerSchematic(SchematicArcaneSword, SchematicArcaneSword2, "ArcaneSword", Names.rare, false, TTTab.TabMagic);
        registerSchematic(SchematicAssasin, SchematicAssasin2, "AssasinDagger", Names.rare, false, TTTab.TTTab);
        registerSchematic(SchematicSnowballGun, SchematicSnowballGun2, "SnowZooka", Names.epic, false, TTTab.TTTab);
        registerSchematic(SchematicPlasmaBlade, SchematicPlasmaBlade2, "PlasmaBlade", Names.rare, false, TTTab.TabTech);
        registerSchematic(SchematicCleaver, SchematicCleaver2, "Cleaver", Names.legendary, false, TTTab.TTTab);
        registerSchematic(SchematicLightning, SchematicLightning2, "LightningStaff", Names.godly, false, TTTab.TabMagic);
        registerSchematic(SchematicScythe, SchematicScythe2, "Scythe", Names.common, false, TTTab.TTTab);
        registerSchematic(SchematicDemonMace, SchematicDemonMace2, "DemonicMace", Names.godly, false, TTTab.TabMagic);
        registerSchematic(SchematicMasamune, SchematicMasamune2, "Masamune", Names.legendary, false, TTTab.TTTab);
        registerSchematic(SchematicDartgun, SchematicDartgun2, "DartGun", Names.common, false, TTTab.TTTab);
    }

    public static void initMagic(){
        //Weapons
        GameRegistry.registerItem(arcanesword, "Arcanesword");
        GameRegistry.registerItem(StaffLightning, "StaffLightning");
        GameRegistry.registerItem(Daedramace, "Daedramace");
        GameRegistry.registerItem(BotaniaSword, "BotaniaSword");

        //Tools
        GameRegistry.registerItem(orb, "Orb");
        GameRegistry.registerItem(waterstone, "WaterStone");
        GameRegistry.registerItem(lightstone, "lightstone");
        GameRegistry.registerItem(darkstone, "darkstone");
        GameRegistry.registerItem(hyperCatalyst, "hyperCatalyst");
        GameRegistry.registerItem(uberCatalyst, "uberCatalyst");
        GameRegistry.registerItem(infiniteCatalyst, "infiniteCatalyst");
        GameRegistry.registerItem(bubbleRing, "bubbleRing");

        //Crafting
        GameRegistry.registerItem(daggerSacrifice, "daggerSacrifice");
        GameRegistry.registerItem(bloodbottle, "bloodbottle");
        GameRegistry.registerItem(mobbloodbottle, "mobbloodbottle");
        GameRegistry.registerItem(slimebottle, "slimebottle");
        GameRegistry.registerItem(marrowbottle, "marrowbottle");
        GameRegistry.registerItem(witherblood, "witherblood");
        GameRegistry.registerItem(dragonblood, "dragonblood");
        GameRegistry.registerItem(enderblood, "enderblood");
        GameRegistry.registerItem(magmablood, "magmablood");
        GameRegistry.registerItem(ghastlyblood, "ghastlyblood");
        GameRegistry.registerItem(inkblood, "inkblood");
        GameRegistry.registerItem(runeWater, "runeWater");
        GameRegistry.registerItem(runeFire, "runeFire");
        GameRegistry.registerItem(runeAir, "runeAir");
        GameRegistry.registerItem(runeEarth, "runeEarth");

        //Spells
        GameRegistry.registerItem(spellBase, "spellbase");
        GameRegistry.registerItem(spellSpectator, "spellSpectator"); //CJK unified ideographs : empty room, unable to meet.
        GameRegistry.registerItem(spellRain, "spellRain"); //CJK unified ideographs : to rain, a pouring rain.
        GameRegistry.registerItem(spellShout, "spellShout"); //CJK unified ideographs : roaring with rage, sound angrily.
        GameRegistry.registerItem(spellHeal, "spellHeal"); //CJK unified ideographs : to cure, to heal.
        GameRegistry.registerItem(spellJuggernaut, "spellJuggernaut"); //CJK unified ideographs : to be chief, to rule by might rather than by right.
        GameRegistry.registerItem(spellDiffuse, "spellDiffuse"); //CJK unified ideographs : empty, hollow.
        GameRegistry.registerItem(spellWhirlwind, "spellWhirlWind"); //CJK unified ideographs : storm, whirlwind.
        //GameRegistry.registerItem(spellDisorient, "spellDisorient");  THIS WILL CRASH CLIENT ON USE! (Also, its not very useful...)
        GameRegistry.registerItem(spellFireball, "spellFireball"); //CJK unified ideographs : to burn, blaze
        GameRegistry.registerItem(spellWither, "spellWither"); //CJK unified ideographs : top of head, skull
        GameRegistry.registerItem(spellBurst, "spellBurst");
        GameRegistry.registerItem(spellReBurst, "spellReBurst");
        GameRegistry.registerItem(spellExplode, "spellExplode");
        GameRegistry.registerItem(spellSunlight, "spellSunlight");
        GameRegistry.registerItem(spellMoonlight, "spellMoonlight");
        GameRegistry.registerItem(spellEnder, "spellEnder");

        //PlaceHolders
        GameRegistry.registerItem(thaumsteel, "thaumsteel");
        GameRegistry.registerItem(botaniasteel, "botaniasteel");
        GameRegistry.registerItem(botaniaterra, "botaniaterra");
        GameRegistry.registerItem(botanianelven, "botanianelven");
        GameRegistry.registerItem(botaniagaia, "botaniagaia");
        GameRegistry.registerItem(botaniawrathrune, "botaniawrathrune");
        GameRegistry.registerItem(botaniaflowerred, "botaniaflowerred");
        GameRegistry.registerItem(botaniastick, "botaniastick");
        GameRegistry.registerItem(botaniapetalblack, "botaniapetalblack");

        //Schematics

        //Armor
        GameRegistry.registerItem(aerialCrown, "AerialCrown");
        GameRegistry.registerItem(fireGauntlets, "FireGauntlets");
        GameRegistry.registerItem(waterPants, "WaterGreaves");
        GameRegistry.registerItem(EarthBoots, "EarthBoots");
    }

    public static void initTech(){
        //Weapons
        GameRegistry.registerItem(PlasmaBlade, "PlasmaBlade");
        GameRegistry.registerItem(Bomb, "Bomb");
        GameRegistry.registerItem(Exploder, "Exploder");
        GameRegistry.registerItem(handGun, "handGun");

        //Tools

        //Crafting
        GameRegistry.registerItem(ExploderCore, "ExploderCore");
        GameRegistry.registerItem(Chipset, "Chipset");
        GameRegistry.registerItem(Wire, "Cable");
        GameRegistry.registerItem(bullet, "bullet");

        //PlaceHolders
        GameRegistry.registerItem(ae2fluix, "ae2fluix");
        GameRegistry.registerItem(theEnderium, "theEnderium");
        GameRegistry.registerItem(theElectrum, "theElectrum");
        GameRegistry.registerItem(theInvar, "theInvar");
        GameRegistry.registerItem(tcManyullyn, "tcManyullyn");
        GameRegistry.registerItem(tcCobalt, "tcCobalt");
        GameRegistry.registerItem(tcArdite, "tcArdite");
        GameRegistry.registerItem(ae2certus, "ae2certus");

        //Schematics
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
            GameRegistry.registerItem(picks[i], "Pick" + type + i);
            GameRegistry.registerItem(axes[i], "Axe" + type + i);
            GameRegistry.registerItem(shovels[i], "Shovel" + type + i);
            GameRegistry.registerItem(swords[i], "Sword" + type + i);
            GameRegistry.registerItem(hoes[i], "Hoe" + type + i);
        }
    }

    private static void registerSchematic(Item schem1, Item schem2, String name, String tag, boolean usesAltRecipe, CreativeTabs tabs){
        schem1 = new ASchematic(name, tag).setCreativeTab(tabs);
        schem2 = new BSchematic(name, tag).setCreativeTab(tabs);
        GameRegistry.registerItem(schem1, "Schematic"+name);
        GameRegistry.registerItem(schem2, "FinalSchematic" + name);
        if(usesAltRecipe){
            GameRegistry.addShapelessRecipe(new ItemStack(schem2), new ItemStack(schem1), new ItemStack(Items.feather), new ItemStack(Items.dye, 1, 0));
        } else {
            GameRegistry.addShapelessRecipe(new ItemStack(schem2), new ItemStack(schem1), new ItemStack(Items.feather), new ItemStack(Items.dye, 1, 0), new ItemStack(ModItems.DiamondChunk));
        }
    }
}