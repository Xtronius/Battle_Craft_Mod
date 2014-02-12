package mod.xtronius.bc_mod.items.Misc;

import java.util.LinkedList;
import java.util.List;

import mod.xtronius.bc_mod.blocks.Misc.Misc;
import mod.xtronius.bc_mod.creativetab.CreativeTab;
import mod.xtronius.bc_mod.util.BCPlayer;
import mod.xtronius.bc_mod.util.StackUtil;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatMessageComponent;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemMetalPostPlacer extends Item {

	public int currentColorInt;
	public String currentColorString;
	public String currentTexture;
	public String mode;
	
	public int par4;
	public int par5;
	public int par6;
	public int par7;
	public float par8;
	public float par9;
	public float par10;
	
	

	public ItemMetalPostPlacer(int id) {
		super(id);
		this.setCreativeTab(CreativeTab.tabsBC_ModSpecialItemsAndBlocks);
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List list,
			boolean par4) {
		super.addInformation(stack, player, list, par4);

		NBTTagCompound nbtData = StackUtil.getOrCreateNbtData(stack);
		switch (nbtData.getInteger("currentColor")) {
		case 0:
			mode = "White";
			break;
		case 1:
			mode = "Orange";
			break;
		case 2:
			mode = "Magenta";
			break;
		case 3:
			mode = "Light Blue";
			break;
		case 4:
			mode = "Yellow";
			break;
		case 5:
			mode = "Lime reen";
			break;
		case 6:
			mode = "Pink";
			break;
		case 7:
			mode = "Gray";
			break;
		case 8:
			mode = "Light Gray";
			break;
		case 9:
			mode = "Cyan";
			break;
		case 10:
			mode = "Violet";
			break;
		case 11:
			mode = "Blue";
			break;
		case 12:
			mode = "Brown";
			break;
		case 13:
			mode = "Green";
			break;
		case 14:
			mode = "Red";
			break;
		case 15:
			mode = "Black";
			break;
		default:
			return;
		}

		list.add(" \u00a7e [Shift-Right-Click] To Switch Colors");
		list.add(" \u00a7f Current Color: " + mode);
	}

	public List<String> getHudInfo(ItemStack itemStack) {
		List info = new LinkedList();

		NBTTagCompound nbtData = StackUtil.getOrCreateNbtData(itemStack);
		String mode = getModeString(nbtData.getInteger("currentColor"));

		info.addAll(StackUtil.getHudInfo(itemStack));
		info.add(" \u00a7e [Shift-Right-Click] To Switch Colors");
		info.add(" \u00a7f Current Color: " + mode);

		return info;
	}

	public boolean onItemUseFirst(ItemStack itemstack, EntityPlayer player,
			World world, int x, int y, int z, int side, float hitX, float hitY,
			float hitZ) {
		NBTTagCompound nbtData = StackUtil.getOrCreateNbtData(itemstack);
		return false;
	}

	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world,
			int par4, int par5, int par6, int par7, float par8, float par9,
			float par10) {
		
		this.par4 = par4;
		this.par5 = par5;
		this.par6 = par6;
		this.par7 = par7;
		this.par8 = par8;
		this.par9 = par9;
		this.par10 = par10;
		
		if (player.isSneaking()) {
			switchColor(player, stack);
		} else {
			placeBlock(world, player, stack, par4, par5, par6, par7, par8, par9, par10);
		}
		return true;
	}

	public void registerIcons(IconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("bc_mod:"
				+ (this.getUnlocalizedName().substring(this
						.getUnlocalizedName().indexOf(".") + 1)));
	}

	private String getModeString(int mode) {
		switch (mode) {
		case 0:
			return "bc_mod.tooltip.mode.white";
		case 1:
			return "bc_mod.tooltip.mode.orange";
		case 2:
			return "bc_mod.tooltip.mode.magenta";
		case 3:
			return "bc_mod.tooltip.mode.lightblue";
		case 4:
			return "bc_mod.tooltip.mode.yellow";
		case 5:
			return "bc_mod.tooltip.mode.limegreen";
		case 6:
			return "bc_mod.tooltip.mode.pink";
		case 7:
			return "bc_mod.tooltip.mode.gray";
		case 8:
			return "bc_mod.tooltip.mode.lightgray";
		case 9:
			return "bc_mod.tooltip.mode.cyan";
		case 10:
			return "bc_mod.tooltip.mode.violet";
		case 11:
			return "bc_mod.tooltip.mode.blue";
		case 12:
			return "bc_mod.tooltip.mode.brown";
		case 13:
			return "bc_mod.tooltip.mode.green";
		case 14:
			return "bc_mod.tooltip.mode.red";
		case 15:
			return "bc_mod.tooltip.mode.black";
		case 16:
			return "bc_mod.tooltip.mode.white";
		}
		return "";
	}

	public void switchColor(EntityPlayer player, ItemStack stack) {
		NBTTagCompound nbtData = StackUtil.getOrCreateNbtData(stack);

		int currentColorInt = nbtData.getInteger("currentColor");

		currentColorInt = (currentColorInt + 1) % 16;
		nbtData.setInteger("currentColor", currentColorInt);
		System.out.println(currentColorInt);

		if (nbtData.getInteger("currentColor") == 0) {
			currentColorString = " \u00a7f White";
		} else if (nbtData.getInteger("currentColor") == 1) {
			currentColorString = " \u00a76 Orange";
		} else if (nbtData.getInteger("currentColor") == 2) {
			currentColorString = " \u00a7d Magenta";
		} else if (nbtData.getInteger("currentColor") == 3) {
			currentColorString = " \u00a79 Light Blue";
		} else if (nbtData.getInteger("currentColor") == 4) {
			currentColorString = " \u00a7e Yellow";
		} else if (nbtData.getInteger("currentColor") == 5) {
			currentColorString = " \u00a7a Lime Green";
		} else if (nbtData.getInteger("currentColor") == 6) {
			currentColorString = " \u00a7d Pink";
		} else if (nbtData.getInteger("currentColor") == 7) {
			currentColorString = " \u00a78 Gray";
		} else if (nbtData.getInteger("currentColor") == 8) {
			currentColorString = " \u00a77 Light Gray";
		} else if (nbtData.getInteger("currentColor") == 9) {
			currentColorString = " \u00a7b Cyan";
		} else if (nbtData.getInteger("currentColor") == 10) {
			currentColorString = " \u00a7d Violet";
		} else if (nbtData.getInteger("currentColor") == 11) {
			currentColorString = " \u00a71 Blue";
		} else if (nbtData.getInteger("currentColor") == 12) {
			currentColorString = " \u00a76 Brown";
		} else if (nbtData.getInteger("currentColor") == 13) {
			currentColorString = " \u00a7a Green";
		} else if (nbtData.getInteger("currentColor") == 14) {
			currentColorString = " \u00a74 Red";
		} else if (nbtData.getInteger("currentColor") == 15) {
			currentColorString = " \u00a70 Black";
		}
		BCPlayer.messagePlayer(player, this.currentColorString, new Object[0]);
		for(int i = 0; i < 10; i++) {
			System.out.println(currentColorString);
			System.out.println(currentColorString);
		}
	}

	public void placeBlock(World world, EntityPlayer player, ItemStack stack,
			int par4, int par5, int par6, int par7, float par8, float par9,
			float par10) {
		NBTTagCompound nbtData = StackUtil.getOrCreateNbtData(stack);
		
		par4 = this.par4;
		par5 = this.par5;
		par6 = this.par6;
		par7 = this.par7;
		par8 = this.par8;
		par9 = this.par9;
		par10 = this.par10;
		
		int i1 = world.getBlockId(par4, par5, par6);
		int j1 = world.getBlockMetadata(par4, par5, par6);

		if (i1 != 0) {
			if (par7 == 0) {
				--par5;
			}

			if (par7 == 1) {
				++par5;
			}

			if (par7 == 2) {
				--par6;
			}

			if (par7 == 3) {
				++par6;
			}

			if (par7 == 4) {
				--par4;
			}

			if (par7 == 5) {
				++par4;
			}

			if (world.isAirBlock(par4, par5, par6)) {
				int k1 = Block.blocksList[Misc.FenceIron.blockID]
						.onBlockPlaced(world, par4, par5, par6, par7, par8,
								par9, par10, nbtData.getInteger("currentColor"));
				
				world.setBlock(par4, par5, par6, Misc.FenceIron.blockID, k1, 2);

				if (!player.capabilities.isCreativeMode) {
					--stack.stackSize;
				}
			}
		}
	}
}
