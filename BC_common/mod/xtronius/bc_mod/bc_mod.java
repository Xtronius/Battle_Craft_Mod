package mod.xtronius.bc_mod;


import mod.xtronius.bc_mod.blocks.Gem.*;
import mod.xtronius.bc_mod.blocks.GuiBlock.*;
import mod.xtronius.bc_mod.blocks.Metal.*;
import mod.xtronius.bc_mod.blocks.Misc.*;
import mod.xtronius.bc_mod.blocks.Special.*;
import mod.xtronius.bc_mod.blocks.ids.BlockIDs;
import mod.xtronius.bc_mod.creativetab.*;
import mod.xtronius.bc_mod.handlers.*;
import mod.xtronius.bc_mod.items.Gem.*;
import mod.xtronius.bc_mod.items.Metal.*;
import mod.xtronius.bc_mod.items.Misc.*;
import mod.xtronius.bc_mod.items.Special.*;
import mod.xtronius.bc_mod.items.ids.*;
import mod.xtronius.bc_mod.lib.*;
import mod.xtronius.bc_mod.proxy.*;
import mod.xtronius.bc_mod.tileEntity.*;
import mod.xtronius.bc_mod.world.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * bc_mod
 * 
 * bc_mod
 * 
 * @author xtronius
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class bc_mod {
	
	@Instance(Reference.MOD_ID)
	public static bc_mod instance;
	
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	public static BCLanguageRegistry LanguageReg;
	public static BCBlockRegistry BlockReg;
	public static BCBlockInitializer bcblockinitializer;
	public static BCIDHandler bcconfigidhandler;
	//public static BCCreativeTabsInitializer bccreativetabinitializer;
	
	EventManager eventmanager = new EventManager();
	
	
    /***
     * This is code that is executed prior to your mod being initialized into of Minecraft
     * Examples of code that could be run here;
     * 
     * Initializing your items/blocks (you must do this here)
     * Setting up your own custom logger for writing log data to
     * Loading your language translations for your mod (if your mod has translations for other languages)
     * Registering your mod's key bindings and sounds
     * 
     * @param event The Forge ModLoader pre-initialization event
     */
	@EventHandler
    public void preInit(FMLPreInitializationEvent event) {
		
		BCIDHandler.RegConfigIDs(event);
		new EnumBCToolMaterial();
		new BCBlockInitializer();
		new BCItemInitializer();
		
    }   
    /***
     * This is code that is executed when your mod is being initialized in Minecraft
     * Examples of code that could be run here;
     * 
     * Registering your GUI Handler
     * Registering your different event listeners
     * Registering your different tile entities
     * Adding in any recipes you have 
     * 
     * @param event The Forge ModLoader initialization event
     */
	@EventHandler
	public void init(FMLInitializationEvent event) {

		BCBlockRegistry.BlockReg();
		BCLanguageRegistry.LanguageReg();
		GameRegistry.registerWorldGenerator(eventmanager);
		NetworkRegistry.instance().registerGuiHandler(this, new GuiHandler());
		//new BCCreativeTabsInitializer();
	}
    	
    /***
     * This is code that is executed after all mods are initialized in Minecraft
     * This is a good place to execute code that interacts with other mods (ie, loads an addon module
     * of your mod if you find a particular mod).
     * 
     * @param event The Forge ModLoader post-initialization event
     */
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	proxy.registerRenderInformation();
    	proxy.initSounds();
    }
    
    public bc_mod() {}

}

