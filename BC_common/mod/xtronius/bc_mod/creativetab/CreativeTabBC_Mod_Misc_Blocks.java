package mod.xtronius.bc_mod.creativetab;
import mod.xtronius.bc_mod.bc_mod;
import mod.xtronius.bc_mod.blocks.Misc.Misc;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;



import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * BC_Mod
 * 
 * CreativeTabBC_Mod
 * 
 * @author Xtronius
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class CreativeTabBC_Mod_Misc_Blocks extends CreativeTabs {

    public CreativeTabBC_Mod_Misc_Blocks(int tabID, String tabLabel) {

        super(tabID, tabLabel);
    }

    @Override
    @SideOnly(Side.CLIENT)
    /**
     * the itemID for the item to be displayed on the tab
     */
    public int getTabIconItemIndex() {

        return Misc.SifterVentalator.blockID;
    }

}
