package mod.xtronius.bc_mod.tileEntity.Model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPipe extends ModelBase
{
  //fields
    ModelRenderer BPadFront;
    ModelRenderer BPadBack;
    ModelRenderer BPadRight;
    ModelRenderer BPadLeft;
    ModelRenderer ShaftPanelBack;
    ModelRenderer ShaftPanelFront;
    ModelRenderer ShaftPanelLeft;
    ModelRenderer ShaftPanelRight;
    ModelRenderer TPadBack;
    ModelRenderer TPadFront;
    ModelRenderer TPadRight;
    ModelRenderer TPadLeft;
    ModelRenderer ShaftPanelCoverFront;
    ModelRenderer ShaftPanelCoverBack;
    ModelRenderer ShaftPanelCoverRight;
    ModelRenderer ShaftPanelCoverLeft;
  
  public ModelPipe()
  {
    textureWidth = 512;
    textureHeight = 512;
    
      BPadFront = new ModelRenderer(this, 0, 0);
      BPadFront.addBox(-3F, 0F, 0F, 4, 1, 2);
      BPadFront.setRotationPoint(1F, 23F, -4F);
      BPadFront.setTextureSize(64, 32);
      BPadFront.mirror = true;
      setRotation(BPadFront, 0F, 0F, 0F);
      BPadBack = new ModelRenderer(this, 50, 0);
      BPadBack.addBox(0F, 0F, 0F, 4, 1, 2);
      BPadBack.setRotationPoint(-2F, 23F, 2F);
      BPadBack.setTextureSize(64, 32);
      BPadBack.mirror = true;
      setRotation(BPadBack, 0F, 0F, 0F);
      BPadRight = new ModelRenderer(this, 100, 0);
      BPadRight.addBox(0F, 0F, 0F, 2, 1, 8);
      BPadRight.setRotationPoint(2F, 23F, -4F);
      BPadRight.setTextureSize(64, 32);
      BPadRight.mirror = true;
      setRotation(BPadRight, 0F, 0F, 0F);
      BPadLeft = new ModelRenderer(this, 150, 0);
      BPadLeft.addBox(0F, 0F, 0F, 2, 1, 8);
      BPadLeft.setRotationPoint(-4F, 23F, -4F);
      BPadLeft.setTextureSize(64, 32);
      BPadLeft.mirror = true;
      setRotation(BPadLeft, 0F, 0F, 0F);
      ShaftPanelBack = new ModelRenderer(this, 200, 0);
      ShaftPanelBack.addBox(0F, 0F, 0F, 4, 8, 1);
      ShaftPanelBack.setRotationPoint(-2F, 16F, 1F);
      ShaftPanelBack.setTextureSize(64, 32);
      ShaftPanelBack.mirror = true;
      setRotation(ShaftPanelBack, 0F, 0F, 0F);
      ShaftPanelFront = new ModelRenderer(this, 250, 0);
      ShaftPanelFront.addBox(0F, 0F, 0F, 4, 8, 1);
      ShaftPanelFront.setRotationPoint(-2F, 16F, -2F);
      ShaftPanelFront.setTextureSize(64, 32);
      ShaftPanelFront.mirror = true;
      setRotation(ShaftPanelFront, 0F, 0F, 0F);
      ShaftPanelLeft = new ModelRenderer(this, 300, 0);
      ShaftPanelLeft.addBox(0F, 0F, 0F, 1, 8, 2);
      ShaftPanelLeft.setRotationPoint(-2F, 16F, -1F);
      ShaftPanelLeft.setTextureSize(64, 32);
      ShaftPanelLeft.mirror = true;
      setRotation(ShaftPanelLeft, 0F, 0F, 0F);
      ShaftPanelRight = new ModelRenderer(this, 350, 0);
      ShaftPanelRight.addBox(0F, 0F, 0F, 1, 8, 2);
      ShaftPanelRight.setRotationPoint(1F, 16F, -1F);
      ShaftPanelRight.setTextureSize(64, 32);
      ShaftPanelRight.mirror = true;
      setRotation(ShaftPanelRight, 0F, 0F, 0F);
      TPadBack = new ModelRenderer(this, 0, 50);
      TPadBack.addBox(0F, 0F, 0F, 4, 1, 2);
      TPadBack.setRotationPoint(-2F, 16F, 2F);
      TPadBack.setTextureSize(64, 32);
      TPadBack.mirror = true;
      setRotation(TPadBack, 0F, 0F, 0F);
      TPadFront = new ModelRenderer(this, 50, 50);
      TPadFront.addBox(0F, 0F, 0F, 4, 1, 2);
      TPadFront.setRotationPoint(-2F, 16F, -4F);
      TPadFront.setTextureSize(64, 32);
      TPadFront.mirror = true;
      setRotation(TPadFront, 0F, 0F, 0F);
      TPadRight = new ModelRenderer(this, 100, 50);
      TPadRight.addBox(0F, 0F, 0F, 2, 1, 8);
      TPadRight.setRotationPoint(2F, 16F, -4F);
      TPadRight.setTextureSize(64, 32);
      TPadRight.mirror = true;
      setRotation(TPadRight, 0F, 0F, 0F);
      TPadLeft = new ModelRenderer(this, 150, 50);
      TPadLeft.addBox(0F, 0F, 0F, 2, 1, 8);
      TPadLeft.setRotationPoint(-4F, 16F, -4F);
      TPadLeft.setTextureSize(64, 32);
      TPadLeft.mirror = true;
      setRotation(TPadLeft, 0F, 0F, 0F);
      ShaftPanelCoverFront = new ModelRenderer(this, 400, 0);
      ShaftPanelCoverFront.addBox(0F, 0F, 0F, 2, 4, 1);
      ShaftPanelCoverFront.setRotationPoint(-1F, 18F, -2.5F);
      ShaftPanelCoverFront.setTextureSize(64, 32);
      ShaftPanelCoverFront.mirror = true;
      setRotation(ShaftPanelCoverFront, 0F, 0F, 0F);
      ShaftPanelCoverBack = new ModelRenderer(this, 450, 0);
      ShaftPanelCoverBack.addBox(0F, 0F, 0F, 2, 4, 1);
      ShaftPanelCoverBack.setRotationPoint(-1F, 18F, 1.5F);
      ShaftPanelCoverBack.setTextureSize(64, 32);
      ShaftPanelCoverBack.mirror = true;
      setRotation(ShaftPanelCoverBack, 0F, 0F, 0F);
      ShaftPanelCoverRight = new ModelRenderer(this, 500, 0);
      ShaftPanelCoverRight.addBox(0F, 0F, 0F, 1, 4, 2);
      ShaftPanelCoverRight.setRotationPoint(1.5F, 18F, -1F);
      ShaftPanelCoverRight.setTextureSize(64, 32);
      ShaftPanelCoverRight.mirror = true;
      setRotation(ShaftPanelCoverRight, 0F, 0F, 0F);
      ShaftPanelCoverLeft = new ModelRenderer(this, 0, 100);
      ShaftPanelCoverLeft.addBox(0F, 0F, 0F, 1, 4, 2);
      ShaftPanelCoverLeft.setRotationPoint(-2.5F, 18F, -1F);
      ShaftPanelCoverLeft.setTextureSize(64, 32);
      ShaftPanelCoverLeft.mirror = true;
      setRotation(ShaftPanelCoverLeft, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    BPadFront.render(f5);
    BPadBack.render(f5);
    BPadRight.render(f5);
    BPadLeft.render(f5);
    ShaftPanelBack.render(f5);
    ShaftPanelFront.render(f5);
    ShaftPanelLeft.render(f5);
    ShaftPanelRight.render(f5);
    TPadBack.render(f5);
    TPadFront.render(f5);
    TPadRight.render(f5);
    TPadLeft.render(f5);
    ShaftPanelCoverFront.render(f5);
    ShaftPanelCoverBack.render(f5);
    ShaftPanelCoverRight.render(f5);
    ShaftPanelCoverLeft.render(f5);
  }
  
  public void renderModel(float f){
	  BPadFront.render(f);
	  BPadBack.render(f);
	  BPadRight.render(f);
	  BPadLeft.render(f);
	  ShaftPanelBack.render(f);
	  ShaftPanelFront.render(f);
	  ShaftPanelLeft.render(f);
	  ShaftPanelRight.render(f);
	  TPadBack.render(f);
	  TPadFront.render(f);
	  TPadRight.render(f);
	  TPadLeft.render(f);
	  ShaftPanelCoverFront.render(f);
	  ShaftPanelCoverBack.render(f);
	  ShaftPanelCoverRight.render(f);
	  ShaftPanelCoverLeft.render(f);
}
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
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
