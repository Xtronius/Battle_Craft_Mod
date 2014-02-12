package mod.xtronius.bc_mod.renderer;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;
import mod.xtronius.bc_mod.lib.Reference;
import mod.xtronius.bc_mod.tileEntity.TileEntitySifterPipe;
import mod.xtronius.bc_mod.tileEntity.TileEntitySifterVentalator;
import mod.xtronius.bc_mod.tileEntity.TileEntitySifterVentalator2;
import mod.xtronius.bc_mod.tileEntity.Model.ModelPipe;
import mod.xtronius.bc_mod.tileEntity.Model.ModelSifterVentalator;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;

public class RenderItemSifterVentalator implements IItemRenderer{

	public ModelSifterVentalator model; 
	private  static final ResourceLocation texture = new ResourceLocation(Reference.MOD_Gui, "textures/modelTextureMaps/ModelSifterVentalatorTextureMap.png");
	
	public RenderItemSifterVentalator(){
		model = new ModelSifterVentalator();
	}
	
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
	return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
			ItemRendererHelper helper) {
	return true;
	}

	@Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {

        switch (type) {
            case ENTITY: {
            	renderSifterVentalator(0F, 0F, 0F);
                break;
            }
            case EQUIPPED: {
            	renderSifterVentalator(0F, 0F, 0F);
                break;
            }
            case EQUIPPED_FIRST_PERSON: {
            	renderSifterVentalator(0F, 0F, 0F);
                break;
            }
            case INVENTORY: {
            	renderSifterVentalator(0.0F, -0.075F, 0.0F);
                break;
            }
            default:
                break;
        }
    }
	private void renderSifterVentalator(float x, float y, float z) {

        GL11.glPushMatrix();
        GL11.glDisable(GL11.GL_LIGHTING);

        // Scale, Translate, Rotate
        GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
        GL11.glRotatef(180, 1, 0, 0);
        GL11.glRotatef(-90, 0, 1, 0);
        // Bind texture
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(texture);

        // Render
        this.model.renderModel(0.0625F);

        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glPopMatrix();
    }
}
