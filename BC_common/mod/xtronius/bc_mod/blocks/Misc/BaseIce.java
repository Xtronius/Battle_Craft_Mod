package mod.xtronius.bc_mod.blocks.Misc;

import java.util.Random;

import mod.xtronius.bc_mod.creativetab.CreativeTab;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityCommandBlock;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BaseIce extends BlockContainer{

    private final boolean powered;
	private float SlipVar;
	private float SlipVarBuffer;



	public BaseIce(int par1, Material par2Material, boolean par2) {
		super(par1, Material.iron);
        this.setCreativeTab(CreativeTab.tabsBC_ModSpecialItemsAndBlocks);
        this.slipperiness = SlipVar;
        this.powered = par2;
        System.out.println(SlipVar);
    }
	
	
	

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
	public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
    {
        if (!par1World.isRemote)
        {
            boolean flag = par1World.isBlockIndirectlyGettingPowered(par2, par3, par4);
            int i1 = par1World.getBlockMetadata(par2, par3, par4);
            boolean flag1 = (i1 & 1) != 0;

            if (flag && !flag1)
            {
               this.SlipVar = 10F;
            }
            else if (!flag && flag1)
            {
            	this.SlipVar = 1F;
            }
        }
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        TileEntity tileentity = par1World.getBlockTileEntity(par2, par3, par4);

        if (tileentity != null && tileentity instanceof TileEntityCommandBlock)
        {
            par1World.func_96440_m(par2, par3, par4, this.blockID);
        }
    }

    /**
     * How many world ticks before ticking
     */
    public int tickRate(World par1World)
    {
        return 1;
    }
    
@Override
@SideOnly(Side.CLIENT)

public void registerIcons(IconRegister iconRegister){
    blockIcon = iconRegister.registerIcon("bc_mod:" + (this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1)));;
	}




@Override
public TileEntity createNewTileEntity(World world) {
	return null;
}
}
