package mod.xtronius.bc_mod.blocks.Misc;

import mod.xtronius.bc_mod.creativetab.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class BCBlockStairs extends BlockStairs {

public BCBlockStairs(int par1, Block par2Block, int par3) {
super(par1, par2Block, par3);

this.setLightOpacity(0);
this.setCreativeTab(CreativeTab.tabsBC_ModDecorativeBlocks);
}
public boolean isOpaqueCube(){
	return false;
	
}
}