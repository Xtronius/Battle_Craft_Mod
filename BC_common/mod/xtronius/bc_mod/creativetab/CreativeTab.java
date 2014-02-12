package mod.xtronius.bc_mod.creativetab;

import mod.xtronius.bc_mod.lib.Reference;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTab {
	
	public static CreativeTabs tabsBC_ModMetals = new CreativeTabBC_Mod_Metals(CreativeTabs.getNextID(), Reference.Creative_Tabs_Metals);
	public static CreativeTabs tabsBC_ModGems = new CreativeTabBC_Mod_Gems(CreativeTabs.getNextID(), Reference.Creative_Tabs_Gems);
	public static CreativeTabs tabsBC_ModSpecialItemsAndBlocks = new CreativeTabBC_Mod_Special_Items_And_Blocks(CreativeTabs.getNextID(), Reference.Creative_Tabs_SpecialItemsAndBlocks);

	public static CreativeTabs tabsBC_ModDecorativeBlocks = new CreativeTabBC_Mod_Decorative_Blocks(CreativeTabs.getNextID(), Reference.Creative_Tabs_Decorative_Blocks);
	public static CreativeTabs tabsBC_ModMiscItems = new CreativeTabBC_Mod_Misc_Items(CreativeTabs.getNextID(), Reference.Creative_Tabs_MiscItems);
	public static CreativeTabs tabsBC_ModMiscBlocks = new CreativeTabBC_Mod_Misc_Blocks(CreativeTabs.getNextID(), Reference.Creative_Tabs_MiscBlocks);
}
