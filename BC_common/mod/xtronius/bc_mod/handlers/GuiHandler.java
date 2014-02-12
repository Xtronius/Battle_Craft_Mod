package mod.xtronius.bc_mod.handlers;

import mod.xtronius.bc_mod.bc_mod;
import mod.xtronius.bc_mod.Misc.IDs.MiscIDs;
import mod.xtronius.bc_mod.blocks.ids.BlockIDs;
import mod.xtronius.bc_mod.container.ContainerBCFurnace1;
import mod.xtronius.bc_mod.container.ContainerSifterCore;
import mod.xtronius.bc_mod.container.ContainerXPBlock;
import mod.xtronius.bc_mod.container.TestGuiContainer;
import mod.xtronius.bc_mod.gui.GuiBCFurnace1;
import mod.xtronius.bc_mod.gui.GuiSifterCore;
import mod.xtronius.bc_mod.gui.GuiTestGui;
import mod.xtronius.bc_mod.gui.GuiXPBlock;
import mod.xtronius.bc_mod.tileEntity.TileEntityBCFurnace1;
import mod.xtronius.bc_mod.tileEntity.TileEntitySifterCore;
import mod.xtronius.bc_mod.tileEntity.TileEntityTestGui;
import mod.xtronius.bc_mod.tileEntity.TileEntityXPBlock;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

public class GuiHandler implements IGuiHandler {



public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
TileEntity entity = world.getBlockTileEntity(x, y, z);

switch(id) {
case MiscIDs.guiIdTestGui:
if(entity != null){
				if(entity instanceof TileEntityTestGui){
					return new TestGuiContainer(player.inventory, (TileEntityTestGui) entity);
				}
			}
case MiscIDs.guiIdBCFurnace1:
if(entity != null){
				if(entity instanceof TileEntityBCFurnace1){
					return new ContainerBCFurnace1(player.inventory, (TileEntityBCFurnace1) entity);
				}
			}
case MiscIDs.guiIdXPBlock:
if(entity != null){
				if(entity instanceof TileEntityXPBlock){
					return new ContainerXPBlock(player.inventory, (TileEntityXPBlock) entity);
				}
			}
/*case bc_mod.guiIdSifterCore:
if(entity != null){
				if(entity instanceof TileEntitySifterCore){
					return new ContainerSifterCore(player.inventory, (TileEntitySifterCore) entity);
				}
			}*/
		}
	
	return null;
}


public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
TileEntity entity = world.getBlockTileEntity(x, y, z);



switch(id) {
case MiscIDs.guiIdTestGui:
	if(entity != null){
				if(entity instanceof TileEntityTestGui){
					return new GuiTestGui(player.inventory, (TileEntityTestGui) entity);
			}
		}
	
case MiscIDs.guiIdBCFurnace1:
	if(entity != null){
				if(entity instanceof TileEntityBCFurnace1){
					return new GuiBCFurnace1(player.inventory, (TileEntityBCFurnace1) entity);
			}
		}
case MiscIDs.guiIdXPBlock:
	if(entity != null){
				if(entity instanceof TileEntityXPBlock){
					return new GuiXPBlock(player.inventory, (TileEntityXPBlock) entity);
			}
		}
/*case bc_mod.guiIdSifterCore:
	if(entity != null){
				if(entity instanceof TileEntitySifterCore){
					return new GuiSifterCore(player.inventory, (TileEntitySifterCore) entity);
			}
		}*/
	}
	
	return null;
	}
}