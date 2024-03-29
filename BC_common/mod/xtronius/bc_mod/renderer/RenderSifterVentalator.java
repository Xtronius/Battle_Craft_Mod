package mod.xtronius.bc_mod.renderer;

import mod.xtronius.bc_mod.lib.Reference;
import mod.xtronius.bc_mod.tileEntity.Model.ModelSifterVentalator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public class RenderSifterVentalator extends TileEntitySpecialRenderer{
	
	
	    
	    
	    
	private ModelSifterVentalator model;
	private  static final ResourceLocation texture = new ResourceLocation(Reference.MOD_Gui, "textures/modelTextureMaps/ModelSifterVentalatorTextureMap.png");
	
	public RenderSifterVentalator(){
		this.model = new ModelSifterVentalator();
	}
	
	
	@Override
	public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f) {
		
	    
        
		GL11.glPushMatrix();
		GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
		GL11.glRotatef(180F, 0F, 0F, 1F);
		int i = tileentity.getBlockMetadata();
		
		short short1 = 0;

		if (i == 2)
        {
            short1 = 360;
        }

        if (i == 3)
        {
            short1 = 180;
        }

        if (i == 4)
        {
            short1 = -90;
        }

        if (i == 5)
        {
            short1 = 90;
        }
        GL11.glRotatef((float)short1, 0.0F, 1.0F, 0.0F);
        
        
		
		this.bindTexture(texture);
		GL11.glPushMatrix();
		this.model.renderModel(0.0625F);
		GL11.glPopMatrix();
		GL11.glPopMatrix();
	}
	

}

