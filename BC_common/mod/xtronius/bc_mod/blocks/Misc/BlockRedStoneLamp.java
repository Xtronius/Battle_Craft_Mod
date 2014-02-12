package mod.xtronius.bc_mod.blocks.Misc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import mod.xtronius.bc_mod.bc_mod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockRedStoneLamp extends Block
{
	private final boolean isAcitve;
	private int meta;
	private int meta1;
	private int meta2;
	private int buffer;
	public BlockRedStoneLamp(int id, boolean par2) 
	{
		super(id, Material.redstoneLight);
		this.isAcitve = par2;
		if (par2)
        {
            this.setLightValue(1F);
        }
    }

    /**
     * Called whenever the block is added into the world. Args: world, x, y, z
     */
    public void onBlockAdded(World par1World, int par2, int par3, int par4)
    {
        if (!par1World.isRemote)
        {
            if (this.isAcitve && !par1World.isBlockIndirectlyGettingPowered(par2, par3, par4))
            {
                par1World.scheduleBlockUpdate(par2, par3, par4, this.blockID, 4);
            }
            else if (!this.isAcitve && par1World.isBlockIndirectlyGettingPowered(par2, par3, par4))
            {
            	meta = par1World.getBlockMetadata(par2, par3, par4);
                par1World.setBlock(par2, par3, par4, Misc.BlockActiveRedStoneLamp.blockID, meta, 2);
            }
        }
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
    {
        if (!par1World.isRemote)
        {
            if (this.isAcitve && !par1World.isBlockIndirectlyGettingPowered(par2, par3, par4))
            {
                par1World.scheduleBlockUpdate(par2, par3, par4, this.blockID, 4);
            }
            else if (!this.isAcitve && par1World.isBlockIndirectlyGettingPowered(par2, par3, par4))
            {
            	meta1 = par1World.getBlockMetadata(par2, par3, par4);
                par1World.setBlock(par2, par3, par4, Misc.BlockActiveRedStoneLamp.blockID, meta1, 2);
            }
        }
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (!par1World.isRemote && this.isAcitve && !par1World.isBlockIndirectlyGettingPowered(par2, par3, par4))
        {
        	meta2 = par1World.getBlockMetadata(par2, par3, par4);
            par1World.setBlock(par2, par3, par4, Misc.BlockIdleRedStoneLamp.blockID, meta2, 2);
        }
    }

    @SideOnly(Side.CLIENT)

    /**
     * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
     */
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return Misc.BlockIdleRedStoneLamp.blockID;
    }
    

    @Override
    public int damageDropped(int meta)
        {
            return meta;
        }

    @Override
    public int idDropped(int meta, Random random, int fortune) {
        return Misc.BlockIdleRedStoneLamp.blockID;
    }
    
    
	@SideOnly(Side.CLIENT)
	private Icon[] icons;
	      
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
	       icons = new Icon[16];
	            
	       for(int i = 0; i < icons.length; i++)
	       {
	        icons[i] = par1IconRegister.registerIcon("bc_mod" + ":lamp/" + this.textureName + i);
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
}