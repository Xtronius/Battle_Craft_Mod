package mod.xtronius.bc_mod.blocks.Misc;

import java.util.List;

import mod.xtronius.bc_mod.creativetab.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockIronColored extends Block
{
	public BlockIronColored(int id, Material material) 
	{
		super(id, material);
		this.setCreativeTab(CreativeTab.tabsBC_ModDecorativeBlocks);
	}

	public int damageDropped(int par1)
   	{
        	return par1;
    	}
	
	@SideOnly(Side.CLIENT)
	private Icon[] icons;
	      
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
	       icons = new Icon[16];
	            
	       for(int i = 0; i < icons.length; i++)
	       {
	        icons[i] = par1IconRegister.registerIcon("bc_mod" + ":" + "FenceIron" + i);
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