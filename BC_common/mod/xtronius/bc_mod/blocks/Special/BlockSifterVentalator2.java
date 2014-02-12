package mod.xtronius.bc_mod.blocks.Special;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mod.xtronius.bc_mod.bc_mod;
import mod.xtronius.bc_mod.tileEntity.TileEntitySifterPipe;
import mod.xtronius.bc_mod.tileEntity.TileEntitySifterVentalator2;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockSifterVentalator2 extends BlockContainer{

	public BlockSifterVentalator2(int id) {
		super(id, Material.iron);
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileEntitySifterVentalator2();
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


