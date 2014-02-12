package mod.xtronius.bc_mod.blocks.Gem;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mod.xtronius.bc_mod.bc_mod;
import mod.xtronius.bc_mod.creativetab.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;

public class BlockBaseGemBlock extends Block{

   
	public BlockBaseGemBlock(int par1, Material par2Material) {
		super(par1, Material.iron);
        this.setCreativeTab(CreativeTab.tabsBC_ModGems);
        this.setHardness(1.25F);
    MinecraftForge.setBlockHarvestLevel(this, "pickaxe", 1);
    }
    
@Override
@SideOnly(Side.CLIENT)

public void registerIcons(IconRegister iconRegister){
    blockIcon = iconRegister.registerIcon("bc_mod:" + (this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1)));;
	}
}
//(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));