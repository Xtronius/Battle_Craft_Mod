package mod.xtronius.bc_mod.blocks.Special;

import mod.xtronius.bc_mod.creativetab.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBaseSpecialOres extends Block{

   
	public BlockBaseSpecialOres(int par1, Material par2Material) {
		super(par1, Material.iron);
        this.setCreativeTab(CreativeTab.tabsBC_ModSpecialItemsAndBlocks);
    }


    
@Override
@SideOnly(Side.CLIENT)

public void registerIcons(IconRegister iconRegister){
    blockIcon = iconRegister.registerIcon("bc_mod:" + (this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1)));;
	}
}
//(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));