package mod.xtronius.bc_mod.items.Misc;

import java.util.Random;

import mod.xtronius.bc_mod.handlers.EnumBCToolMaterial;
import mod.xtronius.bc_mod.positions.SavedLocation;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;

import com.google.common.collect.Multimap;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemTpSword extends ItemSword
{
    
	private float weaponDamage;
    private final EnumToolMaterial toolMaterial;
    int itemDamage;
    int durrability;

    private SavedLocation location = null;

	protected Random rand = new Random();

	private EntityPlayer player;
    public static double x;
    public static double y;
    public static double z;
    
    public static double xPos;
    public static double yPos;
    public static double zPos;
    
    public static double xEPos;
    public static double yEPos;
    public static double zEPos;

    public ItemTpSword(int par1, EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1, par2EnumToolMaterial);
        this.toolMaterial = par2EnumToolMaterial;
        this.maxStackSize = 1;
        this.setMaxDamage(getDurrability());
        //getDurrability();
        this.weaponDamage = 0F + par2EnumToolMaterial.getDamageVsEntity();
        this.setUnlocalizedName("tpSword");
    }
    private int getDurrability() {
    	
    	if(this.toolMaterial == EnumToolMaterial.WOOD) {
    		return 118;
    	}
    	if(this.toolMaterial == EnumToolMaterial.STONE) {
    		return 262;
    	}
    	if(this.toolMaterial == EnumToolMaterial.IRON) {
    		return 500;
    	}
    	if(this.toolMaterial == EnumToolMaterial.GOLD) {
    		return 64;
    	}
    	if(this.toolMaterial == EnumToolMaterial.EMERALD) {
    		return 3122;
    	}
    	if(this.toolMaterial == EnumBCToolMaterial.ENDER) {
    		return 2854;
    	} else {
		return durrability;
    	}
	}
	public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5)
    {
        if (location != null)
        {
            if (par1ItemStack.stackTagCompound == null)
            {
                par1ItemStack.setTagCompound(new NBTTagCompound());
            }

            if (!par1ItemStack.stackTagCompound.hasKey("ench"))
            {
                par1ItemStack.stackTagCompound.setTag("gegy", new NBTTagList("gegy"));
            }

            NBTTagList var3 = (NBTTagList)par1ItemStack.stackTagCompound.getTag("gegy");
            NBTTagCompound var4 = new NBTTagCompound();
            var4.setDouble("tpX", location._x);
            var4.setDouble("tpY", location._y);
            var4.setDouble("tpZ", location._z);
            var3.appendTag(var4);
        }
    }

    private void savetpPosition(ItemStack par1ItemStack,
                                EntityPlayer par3EntityPlayer)
    {
        if (par1ItemStack.stackTagCompound == null)
        {
            par1ItemStack.setTagCompound(new NBTTagCompound());
        }

        if (!par1ItemStack.stackTagCompound.hasKey("tpPosition"))
        {
            par1ItemStack.stackTagCompound.setTag("tpPosition", new NBTTagList("tpPosition"));
        }

        NBTTagList tpPositionTagList = (NBTTagList)par1ItemStack.stackTagCompound.getTag("tpPosition");
        NBTTagCompound tpPositionTag = new NBTTagCompound();
        tpPositionTag.setDouble("x", par3EntityPlayer.posX);
        tpPositionTag.setDouble("y", par3EntityPlayer.posY);
        tpPositionTag.setDouble("z", par3EntityPlayer.posZ);
        tpPositionTagList.appendTag(tpPositionTag);
    }

    private boolean hasSavedPosition(ItemStack par1ItemStack)
    {
        return par1ItemStack.stackTagCompound != null && par1ItemStack.stackTagCompound.hasKey("tpPosition");
    }

    @Override
    @SideOnly(Side.CLIENT)

    public void registerIcons(IconRegister iconRegister){
        itemIcon = iconRegister.registerIcon("bc_mod:" + (this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1)));;
    	}
    
    public static void readtpPosition(ItemStack par1ItemStack, Entity par3Entity)
    {
        NBTTagList tpPositionTagList = (NBTTagList)par1ItemStack.stackTagCompound.getTag("tpPosition");
        NBTTagCompound tpPositionTag = (NBTTagCompound) tpPositionTagList.tagAt(0);
        x = tpPositionTag.getDouble("x");
        y = tpPositionTag.getDouble("y");
        z = tpPositionTag.getDouble("z");
    }

    public float func_82803_g()
    {
        return this.toolMaterial.getDamageVsEntity();
    }

    /**
     * Returns the strength of the stack against a given block. 1.0F base, (Quality+1)*2 if correct blocktype, 1.5F if
     * sword
     */
    public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
    {
        if (par2Block.blockID == Block.web.blockID)
        {
            return 15.0F;
        }
        else
        {
            Material material = par2Block.blockMaterial;
            return material != Material.plants && material != Material.vine && material != Material.coral && material != Material.leaves && material != Material.pumpkin ? 1.0F : 1.5F;
        }
    }

    /**
     * Current implementations of this method in child classes do not use the entry argument beside ev. They just raise
     * the damage on the stack.
     */
    
    public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase)
    {
        if (this.hasSavedPosition(par1ItemStack))
        {
        	xEPos = par2EntityLivingBase.posX;
        	yEPos = par2EntityLivingBase.posY;
        	zEPos = par2EntityLivingBase.posZ;
            readtpPosition(par1ItemStack, par2EntityLivingBase);
            for (int i = 0; i < 48; ++i)
            {
            	par2EntityLivingBase.worldObj.spawnParticle("portal", this.xEPos, this.yEPos + this.rand.nextDouble() * 2.0D, this.zEPos, this.rand.nextGaussian(), this.rand.nextGaussian(), this.rand.nextGaussian());
            	//this.worldObj.spawnParticle("portal", this.posX, this.posY + this.rand.nextDouble() * 2.0D, this.posZ, this.rand.nextGaussian(), 0.0D, this.rand.nextGaussian());
            }
            par2EntityLivingBase.worldObj.playSoundAtEntity(par2EntityLivingBase, "mob.endermen.portal", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
            par2EntityLivingBase.setPosition(x, y, z);
            par2EntityLivingBase.worldObj.playSoundAtEntity(par2EntityLivingBase, "mob.endermen.portal2", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
            
            
            
        }

        par1ItemStack.damageItem(1, par3EntityLivingBase);
        return true;
    }

    public boolean onBlockDestroyed(ItemStack par1ItemStack, World par2World, int par3, int par4, int par5, int par6, EntityLivingBase par7EntityLivingBase)
    {
        if ((double)Block.blocksList[par3].getBlockHardness(par2World, par4, par5, par6) != 0.0D)
        {
            par1ItemStack.damageItem(2, par7EntityLivingBase);
            this.itemDamage = par1ItemStack.getItemDamage();
        }

        return true;
    }

    @SideOnly(Side.CLIENT)

    /**
     * Returns True is the item is renderer in full 3D when hold.
     */
    public boolean isFull3D()
    {
        return true;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.block;
    }

    /**
     * How long it takes to use or consume an item
     */
    public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 72000;
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
    	this.xPos = par3EntityPlayer.posX;
    	this.yPos = par3EntityPlayer.posY;
    	this.zPos = par3EntityPlayer.posZ;
    	
        if (par3EntityPlayer.isSneaking())
        {
            if (par3EntityPlayer.getClass() != EntityClientPlayerMP.class)
            {
                if (!this.hasSavedPosition(par1ItemStack))
                {
                    this.savetpPosition(par1ItemStack, par3EntityPlayer);
                    par3EntityPlayer.addChatMessage("\u00a7e Succsesfully Set Co-ords To " + "\u00a7f[" + "\u00a7fX: " + (int)xPos + "] " +  "[" + "\u00a7fY: " + (int)yPos +  "] " +  "[" + "\u00a7fZ: " + (int)zPos + "\u00a7f]");
                }
                else
                {
                    par1ItemStack.stackTagCompound.removeTag("tpPosition");
                    this.savetpPosition(par1ItemStack, par3EntityPlayer);
                    par3EntityPlayer.addChatMessage("\u00a7e Succsesfully Set Co-ords To " + "\u00a7f[" + "\u00a7fX: " + (int)xPos + "] " +  "[" + "\u00a7fY: " + (int)yPos +  "] " +  "[" + "\u00a7fZ: " + (int)zPos + "\u00a7f]");
                    
                }
            }
        }
        else
        {
            par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
        }

        return par1ItemStack;
    }

    /**
     * Returns if the item (tool) can harvest results from the block type.
     */
    public boolean canHarvestBlock(Block par1Block)
    {
        return par1Block.blockID == Block.web.blockID;
    }

    /**
     * Return the enchantability factor of the item, most of the time is based on material.
     */
    public int getItemEnchantability()
    {
        return 30;
    }

    /**
     * Return the name for this tool's material.
     */
    public String getToolMaterialName()
    {
        return this.toolMaterial.toString();
    }

    /**
     * Return whether this item is repairable in an anvil.
     */
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        return this.toolMaterial.getToolCraftingMaterial() == par2ItemStack.itemID ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
    }

    /**
     * Gets a map of item attribute modifiers, used by ItemSword to increase hit damage.
     */
    public Multimap getItemAttributeModifiers()
    {
        Multimap multimap = super.getItemAttributeModifiers();
        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", (double)this.weaponDamage, 0));
        return multimap;
    }

    public boolean hasEffect(ItemStack par1ItemStack)
    {
        return true;
    }
    public EnumRarity getRarity(ItemStack par1ItemStack)
    {
        return par1ItemStack.getItemDamage() == 0 ? EnumRarity.rare : EnumRarity.epic;
    }
    
    
}
