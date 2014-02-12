package mod.xtronius.bc_mod.blocks.Misc;

import mod.xtronius.bc_mod.creativetab.CreativeTab;
import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.ForgeDirection;

public class BlockBCThinGlass extends BlockPane{

	public BlockBCThinGlass(int id, String par2Str, String par3Str,Material par4Material, boolean par5) {
		super(id, par2Str, par3Str, par4Material, par5);
		this.setCreativeTab(CreativeTab.tabsBC_ModDecorativeBlocks);
	}
	public boolean canThisPaneConnectToThisBCBlockID(int par1)
    {
        return par1 != 0 ;
    }
	
	public boolean canPaneConnectTo(IBlockAccess access, int x, int y, int z, ForgeDirection dir)
    {
        return canThisPaneConnectToThisBCBlockID(access.getBlockId(x+dir.offsetX, y+dir.offsetY, z+dir.offsetZ)) || access.isBlockSolidOnSide(x+dir.offsetX, y+dir.offsetY, z+dir.offsetZ, dir.getOpposite(), false);
    }

}
