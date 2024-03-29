package mod.xtronius.bc_mod.renderer;

import org.lwjgl.opengl.GL11;

import mod.xtronius.bc_mod.bc_mod;
import mod.xtronius.bc_mod.lib.Reference;
import mod.xtronius.bc_mod.tileEntity.Model.ModelPipe;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RenderSifterPipe extends TileEntitySpecialRenderer{
	
	
	private ModelPipe model;
	private  static final ResourceLocation texture = new ResourceLocation(Reference.MOD_Gui, "textures/modelTextureMaps/ModelPipeTextureMap 2.png");
	
	public RenderSifterPipe(){
		this.model = new ModelPipe();
	}
	@Override
	public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f) {
		
		GL11.glPushMatrix();
		GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
		GL11.glRotatef(180F, 0F, 0F, 1F);
		
		this.bindTexture(texture);
		GL11.glPushMatrix();
		this.model.renderModel(0.0625F);
		GL11.glPopMatrix();
		GL11.glPopMatrix();
	}
	

}

