package mod.xtronius.bc_mod.renderer;

import org.lwjgl.Sys;
import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;
import mod.xtronius.bc_mod.items.Misc.ItemBaseStaff;
import mod.xtronius.bc_mod.items.model.ModelItemBaseStaff;
import mod.xtronius.bc_mod.lib.Reference;
import mod.xtronius.bc_mod.tileEntity.TileEntitySifterPipe;
import mod.xtronius.bc_mod.tileEntity.TileEntitySifterVentalator;
import mod.xtronius.bc_mod.tileEntity.TileEntitySifterVentalator2;
import mod.xtronius.bc_mod.tileEntity.Model.ModelPipe;
import mod.xtronius.bc_mod.tileEntity.Model.ModelSifterVentalator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;

public class RenderItemBaseStaff implements IItemRenderer{

	public int intBuffer = 0;
	//public int intBuffer2 = 0;
	//public int intBuffer3 = 0;
	//public int intBuffer4 = 0;
	//public int intBuffer5 = 0;

	public boolean booleanBuffer = false;
	public boolean booleanBuffer2 = false;
	public boolean booleanBuffer3 = false;
	public boolean booleanBuffer4 = false;
	public boolean booleanBuffer5 = false;
	
	public ModelItemBaseStaff model; 
	private  static final ResourceLocation texture = new ResourceLocation(Reference.MOD_Gui, "textures/modelTextureMaps/ModelBaseStaff_TextureMap_1.png");
	
	public RenderItemBaseStaff(){
		model = new ModelItemBaseStaff();
	}
	
	@Override
	public boolean handleRenderType(ItemStack stack, IItemRenderer.ItemRenderType type)
    {
        switch (type)
        {
            case EQUIPPED:
                return true;

            case EQUIPPED_FIRST_PERSON:
                return true;

            case INVENTORY:
                return true;

            case ENTITY:
                return true;

            default:
                return false;
        }
    }

    public boolean shouldUseRenderHelper(IItemRenderer.ItemRenderType var1, ItemStack var2, IItemRenderer.ItemRendererHelper var3)
    {
        return true;
    }

    public void renderWand(ItemRenderType type)
    {
    	float rotationAngleT = Sys.getTime() / 359F % 360F;
    	float rotationAngleB = Sys.getTime() / -359F % -360F;
    	ModelItemBaseStaff.setRotation(ModelItemBaseStaff.ShapeL, rotationAngleT, rotationAngleT, rotationAngleT);
    	ModelItemBaseStaff.setRotation(ModelItemBaseStaff.ShapeM, rotationAngleB, rotationAngleB, rotationAngleB);
    	
        GL11.glPushMatrix();
        Minecraft.getMinecraft().renderEngine.bindTexture(texture);

        if (type == ItemRenderType.EQUIPPED)
        {
            float scale = 2F;
            GL11.glScalef(scale, scale, scale);
            GL11.glTranslatef(0.4F, 0.3F, 0.4F);
            GL11.glRotatef(180, 0, 1, 0);
            GL11.glRotatef(200, 1, 0, 0);
            GL11.glRotatef(25, 0, 0, 1);
            GL11.glRotatef(-30, 0, 1, 0);
        }
        else if (type == ItemRenderType.EQUIPPED_FIRST_PERSON)
        {
        	if(ItemBaseStaff.isCharging){
        	
        	
        	float scale = 2F;
             GL11.glScalef(scale, scale, scale);
             GL11.glRotatef(160 - intBuffer, 0, 1F, 0);
             GL11.glRotatef(185 - intBuffer, 1F, 0, 0);
             GL11.glRotatef(10, 0, 0, 1F);
             GL11.glTranslatef(-1.25F, -0.15F, -0.0F);
             //Sys.getTime() / 40F % 360F
           
             if(booleanBuffer == false) {
        		intBuffer++; 
        		if(intBuffer >= 10) {
        			//booleanBuffer2 = true;
        			booleanBuffer = true;
        		}
        			
             } else if(booleanBuffer2 == true) {
            	 
            	if(booleanBuffer == false){
            	 GL11.glRotatef(+5, 0, 1F, 0);
                 GL11.glRotatef(+5, 1F, 0, 0);
                 booleanBuffer = true;
            	}else if(booleanBuffer == true) {
                 GL11.glRotatef(+5, 0, 1F, 0);
                 GL11.glRotatef(+5, 1F, 0, 0);
                 booleanBuffer = false;
            	}
            	 
             }
         		
        	}else{
        		
				if (ItemBaseStaff.isDischarging) {
					
					float scale = 2F;
		             GL11.glScalef(scale, scale, scale);
		             GL11.glRotatef(160 - intBuffer, 0, 1F, 0);
		             GL11.glRotatef(185 - intBuffer, 1F, 0, 0);
		             GL11.glRotatef(10, 0, 0, 1F);
		             GL11.glTranslatef(-1.25F, -0.15F, -0.0F);
		             
					if (intBuffer >= 1) {
						System.out.println(intBuffer);
						intBuffer--;
						if (intBuffer <= 0) {
							
							booleanBuffer4 = true;
							booleanBuffer = false;
							booleanBuffer2 = false;
						}
					}  
				} else {
        	intBuffer = 0;
            float scale = 2F;
            GL11.glScalef(scale, scale, scale);
            GL11.glRotatef(160, 0, 1F, 0);
            GL11.glRotatef(185, 1F, 0, 0);
            GL11.glRotatef(10, 0, 0, 1F);
            GL11.glTranslatef(-1.25F, -0.15F, -0.0F);
        	}
        	}
        }
        else if (type == ItemRenderType.INVENTORY)
        {
            float scale = 0.65F;
            GL11.glScalef(scale, scale, scale);
            GL11.glRotatef(180, 1F, 0F, 0F);
            GL11.glRotatef(Sys.getTime() / 25F % 360F, 0F, 1F, 0F);
            GL11.glRotatef(25, 0F, 0F, 1F);
        }
        else if (type == ItemRenderType.ENTITY)
        {
//            GL11.glTranslatef(0.0F, 0.0F, 0F);
//            GL11.glScalef(2.0F, 2.0F, 2.0F);
//            GL11.glRotatef(Sys.getTime() / 40F % 360F, 0F, 1F, 0F);
        	//GL11.glScalef(scale, scale, scale);
        	GL11.glTranslatef(0F, 1.5F, 0F);
            GL11.glRotatef(180, 1F, 0F, 0F);
            GL11.glRotatef(Sys.getTime() / 25F % 360F, 0F, 1F, 0F);
            GL11.glRotatef(25, 0F, 0F, 1F);
            
        }

        //model.renderAll();
        this.model.renderModel(0.0625F);
        GL11.glPopMatrix();
        //GL11.glRotatef(angle, x, y, z);
    }
    public void renderItem(IItemRenderer.ItemRenderType type, ItemStack var2, Object ... data)
    {
        switch (type)
        {
            case EQUIPPED:
                this.renderWand(type);
                break;

            case INVENTORY:
                this.renderWand(type);
                break;

            case EQUIPPED_FIRST_PERSON:
                this.renderWand(type);
                break;

            case ENTITY:
                this.renderWand(type);
                break;

            default:
        }
    }
}
