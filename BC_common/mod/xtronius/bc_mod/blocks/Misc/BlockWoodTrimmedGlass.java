package mod.xtronius.bc_mod.blocks.Misc;

import java.util.List;

import mod.xtronius.bc_mod.creativetab.CreativeTab;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockWoodTrimmedGlass extends BlockGlass{

	public BlockWoodTrimmedGlass(int id) {
		super(id, Material.glass, false);
		this.setCreativeTab(CreativeTab.tabsBC_ModDecorativeBlocks);
	}
	public void addInformation(ItemStack itemstack, EntityPlayer player, List descriptiveList, boolean B)
	{
	         descriptiveList.add("Decorative Block");
	}
	
	@Override
	@SideOnly(Side.CLIENT)

	public void registerIcons(IconRegister iconRegister){
	    blockIcon = iconRegister.registerIcon("bc_mod:" + (this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1)));;
		}
}
