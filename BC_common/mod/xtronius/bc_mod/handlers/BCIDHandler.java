package mod.xtronius.bc_mod.handlers;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.Configuration;
import mod.xtronius.bc_mod.blocks.ids.BlockIDs;
import mod.xtronius.bc_mod.items.ids.ItemIDs;

public class BCIDHandler {

	public static void RegConfigIDs(FMLPreInitializationEvent event)
	{
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());

        int idI = 20000;
        int idB = 2750;
        int idGui = 1;
        
		//ingots
        ItemIDs.ingotTungstenCarbideID = config.getItem("ingotTungstenCarbideID", idI++).getInt();
        ItemIDs.ingotTungstenID = config.getItem("ingotTungstenID", idI++).getInt();
        ItemIDs.ingotOsmiumID = config.getItem("ingotOsmiumID", idI++).getInt();
        ItemIDs.ingotIridiumID = config.getItem("ingotIridiumID", idI++).getInt();
        ItemIDs.ingotHardenedSteelID = config.getItem("ingotHardenedSteelID", idI++).getInt();
        ItemIDs.ingotTitaniumID = config.getItem("ingotTitaniumID", idI++).getInt();
        ItemIDs.ingotRhodiumID = config.getItem("ingotRhodiumID", idI++).getInt();
        ItemIDs.ingotPalladiamID = config.getItem("ingotPalladiamID", idI++).getInt();
        ItemIDs.ingotPlatinumID = config.getItem("ingotPlatinumID", idI++).getInt();
        ItemIDs.ingotSteelID = config.getItem("ingotSteelID", idI++).getInt();
        ItemIDs.ingotNickelID = config.getItem("ingotNickelID", idI++).getInt();
        ItemIDs.ingotBronzeID = config.getItem("ingotBronzeID", idI++).getInt();
        ItemIDs.ingotBrassID = config.getItem("ingotBrassID", idI++).getInt();
        ItemIDs.ingotCopperID = config.getItem("ingotCopperID", idI++).getInt();
        ItemIDs.ingotAluminumID = config.getItem("ingotAluminumID", idI++).getInt();
        ItemIDs.ingotSilverID = config.getItem("ingotSilverID", idI++).getInt();
        ItemIDs.ingotZincID = config.getItem("ingotZincID", idI++).getInt();
        ItemIDs.ingotTinID = config.getItem("ingotTinID", idI++).getInt();
        ItemIDs.ingotLeadID = config.getItem("ingotLeadID", idI++).getInt();
        
        //special items
        ItemIDs.airShardID = config.getItem("airShardID", idI++).getInt();
        ItemIDs.waterShardID = config.getItem("waterShardID", idI++).getInt();
        ItemIDs.earthShardID = config.getItem("earthShardID", idI++).getInt();
        ItemIDs.fireShardID = config.getItem("fireShardID", idI++).getInt();
        
        //gems
        ItemIDs.gemRubyID = config.getItem("gemRubyID", idI++).getInt();
        ItemIDs.gemSapphireID = config.getItem("gemSapphireID", idI++).getInt();
        ItemIDs.gemTopazID = config.getItem("gemTopazID", idI++).getInt();
        ItemIDs.gemEmeraldID = config.getItem("gemEmeraldID", idI++).getInt();
        ItemIDs.gemAquamarineID = config.getItem("gemAquamarineID", idI++).getInt();
        ItemIDs.gemBerylID = config.getItem("gemBerylID", idI++).getInt();
        ItemIDs.gemSmokyQuartzID = config.getItem("gemSmokyQuartzID", idI++).getInt();
        ItemIDs.gemQuartzID = config.getItem("gemQuartzID", idI++).getInt();
        ItemIDs.gemAmetrineID = config.getItem("gemAmetrineID", idI++).getInt();
        ItemIDs.gemKunziteID = config.getItem("gemKunziteID", idI++).getInt();
        ItemIDs.gemAmethystID = config.getItem("gemAmethystID", idI++).getInt();
        ItemIDs.gemJasperID = config.getItem("gemJasperID", idI++).getInt();
        ItemIDs.gemAxiniteID = config.getItem("gemAxiniteID", idI++).getInt();
        ItemIDs.gemOnyxID = config.getItem("gemOnyxID", idI++).getInt();
        ItemIDs.gemSunStoneID = config.getItem("gemSunStoneID", idI++).getInt();
        ItemIDs.gemMoonStoneID = config.getItem("gemMoonStoneID", idI++).getInt();
        ItemIDs.gemOpalID = config.getItem("gemOpalID", idI++).getInt();
        ItemIDs.gemApatiteID = config.getItem("gemApatiteID", idI++).getInt();
        ItemIDs.gemAzuriteID = config.getItem("gemAzuriteID", idI++).getInt();
        ItemIDs.gemAmberID = config.getItem("gemAmberID", idI++).getInt();
        ItemIDs.gemPearlID = config.getItem("gemPearlID", idI++).getInt();
        
        ItemIDs.StaffID = config.getItem("StaffID", idI++).getInt(); 
        
        //metal ores
        BlockIDs.blockTungstenOreID = config.getBlock("blockTungstenOreID", idB++).getInt();
        BlockIDs.blockOsmiumOreID = config.getBlock("blockOsmiumOreID", idB++).getInt();
        BlockIDs.blockIridiumOreID = config.getBlock("blockIridiumOreID", idB++).getInt();
        BlockIDs.blockTitaniumOreID = config.getBlock("blockTitaniumOreID", idB++).getInt();
        BlockIDs.blockRhodiumOreID = config.getBlock("blockRhodiumOreID", idB++).getInt();
        BlockIDs.blockPalladiamOreID = config.getBlock("blockPalladiamOreID", idB++).getInt();
        BlockIDs.blockPlatinumOreID = config.getBlock("blockPlatinumOreID", idB++).getInt();
        BlockIDs.blockNickelOreID = config.getBlock("blockNickelOreID", idB++).getInt();
        BlockIDs.blockBronzeOreID = config.getBlock("blockBronzeOreID", idB++).getInt();
        BlockIDs.blockBrassOreID = config.getBlock("blockBrassOreID", idB++).getInt();
        BlockIDs.blockCopperOreID = config.getBlock("blockCopperOreID", idB++).getInt();
        BlockIDs.blockAluminumOreID = config.getBlock("blockAluminumOreID", idB++).getInt();
        BlockIDs.blockSilverOreID = config.getBlock("blockSilverOreID", idB++).getInt();
        BlockIDs.blockZincOreID = config.getBlock("blockZincOreID", idB++).getInt();
        BlockIDs.blockTinOreID = config.getBlock("blockTinOreID", idB++).getInt();
        BlockIDs.blockLeadOreID = config.getBlock("blockLeadOreID", idB++).getInt();
        
        //special ores
        BlockIDs.airOreID = config.getBlock("airOreID", idB++).getInt();
        BlockIDs.waterOreID = config.getBlock("waterOreID", idB++).getInt();
        BlockIDs.earthOreID = config.getBlock("earthOreID", idB++).getInt();
        BlockIDs.fireOreID = config.getBlock("fireOreID", idB++).getInt();
        
        //gem ores
        BlockIDs.blockRubyOreID = config.getBlock("blockRubyOreID", idB++).getInt();
        BlockIDs.blockSapphireOreID = config.getBlock("blockSapphireOreID", idB++).getInt();
        BlockIDs.blockTopazOreID = config.getBlock("blockTopazOreID", idB++).getInt();
        BlockIDs.blockEmeraldOreID = config.getBlock("blockEmeraldOreID", idB++).getInt();
        BlockIDs.blockAquamarineOreID = config.getBlock("blockAquamarineOreID", idB++).getInt();
        BlockIDs.blockBerylOreID = config.getBlock("blockBerylOreID", idB++).getInt();
        BlockIDs.blockSmokyQuartzOreID = config.getBlock("blockSmokyQuartzOreID", idB++).getInt();
        BlockIDs.blockQuartzOreID = config.getBlock("blockQuartzOreID", idB++).getInt();
        BlockIDs.blockAmetrineOreID = config.getBlock("blockAmetrineOreID", idB++).getInt();
        BlockIDs.blockKunziteOreID = config.getBlock("blockKunziteOreID", idB++).getInt();
        BlockIDs.blockAmethystOreID = config.getBlock("blockAmethystOreID", idB++).getInt();
        BlockIDs.blockJasperOreID = config.getBlock("blockJasperOreID", idB++).getInt();
        BlockIDs.blockAxiniteOreID = config.getBlock("blockAxiniteOreID", idB++).getInt();
        BlockIDs.blockOnyxOreID = config.getBlock("blockOnyxOreID", idB++).getInt();
        BlockIDs.blockSunStoneOreID = config.getBlock("blockSunStoneOreID", idB++).getInt();
        BlockIDs.blockMoonStoneOreID = config.getBlock("blockMoonStoneOreID", idB++).getInt();
        BlockIDs.blockOpalOreID = config.getBlock("blockOpalOreID", idB++).getInt();
        BlockIDs.blockApatiteOreID = config.getBlock("blockApatiteOreID", idB++).getInt();
        BlockIDs.blockAzuriteOreID = config.getBlock("blockAzuriteOreID", idB++).getInt();
        BlockIDs.blockAmberOreID = config.getBlock("blockAmberOreID", idB++).getInt();
        BlockIDs.blockPearlOreID = config.getBlock("blockPearlOreID", idB++).getInt();
        
        //metal blocks
        BlockIDs.blockTungstenCarbideID = config.getBlock("blockTungstenCarbideID", idB++).getInt();
        BlockIDs.blockTungstenID = config.getBlock("blockTungstenID", idB++).getInt();
        BlockIDs.blockOsmiumID = config.getBlock("blockOsmiumID", idB++).getInt();
        BlockIDs.blockIridiumID = config.getBlock("blockIridiumID", idB++).getInt();
        BlockIDs.blockHardenedSteelID = config.getBlock("blockHardenedSteelID", idB++).getInt();
        BlockIDs.blockTitaniumID = config.getBlock("blockTitaniumID", idB++).getInt();
        BlockIDs.blockRhodiumID = config.getBlock("blockRhodiumID", idB++).getInt();
        BlockIDs.blockPalladiamID = config.getBlock("blockPalladiamID", idB++).getInt();
        BlockIDs.blockPlatinumID = config.getBlock("blockPlatinumID", idB++).getInt();
        BlockIDs.blockSteelID = config.getBlock("blockSteelID", idB++).getInt();
        BlockIDs.blockNickelID = config.getBlock("blockNickelID", idB++).getInt();
        BlockIDs.blockBronzeID = config.getBlock("blockBronzeID", idB++).getInt();
        BlockIDs.blockBrassID = config.getBlock("blockBrassID", idB++).getInt();
        BlockIDs.blockCopperID = config.getBlock("blockCopperID", idB++).getInt();
        BlockIDs.blockAluminumID = config.getBlock("blockAluminumID", idB++).getInt();
        BlockIDs.blockSilverID = config.getBlock("blockSilverID", idB++).getInt();
        BlockIDs.blockZincID = config.getBlock("blockZincID", idB++).getInt();
        BlockIDs.blockTinID = config.getBlock("blockTinID", idB++).getInt();
        BlockIDs.blockLeadID = config.getBlock("blockLeadID", idB++).getInt();
        
        //special blocks
        BlockIDs.airBlockID = config.getBlock("airBlockID", idB++).getInt();
        BlockIDs.waterBlockID = config.getBlock("waterBlockID", idB++).getInt();
        BlockIDs.earthBlockID = config.getBlock("earthBlockID", idB++).getInt();
        BlockIDs.fireBlockID = config.getBlock("fireBlockID", idB++).getInt();
        
        //gem blocks
        BlockIDs.blockRubyID = config.getBlock("blockRubyID", idB++).getInt();
        BlockIDs.blockSapphireID = config.getBlock("blockSapphireID", idB++).getInt();
        BlockIDs.blockTopazID = config.getBlock("blockTopazID", idB++).getInt();
        BlockIDs.blockEmeraldID = config.getBlock("blockEmeraldID", idB++).getInt();
        BlockIDs.blockAquamarineID = config.getBlock("blockAquamarineID", idB++).getInt();
        BlockIDs.blockBerylID = config.getBlock("blockBerylID", idB++).getInt();
        BlockIDs.blockSmokyQuartzID = config.getBlock("blockSmokyQuartzID", idB++).getInt();
        BlockIDs.blockQuartzID = config.getBlock("blockQuartzID", idB++).getInt();
        BlockIDs.blockAmetrineID = config.getBlock("blockAmetrineID", idB++).getInt();
        BlockIDs.blockKunziteID = config.getBlock("blockKunziteID", idB++).getInt();
        BlockIDs.blockAmethystID = config.getBlock("blockAmethystID", idB++).getInt();
        BlockIDs.blockJasperID = config.getBlock("blockJasperID", idB++).getInt();
        BlockIDs.blockAxiniteID = config.getBlock("blockAxiniteID", idB++).getInt();
        BlockIDs.blockOnyxID = config.getBlock("blockOnyxID", idB++).getInt();
        BlockIDs.blockSunStoneID = config.getBlock("blockSunStoneID", idB++).getInt();
        BlockIDs.blockMoonStoneID = config.getBlock("blockMoonStoneID", idB++).getInt();
        BlockIDs.blockOpalID = config.getBlock("blockOpalID", idB++).getInt();
        BlockIDs.blockApatiteID = config.getBlock("blockApatiteID", idB++).getInt();
        BlockIDs.blockAzuriteID = config.getBlock("blockAzuriteID", idB++).getInt();
        BlockIDs.blockAmberID = config.getBlock("blockAmberID", idB++).getInt();
        BlockIDs.blockPearlID = config.getBlock("blockPearlID", idB++).getInt();
        //BaseIceID = config.getBlock("BaseIce", idB++).getInt();
        BlockIDs.TestGuiID = config.getBlock("TestGui", idB++).getInt();
        BlockIDs.TestGuiIdleID = config.getBlock("TestGuiIdle", idB++).getInt();
        BlockIDs.BCFurnace1ActiveID = config.getBlock("BCFurnace1Active", idB++).getInt();
        BlockIDs.BCFurnace1IdleID = config.getBlock("BCFurnace1Idle", idB++).getInt();
        BlockIDs.StairGlassID = config.getBlock("StairGlass", idB++).getInt();
        BlockIDs.StairStoneID = config.getBlock("StairStone", idB++).getInt();
        BlockIDs.StairWhiteStoneID = config.getBlock("StairEndStone", idB++).getInt();
        
        BlockIDs.FenceBirchID = config.getBlock("FenceBirch", idB++).getInt();
        BlockIDs.FenceSpruceID = config.getBlock("FenceSpruce", idB++).getInt();
        BlockIDs.FenceJungleID = config.getBlock("FenceJungle", idB++).getInt();
        
        BlockIDs.FenceIronID = config.getBlock("FenceIron", idB++).getInt();
        BlockIDs.BlockIronColoredID = config.getBlock("BlockIronColored", idB++).getInt();
        //BlockSingleSlabIronColoredID = config.getBlock("BlockSingleSlabIronColored", idB++).getInt();
        //BlockDoubleSlabIronColoredID = config.getBlock("BlockDoubleSlabIronColored", idB++).getInt();
        
        ItemIDs.ItemMetalPostPlacerID = config.getItem("ItemMetalPostPlacer", idI++).getInt();
        //SifterCoreActiveID = config.getBlock("SifterCoreActive", idB++).getInt();
        //SifterCoreIdleID = config.getBlock("SifterCoreIdle", idB++).getInt();
        BlockIDs.BlockShinyGlassID = config.getBlock("BlockShinyGlass", idB++).getInt();
        BlockIDs.BlockRedStoneSheetID = config.getBlock("BlockRedStoneSheet", idB++).getInt();
        BlockIDs.BlockWoodTrimmedGlassID = config.getBlock("BlockWoodTrimmedGlass", idB++).getInt();
        
        BlockIDs.BlockBCThinGlassID = config.getBlock("BlockBCThinGlass", idB++).getInt();
        BlockIDs.BlockBCIronBarsID = config.getBlock("BlockBCIronBars", idB++).getInt();
        
        BlockIDs.BlockActiveRedStoneLampID = config.getBlock("BlockActiveRedStoneLamp", idB++).getInt();
        BlockIDs.BlockIdleRedStoneLampID = config.getBlock("BlockIdleRedStoneLamp", idB++).getInt();
        
        BlockIDs.BlockPlaqueDiamondSwordID = config.getBlock("BlockPlaqueDiamondSword", idB++).getInt();
        BlockIDs.BlockQuickSandID = config.getBlock("BlockQuickSand", idB++).getInt();
        
        ItemIDs.TpSwordWoodID = config.getItem("TpSwordWood", idI++).getInt();
        ItemIDs.TpSwordStoneID = config.getItem("TpSwordStone", idI++).getInt();
        ItemIDs.TpSwordIronID = config.getItem("TpSwordIron", idI++).getInt();
        ItemIDs.TpSwordGoldID = config.getItem("TpSwordGold", idI++).getInt();
        ItemIDs.TpSwordDiamondID = config.getItem("TpSwordDiamond", idI++).getInt();
        ItemIDs.TpSwordMiscID = config.getItem("TpSwordMisc", idI++).getInt();
        
        BlockIDs.BlockXPBlockID = config.getBlock("BlockXPBlock", idB++).getInt();
        BlockIDs.BlockXPBlockActiveID = config.getBlock("BlockXPBlockActive", idB++).getInt();
        config.save();
	}
}
