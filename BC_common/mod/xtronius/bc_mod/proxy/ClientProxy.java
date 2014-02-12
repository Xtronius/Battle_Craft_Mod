package mod.xtronius.bc_mod.proxy;

import mod.xtronius.bc_mod.bc_mod;
import mod.xtronius.bc_mod.blocks.Misc.Misc;
import mod.xtronius.bc_mod.client.render.entity.BaseModel;
import mod.xtronius.bc_mod.client.render.entity.RenderWaterBolt;
import mod.xtronius.bc_mod.entity.projectile.EntityBaseMagic;
import mod.xtronius.bc_mod.items.Misc.IMisc;
import mod.xtronius.bc_mod.renderer.RenderItemBaseStaff;
import mod.xtronius.bc_mod.renderer.RenderItemPlaqueDiamondSword;
//import mod.xtronius.bc_mod.renderer.RenderCustomBlocks;
import mod.xtronius.bc_mod.renderer.RenderItemSifterPipe;
import mod.xtronius.bc_mod.renderer.RenderItemSifterVentalator;
import mod.xtronius.bc_mod.renderer.RenderPlaqueDiamondSword;
import mod.xtronius.bc_mod.renderer.RenderSifterPipe;
import mod.xtronius.bc_mod.renderer.RenderSifterVentalator;
import mod.xtronius.bc_mod.renderer.RenderSifterVentalator2;
import mod.xtronius.bc_mod.tileEntity.TileEntityBlockPlaqueDiamondSword;
import mod.xtronius.bc_mod.tileEntity.TileEntitySifterPipe;
import mod.xtronius.bc_mod.tileEntity.TileEntitySifterVentalator;
import mod.xtronius.bc_mod.tileEntity.TileEntitySifterVentalator2;
import mod.xtronius.bc_mod.tileEntity.Model.ModelPipe;
import net.minecraft.entity.EntityList;
import net.minecraft.item.Item;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;

/**
 * BC_Mod
 * 
 * ClientProxy
 * 
 * @author xtronius
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class ClientProxy extends CommonProxy {
	 public static int renderBCFenceID;
	 static int startEntityId = 345;
	 @Override
	 public void registerRenderInformation()
	  {
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySifterPipe.class, new RenderSifterPipe());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySifterVentalator.class, new RenderSifterVentalator());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySifterVentalator2.class, new RenderSifterVentalator2());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlockPlaqueDiamondSword.class, new RenderPlaqueDiamondSword());
		MinecraftForgeClient.registerItemRenderer(Misc.SifterPipe.blockID, new RenderItemSifterPipe());
		MinecraftForgeClient.registerItemRenderer(Misc.SifterVentalator.blockID, new RenderItemSifterVentalator());
		MinecraftForgeClient.registerItemRenderer(Misc.BlockPlaqueDiamondSword.blockID, new RenderItemPlaqueDiamondSword());
		 MinecraftForgeClient.registerItemRenderer(IMisc.itemStaff.itemID, (IItemRenderer)new RenderItemBaseStaff());
		
		EntityRegistry.registerModEntity(EntityBaseMagic.class, "BaseMagic", this.getUniqueEntityId(), bc_mod.instance, 80, 1, true);
		RenderingRegistry.instance().registerEntityRenderingHandler(EntityBaseMagic.class, new RenderWaterBolt());
	    RenderingRegistry.registerEntityRenderingHandler(EntityBaseMagic.class, new RenderWaterBolt());
		// EntityRegistry.registerGlobalEntityID(EntityBaseMagic.class, "Magic", EntityRegistry.findGlobalUniqueEntityId());
		 //RenderingRegistry.registerEntityRenderingHandler(EntityBaseMagic.class, new RenderBaseMagic(0.5F));
	    //renderBCFenceID = RenderingRegistry.getNextAvailableRenderId();
	   // RenderingRegistry.registerBlockHandler(renderBCFenceID, new RenderCustomBlocks());
	  }
	 @Override
	 public void initSounds(){
		 
	 }
	 public static int getUniqueEntityId()
	    {
	        do
	        {
	            startEntityId++;
	        }
	        while (EntityList.getStringFromID(startEntityId) != null);

	        return startEntityId;
	    }
}
