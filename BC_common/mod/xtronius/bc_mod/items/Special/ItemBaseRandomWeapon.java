package mod.xtronius.bc_mod.items.Special;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class ItemBaseRandomWeapon extends Item{


	public ItemBaseRandomWeapon(int id) {
		super(id);
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setMaxStackSize(1);
		this.setMaxDamage(1);
		
	}	
	@Override
    public boolean itemInteractionForEntity(ItemStack itemstack, EntityPlayer player, EntityLivingBase target){
		if (!target.worldObj.isRemote){
			target.setHealth(14.0F);
			target.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 50, 3));
			target.isBurning();
		}
		return false;
		
	}
	@Override
	@SideOnly(Side.CLIENT)

	public void registerIcons(IconRegister iconRegister){
	    itemIcon = iconRegister.registerIcon("bc_mod:" + (this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1)));;
		}
	}
