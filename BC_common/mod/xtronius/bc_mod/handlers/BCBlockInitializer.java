package mod.xtronius.bc_mod.handlers;

import mod.xtronius.bc_mod.bc_mod;
import mod.xtronius.bc_mod.blocks.Gem.BlockBaseGemBlock;
import mod.xtronius.bc_mod.blocks.Gem.BlockBaseGemOre;
import mod.xtronius.bc_mod.blocks.Gem.Gems;
import mod.xtronius.bc_mod.blocks.GuiBlock.BCFurnace1;
import mod.xtronius.bc_mod.blocks.GuiBlock.BlockXPBlock;
import mod.xtronius.bc_mod.blocks.GuiBlock.GuiBlocks;
import mod.xtronius.bc_mod.blocks.GuiBlock.TestGui;
import mod.xtronius.bc_mod.blocks.Metal.BlockBaseMetalBlock;
import mod.xtronius.bc_mod.blocks.Metal.BlockBaseMetalOre;
import mod.xtronius.bc_mod.blocks.Metal.Metals;
import mod.xtronius.bc_mod.blocks.Misc.BCBlockStairs;
import mod.xtronius.bc_mod.blocks.Misc.BaseMetalFence;
import mod.xtronius.bc_mod.blocks.Misc.BlockBCThinGlass;
import mod.xtronius.bc_mod.blocks.Misc.BlockConnectedGlass;
import mod.xtronius.bc_mod.blocks.Misc.BlockIronColored;
import mod.xtronius.bc_mod.blocks.Misc.BlockPlaqueDiamondSword;
import mod.xtronius.bc_mod.blocks.Misc.BlockQuickSand;
import mod.xtronius.bc_mod.blocks.Misc.BlockRedStoneLamp;
import mod.xtronius.bc_mod.blocks.Misc.BlockRedStoneSheet;
import mod.xtronius.bc_mod.blocks.Misc.BlockWoodTrimmedGlass;
import mod.xtronius.bc_mod.blocks.Misc.Misc;
import mod.xtronius.bc_mod.blocks.Special.BlockBaseSpecialBlocks;
import mod.xtronius.bc_mod.blocks.Special.BlockBaseSpecialOres;
import mod.xtronius.bc_mod.blocks.Special.BlockSifterPipe;
import mod.xtronius.bc_mod.blocks.Special.BlockSifterStructuring;
import mod.xtronius.bc_mod.blocks.Special.BlockSifterVentalator;
import mod.xtronius.bc_mod.blocks.Special.BlockSifterVentalator2;
import mod.xtronius.bc_mod.blocks.Special.Special;
import mod.xtronius.bc_mod.blocks.ids.BlockIDs;
import mod.xtronius.bc_mod.creativetab.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.MinecraftForge;

public class BCBlockInitializer {

	public BCBlockInitializer()
{
		
  	  Metals.blockTungstenCarbide = new BlockBaseMetalBlock(BlockIDs.blockTungstenCarbideID, null).setUnlocalizedName("blockTungstenCarbide");
  	  Metals.blockTungsten = new BlockBaseMetalBlock(BlockIDs.blockTungstenID, null).setUnlocalizedName("blockTungsten");
  	  Metals.blockOsmium = new BlockBaseMetalBlock(BlockIDs.blockOsmiumID, null).setUnlocalizedName("blockOsmium");
  	  Metals.blockIridium = new BlockBaseMetalBlock(BlockIDs.blockIridiumID, null).setUnlocalizedName("blockIridium");
  	  Metals.blockHardenedSteel = new BlockBaseMetalBlock(BlockIDs.blockHardenedSteelID, null).setUnlocalizedName("blockHardenedSteel");
  	  Metals.blockTitanium = new BlockBaseMetalBlock(BlockIDs.blockTitaniumID, null).setUnlocalizedName("blockTitanium");
  	  Metals.blockRhodium = new BlockBaseMetalBlock(BlockIDs.blockRhodiumID, null).setUnlocalizedName("blockRhodium");
  	  Metals.blockPalladiam = new BlockBaseMetalBlock(BlockIDs.blockPalladiamID, null).setUnlocalizedName("blockPalladiam");
  	  Metals.blockPlatinum = new BlockBaseMetalBlock(BlockIDs.blockPlatinumID, null).setUnlocalizedName("blockPlatinum");
  	  Metals.blockSteel = new BlockBaseMetalBlock(BlockIDs.blockSteelID, null).setUnlocalizedName("blockSteel");
  	  Metals.blockNickel = new BlockBaseMetalBlock(BlockIDs.blockNickelID, null).setUnlocalizedName("blockNickel");
  	  Metals.blockBronze = new BlockBaseMetalBlock(BlockIDs.blockBronzeID, null).setUnlocalizedName("blockBronze");
  	  Metals.blockBrass = new BlockBaseMetalBlock(BlockIDs.blockBrassID, null).setUnlocalizedName("blockBrass");
  	  Metals.blockCopper = new BlockBaseMetalBlock(BlockIDs.blockCopperID, null).setUnlocalizedName("blockCopper");
  	  Metals.blockAluminum = new BlockBaseMetalBlock(BlockIDs.blockAluminumID, null).setUnlocalizedName("blockAluminum");
  	  Metals.blockSilver = new BlockBaseMetalBlock(BlockIDs.blockSilverID, null).setUnlocalizedName("blockSilver");
  	  Metals.blockZinc = new BlockBaseMetalBlock(BlockIDs.blockZincID, null).setUnlocalizedName("blockZinc");
  	  Metals.blockTin = new BlockBaseMetalBlock(BlockIDs.blockTinID, null).setUnlocalizedName("blockTin");
  	  Metals.blockLead = new BlockBaseMetalBlock(BlockIDs.blockLeadID, null).setUnlocalizedName("blockLead");
  	
  	  Special.airBlock = new BlockBaseSpecialBlocks(BlockIDs.airBlockID, null).setUnlocalizedName("airBlock");
  	  Special.waterBlock = new BlockBaseSpecialBlocks(BlockIDs.waterBlockID, null).setUnlocalizedName("waterBlock");
  	  Special.earthBlock = new BlockBaseSpecialBlocks(BlockIDs.earthBlockID, null).setUnlocalizedName("earthBlock");
  	  Special.fireBlock = new BlockBaseSpecialBlocks(BlockIDs.fireBlockID, null).setUnlocalizedName("fireBlock");
  	
  	  Gems.blockRuby = new BlockBaseGemBlock(BlockIDs.blockRubyID, null).setUnlocalizedName("blockRuby");
  	  Gems.blockSapphire = new BlockBaseGemBlock(BlockIDs.blockSapphireID, null).setUnlocalizedName("blockSapphire");
  	  Gems.blockTopaz = new BlockBaseGemBlock(BlockIDs.blockTopazID, null).setUnlocalizedName("blockTopaz");
  	  Gems.blockEmerald = new BlockBaseGemBlock(BlockIDs.blockEmeraldID, null).setUnlocalizedName("blockEmerald");
  	  Gems.blockAquamarine = new BlockBaseGemBlock(BlockIDs.blockAquamarineID, null).setUnlocalizedName("blockAquamarine");
  	  Gems.blockBeryl = new BlockBaseGemBlock(BlockIDs.blockBerylID, null).setUnlocalizedName("blockBeryl");
  	  Gems.blockSmokyQuartz = new BlockBaseGemBlock(BlockIDs.blockSmokyQuartzID, null).setUnlocalizedName("blockSmokyQuartz");
  	  Gems.blockQuartz = new BlockBaseGemBlock(BlockIDs.blockQuartzID, null).setUnlocalizedName("blockQuartz");
  	  Gems.blockAmetrine = new BlockBaseGemBlock(BlockIDs.blockAmetrineID, null).setUnlocalizedName("blockAmetrine");
  	  Gems.blockKunzite = new BlockBaseGemBlock(BlockIDs.blockKunziteID, null).setUnlocalizedName("blockKunzite");
  	  Gems.blockAmethyst = new BlockBaseGemBlock(BlockIDs.blockAmethystID, null).setUnlocalizedName("blockAmethyst");
  	  Gems.blockJasper = new BlockBaseGemBlock(BlockIDs.blockJasperID, null).setUnlocalizedName("blockJasper");
  	  Gems.blockAxinite = new BlockBaseGemBlock(BlockIDs.blockAxiniteID, null).setUnlocalizedName("blockAxinite");
  	  Gems.blockOnyx = new BlockBaseGemBlock(BlockIDs.blockOnyxID, null).setUnlocalizedName("blockOnyx");
  	  Gems.blockSunStone = new BlockBaseGemBlock(BlockIDs.blockSunStoneID, null).setUnlocalizedName("blockSunStone");
  	  Gems.blockMoonStone = new BlockBaseGemBlock(BlockIDs.blockMoonStoneID, null).setUnlocalizedName("blockMoonStone");
  	  Gems.blockOpal = new BlockBaseGemBlock(BlockIDs.blockOpalID, null).setUnlocalizedName("blockOpal");
  	  Gems.blockApatite = new BlockBaseGemBlock(BlockIDs.blockApatiteID, null).setUnlocalizedName("blockApatite");
  	  Gems.blockAzurite = new BlockBaseGemBlock(BlockIDs.blockAzuriteID, null).setUnlocalizedName("blockAzurite");
  	  Gems.blockAmber = new BlockBaseGemBlock(BlockIDs.blockAmberID, null).setUnlocalizedName("blockAmber");
  	  Gems.blockPearl = new BlockBaseGemBlock(BlockIDs.blockPearlID, null).setUnlocalizedName("blockPearl");
  	
  	  Metals.blockTungstenOre = new BlockBaseMetalOre(BlockIDs.blockTungstenOreID, null).setUnlocalizedName("blockTungstenOre");
  	  MinecraftForge.setBlockHarvestLevel(Metals.blockTungstenOre, "pickaxe", 3);
  	  Metals.blockOsmiumOre = new BlockBaseMetalOre(BlockIDs.blockOsmiumOreID, null).setUnlocalizedName("blockOsmiumOre");
  	  MinecraftForge.setBlockHarvestLevel(Metals.blockOsmiumOre, "pickaxe", 3);
  	  Metals.blockIridiumOre = new BlockBaseMetalOre(BlockIDs.blockIridiumOreID, null).setUnlocalizedName("blockIridiumOre");
  	  MinecraftForge.setBlockHarvestLevel(Metals.blockIridiumOre, "pickaxe", 3);
  	  Metals.blockTitaniumOre = new BlockBaseMetalOre(BlockIDs.blockTitaniumOreID, null).setUnlocalizedName("blockTitaniumOre");
  	  MinecraftForge.setBlockHarvestLevel(Metals.blockTitaniumOre, "pickaxe", 3);
  	  Metals.blockRhodiumOre = new BlockBaseMetalOre(BlockIDs.blockRhodiumOreID, null).setUnlocalizedName("blockRhodiumOre");
  	  MinecraftForge.setBlockHarvestLevel(Metals.blockRhodiumOre, "pickaxe", 3);
  	  Metals.blockPalladiamOre = new BlockBaseMetalOre(BlockIDs.blockPalladiamOreID, null).setUnlocalizedName("blockPalladiamOre");
  	  MinecraftForge.setBlockHarvestLevel(Metals.blockPalladiamOre, "pickaxe", 2);
  	  Metals.blockPlatinumOre = new BlockBaseMetalOre(BlockIDs.blockPlatinumOreID, null).setUnlocalizedName("blockPlatinumOre");
  	  MinecraftForge.setBlockHarvestLevel(Metals.blockPlatinumOre, "pickaxe", 2);
  	  Metals.blockNickelOre = new BlockBaseMetalOre(BlockIDs.blockNickelOreID, null).setUnlocalizedName("blockNickelOre");
  	  MinecraftForge.setBlockHarvestLevel(Metals.blockNickelOre, "pickaxe", 2);
  	  Metals.blockCopperOre = new BlockBaseMetalOre(BlockIDs.blockCopperOreID, null).setUnlocalizedName("blockCopperOre");
  	  MinecraftForge.setBlockHarvestLevel(Metals.blockCopperOre, "pickaxe", 1);
  	  Metals.blockAluminumOre = new BlockBaseMetalOre(BlockIDs.blockAluminumOreID, null).setUnlocalizedName("blockAluminumOre");
  	  MinecraftForge.setBlockHarvestLevel(Metals.blockAluminumOre, "pickaxe", 1);
  	  Metals.blockSilverOre = new BlockBaseMetalOre(BlockIDs.blockSilverOreID, null).setUnlocalizedName("blockSilverOre");
  	  MinecraftForge.setBlockHarvestLevel(Metals.blockSilverOre, "pickaxe", 1);
  	  Metals.blockZincOre = new BlockBaseMetalOre(BlockIDs.blockZincOreID, null).setUnlocalizedName("blockZincOre");
  	  MinecraftForge.setBlockHarvestLevel(Metals.blockZincOre, "pickaxe", 1);
  	  Metals.blockTinOre = new BlockBaseMetalOre(BlockIDs.blockTinOreID, null).setUnlocalizedName("blockTinOre");
  	  MinecraftForge.setBlockHarvestLevel(Metals.blockTinOre, "pickaxe", 1);
  	  Metals.blockLeadOre = new BlockBaseMetalOre(BlockIDs.blockLeadOreID, null).setUnlocalizedName("blockLeadOre");
  	  MinecraftForge.setBlockHarvestLevel(Metals.blockLeadOre, "pickaxe", 1);
  	
  	  Special.airOre = new BlockBaseSpecialOres(BlockIDs.airOreID, null).setUnlocalizedName("airOre");
  	  MinecraftForge.setBlockHarvestLevel(Special.airOre, "pickaxe", 2);
  	  Special.waterOre = new BlockBaseSpecialOres(BlockIDs.waterOreID, null).setUnlocalizedName("waterOre");
  	  MinecraftForge.setBlockHarvestLevel(Special.waterOre, "pickaxe", 2);
  	  Special.earthOre = new BlockBaseSpecialOres(BlockIDs.earthOreID, null).setUnlocalizedName("earthOre");
  	  MinecraftForge.setBlockHarvestLevel(Special.earthOre, "pickaxe", 2);
  	  Special.fireOre = new BlockBaseSpecialOres(BlockIDs.fireOreID, null).setUnlocalizedName("fireOre");
  	  MinecraftForge.setBlockHarvestLevel(Special.fireOre, "pickaxe", 2);
  
  	  Gems.blockRubyOre = new BlockBaseGemOre(BlockIDs.blockRubyOreID, null, "Ruby").setUnlocalizedName("blockRubyOre");
  	  MinecraftForge.setBlockHarvestLevel(Gems.blockRubyOre, "pickaxe", 2);
  	  Gems.blockSapphireOre = new BlockBaseGemOre(BlockIDs.blockSapphireOreID, null, "Sapphire").setUnlocalizedName("blockSapphireOre");
  	  MinecraftForge.setBlockHarvestLevel(Gems.blockSapphireOre, "pickaxe", 2);
  	  Gems.blockTopazOre = new BlockBaseGemOre(BlockIDs.blockTopazOreID, null, "Topaz").setUnlocalizedName("blockTopazOre");
  	  MinecraftForge.setBlockHarvestLevel(Gems.blockTopazOre, "pickaxe", 2);
  	  Gems.blockEmeraldOre = new BlockBaseGemOre(BlockIDs.blockEmeraldOreID, null, "Emerald").setUnlocalizedName("blockEmeraldOre");
  	  MinecraftForge.setBlockHarvestLevel(Gems.blockEmeraldOre, "pickaxe", 2);
  	  Gems.blockAquamarineOre = new BlockBaseGemOre(BlockIDs.blockAquamarineOreID, null, "Aquamarine").setUnlocalizedName("blockAquamarineOre");
  	  MinecraftForge.setBlockHarvestLevel(Gems.blockAquamarineOre, "pickaxe", 2);
  	  Gems.blockBerylOre = new BlockBaseGemOre(BlockIDs.blockBerylOreID, null, "Beryl").setUnlocalizedName("blockBerylOre");
  	  MinecraftForge.setBlockHarvestLevel(Gems.blockBerylOre, "pickaxe", 2);
  	  Gems.blockSmokyQuartzOre = new BlockBaseGemOre(BlockIDs.blockSmokyQuartzOreID, null, "SmokyQuartz").setUnlocalizedName("blockSmokyQuartzOre");
  	  MinecraftForge.setBlockHarvestLevel(Gems.blockSmokyQuartzOre, "pickaxe", 2);
  	  Gems.blockQuartzOre = new BlockBaseGemOre(BlockIDs.blockQuartzOreID, null, "Quartz").setUnlocalizedName("blockQuartzOre");
  	  MinecraftForge.setBlockHarvestLevel(Gems.blockQuartzOre, "pickaxe", 2);
  	  Gems.blockAmetrineOre = new BlockBaseGemOre(BlockIDs.blockAmetrineOreID, null, "Ametrine").setUnlocalizedName("blockAmetrineOre");
  	  MinecraftForge.setBlockHarvestLevel(Gems.blockAmetrineOre, "pickaxe", 2);
  	  Gems.blockKunziteOre = new BlockBaseGemOre(BlockIDs.blockKunziteOreID, null, "Kunzite").setUnlocalizedName("blockKunziteOre");
  	  MinecraftForge.setBlockHarvestLevel(Gems.blockKunziteOre, "pickaxe", 2);
  	  Gems.blockAmethystOre = new BlockBaseGemOre(BlockIDs.blockAmethystOreID, null, "Amethyst").setUnlocalizedName("blockAmethystOre");
  	  MinecraftForge.setBlockHarvestLevel(Gems.blockAmethystOre, "pickaxe", 2);
  	  Gems.blockJasperOre = new BlockBaseGemOre(BlockIDs.blockJasperOreID, null, "Jasper").setUnlocalizedName("blockJasperOre");
  	  MinecraftForge.setBlockHarvestLevel(Gems.blockJasperOre, "pickaxe", 2);
  	  Gems.blockAxiniteOre = new BlockBaseGemOre(BlockIDs.blockAxiniteOreID, null, "Axinite").setUnlocalizedName("blockAxiniteOre");
  	  MinecraftForge.setBlockHarvestLevel(Gems.blockAxiniteOre, "pickaxe", 2);
  	  Gems.blockOnyxOre = new BlockBaseGemOre(BlockIDs.blockOnyxOreID, null, "Onyx").setUnlocalizedName("blockOnyxOre");
  	  MinecraftForge.setBlockHarvestLevel(Gems.blockOnyxOre, "pickaxe", 2);
  	  Gems.blockSunStoneOre = new BlockBaseGemOre(BlockIDs.blockSunStoneOreID, null, "SunStone").setUnlocalizedName("blockSunStoneOre");
  	  MinecraftForge.setBlockHarvestLevel(Gems.blockSunStoneOre, "pickaxe", 3);
  	  Gems.blockMoonStoneOre = new BlockBaseGemOre(BlockIDs.blockMoonStoneOreID, null, "MoonStone").setUnlocalizedName("blockMoonStoneOre");
  	  MinecraftForge.setBlockHarvestLevel(Gems.blockMoonStoneOre, "pickaxe", 3);
  	  Gems.blockOpalOre = new BlockBaseGemOre(BlockIDs.blockOpalOreID, null, "Opal").setUnlocalizedName("blockOpalOre");
  	  MinecraftForge.setBlockHarvestLevel(Gems.blockOpalOre, "pickaxe", 2);
  	  Gems.blockApatiteOre = new BlockBaseGemOre(BlockIDs.blockApatiteOreID, null, "Apatite").setUnlocalizedName("blockApatiteOre");
  	  MinecraftForge.setBlockHarvestLevel(Gems.blockApatiteOre, "pickaxe", 2);
  	  Gems.blockAzuriteOre = new BlockBaseGemOre(BlockIDs.blockAzuriteOreID, null, "Azurite").setUnlocalizedName("blockAzuriteOre");
  	  MinecraftForge.setBlockHarvestLevel(Gems.blockAzuriteOre, "pickaxe", 2);
  	  Gems.blockAmberOre = new BlockBaseGemOre(BlockIDs.blockAmberOreID, null, "Amber").setUnlocalizedName("blockAmberOre");
  	  MinecraftForge.setBlockHarvestLevel(Gems.blockAmberOre, "pickaxe", 2);
  	  Gems.blockPearlOre = new BlockBaseGemOre(BlockIDs.blockPearlOreID, null, "Pearl").setUnlocalizedName("blockPearlOre");
  	  MinecraftForge.setBlockHarvestLevel(Gems.blockPearlOre, "pickaxe", 2);
  	  
  	  GuiBlocks.TestGuiIdle = new TestGui(BlockIDs.TestGuiIdleID, false).setUnlocalizedName("TestGuiIdle").setCreativeTab(CreativeTab.tabsBC_ModSpecialItemsAndBlocks);
  	  GuiBlocks.TestGui = new TestGui(BlockIDs.TestGuiID, true).setUnlocalizedName("TestGui");
  	  
  	  GuiBlocks.BCFurnace1Active = new BCFurnace1(BlockIDs.BCFurnace1ActiveID, true).setUnlocalizedName("BCFurnace1Active");
  	  GuiBlocks.BCFurnace1Idle = new BCFurnace1(BlockIDs.BCFurnace1IdleID, false).setUnlocalizedName("BCFurnace1Idle").setCreativeTab(CreativeTab.tabsBC_ModSpecialItemsAndBlocks);
  	  
  	  Misc.BlockPlaqueDiamondSword = new BlockPlaqueDiamondSword(BlockIDs.BlockPlaqueDiamondSwordID).setUnlocalizedName("BlockPlaqueDiamondSword").setCreativeTab(CreativeTab.tabsBC_ModSpecialItemsAndBlocks);
  	  
  	  // SifterCoreActive = new BCFurnace1(SifterCoreActiveID, true).setUnlocalizedName("SifterCoreActive");
  	  //  SifterCoreIdle = new BCFurnace1( SifterCoreIdleID, false).setUnlocalizedName("SifterCoreIdle").setCreativeTab(bc_mod.tabsBC_ModSpecialItemsAndBlocks);
  
  	  // BaseIce = new BaseIce(BaseIceID, null, false).setUnlocalizedName("BaseIce");
  	  Misc.BlockQuickSand = new BlockQuickSand(BlockIDs.BlockQuickSandID, Material.sand).setUnlocalizedName("BlockQuickSand").setCreativeTab(CreativeTab.tabsBC_ModDecorativeBlocks);
  	  
  	  Misc.SifterStructuring = new BlockSifterStructuring(BlockIDs.SifterStructuringID).setUnlocalizedName("SifterStructuring").setCreativeTab(CreativeTab.tabsBC_ModMiscBlocks);
  	  Misc.SifterPipe = new BlockSifterPipe(BlockIDs.SifterPipeID).setUnlocalizedName("SifterPipe").setCreativeTab(CreativeTab.tabsBC_ModMiscBlocks);
  	  Misc.SifterVentalator = new BlockSifterVentalator(BlockIDs.SifterVentalatorID).setUnlocalizedName("SifterVentalator").setCreativeTab(CreativeTab.tabsBC_ModMiscBlocks);
  	  Misc.SifterVentalator2 = new BlockSifterVentalator2(BlockIDs.SifterVentalator2ID).setUnlocalizedName("SifterVentalator2");
  	  Misc.SifterTurbine = new BlockBaseMetalBlock(BlockIDs.SifterTurbineID, null).setUnlocalizedName("SifterTurbine").setCreativeTab(CreativeTab.tabsBC_ModMiscBlocks);
  	  Misc.SifterTurbineFans = new BlockBaseMetalBlock(BlockIDs.SifterTurbineFansID, null).setUnlocalizedName("SifterTurbineFans").setCreativeTab(CreativeTab.tabsBC_ModMiscBlocks);
  	  Misc.SifterRubberSealer = new BlockBaseMetalBlock(BlockIDs.SifterRubberSealerID, null).setUnlocalizedName("SifterRubberSealer").setCreativeTab(CreativeTab.tabsBC_ModMiscBlocks);
  	  Misc.SifterItemCollector = new BlockBaseMetalBlock(BlockIDs.SifterItemCollectorID, null).setUnlocalizedName("SifterItemCollector").setCreativeTab(CreativeTab.tabsBC_ModMiscBlocks);
  	  Misc.SifterPreasureWalling = new BlockBaseMetalBlock(BlockIDs.SifterPreasureWallingID, null).setUnlocalizedName("SifterPreasureWalling").setCreativeTab(CreativeTab.tabsBC_ModMiscBlocks);
  	  
  	  Misc.BlockWoodTrimmedGlass =  new BlockWoodTrimmedGlass(BlockIDs.BlockWoodTrimmedGlassID).setUnlocalizedName("BlockWoodTrimmedGlass");
  	  Misc.StairGlass = new BCBlockStairs(BlockIDs.StairGlassID, Block.glass, 0).setUnlocalizedName("StairGlass");
  	  Misc.StairStone = new BCBlockStairs(BlockIDs.StairStoneID, Block.stone, 0).setUnlocalizedName("StairStone");
  	  Misc.StairWhiteStone = new BCBlockStairs(BlockIDs.StairWhiteStoneID, Block.whiteStone, 0).setUnlocalizedName("StairWhiteStone");
  	  Misc.FenceBirch = new BlockFence(BlockIDs.FenceBirchID, "planks_birch", Material.wood).setUnlocalizedName("FenceBirch").setCreativeTab(CreativeTab.tabsBC_ModSpecialItemsAndBlocks);
  	  Misc.FenceSpruce = new BlockFence(BlockIDs.FenceSpruceID, "planks_spruce", Material.wood).setUnlocalizedName("FenceSpruce").setCreativeTab(CreativeTab.tabsBC_ModSpecialItemsAndBlocks);
  	  Misc.FenceJungle = new BlockFence(BlockIDs.FenceJungleID, "planks_jungle", Material.wood).setUnlocalizedName("FenceJungle").setCreativeTab(CreativeTab.tabsBC_ModSpecialItemsAndBlocks);
  	  Misc.FenceIron = new BaseMetalFence(BlockIDs.FenceIronID, Material.iron).setUnlocalizedName("FenceIron");
  	  Misc.BlockIronColored = new BlockIronColored(BlockIDs.BlockIronColoredID, Material.iron).setUnlocalizedName("BlockIronColored");
  	  // BlockSingleSlabIronColored =  (BlockHalfSlab)(new BlockSlabIronColored(BlockSingleSlabIronColoredID, true, Material.iron).setUnlocalizedName("BlockSlabIronColored"));
  	  //BlockDoubleSlabIronColored =  (BlockHalfSlab)(new BlockSlabIronColored(BlockDoubleSlabIronColoredID, false, Material.iron).setUnlocalizedName("BlockSlabIronColored"));

  	  Misc.BlockShinyGlass =  new BlockConnectedGlass(BlockIDs.BlockShinyGlassID).setUnlocalizedName("BlockShinyGlass");
	  Misc.BlockActiveRedStoneLamp =  new BlockRedStoneLamp(BlockIDs.BlockActiveRedStoneLampID, true).setUnlocalizedName("BlockActiveRedStoneLamp").setTextureName("Active/LampActive");
	  Misc.BlockIdleRedStoneLamp =  new BlockRedStoneLamp(BlockIDs.BlockIdleRedStoneLampID, false).setUnlocalizedName("BlockIdleRedStoneLamp").setCreativeTab(CreativeTab.tabsBC_ModDecorativeBlocks).setTextureName("Idle/LampIdle");
	  Misc.BlockRedStoneSheet =  new BlockRedStoneSheet(BlockIDs.BlockRedStoneSheetID).setUnlocalizedName("BlockRedStoneSheet");
	  Misc.BlockBCThinGlass =  new BlockBCThinGlass(BlockIDs.BlockBCThinGlassID, "bc_mod:BlockWoodTrimmedGlass", "bc_mod:BlockWoodTrimmedGlass_pane_top", Material.glass, true).setUnlocalizedName("BlockBCThinGlass");
	  Misc.BlockBCIronBars =  new BlockBCThinGlass(BlockIDs.BlockBCIronBarsID, "bc_mod:BlockRobustIronBars", "bc_mod:BlockRobustIronBars", Material.iron, true).setUnlocalizedName("BlockBCIronBars");
	  // public static final BlockHalfSlab woodDoubleSlab = (BlockHalfSlab)(new BlockWoodSlab(125, true)).setHardness(2.0F).setResistance(5.0F).setStepSound(soundWoodFootstep).setUnlocalizedName("woodSlab");
	  // public static final BlockHalfSlab woodSingleSlab = (BlockHalfSlab)(new BlockWoodSlab(126, false)).setHardness(2.0F).setResistance(5.0F).setStepSound(soundWoodFootstep).setUnlocalizedName("woodSlab");
	  
	  GuiBlocks.BlockXPBlock =  new BlockXPBlock(BlockIDs.BlockXPBlockID, false).setUnlocalizedName("BlockXPBlock");
	  GuiBlocks.BlockXPBlockActive =  new BlockXPBlock(BlockIDs.BlockXPBlockActiveID, true).setUnlocalizedName("BlockXPBlockActive");
}

}