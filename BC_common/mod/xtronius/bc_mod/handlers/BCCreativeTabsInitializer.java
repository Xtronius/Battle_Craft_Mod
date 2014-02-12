package mod.xtronius.bc_mod.handlers;

import mod.xtronius.bc_mod.creativetab.CreativeTab;
import mod.xtronius.bc_mod.creativetab.CreativeTabBC_Mod_Decorative_Blocks;
import mod.xtronius.bc_mod.creativetab.CreativeTabBC_Mod_Gems;
import mod.xtronius.bc_mod.creativetab.CreativeTabBC_Mod_Metals;
import mod.xtronius.bc_mod.creativetab.CreativeTabBC_Mod_Misc_Blocks;
import mod.xtronius.bc_mod.creativetab.CreativeTabBC_Mod_Misc_Items;
import mod.xtronius.bc_mod.creativetab.CreativeTabBC_Mod_Special_Items_And_Blocks;
import mod.xtronius.bc_mod.lib.Reference;
import net.minecraft.creativetab.CreativeTabs;

public class BCCreativeTabsInitializer {

	public BCCreativeTabsInitializer()
	{
		
		CreativeTab.tabsBC_ModMetals = new CreativeTabBC_Mod_Metals(CreativeTabs.getNextID(), Reference.Creative_Tabs_Metals);
		CreativeTab.tabsBC_ModGems = new CreativeTabBC_Mod_Gems(CreativeTabs.getNextID(), Reference.Creative_Tabs_Gems);
		CreativeTabs tabsBC_ModSpecialItemsAndBlocks = new CreativeTabBC_Mod_Special_Items_And_Blocks(CreativeTabs.getNextID(), Reference.Creative_Tabs_SpecialItemsAndBlocks);

		CreativeTab.tabsBC_ModDecorativeBlocks = new CreativeTabBC_Mod_Decorative_Blocks(CreativeTabs.getNextID(), Reference.Creative_Tabs_Decorative_Blocks);
		CreativeTab.tabsBC_ModMiscItems = new CreativeTabBC_Mod_Misc_Items(CreativeTabs.getNextID(), Reference.Creative_Tabs_MiscItems);
		CreativeTab.tabsBC_ModMiscBlocks = new CreativeTabBC_Mod_Misc_Blocks(CreativeTabs.getNextID(), Reference.Creative_Tabs_MiscBlocks);
	}
}
