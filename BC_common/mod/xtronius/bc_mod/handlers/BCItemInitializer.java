package mod.xtronius.bc_mod.handlers;

import mod.xtronius.bc_mod.creativetab.CreativeTab;
import mod.xtronius.bc_mod.items.Gem.IGems;
import mod.xtronius.bc_mod.items.Gem.ItemBaseGem;
import mod.xtronius.bc_mod.items.Metal.IMetals;
import mod.xtronius.bc_mod.items.Metal.ItemBaseIngot;
import mod.xtronius.bc_mod.items.Misc.IMisc;
import mod.xtronius.bc_mod.items.Misc.ItemBaseStaff;
import mod.xtronius.bc_mod.items.Misc.ItemMetalPostPlacer;
import mod.xtronius.bc_mod.items.Misc.ItemTpSword;
import mod.xtronius.bc_mod.items.Special.ISpecial;
import mod.xtronius.bc_mod.items.Special.ItemBaseRandomWeapon;
import mod.xtronius.bc_mod.items.Special.ItemBaseSpecialItems;
import mod.xtronius.bc_mod.items.ids.ItemIDs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;

public class BCItemInitializer {

	public BCItemInitializer(){
		
		
	  IMetals.ingotTungstenCarbide = new ItemBaseIngot(ItemIDs.ingotTungstenCarbideID).setUnlocalizedName("ingotTungstenCarbide");
	  IMetals.ingotTungsten = new ItemBaseIngot(ItemIDs.ingotTungstenID).setUnlocalizedName("ingotTungsten");
	  IMetals.ingotOsmium = new ItemBaseIngot(ItemIDs.ingotOsmiumID).setUnlocalizedName("ingotOsmium");
	  IMetals.ingotIridium = new ItemBaseIngot(ItemIDs.ingotIridiumID).setUnlocalizedName("ingotIridium");
	  IMetals.ingotHardenedSteel = new ItemBaseIngot(ItemIDs.ingotHardenedSteelID).setUnlocalizedName("ingotHardenedSteel");
	  IMetals.ingotTitanium = new ItemBaseIngot(ItemIDs.ingotTitaniumID).setUnlocalizedName("ingotTitanium");
	  IMetals.ingotRhodium = new ItemBaseIngot(ItemIDs.ingotRhodiumID).setUnlocalizedName("ingotRhodium");
	  IMetals.ingotPalladiam = new ItemBaseIngot(ItemIDs.ingotPalladiamID).setUnlocalizedName("ingotPalladiam");
	  IMetals.ingotPlatinum = new ItemBaseIngot(ItemIDs.ingotPlatinumID).setUnlocalizedName("ingotPlatinum");
	  IMetals.ingotSteel = new ItemBaseIngot(ItemIDs.ingotSteelID).setUnlocalizedName("ingotSteel");
	  IMetals.ingotNickel = new ItemBaseIngot(ItemIDs.ingotNickelID).setUnlocalizedName("ingotNickel");
	  IMetals.ingotBronze = new ItemBaseIngot(ItemIDs.ingotBronzeID).setUnlocalizedName("ingotBronze");
	  IMetals.ingotBrass = new ItemBaseIngot(ItemIDs.ingotBrassID).setUnlocalizedName("ingotBrass");
	  IMetals.ingotCopper = new ItemBaseIngot(ItemIDs.ingotCopperID).setUnlocalizedName("ingotCopper");
	  IMetals.ingotAluminum = new ItemBaseIngot(ItemIDs.ingotAluminumID).setUnlocalizedName("ingotAluminum");
	  IMetals.ingotSilver = new ItemBaseIngot(ItemIDs.ingotSilverID).setUnlocalizedName("ingotSilver");
	  IMetals.ingotZinc = new ItemBaseIngot(ItemIDs.ingotZincID).setUnlocalizedName("ingotZinc");
	  IMetals.ingotTin = new ItemBaseIngot(ItemIDs.ingotTinID).setUnlocalizedName("ingotTin");
	  IMetals.ingotLead = new ItemBaseIngot(ItemIDs.ingotLeadID).setUnlocalizedName("ingotLead");
	
	  ISpecial.airShard = new ItemBaseSpecialItems(ItemIDs.airShardID).setUnlocalizedName("airShard");
	  ISpecial.waterShard = new ItemBaseSpecialItems(ItemIDs.waterShardID).setUnlocalizedName("waterShard");
	  ISpecial.earthShard = new ItemBaseSpecialItems(ItemIDs.earthShardID).setUnlocalizedName("earthShard");
	  ISpecial.fireShard = new ItemBaseSpecialItems(ItemIDs.fireShardID).setUnlocalizedName("fireShard");
	
	  IGems.gemRuby = new ItemBaseGem(ItemIDs.gemRubyID).setUnlocalizedName("gemRuby");
	  IGems.gemSapphire = new ItemBaseGem(ItemIDs.gemSapphireID).setUnlocalizedName("gemSapphire");
	  IGems.gemTopaz = new ItemBaseGem(ItemIDs.gemTopazID).setUnlocalizedName("gemTopaz");
	  IGems.gemEmerald = new ItemBaseGem(ItemIDs.gemEmeraldID).setUnlocalizedName("gemEmerald");
	  IGems.gemAquamarine = new ItemBaseGem(ItemIDs.gemAquamarineID).setUnlocalizedName("gemAquamarine");
	  IGems.gemBeryl = new ItemBaseGem(ItemIDs.gemBerylID).setUnlocalizedName("gemBeryl");
	  IGems.gemSmokyQuartz = new ItemBaseGem(ItemIDs.gemSmokyQuartzID).setUnlocalizedName("gemSmokyQuartz");
	  IGems.gemQuartz = new ItemBaseGem(ItemIDs.gemQuartzID).setUnlocalizedName("gemQuartz");
	  IGems.gemAmetrine = new ItemBaseGem(ItemIDs.gemAmetrineID).setUnlocalizedName("gemAmetrine");
	  IGems.gemKunzite = new ItemBaseGem(ItemIDs.gemKunziteID).setUnlocalizedName("gemKunzite");
	  IGems.gemAmethyst = new ItemBaseGem(ItemIDs.gemAmethystID).setUnlocalizedName("gemAmethyst");
	  IGems.gemJasper = new ItemBaseGem(ItemIDs.gemJasperID).setUnlocalizedName("gemJasper");
	  IGems.gemAxinite = new ItemBaseGem(ItemIDs.gemAxiniteID).setUnlocalizedName("gemAxinite");
	  IGems.gemOnyx = new ItemBaseGem(ItemIDs.gemOnyxID).setUnlocalizedName("gemOnyx");
	  IGems.gemSunStone = new ItemBaseGem(ItemIDs.gemSunStoneID).setUnlocalizedName("gemSunStone");
	  IGems.gemMoonStone = new ItemBaseGem(ItemIDs.gemMoonStoneID).setUnlocalizedName("gemMoonStone");
	  IGems.gemOpal = new ItemBaseGem(ItemIDs.gemOpalID).setUnlocalizedName("gemOpal");
	  IGems.gemApatite = new ItemBaseGem(ItemIDs.gemApatiteID).setUnlocalizedName("gemApatite");
	  IGems.gemAzurite = new ItemBaseGem(ItemIDs.gemAzuriteID).setUnlocalizedName("gemAzurite");
	  IGems.gemAmber = new ItemBaseGem(ItemIDs.gemAmberID).setUnlocalizedName("gemAmber");
	  IGems.gemPearl = new ItemBaseGem(ItemIDs.gemPearlID).setUnlocalizedName("gemPearl");
	  
	  IMisc.itemStaff = new ItemBaseStaff(ItemIDs.StaffID).setCreativeTab(CreativeTabs.tabCombat).setUnlocalizedName("Staff");	 
	  IMisc.BaseRandWeapon = new ItemBaseRandomWeapon(ItemIDs.BaseRandWeaponID).setUnlocalizedName("BaseRandWeapon");
	  IMisc.ItemMetalPostPlacer =  new ItemMetalPostPlacer(ItemIDs.ItemMetalPostPlacerID).setUnlocalizedName("ItemMetalPostPlacer");
	  IMisc.TpSwordWood = new ItemTpSword(ItemIDs.TpSwordWoodID, EnumToolMaterial.WOOD).setCreativeTab(CreativeTab.tabsBC_ModMiscItems).setUnlocalizedName("TpSwordWood");
	  IMisc.TpSwordStone = new ItemTpSword(ItemIDs.TpSwordStoneID, EnumToolMaterial.STONE).setCreativeTab(CreativeTab.tabsBC_ModMiscItems).setUnlocalizedName("TpSwordStone");
	  IMisc.TpSwordIron = new ItemTpSword(ItemIDs.TpSwordIronID, EnumToolMaterial.IRON).setCreativeTab(CreativeTab.tabsBC_ModMiscItems).setUnlocalizedName("TpSwordIron");
	  IMisc.TpSwordGold = new ItemTpSword(ItemIDs.TpSwordGoldID, EnumToolMaterial.GOLD).setCreativeTab(CreativeTab.tabsBC_ModMiscItems).setUnlocalizedName("TpSwordGold");
	  IMisc.TpSwordDiamond = new ItemTpSword(ItemIDs.TpSwordDiamondID, EnumToolMaterial.EMERALD).setCreativeTab(CreativeTab.tabsBC_ModMiscItems).setUnlocalizedName("TpSwordDiamond");
	  IMisc.TpSwordMisc = new ItemTpSword(ItemIDs.TpSwordMiscID, EnumBCToolMaterial.ENDER).setCreativeTab(CreativeTab.tabsBC_ModMiscItems).setUnlocalizedName("TpSwordMisc");
	}
}
