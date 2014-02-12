package mod.xtronius.bc_mod.handlers;

import net.minecraft.item.ItemBlock;
import mod.xtronius.bc_mod.blocks.Gem.Gems;
import mod.xtronius.bc_mod.blocks.GuiBlock.GuiBlocks;
import mod.xtronius.bc_mod.blocks.Metal.Metals;
import mod.xtronius.bc_mod.blocks.Misc.Misc;
import mod.xtronius.bc_mod.blocks.Special.Special;
import mod.xtronius.bc_mod.tileEntity.TileEntityBCFurnace1;
import mod.xtronius.bc_mod.tileEntity.TileEntityBlockPlaqueDiamondSword;
import mod.xtronius.bc_mod.tileEntity.TileEntitySifterCore;
import mod.xtronius.bc_mod.tileEntity.TileEntitySifterPipe;
import mod.xtronius.bc_mod.tileEntity.TileEntitySifterVentalator;
import mod.xtronius.bc_mod.tileEntity.TileEntitySifterVentalator2;
import mod.xtronius.bc_mod.tileEntity.TileEntityTestGui;
import mod.xtronius.bc_mod.tileEntity.TileEntityXPBlock;
import cpw.mods.fml.common.registry.GameRegistry;

public class BCBlockRegistry {

	public static void BlockReg()
	
	{
		
		GameRegistry.registerBlock(Metals.blockTungstenCarbide, "blockTungstenCarbide");
        GameRegistry.registerBlock(Metals.blockTungsten, "blockTungsten");
        GameRegistry.registerBlock(Metals.blockOsmium, "blockOsmium");
        GameRegistry.registerBlock(Metals.blockIridium, "blockIridium");
        GameRegistry.registerBlock(Metals.blockHardenedSteel, "blockHardenedSteel");
        GameRegistry.registerBlock(Metals.blockTitanium, "blockTitanium");
        GameRegistry.registerBlock(Metals.blockRhodium, "blockRhodium");
        GameRegistry.registerBlock(Metals.blockPalladiam, "blockPalladiam");
        GameRegistry.registerBlock(Metals.blockPlatinum, "blockPlatinum");
        GameRegistry.registerBlock(Metals.blockSteel, "blockSteel");
        GameRegistry.registerBlock(Metals.blockNickel, "blockNickel");
        GameRegistry.registerBlock(Metals.blockBronze, "blockBronze");
        GameRegistry.registerBlock(Metals.blockBrass, "blockBrass");
        GameRegistry.registerBlock(Metals.blockCopper, "blockCopper");
        GameRegistry.registerBlock(Metals.blockAluminum, "blockAluminum");
        GameRegistry.registerBlock(Metals.blockSilver, "blockSilver");
        GameRegistry.registerBlock(Metals.blockZinc, "blockZinc");
        GameRegistry.registerBlock(Metals.blockTin, "blockTin");
        GameRegistry.registerBlock(Metals.blockLead, "blockLead");
        
        
        GameRegistry.registerBlock(Special.airBlock, "airBlock");
        GameRegistry.registerBlock(Special.waterBlock, "waterBlock");
        GameRegistry.registerBlock(Special.earthBlock, "earthBlock");
        GameRegistry.registerBlock(Special.fireBlock, "fireBlock");
        
        GameRegistry.registerBlock(Special.airOre, "airOre");
        GameRegistry.registerBlock(Special.waterOre, "waterOre");
        GameRegistry.registerBlock(Special.earthOre, "earthOre");
        GameRegistry.registerBlock(Special.fireOre, "fireOre");
        
        
        GameRegistry.registerBlock(Gems.blockRuby, "blockRuby");
        GameRegistry.registerBlock(Gems.blockSapphire, "blockSapphire");
        GameRegistry.registerBlock(Gems.blockTopaz, "blockTopaz");
        GameRegistry.registerBlock(Gems.blockEmerald, "blockEmerald");
        GameRegistry.registerBlock(Gems.blockAquamarine, "blockAquamarine");
        GameRegistry.registerBlock(Gems.blockBeryl, "blockBeryl");
        GameRegistry.registerBlock(Gems.blockSmokyQuartz, "blockSmokyQuartz");
        GameRegistry.registerBlock(Gems.blockQuartz, "blockQuartz");
        GameRegistry.registerBlock(Gems.blockAmetrine, "blockAmetrine");
        GameRegistry.registerBlock(Gems.blockKunzite, "blockKunzite");
        GameRegistry.registerBlock(Gems.blockAmethyst, "blockAmethyst");
        GameRegistry.registerBlock(Gems.blockJasper, "blockJasper");
        GameRegistry.registerBlock(Gems.blockAxinite, "blockAxinite");
        GameRegistry.registerBlock(Gems.blockOnyx, "blockOnyx");
        GameRegistry.registerBlock(Gems.blockSunStone, "blockSunStone");
        GameRegistry.registerBlock(Gems.blockMoonStone, "blockMoonStone");
        GameRegistry.registerBlock(Gems.blockOpal, "blockOpal");
        GameRegistry.registerBlock(Gems.blockApatite, "blockApatite");
        GameRegistry.registerBlock(Gems.blockAzurite, "blockAzurite");
        GameRegistry.registerBlock(Gems.blockAmber, "blockAmber");
        GameRegistry.registerBlock(Gems.blockPearl, "blockPearl");
        
        
        GameRegistry.registerBlock(Metals.blockTungstenOre, "blockTungstenOre");
        GameRegistry.registerBlock(Metals.blockOsmiumOre, "blockOsmiumOre");
        GameRegistry.registerBlock(Metals.blockIridiumOre, "blockIridiumOre");
        GameRegistry.registerBlock(Metals.blockTitaniumOre, "blockTitaniumOre");
        GameRegistry.registerBlock(Metals.blockRhodiumOre, "blockRhodiumOre");
        GameRegistry.registerBlock(Metals.blockPalladiamOre, "blockPalladiamOre");
        GameRegistry.registerBlock(Metals.blockPlatinumOre, "blockPlatinumOre");
        GameRegistry.registerBlock(Metals.blockNickelOre, "blockNickelOre");
        GameRegistry.registerBlock(Metals.blockCopperOre, "blockCopperOre");
        GameRegistry.registerBlock(Metals.blockAluminumOre, "blockAluminumOre");
        GameRegistry.registerBlock(Metals.blockSilverOre, "blockSilverOre");
        GameRegistry.registerBlock(Metals.blockZincOre, "blockZincOre");
        GameRegistry.registerBlock(Metals.blockTinOre, "blockTinOre");
        GameRegistry.registerBlock(Metals.blockLeadOre, "blockLeadOre");
        
        
        GameRegistry.registerBlock(Gems.blockRubyOre, "blockRubyOre");
        GameRegistry.registerBlock(Gems.blockSapphireOre, "blockSapphireOre");
        GameRegistry.registerBlock(Gems.blockTopazOre, "blockTopazOre");
        GameRegistry.registerBlock(Gems.blockEmeraldOre, "blockEmeraldOre");
        GameRegistry.registerBlock(Gems.blockAquamarineOre, "blockAquamarineOre");
        GameRegistry.registerBlock(Gems.blockBerylOre, "blockBerylOre");
        GameRegistry.registerBlock(Gems.blockSmokyQuartzOre, "blockSmokyQuartzOre");
        GameRegistry.registerBlock(Gems.blockQuartzOre, "blockQuartzOre");
        GameRegistry.registerBlock(Gems.blockAmetrineOre, "blockAmetrineOre");
        GameRegistry.registerBlock(Gems.blockKunziteOre, "blockKunziteOre");
        GameRegistry.registerBlock(Gems.blockAmethystOre, "blockAmethystOre");
        GameRegistry.registerBlock(Gems.blockJasperOre, "blockJasperOre");
        GameRegistry.registerBlock(Gems.blockAxiniteOre, "blockAxiniteOre");
        GameRegistry.registerBlock(Gems.blockOnyxOre, "blockOnyxOre");
        GameRegistry.registerBlock(Gems.blockSunStoneOre, "blockSunStoneOre");
        GameRegistry.registerBlock(Gems.blockMoonStoneOre, "blockMoonStoneOre");
        GameRegistry.registerBlock(Gems.blockOpalOre, "blockOpalOre");
        GameRegistry.registerBlock(Gems.blockApatiteOre, "blockApatiteOre");
        GameRegistry.registerBlock(Gems.blockAzuriteOre, "blockAzuriteOre");
        GameRegistry.registerBlock(Gems.blockAmberOre, "blockAmberOre");
        GameRegistry.registerBlock(Gems.blockPearlOre, "blockPearlOre");
        
        GameRegistry.registerBlock(Misc.BlockQuickSand, "BlockQuickSand");
        GameRegistry.registerBlock(Misc.FenceIron, BCItemBlock.class, "FenceIron");
        GameRegistry.registerBlock(Misc.BlockIronColored, BCItemBlock.class, "BlockIronColored");
        GameRegistry.registerBlock(Misc.BlockIdleRedStoneLamp, BCItemBlock.class, "BlockIdleRedStoneLamp");
    	GameRegistry.registerBlock(Misc.BlockActiveRedStoneLamp, BCItemBlock.class, "BlockActiveRedStoneLamp");
    	//GameRegistry.registerBlock(BlockSingleSlabIronColored, ItemTutorialBlock.class, "BlockSlabIronColored");
    	//GameRegistry.registerBlock(BlockDoubleSlabIronColored, ItemTutorialBlock.class, "BlockSlabIronColored1");
    	
    	GameRegistry.registerBlock(Misc.BlockBCThinGlass, "BlockBCThinGlass");
        GameRegistry.registerBlock(Misc.BlockBCIronBars, "BlockBCIronBars");
        
        GameRegistry.registerBlock(Misc.SifterStructuring, "SifterStructuring");
        GameRegistry.registerBlock(Misc.SifterPipe, "SifterPiping");
        GameRegistry.registerBlock(Misc.SifterVentalator, "SifterVentalator");
        GameRegistry.registerBlock(Misc.SifterVentalator2, "SifterVentalator2");
        GameRegistry.registerBlock(Misc.SifterTurbine, "SifterTurbine");
        GameRegistry.registerBlock(Misc.SifterTurbineFans, "SifterTurbineFans");
        GameRegistry.registerBlock(Misc.SifterItemCollector, "SifterItemCollector");
        GameRegistry.registerBlock(Misc.SifterPreasureWalling, "SifterPreasureWalling");
        GameRegistry.registerBlock(Misc.SifterRubberSealer, "RubberSealer");
        
        GameRegistry.registerBlock(Misc.StairGlass, "StairGlass");
        GameRegistry.registerBlock(Misc.StairStone, "StairStone");
        GameRegistry.registerBlock(Misc.StairWhiteStone, "StairWhiteStone");
        
        GameRegistry.registerBlock(Misc.FenceBirch, "FenceBirch");
        GameRegistry.registerBlock(Misc.FenceSpruce, "FenceSpruce");
        GameRegistry.registerBlock(Misc.FenceJungle, "FenceJungle");
        
        GameRegistry.registerBlock(Misc.BlockShinyGlass, "BlockShinyGlass");
        GameRegistry.registerBlock(Misc.BlockWoodTrimmedGlass, "BlockWoodTrimmedGlass");
        GameRegistry.registerBlock(Misc.BlockRedStoneSheet, "BlockRedStoneSheet");
        
        GameRegistry.registerBlock(GuiBlocks.TestGui, ItemBlock.class , "TestGuiActive");
        GameRegistry.registerBlock(GuiBlocks.TestGuiIdle, ItemBlock.class , "Test Gui");
        
        GameRegistry.registerBlock(GuiBlocks.BCFurnace1Active, ItemBlock.class , "BCFurnace1Active");
        GameRegistry.registerBlock(GuiBlocks.BCFurnace1Idle, ItemBlock.class , "BCFurnace1Idle");
        
       // GameRegistry.registerBlock(SifterCoreActive, ItemBlock.class , "SifterCoreActive");
       // GameRegistry.registerBlock(SifterCoreIdle, ItemBlock.class , "SifterCoreIdle");
        //GameRegistry.registerBlock(BaseIce, "BaseIce");
        GameRegistry.registerBlock(GuiBlocks.BlockXPBlock, ItemBlock.class , "BlockXPBlock");
        GameRegistry.registerBlock(GuiBlocks.BlockXPBlockActive, ItemBlock.class , "BlockXPBlockActive");
        
        GameRegistry.registerTileEntity(TileEntitySifterCore.class, "SifterCore");
        GameRegistry.registerTileEntity(TileEntityBCFurnace1.class, "BCFurnace1");
        GameRegistry.registerTileEntity(TileEntityTestGui.class, "TestGui");
        GameRegistry.registerTileEntity(TileEntityXPBlock.class, "BlockXPBlock");
        GameRegistry.registerTileEntity(TileEntitySifterPipe.class, "SifterPipe");
        GameRegistry.registerTileEntity(TileEntitySifterVentalator.class, "SifterVentalator");
        GameRegistry.registerTileEntity(TileEntitySifterVentalator2.class, "SifterVentalator2");
        
        GameRegistry.registerBlock(Misc.BlockPlaqueDiamondSword, "BlockPlaqueDiamondSword");
        
        GameRegistry.registerTileEntity(TileEntityBlockPlaqueDiamondSword.class, "BlockPlaqueDiamondSword");
        
//        GameRegistry.registerBlock(GuiBlocks.BlockXPBlock, "BlockXPBlock");
//        GameRegistry.registerBlock(GuiBlocks.BlockXPBlockActive, "BlockXPBlockActive");
        
        
        
       
	}
}
