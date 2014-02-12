package mod.xtronius.bc_mod.blocks.Gem;

import java.util.Random;

import mod.xtronius.bc_mod.creativetab.CreativeTab;
import mod.xtronius.bc_mod.items.Gem.IGems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBaseGemOre extends Block{


	public String GemID;
	public BlockBaseGemOre(int par1, Material par2Material, String gemID) {
		super(par1, Material.iron);
        this.setCreativeTab(CreativeTab.tabsBC_ModGems);
        this.GemID = gemID;
    }
	  
	 
	public int idDropped(int par1, Random par2Random, int par3)
    {
		
		if(GemID == "Ruby"){
		// System.out.println(GemID);
		return IGems.gemRuby.itemID;
		}
		else if (GemID == "Sapphire"){
			// System.out.println(GemID);
			return IGems.gemSapphire.itemID;
		}
		else if (GemID == "Topaz"){
			// System.out.println(GemID);
			return IGems.gemTopaz.itemID;
		}
		else if (GemID == "Emerald"){
			// System.out.println(GemID);
			return IGems.gemEmerald.itemID;
		}
		else if (GemID == "Aquamarine"){
			// System.out.println(GemID);
			return IGems.gemAquamarine.itemID;
		}
		else if (GemID == "Beryl"){
			// System.out.println(GemID);
			return IGems.gemBeryl.itemID;
		}
		else if (GemID == "SmokyQuartz"){
			// System.out.println(GemID);
			return IGems.gemSmokyQuartz.itemID;
		}
		else if (GemID == "Quartz"){
			// System.out.println(GemID);
			return IGems.gemQuartz.itemID;
		}
		else if (GemID == "Ametrine"){
			// System.out.println(GemID);
			return IGems.gemAmetrine.itemID;
		}
		else if (GemID == "Kunzite"){
			// System.out.println(GemID);
			return IGems.gemKunzite.itemID;
		}
		else if (GemID == "Amethyst"){
			// System.out.println(GemID);
			return IGems.gemAmethyst.itemID;
		}
		else if (GemID == "Jasper"){
			// System.out.println(GemID);
			return IGems.gemJasper.itemID;
		}
		else if (GemID == "Axinite"){
			// System.out.println(GemID);
			return IGems.gemAxinite.itemID;
		}
		else if (GemID == "Onyx"){
			// System.out.println(GemID);
			return IGems.gemOnyx.itemID;
		}
		else if (GemID == "SunStone"){
			// System.out.println(GemID);
			return IGems.gemSunStone.itemID;
		}
		else if (GemID == "MoonStone"){
			// System.out.println(GemID);
			return IGems.gemMoonStone.itemID;
		}
		else if (GemID == "Opal"){
			// System.out.println(GemID);
			return IGems.gemOpal.itemID;
		}
		else if (GemID == "Apatite"){
			// System.out.println(GemID);
			return IGems.gemApatite.itemID;
		}
		else if (GemID == "Azurite"){
			// System.out.println(GemID);
			return IGems.gemAzurite.itemID;
		}
		else if (GemID == "Amber"){
			// System.out.println(GemID);
			return IGems.gemAmber.itemID;
		}
		else if (GemID == "Pearl"){
			// System.out.println(GemID);
			return IGems.gemPearl.itemID;
		}
		else{
			System.out.println("Yo This be Returning False Boyyyyyy!!!!!");
			return Item.redstone.itemID;
		}
    }
    
@Override
@SideOnly(Side.CLIENT)

public void registerIcons(IconRegister iconRegister){
    blockIcon = iconRegister.registerIcon("bc_mod:" + (this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1)));;
	}
}
//(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));