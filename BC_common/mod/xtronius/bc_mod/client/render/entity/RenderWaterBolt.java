package mod.xtronius.bc_mod.client.render.entity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mod.xtronius.bc_mod.entity.projectile.EntityBaseMagic;
import mod.xtronius.bc_mod.entity.projectile.ModelWaterBolt;
import mod.xtronius.bc_mod.lib.Reference;
import mod.xtronius.bc_mod.tileEntity.Model.ModelPlaqueDiamondSword;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

@SideOnly(Side.CLIENT)
public class RenderWaterBolt extends Render
{
    private static final ResourceLocation baseMagicTexture = new ResourceLocation(Reference.MOD_Gui, "textures/modelTextureMaps/ModelWaterBoltTextureMap_1.png");
	public ModelWaterBolt model;

    public RenderWaterBolt() {
    	model = new ModelWaterBolt();
	}

	public void renderBaseMagic(EntityBaseMagic par1Entity, double x, double y, double z, float par8, float par9)
    {
		GL11.glPushMatrix();
        GL11.glTranslatef((float)x, (float)y+0.75f, (float)z);
        
        
        
        float rotateYaw = par1Entity.prevRotationYaw + (par1Entity.rotationYaw - par1Entity.prevRotationYaw) * par9;
        float rotatePitch = par1Entity.prevRotationPitch + (par1Entity.rotationPitch - par1Entity.prevRotationPitch) * par9;
        
        if(!(rotateYaw > 360)) {
        	rotateYaw -= 180;
        }
        if(!(rotatePitch > 360)) {
        	rotatePitch -= 180;
        }
        
        String temp1 = "[Rotation Yaw]";
        String temp2 = "[Rotation Pitch]";
        //System.out.println(temp1 + rotateYaw);
        //System.out.println(temp2 + rotatePitch);
        
        GL11.glRotatef(rotateYaw, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(rotatePitch, 1.0F, 0.0F, 0.0F);
        Tessellator tessellator = Tessellator.instance;
        byte b0 = 0;
        float f2 = 0.0F;
        float f3 = 0.5F;
        float f4 = (float)(0 + b0 * 10) / 32.0F;
        float f5 = (float)(5 + b0 * 10) / 32.0F;
        float f6 = 0.0F;
        float f7 = 0.15625F;
        float f8 = (float)(5 + b0 * 10) / 32.0F;
        float f9 = (float)(10 + b0 * 10) / 32.0F;
        float f10 = (float) 0.5;
        GL11.glEnable(GL12.GL_RESCALE_NORMAL);
        float f11 = (float)par1Entity.arrowShake - par9;

        if (f11 > 0.0F)
        {
            float f12 = -MathHelper.sin(f11 * 3.0F) * f11;
            //GL11.glRotatef(f12, 0.0F, 0.0F, 1.0F);
        }
        //GL11.glRotatef(45.0F, 1.0F, 0.0F, 0.0F);
        GL11.glScalef(f10, f10, f10);
        //GL11.glTranslatef(-3.0F, 0.0F, 0.0F);
        //GL11.glNormal3f(f10, 0.0F, 0.0F);
		this.bindTexture(baseMagicTexture);
		GL11.glPushMatrix();
		this.model.renderModel(0.0625F);
		GL11.glPopMatrix();
		GL11.glPopMatrix();
    }

    protected ResourceLocation getArrowTextures(EntityBaseMagic par1Entity)
    {
        return baseMagicTexture;
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.getArrowTextures((EntityBaseMagic)par1Entity);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderBaseMagic((EntityBaseMagic)par1Entity, par2, par4, par6, par8, par9);
    }
}
