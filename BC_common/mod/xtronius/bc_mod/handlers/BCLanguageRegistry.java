package mod.xtronius.bc_mod.handlers;

import net.minecraft.item.ItemStack;
import mod.xtronius.bc_mod.blocks.Gem.Gems;
import mod.xtronius.bc_mod.blocks.GuiBlock.GuiBlocks;
import mod.xtronius.bc_mod.blocks.Metal.Metals;
import mod.xtronius.bc_mod.blocks.Misc.Misc;
import mod.xtronius.bc_mod.blocks.Special.Special;
import mod.xtronius.bc_mod.items.Gem.IGems;
import mod.xtronius.bc_mod.items.Metal.IMetals;
import mod.xtronius.bc_mod.items.Misc.IMisc;
import mod.xtronius.bc_mod.items.Special.ISpecial;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


public class BCLanguageRegistry {
	
	public static void LanguageReg()
	{
		
	LanguageRegistry.addName(Metals.blockTungstenCarbide, "Block of Tungsten Carbide");
    LanguageRegistry.addName(Metals.blockTungsten, "Block of Tungsten");
    LanguageRegistry.addName(Metals.blockOsmium, "Block of Osmium");
    LanguageRegistry.addName(Metals.blockIridium, "Block of Iridium");
    LanguageRegistry.addName(Metals.blockHardenedSteel, "Block of Hardened Steel");
    LanguageRegistry.addName(Metals.blockTitanium, "Block of Titanium");
    LanguageRegistry.addName(Metals.blockRhodium, "Block of Rhodium");
    LanguageRegistry.addName(Metals.blockPalladiam, "Block of Palladiam");
    LanguageRegistry.addName(Metals.blockPlatinum, "Block of Platinum");
    LanguageRegistry.addName(Metals.blockSteel, "Block of Steel");
    LanguageRegistry.addName(Metals.blockNickel, "Block of Nickel");
    LanguageRegistry.addName(Metals.blockBronze, "Block of Bronze");
    LanguageRegistry.addName(Metals.blockBrass, "Block of Brass");
    LanguageRegistry.addName(Metals.blockCopper, "Block of Copper");
    LanguageRegistry.addName(Metals.blockAluminum, "Block of Aluminum");
    LanguageRegistry.addName(Metals.blockSilver, "Block of Silver");
    LanguageRegistry.addName(Metals.blockZinc, "Block of Zinc");
    LanguageRegistry.addName(Metals.blockTin, "Block of Tin");
    LanguageRegistry.addName(Metals.blockLead, "Block of Lead");
    
    
    LanguageRegistry.addName(Special.airBlock, "Block of Air Shards");
    LanguageRegistry.addName(Special.waterBlock, "Block of Water Shards");
    LanguageRegistry.addName(Special.earthBlock, "Block of Earth Shards");
    LanguageRegistry.addName(Special.fireBlock, "Block of Fire Shards");
    
    
    LanguageRegistry.addName(Gems.blockRuby, "Block of Ruby");
    LanguageRegistry.addName(Gems.blockSapphire, "Block of Sapphire");
    LanguageRegistry.addName(Gems.blockTopaz, "Block of Topaz");
    LanguageRegistry.addName(Gems.blockEmerald, "Block of Emerald");
    LanguageRegistry.addName(Gems.blockAquamarine, "Block of Aquamarine");
    LanguageRegistry.addName(Gems.blockBeryl, "Block of Beryl");
    LanguageRegistry.addName(Gems.blockSmokyQuartz, "Block of Smoky Quartz");
    LanguageRegistry.addName(Gems.blockQuartz, "Block of Quartz");
    LanguageRegistry.addName(Gems.blockAmetrine, "Block of Ametrine");
    LanguageRegistry.addName(Gems.blockKunzite, "Block of Kunzite");
    LanguageRegistry.addName(Gems.blockAmethyst, "Block of Amethyst");
    LanguageRegistry.addName(Gems.blockJasper, "Block of Jasper");
    LanguageRegistry.addName(Gems.blockAxinite, "Block of Axinite");
    LanguageRegistry.addName(Gems.blockOnyx, "Block of Onyx");
    LanguageRegistry.addName(Gems.blockSunStone, "Block of SunStone");
    LanguageRegistry.addName(Gems.blockMoonStone, "Block of MoonStone");
    LanguageRegistry.addName(Gems.blockOpal, "Block of Opal");
    LanguageRegistry.addName(Gems.blockApatite, "Block of Apatite");
    LanguageRegistry.addName(Gems.blockAzurite, "Block of Azurite");
    LanguageRegistry.addName(Gems.blockAmber, "Block of Amber");
    LanguageRegistry.addName(Gems.blockPearl, "Block of Pearl");
    
    
    LanguageRegistry.addName(Metals.blockTungstenOre, "Tungsten Ore");
    LanguageRegistry.addName(Metals.blockOsmiumOre, "Osmium Ore");
    LanguageRegistry.addName(Metals.blockIridiumOre, "Iridium Ore");
    LanguageRegistry.addName(Metals.blockTitaniumOre, "Titanium Ore");
    LanguageRegistry.addName(Metals.blockRhodiumOre, "Rhodium Ore");
    LanguageRegistry.addName(Metals.blockPalladiamOre, "Palladiam Ore");
    LanguageRegistry.addName(Metals.blockPlatinumOre, "Platinum Ore");
    LanguageRegistry.addName(Metals.blockNickelOre, "Nickel Ore");
    LanguageRegistry.addName(Metals.blockCopperOre, "Copper Ore");
    LanguageRegistry.addName(Metals.blockAluminumOre, "Aluminum Ore");
    LanguageRegistry.addName(Metals.blockSilverOre, "Silver Ore");
    LanguageRegistry.addName(Metals.blockZincOre, "Zinc Ore");
    LanguageRegistry.addName(Metals.blockTinOre, "Tin Ore");
    LanguageRegistry.addName(Metals.blockLeadOre, "Lead Ore");
    
    
    LanguageRegistry.addName(Special.airOre, "Air Infused Stone");
    LanguageRegistry.addName(Special.waterOre, "Water Infused Stone");
    LanguageRegistry.addName(Special.earthOre, "Earth Infused Stone");
    LanguageRegistry.addName(Special.fireOre, "Fire Infused Stone");
    
    
    LanguageRegistry.addName(Gems.blockRubyOre, "Ruby Ore");
    LanguageRegistry.addName(Gems.blockSapphireOre, "Sapphire Ore");
    LanguageRegistry.addName(Gems.blockTopazOre, "Topaz Ore");
    LanguageRegistry.addName(Gems.blockEmeraldOre, "Emerald Ore");
    LanguageRegistry.addName(Gems.blockAquamarineOre, "Aquamarine Ore");
    LanguageRegistry.addName(Gems.blockBerylOre, "Beryl Ore");
    LanguageRegistry.addName(Gems.blockSmokyQuartzOre, "Smoky Quartz Ore");
    LanguageRegistry.addName(Gems.blockQuartzOre, " Quartz Ore");
    LanguageRegistry.addName(Gems.blockAmetrineOre, "Ametrine Ore");
    LanguageRegistry.addName(Gems.blockKunziteOre, "Kunzite Ore");
    LanguageRegistry.addName(Gems.blockAmethystOre, "Amethyst Ore");
    LanguageRegistry.addName(Gems.blockJasperOre, "Jasper Ore");
    LanguageRegistry.addName(Gems.blockAxiniteOre, "Axinite Ore");
    LanguageRegistry.addName(Gems.blockOnyxOre, "Onyx Ore");
    LanguageRegistry.addName(Gems.blockSunStoneOre, "Sun Stone Ore");
    LanguageRegistry.addName(Gems.blockMoonStoneOre, "Moon Stone Ore");
    LanguageRegistry.addName(Gems.blockOpalOre, "Opal Ore");
    LanguageRegistry.addName(Gems.blockApatiteOre, "Apatite Ore");
    LanguageRegistry.addName(Gems.blockAzuriteOre, "Azurite Ore");
    LanguageRegistry.addName(Gems.blockAmberOre, "Amber Ore");
    LanguageRegistry.addName(Gems.blockPearlOre, "Pearl Ore");
    
    LanguageRegistry.instance().addStringLocalization("itemGroup.bc_mod.metals", "en_US", "BC_Mod Metals");
    LanguageRegistry.instance().addStringLocalization("itemGroup.bc_mod.gems", "en_US", "BC_Mod Gems");
    LanguageRegistry.instance().addStringLocalization("itemGroup.bc_mod.specialItemsAndBlocks", "en_US", "BC_Mod Special Items & Blocks");
    
    LanguageRegistry.instance().addStringLocalization("itemGroup.bc_mod.DecorativeBlocks", "en_US", "BC_Mod Decorative Blocks");
    LanguageRegistry.instance().addStringLocalization("itemGroup.bc_mod.MiscItems", "en_US", "BC_Mod Misc. Items");
    LanguageRegistry.instance().addStringLocalization("itemGroup.bc_mod.MiscBlocks", "en_US", "BC_Mod Misc. Blocks");
    
    LanguageRegistry.instance().addStringLocalization("container.BCfurnace", "Battle Craft Furnace 1");
    
    LanguageRegistry.addName(IMetals.ingotTungstenCarbide, "Tungsten Carbide Ingot");
    LanguageRegistry.addName(IMetals.ingotTungsten, "Tungsten Ingot");
    LanguageRegistry.addName(IMetals.ingotOsmium, "Osmium Ingot");
    LanguageRegistry.addName(IMetals.ingotIridium, "Iridium Ingot");
    LanguageRegistry.addName(IMetals.ingotHardenedSteel, "Hardened Steel Ingot");
    LanguageRegistry.addName(IMetals.ingotTitanium, "Titanium Ingot");
    LanguageRegistry.addName(IMetals.ingotRhodium, "Rhodium Ingot");
    LanguageRegistry.addName(IMetals.ingotPalladiam, "Palladiam Ingot");
    LanguageRegistry.addName(IMetals.ingotPlatinum, "Platinum Ingot");
    LanguageRegistry.addName(IMetals.ingotSteel, "Steel Ingot");
    LanguageRegistry.addName(IMetals.ingotNickel, "Nickel Ingot");
    LanguageRegistry.addName(IMetals.ingotBronze, "Bronze Ingot");
    LanguageRegistry.addName(IMetals.ingotBrass, "Brass Ingot");
    LanguageRegistry.addName(IMetals.ingotCopper, "Copper Ingot");
    LanguageRegistry.addName(IMetals.ingotAluminum, "Aluminum Ingot");
    LanguageRegistry.addName(IMetals.ingotSilver, "Silver Ingot");
    LanguageRegistry.addName(IMetals.ingotZinc, "Zinc Ingot");
    LanguageRegistry.addName(IMetals.ingotTin, "Tin Ingot");
    LanguageRegistry.addName(IMetals.ingotLead, "Lead Ingot");
    
    
    LanguageRegistry.addName(ISpecial.airShard, "Air Shard");
    LanguageRegistry.addName(ISpecial.waterShard, "Water Shard");
    LanguageRegistry.addName(ISpecial.earthShard, "Earth Shard");
    LanguageRegistry.addName(ISpecial.fireShard, "Fire Shard");
    
    
    LanguageRegistry.addName(IGems.gemRuby, "Ruby");
    LanguageRegistry.addName(IGems.gemSapphire, "Sapphire");
    LanguageRegistry.addName(IGems.gemTopaz, "Topaz");
    LanguageRegistry.addName(IGems.gemEmerald, "Emerald");
    LanguageRegistry.addName(IGems.gemAquamarine, "Aquamarine");
    LanguageRegistry.addName(IGems.gemBeryl, "Beryl");
    LanguageRegistry.addName(IGems.gemSmokyQuartz, "Smoky Quartz");
    LanguageRegistry.addName(IGems.gemQuartz, "Quartz");
    LanguageRegistry.addName(IGems.gemAmetrine, "Ametrine");
    LanguageRegistry.addName(IGems.gemKunzite, "Kunzite");
    LanguageRegistry.addName(IGems.gemAmethyst, "Amethyst");
    LanguageRegistry.addName(IGems.gemJasper, "Jasper");
    LanguageRegistry.addName(IGems.gemAxinite, "Axinite");
    LanguageRegistry.addName(IGems.gemOnyx, "Onyx");
    LanguageRegistry.addName(IGems.gemSunStone, "Sun Stone");
    LanguageRegistry.addName(IGems.gemMoonStone, "Moon Stone");
    LanguageRegistry.addName(IGems.gemOpal, "Opal");
    LanguageRegistry.addName(IGems.gemApatite, "Apatite");
    LanguageRegistry.addName(IGems.gemAzurite, "Azurite");
    LanguageRegistry.addName(IGems.gemAmber, "Amber");
    LanguageRegistry.addName(IGems.gemPearl, "Pearl");
    
    LanguageRegistry.addName(IMisc.itemStaff, "Staff");
   
    LanguageRegistry.addName(GuiBlocks.TestGui, "TestGui");
    LanguageRegistry.addName(GuiBlocks.TestGuiIdle, "Test Gui");
    
    LanguageRegistry.addName(GuiBlocks.BCFurnace1Active, "BC Furnace 1 Active");
    LanguageRegistry.addName(GuiBlocks.BCFurnace1Idle, "BC Furnace 1");
    
    LanguageRegistry.addName(IMisc.BaseRandWeapon, "BaseRandWeapon");
   
    LanguageRegistry.addName(Misc.SifterPipe, "Sifter Pipe");
    LanguageRegistry.addName(Misc.SifterStructuring, "Sifter Structuring");
    LanguageRegistry.addName(Misc.SifterVentalator, "Sifter Ventalator");
    LanguageRegistry.addName(Misc.SifterVentalator2, "Sifter Ventalator2");
    
    LanguageRegistry.addName(IMisc.ItemMetalPostPlacer, "ItemMetalPostPlacer");
    
    LanguageRegistry.addName(Misc.BlockShinyGlass, "Shiny Glass");
    LanguageRegistry.addName(Misc.BlockRedStoneSheet, "Redstone Sheet");
    LanguageRegistry.addName(Misc.BlockWoodTrimmedGlass, "Wood Trimmed Glass");
    LanguageRegistry.addName(Misc.BlockBCThinGlass, "Shiny Glass Pane");
    LanguageRegistry.addName(Misc.BlockBCIronBars, "Robust Iron Bars");
    
    LanguageRegistry.addName(IMisc.TpSwordWood, "Tp Sword Wood");
    LanguageRegistry.addName(IMisc.TpSwordStone, "Tp Sword Stone");
    LanguageRegistry.addName(IMisc.TpSwordIron, "Tp Sword Iron");
    LanguageRegistry.addName(IMisc.TpSwordGold, "Tp Sword Gold");
    LanguageRegistry.addName(IMisc.TpSwordDiamond, "Tp Sword Diamond");
    LanguageRegistry.addName(IMisc.TpSwordMisc, "Tp Sword Misc");
    
    LanguageRegistry.addName(new ItemStack(Misc.FenceIron, 1, 0), "White Metal Post");
	LanguageRegistry.addName(new ItemStack(Misc.FenceIron, 1, 1), "Orange Metal Post");
	LanguageRegistry.addName(new ItemStack(Misc.FenceIron, 1, 2), "Magenta Metal Post");
	LanguageRegistry.addName(new ItemStack(Misc.FenceIron, 1, 3), "Light Blue Metal Post");
	LanguageRegistry.addName(new ItemStack(Misc.FenceIron, 1, 4), "Yellow Metal Post");
	LanguageRegistry.addName(new ItemStack(Misc.FenceIron, 1, 5), "Lime Metal Post");
	LanguageRegistry.addName(new ItemStack(Misc.FenceIron, 1, 6), "Pink Metal Post");
	LanguageRegistry.addName(new ItemStack(Misc.FenceIron, 1, 7), "Gray Metal Post");
	LanguageRegistry.addName(new ItemStack(Misc.FenceIron, 1, 8), "Light Gray Metal Post");
	LanguageRegistry.addName(new ItemStack(Misc.FenceIron, 1, 9), "Cyan Metal Post");
	LanguageRegistry.addName(new ItemStack(Misc.FenceIron, 1, 10), "Purple Metal Post");
	LanguageRegistry.addName(new ItemStack(Misc.FenceIron, 1, 11), "Blue Metal Post");
	LanguageRegistry.addName(new ItemStack(Misc.FenceIron, 1, 12), "Brown Metal Post");
	LanguageRegistry.addName(new ItemStack(Misc.FenceIron, 1, 13), "Green Metal Post");
	LanguageRegistry.addName(new ItemStack(Misc.FenceIron, 1, 14), "Red Metal Post");
	LanguageRegistry.addName(new ItemStack(Misc.FenceIron, 1, 15), "Black Metal Post");
	
    LanguageRegistry.addName(new ItemStack(Misc.BlockIronColored, 1, 0), "White Colored Metal Block");
	LanguageRegistry.addName(new ItemStack(Misc.BlockIronColored, 1, 1), "Orange Colored Metal Block");
	LanguageRegistry.addName(new ItemStack(Misc.BlockIronColored, 1, 2), "Magenta Colored Metal Block");
	LanguageRegistry.addName(new ItemStack(Misc.BlockIronColored, 1, 3), "Light Blue Colored Metal Block");
	LanguageRegistry.addName(new ItemStack(Misc.BlockIronColored, 1, 4), "Yellow Colored Metal Block");
	LanguageRegistry.addName(new ItemStack(Misc.BlockIronColored, 1, 5), "Lime Colored Metal Block");
	LanguageRegistry.addName(new ItemStack(Misc.BlockIronColored, 1, 6), "Pink Colored Metal Block");
	LanguageRegistry.addName(new ItemStack(Misc.BlockIronColored, 1, 7), "Gray Colored Metal Block");
	LanguageRegistry.addName(new ItemStack(Misc.BlockIronColored, 1, 8), "Light Gray Colored Metal Block");
	LanguageRegistry.addName(new ItemStack(Misc.BlockIronColored, 1, 9), "Cyan Colored Metal Block");
	LanguageRegistry.addName(new ItemStack(Misc.BlockIronColored, 1, 10), "Purple Colored Metal Block");
	LanguageRegistry.addName(new ItemStack(Misc.BlockIronColored, 1, 11), "Blue Colored Metal Block");
	LanguageRegistry.addName(new ItemStack(Misc.BlockIronColored, 1, 12), "Brown Colored Metal Block");
	LanguageRegistry.addName(new ItemStack(Misc.BlockIronColored, 1, 13), "Green Colored Metal Block");
	LanguageRegistry.addName(new ItemStack(Misc.BlockIronColored, 1, 14), "Red Colored Metal Block");
	LanguageRegistry.addName(new ItemStack(Misc.BlockIronColored, 1, 15), "Black Colored Metal Block");
	
    LanguageRegistry.addName(new ItemStack(Misc.BlockIdleRedStoneLamp, 1, 0), "White Lamp");
	LanguageRegistry.addName(new ItemStack(Misc.BlockIdleRedStoneLamp, 1, 1), "Orange Lamp");
	LanguageRegistry.addName(new ItemStack(Misc.BlockIdleRedStoneLamp, 1, 2), "Magenta Lamp");
	LanguageRegistry.addName(new ItemStack(Misc.BlockIdleRedStoneLamp, 1, 3), "Light Blue Lamp");
	LanguageRegistry.addName(new ItemStack(Misc.BlockIdleRedStoneLamp, 1, 4), "Yellow Lamp");
	LanguageRegistry.addName(new ItemStack(Misc.BlockIdleRedStoneLamp, 1, 5), "Lime Lamp");
	LanguageRegistry.addName(new ItemStack(Misc.BlockIdleRedStoneLamp, 1, 6), "Pink Lamp");
	LanguageRegistry.addName(new ItemStack(Misc.BlockIdleRedStoneLamp, 1, 7), "Gray Lamp");
	LanguageRegistry.addName(new ItemStack(Misc.BlockIdleRedStoneLamp, 1, 8), "Light Gray Lamp");
	LanguageRegistry.addName(new ItemStack(Misc.BlockIdleRedStoneLamp, 1, 9), "Cyan Lamp");
	LanguageRegistry.addName(new ItemStack(Misc.BlockIdleRedStoneLamp, 1, 10), "Purple Lamp");
	LanguageRegistry.addName(new ItemStack(Misc.BlockIdleRedStoneLamp, 1, 11), "Blue Lamp");
	LanguageRegistry.addName(new ItemStack(Misc.BlockIdleRedStoneLamp, 1, 12), "Brown Lamp");
	LanguageRegistry.addName(new ItemStack(Misc.BlockIdleRedStoneLamp, 1, 13), "Green Lamp");
	LanguageRegistry.addName(new ItemStack(Misc.BlockIdleRedStoneLamp, 1, 14), "Red Lamp");
	LanguageRegistry.addName(new ItemStack(Misc.BlockIdleRedStoneLamp, 1, 15), "Black Lamp");
	
    /*LanguageRegistry.addName(new ItemStack(BlockSingleSlabIronColored, 1, 0), "White Colored Metal Slab");
	LanguageRegistry.addName(new ItemStack(BlockSingleSlabIronColored, 1, 1), "Orange Colored Metal Slab");
	LanguageRegistry.addName(new ItemStack(BlockSingleSlabIronColored, 1, 2), "Magenta Colored Metal Slab");
	LanguageRegistry.addName(new ItemStack(BlockSingleSlabIronColored, 1, 3), "Light Blue Colored Metal Slab");
	LanguageRegistry.addName(new ItemStack(BlockSingleSlabIronColored, 1, 4), "Yellow Colored Metal Slab");
	LanguageRegistry.addName(new ItemStack(BlockSingleSlabIronColored, 1, 5), "Lime Colored Metal Slab");
	LanguageRegistry.addName(new ItemStack(BlockSingleSlabIronColored, 1, 6), "Pink Colored Metal Slab");
	LanguageRegistry.addName(new ItemStack(BlockSingleSlabIronColored, 1, 7), "Gray Colored Metal Slab");
	LanguageRegistry.addName(new ItemStack(BlockSingleSlabIronColored, 1, 8), "Light Gray Colored Metal Slab");
	LanguageRegistry.addName(new ItemStack(BlockSingleSlabIronColored, 1, 9), "Cyan Colored Metal Slab");
	LanguageRegistry.addName(new ItemStack(BlockSingleSlabIronColored, 1, 10), "Purple Colored Metal Slab");
	LanguageRegistry.addName(new ItemStack(BlockSingleSlabIronColored, 1, 11), "Blue Colored Metal Slab");
	LanguageRegistry.addName(new ItemStack(BlockSingleSlabIronColored, 1, 12), "Brown Colored Metal Slab");
	LanguageRegistry.addName(new ItemStack(BlockSingleSlabIronColored, 1, 13), "Green Colored Metal Slab");
	LanguageRegistry.addName(new ItemStack(BlockSingleSlabIronColored, 1, 14), "Red Colored Metal Slab");
	LanguageRegistry.addName(new ItemStack(BlockSingleSlabIronColored), "Black Colored Metal Slab");

    LanguageRegistry.addName(new ItemStack(BlockDoubleSlabIronColored, 1, 0), "White Colored Metal Slab1");
	LanguageRegistry.addName(new ItemStack(BlockDoubleSlabIronColored, 1, 1), "Orange Colored Metal Slab1");
	LanguageRegistry.addName(new ItemStack(BlockDoubleSlabIronColored, 1, 2), "Magenta Colored Metal Slab1");
	LanguageRegistry.addName(new ItemStack(BlockDoubleSlabIronColored, 1, 3), "Light Blue Colored Metal Slab1");
	LanguageRegistry.addName(new ItemStack(BlockDoubleSlabIronColored, 1, 4), "Yellow Colored Metal Slab1");
	LanguageRegistry.addName(new ItemStack(BlockDoubleSlabIronColored, 1, 5), "Lime Colored Metal Slab1");
	LanguageRegistry.addName(new ItemStack(BlockDoubleSlabIronColored, 1, 6), "Pink Colored Metal Slab1");
	LanguageRegistry.addName(new ItemStack(BlockDoubleSlabIronColored, 1, 7), "Gray Colored Metal Slab1");
	LanguageRegistry.addName(new ItemStack(BlockDoubleSlabIronColored, 1, 8), "Light Gray Colored Metal Slab1");
	LanguageRegistry.addName(new ItemStack(BlockDoubleSlabIronColored, 1, 9), "Cyan Colored Metal Slab1");
	LanguageRegistry.addName(new ItemStack(BlockDoubleSlabIronColored, 1, 10), "Purple Colored Metal Slab1");
	LanguageRegistry.addName(new ItemStack(BlockDoubleSlabIronColored, 1, 11), "Blue Colored Metal Slab1");
	LanguageRegistry.addName(new ItemStack(BlockDoubleSlabIronColored, 1, 12), "Brown Colored Metal Slab1");
	LanguageRegistry.addName(new ItemStack(BlockDoubleSlabIronColored, 1, 13), "Green Colored Metal Slab1");
	LanguageRegistry.addName(new ItemStack(BlockDoubleSlabIronColored, 1, 14), "Red Colored Metal Slab1");
	LanguageRegistry.addName(new ItemStack(BlockDoubleSlabIronColored), "Black Colored Metal Slab1");*/
}
}
