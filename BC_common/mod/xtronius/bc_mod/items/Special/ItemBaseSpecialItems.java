package mod.xtronius.bc_mod.items.Special;

import mod.xtronius.bc_mod.creativetab.CreativeTab;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBaseSpecialItems extends Item{

   
        
    public ItemBaseSpecialItems(int par1) {
        super(par1);
        this.setMaxStackSize(64);
        this.setCreativeTab(CreativeTab.tabsBC_ModSpecialItemsAndBlocks);
    }


    
@Override
@SideOnly(Side.CLIENT)

public void registerIcons(IconRegister iconRegister){
    itemIcon = iconRegister.registerIcon("bc_mod:" + (this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1)));;
	}
}
//(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));