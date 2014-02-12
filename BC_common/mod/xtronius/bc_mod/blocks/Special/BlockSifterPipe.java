package mod.xtronius.bc_mod.blocks.Special;

import mod.xtronius.bc_mod.creativetab.CreativeTab;
import mod.xtronius.bc_mod.tileEntity.TileEntitySifterPipe;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSifterPipe extends BlockContainer{

	public BlockSifterPipe(int id) {
		super(id, Material.iron);
		
		this.setCreativeTab(CreativeTab.tabsBC_ModSpecialItemsAndBlocks);
		this.setBlockBounds(1F/16*3F, 0, 1F/16*3F, 1F - 1F/16*3F, 1F - 1F/16*6F, 1F - 1F/16*3F);
		
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileEntitySifterPipe();
	}
	
	
	public int getRenderType(){
		return -1;
	}
	
	public boolean isOpaqueCube(){
		return false;
	}
	public boolean RenderAsNormalBlock(){
		return false;
	}
	
	@Override
	@SideOnly(Side.CLIENT)

	public void registerIcons(IconRegister iconRegister){
	    blockIcon = iconRegister.registerIcon("bc_mod:" + (this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1)));;
		}
	}


