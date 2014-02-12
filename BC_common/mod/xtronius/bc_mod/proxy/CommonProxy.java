package mod.xtronius.bc_mod.proxy;

import mod.xtronius.bc_mod.entity.projectile.EntityBaseMagic;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;


/**
 * ExtraFoodsMod
 * 
 * CommonProxy
 * 
 * @author xtronius
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class CommonProxy {
	public void registerRenderInformation()
	  {
	    EntityRegistry.registerGlobalEntityID(EntityBaseMagic.class, "Magic", EntityRegistry.findGlobalUniqueEntityId());
	   // RenderingRegistry.registerEntityRenderingHandler(EntityBaseMagic.class, new RenderBaseMagic(0.0F));
	  }
	public void initSounds() {
		
	}

}
