package mod.xtronius.bc_mod.blocks.Misc;

import mod.xtronius.bc_mod.creativetab.CreativeTab;
import mod.xtronius.bc_mod.tileEntity.TileEntityBlockPlaqueDiamondSword;
import mod.xtronius.bc_mod.tileEntity.TileEntitySifterVentalator;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockPlaqueDiamondSword extends BlockContainer{

	public BlockPlaqueDiamondSword(int id) {
		super(id, Material.glass);
		
		this.setCreativeTab(CreativeTab.tabsBC_ModSpecialItemsAndBlocks);
		float f = 0.25F;
        float f1 = 1.0F;
		
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileEntityBlockPlaqueDiamondSword();
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
		public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
	    {
	        //float f = 0.125F;
	        //return AxisAlignedBB.getAABBPool().getAABB((double)par2, (double)par3, (double)par4, (double)(par2 + 1), (double)((float)(par3 + 1)), (double)(par4 + 1));
			
			int l = par1World.getBlockMetadata(par2, par3, par4);
            float f = 0.1F;
            float f1 = 0.9F;
            float f2 = 0.0F;
            float f3 = 1.0F;
            float f4 = 0.125F;
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);

            if (l == 4)
            {
                float f5 = 0.125F;
    	        return AxisAlignedBB.getAABBPool().getAABB((double)par2 + 0.5F, (double)par3, (double)par4, (double)(par2 + 1), (double)((float)(par3 + 1)), (double)(par4 + 1));
            }

            if (l == 5)
            {
                this.setBlockBounds(f2, f, 0.0F, f3, f1, f4);
    	        return AxisAlignedBB.getAABBPool().getAABB((double)par2, (double)par3, (double)par4, (double)(par2 + 0.5), (double)((float)(par3 + 1)), (double)(par4 + 1));
            }

            if (l == 2)
            {
                float f7 = 0.125F;
    	        return AxisAlignedBB.getAABBPool().getAABB((double)par2, (double)par3, (double)par4 + 0.5F, (double)(par2 + 1), (double)((float)(par3 + 1)), (double)(par4 + 1));
            }

            if (l == 3)
            {
                float f8 = 0.125F;
    	        return AxisAlignedBB.getAABBPool().getAABB((double)par2, (double)par3, (double)par4, (double)(par2 + 1), (double)((float)(par3 + 1)), (double)(par4 + 0.5F));
            }
			return null;
	    }
	    @SideOnly(Side.CLIENT)

	    /**
	     * Returns the bounding box of the wired rectangular prism to render.
	     */
	    public AxisAlignedBB getSelectedBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
	    {
	        this.setBlockBoundsBasedOnState(par1World, par2, par3, par4);
	        return super.getSelectedBoundingBoxFromPool(par1World, par2, par3, par4);
	    }

	    /**
	     * Updates the blocks bounds based on its current state. Args: world, x, y, z
	     */
	    public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
	    {
	        
	            int l = par1IBlockAccess.getBlockMetadata(par2, par3, par4);
	            float f = 0.1F;
	            float f1 = 0.9F;
	            float f2 = 0.0F;
	            float f3 = 1.0F;
	            float f4 = 0.135F;
	            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);

	            if (l == 2)
	            {
	                this.setBlockBounds(f2, f, 1.0F - f4, f3, f1, 1.0F);
	            }

	            if (l == 3)
	            {
	                this.setBlockBounds(f2, f, 0.0F, f3, f1, f4);
	            }

	            if (l == 4)
	            {
	                this.setBlockBounds(1.0F - f4, f, f2, 1.0F, f1, f3);
	            }

	            if (l == 5)
	            {
	                this.setBlockBounds(0.0F, f, f2, f4, f1, f3);
	            }
	        }
	    }
	


