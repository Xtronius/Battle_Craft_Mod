package mod.xtronius.bc_mod.items.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelItemBaseStaff extends ModelBase
{
  //fields
    ModelRenderer ShapeA;
    ModelRenderer ShapeB;
    ModelRenderer ShapeC;
    ModelRenderer ShapeD;
    ModelRenderer ShapeE;
    ModelRenderer ShapeF;
    ModelRenderer ShapeG;
    ModelRenderer ShapeH;
    ModelRenderer ShapeI;
    ModelRenderer ShapeJ;
    ModelRenderer ShapeK;
    public static ModelRenderer ShapeL;
    public static ModelRenderer ShapeM;
  
  public ModelItemBaseStaff()
  {
    textureWidth = 512;
    textureHeight = 512;
    
      ShapeA = new ModelRenderer(this, 5, 0);
      ShapeA.addBox(0F, -1F, 0F, 2, 7, 2);
      ShapeA.setRotationPoint(-1F, 18F, -1F);
      ShapeA.setTextureSize(512, 512);
      ShapeA.mirror = true;
      setRotation(ShapeA, 0F, 0F, 0F);
      ShapeB = new ModelRenderer(this, 60, 0);
      ShapeB.addBox(0F, 0F, 0F, 2, 5, 2);
      ShapeB.setRotationPoint(-1F, 8F, -1F);
      ShapeB.setTextureSize(512, 512);
      ShapeB.mirror = true;
      setRotation(ShapeB, 0F, 0F, 0F);
      ShapeC = new ModelRenderer(this, 110, 0);
      ShapeC.addBox(0F, 0F, 0F, 4, 4, 4);
      ShapeC.setRotationPoint(-2F, 13F, -2F);
      ShapeC.setTextureSize(512, 512);
      ShapeC.mirror = true;
      setRotation(ShapeC, 0F, 0F, 0F);
      ShapeD = new ModelRenderer(this, 160, 0);
      ShapeD.addBox(0F, 0F, 0F, 4, 4, 4);
      ShapeD.setRotationPoint(-2F, 4F, -2F);
      ShapeD.setTextureSize(512, 512);
      ShapeD.mirror = true;
      setRotation(ShapeD, 0F, 0F, 0F);
      ShapeE = new ModelRenderer(this, 210, 0);
      ShapeE.addBox(0F, 0F, 0F, 2, 8, 2);
      ShapeE.setRotationPoint(-1F, -4F, -1F);
      ShapeE.setTextureSize(512, 512);
      ShapeE.mirror = true;
      setRotation(ShapeE, 0F, 0F, 0F);
      ShapeF = new ModelRenderer(this, 260, 0);
      ShapeF.addBox(0F, 0F, 0F, 4, 1, 4);
      ShapeF.setRotationPoint(-2F, -5F, -2F);
      ShapeF.setTextureSize(512, 512);
      ShapeF.mirror = true;
      setRotation(ShapeF, 0F, 0F, 0F);
      ShapeG = new ModelRenderer(this, 310, 0);
      ShapeG.addBox(0F, 0F, 0F, 6, 1, 6);
      ShapeG.setRotationPoint(-3F, -6F, -3F);
      ShapeG.setTextureSize(512, 512);
      ShapeG.mirror = true;
      setRotation(ShapeG, 0F, 0F, 0F);
      ShapeH = new ModelRenderer(this, 360, 0);
      ShapeH.addBox(-2F, -2F, -2F, 4, 4, 4);
      ShapeH.setRotationPoint(0F, -9.5F, 0F);
      ShapeH.setTextureSize(512, 512);
      ShapeH.mirror = true;
      setRotation(ShapeH, 0.7853982F, 0.7853982F, 0.6108652F);
      ShapeI = new ModelRenderer(this, 410, 0);
      ShapeI.addBox(0F, 0F, 0F, 6, 2, 2);
      ShapeI.setRotationPoint(-3F, -15F, -1F);
      ShapeI.setTextureSize(512, 512);
      ShapeI.mirror = true;
      setRotation(ShapeI, 0F, 0F, 0F);
      ShapeJ = new ModelRenderer(this, 452, 0);
      ShapeJ.addBox(0F, 0F, 0F, 2, 6, 2);
      ShapeJ.setRotationPoint(-5F, -21F, -1F);
      ShapeJ.setTextureSize(512, 512);
      ShapeJ.mirror = true;
      setRotation(ShapeJ, 0F, 0F, 0F);
      ShapeK = new ModelRenderer(this, 0, 50);
      ShapeK.addBox(0F, 0F, 0F, 6, 2, 2);
      ShapeK.setRotationPoint(-3F, -23F, -1F);
      ShapeK.setTextureSize(512, 512);
      ShapeK.mirror = true;
      setRotation(ShapeK, 0F, 0F, 0F);
      ShapeL = new ModelRenderer(this, 42, 50);
      ShapeL.addBox(-1F, -1F, -1F, 2, 2, 2);
      ShapeL.setRotationPoint(3.5F, -18F, 0F);
      ShapeL.setTextureSize(512, 512);
      ShapeL.mirror = true;
      setRotation(ShapeL, 0F, 0F, 0F);
      ShapeM = new ModelRenderer(this, 92, 50);
      ShapeM.addBox(-1F, -1F, -1F, 2, 2, 2);
      ShapeM.setRotationPoint(3.5F, -18F, 0F);
      ShapeM.setTextureSize(512, 512);
      ShapeM.mirror = true;
      setRotation(ShapeM, 0.7853982F, 0.7853982F, 0.7853982F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    ShapeA.render(f5);
    ShapeB.render(f5);
    ShapeC.render(f5);
    ShapeD.render(f5);
    ShapeE.render(f5);
    ShapeF.render(f5);
    ShapeG.render(f5);
    ShapeH.render(f5);
    ShapeI.render(f5);
    ShapeJ.render(f5);
    ShapeK.render(f5);
    ShapeL.render(f5);
    ShapeM.render(f5);
  }
  
  public void renderModel(float f){
	  	ShapeA.render(f);
	    ShapeB.render(f);
	    ShapeC.render(f);
	    ShapeD.render(f);
	    ShapeE.render(f);
	    ShapeF.render(f);
	    ShapeG.render(f);
	    ShapeH.render(f);
	    ShapeI.render(f);
	    ShapeJ.render(f);
	    ShapeK.render(f);
	    ShapeL.render(f);
	    ShapeM.render(f); 
}
  
  
  
  public static void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
