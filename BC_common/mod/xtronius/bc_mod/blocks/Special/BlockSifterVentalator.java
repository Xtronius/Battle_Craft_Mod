package mod.xtronius.bc_mod.blocks.Special;

import mod.xtronius.bc_mod.creativetab.CreativeTab;
import mod.xtronius.bc_mod.tileEntity.TileEntitySifterVentalator;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSifterVentalator extends BlockContainer{

	public BlockSifterVentalator(int id) {
		super(id, Material.iron);
		
		this.setCreativeTab(CreativeTab.tabsBC_ModSpecialItemsAndBlocks);
		
		
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileEntitySifterVentalator();
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
	private void setDefaultDirection(World world, int x, int y, int z) {
		if(!world.isRemote) {
		int zNeg = world.getBlockId(x, y, z - 1);
		int zPos = world.getBlockId(x, y, z + 1);
		int xNeg = world.getBlockId(x - 1, y, z);
		int xPos = world.getBlockId(x + 1, y, z);
		byte meta = 3;

		if(Block.opaqueCubeLookup[xNeg] && !Block.opaqueCubeLookup[xPos]) meta = 5;
		if(Block.opaqueCubeLookup[xPos] && !Block.opaqueCubeLookup[xNeg]) meta = 4;
		if(Block.opaqueCubeLookup[zNeg] && !Block.opaqueCubeLookup[zPos]) meta = 3;
		if(Block.opaqueCubeLookup[zPos] && !Block.opaqueCubeLookup[zNeg]) meta = 2;

		world.setBlockMetadataWithNotify(x, y, z, meta, 2);
		}
		}

		
		public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemstack) {
		int rotation = MathHelper.floor_double((double)(entity.rotationYaw * 4F / 360F) + 0.5D) & 3;

		if(rotation == 0) {
		world.setBlockMetadataWithNotify(x, y, z, 2, 2);
		}

		if(rotation == 1) {
		world.setBlockMetadataWithNotify(x, y, z, 5, 2);
		}

		if(rotation == 2) {
		world.setBlockMetadataWithNotify(x, y, z, 3, 2);
		}

		if(rotation == 3) {
		world.setBlockMetadataWithNotify(x, y, z, 4, 2);
		}
		}
	}


