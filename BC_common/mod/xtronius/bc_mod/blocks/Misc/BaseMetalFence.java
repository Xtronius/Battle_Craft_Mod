package mod.xtronius.bc_mod.blocks.Misc;

import java.util.List;

import mod.xtronius.bc_mod.creativetab.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemLeash;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BaseMetalFence extends Block
{
   // private final String field_94464_a;

    private static String field_94464_a;

	public BaseMetalFence(int par1, Material par3Material)
    {
        super(par1, par3Material);
        //this.field_94464_a = par2Str;
        this.setCreativeTab(CreativeTab.tabsBC_ModDecorativeBlocks);
    }

    /**
     * Adds all intersecting collision boxes to a list. (Be sure to only add boxes to the list if they intersect the
     * mask.) Parameters: World, X, Y, Z, mask, list, colliding entity
     */
    public void addCollisionBoxesToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity)
    {
        boolean flag = this.canConnectFenceTo(par1World, par2, par3, par4 - 1);
        boolean flag1 = this.canConnectFenceTo(par1World, par2, par3, par4 + 1);
        boolean flag2 = this.canConnectFenceTo(par1World, par2 - 1, par3, par4);
        boolean flag3 = this.canConnectFenceTo(par1World, par2 + 1, par3, par4);
        float f = 0.375F;
        float f1 = 0.625F;
        float f2 = 0.375F;
        float f3 = 0.625F;

        if (flag)
        {
            f2 = 0.0F;
        }

        if (flag1)
        {
            f3 = 1.0F;
        }

        if (flag2)
        {
            f = 0.0F;
        }

        if (flag3)
        {
            f1 = 1.0F;
        }

        this.setBlockBounds(f, 0.0F, f2, f1, 1.0F, f3);
        super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
    }

    /**
     * Updates the blocks bounds based on its current state. Args: world, x, y, z
     */
    public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        boolean flag = this.canConnectFenceTo(par1IBlockAccess, par2, par3, par4 - 1);
        boolean flag1 = this.canConnectFenceTo(par1IBlockAccess, par2, par3, par4 + 1);
        boolean flag2 = this.canConnectFenceTo(par1IBlockAccess, par2 - 1, par3, par4);
        boolean flag3 = this.canConnectFenceTo(par1IBlockAccess, par2 + 1, par3, par4);
        float f = 0.375F;
        float f1 = 0.625F;
        float f2 = 0.375F;
        float f3 = 0.625F;

        if (flag)
        {
            f2 = 0.0F;
        }

        if (flag1)
        {
            f3 = 1.0F;
        }

        if (flag2)
        {
            f = 0.0F;
        }

        if (flag3)
        {
            f1 = 1.0F;
        }

        this.setBlockBounds(f, 0.0F, f2, f1, 1.0F, f3);
    }

    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    public boolean isOpaqueCube()
    {
        return false;
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    public boolean getBlocksMovement(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        return false;
    }

    /**
     * The type of render function that is called for this block
     */
    //public int getRenderType()
    //{
    // return 11;
    //}

    /**
     * Returns true if the specified block can be connected by a fence
     */
    public boolean canConnectFenceTo(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        int l = par1IBlockAccess.getBlockId(par2, par3, par4);

		if (l == 0 
				/*&& l != Block.fenceGate.blockID
				&& l != Block.thinGlass.blockID 
				&& l != Block.fenceIron.blockID
				&& l != Block.fence.blockID 
				&& l != Block.stairsBrick.blockID
				&& l != Block.stairsCobblestone.blockID
				&& l != Block.stairsNetherBrick.blockID
				&& l != Block.stairsNetherQuartz.blockID
				&& l != Block.stairsSandStone.blockID 
				&& l != Block.stairsStoneBrick.blockID
				&& l != Block.stairsWoodBirch.blockID 
				&& l != Block.stairsWoodJungle.blockID
				&& l != Block.stairsWoodOak.blockID 
				&& l != Block.stairsWoodSpruce.blockID
				&& l != Block.cauldron.blockID
				&& l != Block.ice.blockID
				&& l != Block.beacon.blockID
				&& l != Block.glass.blockID
				&& l != Block.glowStone.blockID
				&& l != Block.doorWood.blockID
				&& l != Block.doorIron.blockID
				
				&& l != bc_mod.StairGlass.blockID 
				&& l != bc_mod.StairStone.blockID
				&& l != bc_mod.StairWhiteStone.blockID 
				&& l != bc_mod.SifterItemCollector.blockID
				&& l != bc_mod.SifterPipe.blockID 
				&& l != bc_mod.SifterVentalator.blockID
				&& l != bc_mod.SifterStructuring.blockID
				&& l != bc_mod.FenceIron.blockID*/) {
            Block block = Block.blocksList[l];
            return block != null && block.blockMaterial.isOpaque() && block.renderAsNormalBlock() ? block.blockMaterial != Material.pumpkin : false;
        }
        else
        {
            return true;
        }
    }

    public static boolean isIdAFence(int par0)
    {
        return par0 == Misc.FenceIron.blockID;
    }

    @SideOnly(Side.CLIENT)

    /**
     * Returns true if the given side of this block type should be rendered, if the adjacent block is at the given
     * coordinates.  Args: blockAccess, x, y, z, side
     */
    public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        return true;
    }

    @SideOnly(Side.CLIENT)
	private Icon[] icons;
	      
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
	       icons = new Icon[16];
	            
	       for(int i = 0; i < icons.length; i++)
	       {
	    	   //this.texture = "bc_mod:" + (this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1)) + i; 
	        icons[i] = par1IconRegister.registerIcon("bc_mod:" + (this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1)) + i);
	        //icons[i] = par1IconRegister.registerIcon(this.texture);
	        //System.out.println(texture);
	        
	       }
	}

	@SideOnly(Side.CLIENT)
	public Icon getIcon(int par1, int par2)
	{
	       return icons[par2];
	}
	
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
	{
	    for (int var4 = 0; var4 < 16; ++var4)
	    {
	        par3List.add(new ItemStack(par1, 1, var4));
	    }
	}

    public int damageDropped(int par1)
    {
        return par1;
    }
   // public int idPicked(World par1World, int par2, int par3, int par4)
   // {
   //     return bc_mod.FenceIron.getDamageValue(par1World, par2, par3, par4);
  //  }
}