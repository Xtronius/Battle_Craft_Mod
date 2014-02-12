package mod.xtronius.bc_mod.blocks.Misc;

import java.util.Random;

import mod.xtronius.bc_mod.creativetab.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOreStorage;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockRedStoneSheet extends BlockOreStorage{

	public BlockRedStoneSheet(int id) {
		super(id);
		this.setCreativeTab(CreativeTab.tabsBC_ModMiscBlocks);
		this.setBlockBounds(0.0078125F, 0.0F, 0.0078125F, 0.9921875F, 0.0095555555555555555F, 0.9921875F);
		this.setTickRandomly(true);
	}
	public boolean isOpaqueCube()
    {
        return false;
    }
	
    
	
	
	   /**
     * Gets if we can place a torch on a block.
     */
    private boolean canPlaceBlockOn(World par1World, int par2, int par3, int par4)
    {
        if (par1World.doesBlockHaveSolidTopSurface(par2, par3, par4))
        {
            return true;
        }
        else
        {
            int l = par1World.getBlockId(par2, par3, par4);
			return (Block.blocksList[l] != null
					&& Block.blocksList[l].canPlaceTorchOnTop(par1World, par2, par3, par4)
					|| l == Block.pistonBase.blockID
					|| l == Block.pistonExtension.blockID
					|| l == Block.pistonMoving.blockID
					|| l == Block.pistonStickyBase.blockID 
					|| l == Block.anvil.blockID)
					|| l == Block.chest.blockID
					|| l == Block.chestTrapped.blockID
					|| l == Block.cauldron.blockID
					|| l == Block.cobblestoneWall.blockID
					|| l == Block.beacon.blockID
					|| l == Block.doorIron.blockID
					|| l == Block.doorWood.blockID
					|| l == Block.fence.blockID
					|| l == Block.railActivator.blockID
					|| l == Block.rail.blockID
					|| l == Block.railDetector.blockID
					|| l == Block.railPowered.blockID
					|| l == Block.redstoneWire.blockID
					|| l == Block.thinGlass.blockID
					|| l == Block.fenceIron.blockID
					|| l == Block.fenceGate.blockID
					
					|| l == Misc.FenceBirch.blockID
					|| l == Misc.FenceIron.blockID
					|| l == Misc.FenceJungle.blockID
					|| l == Misc.FenceSpruce.blockID
					|| l == Misc.BlockBCIronBars.blockID
					|| l == Misc.BlockBCThinGlass.blockID
					|| l == Misc.BlockShinyGlass.blockID
					
					
					
					
					
					
					
					
					;
 }
    }

    /**
     * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
     */
    public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
    {
        return canPlaceBlockOn(par1World, par2, par3 - 1, par4);
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        super.updateTick(par1World, par2, par3, par4, par5Random);

        if (par1World.getBlockMetadata(par2, par3, par4) == 0)
        {
            this.onBlockAdded(par1World, par2, par3, par4);
        }
    }

    /**
     * Called whenever the block is added into the world. Args: world, x, y, z
     */
    public void onBlockAdded(World par1World, int par2, int par3, int par4)
    {
    	if (this.canPlaceBlockOn(par1World, par2, par3 - 1, par4))
            {
                par1World.setBlockMetadataWithNotify(par2, par3, par4, 5, 2);
            }
    	this.dropBlockIfCantStay(par1World, par2, par3, par4);
        }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
    {
        this.func_94397_d(par1World, par2, par3, par4, par5);
    }

    protected boolean func_94397_d(World par1World, int par2, int par3, int par4, int par5)
    {
        if (this.dropBlockIfCantStay(par1World, par2, par3, par4))
        {
            int i1 = par1World.getBlockMetadata(par2, par3, par4);
            boolean flag = false;

            if (!this.canPlaceBlockOn(par1World, par2, par3 - 1, par4) && i1 == 5)
            {
                flag = true;
            }

            if (flag)
            {
                this.dropBlockAsItem(par1World, par2, par3, par4, par1World.getBlockMetadata(par2, par3, par4), 0);
                par1World.setBlockToAir(par2, par3, par4);
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return true;
        }
    }

    /**
     * Tests if the block can remain at its current location and will drop as an item if it is unable to stay. Returns
     * True if it can stay and False if it drops. Args: world, x, y, z
     */
    protected boolean dropBlockIfCantStay(World par1World, int par2, int par3, int par4)
    {
        if (!this.canPlaceBlockAt(par1World, par2, par3, par4))
        {
            if (par1World.getBlockId(par2, par3, par4) == this.blockID)
            {
                this.dropBlockAsItem(par1World, par2, par3, par4, par1World.getBlockMetadata(par2, par3, par4), 0);
                par1World.setBlockToAir(par2, par3, par4);
            }

            return false;
        }
        else
        {
            return true;
        }
    }
    
    /**
     * Can this block provide power. Only wire currently seems to have this change based on its state.
     */
    public boolean canProvidePower()
    {
        return true;
    }

    /**
     * Returns true if the block is emitting indirect/weak redstone power on the specified side. If isBlockNormalCube
     * returns true, standard redstone propagation rules will apply instead and this will not be called. Args: World, X,
     * Y, Z, side. Note that the side is reversed - eg it is 1 (up) when checking the bottom of the block.
     */
    public int isProvidingWeakPower(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        return 15;
    }
    
    
    
    
    
    
	
	@Override
	@SideOnly(Side.CLIENT)

	public void registerIcons(IconRegister iconRegister){
	    blockIcon = iconRegister.registerIcon("redstone_block");
		}
}
