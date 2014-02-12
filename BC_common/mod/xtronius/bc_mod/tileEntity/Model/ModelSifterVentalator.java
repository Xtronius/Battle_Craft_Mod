package mod.xtronius.bc_mod.tileEntity.Model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSifterVentalator extends ModelBase
{
  //fields
    ModelRenderer BlockBottomWall;
    ModelRenderer BlockTopWall;
    ModelRenderer BlockLeftWall;
    ModelRenderer BlockRightWall;
    ModelRenderer FrontVent1;
    ModelRenderer FrontVent2;
    ModelRenderer FrontVent3;
    ModelRenderer FrontVent4;
    ModelRenderer FrontVent5;
    ModelRenderer BackPanel;
    ModelRenderer BackPanel2;
  
  public ModelSifterVentalator()
  {
    textureWidth = 512;
    textureHeight = 512;
    
      BlockBottomWall = new ModelRenderer(this, 0, 0);
      BlockBottomWall.addBox(0F, 0F, 0F, 16, 1, 16);
      BlockBottomWall.setRotationPoint(-8F, 23F, -8F);
      BlockBottomWall.setTextureSize(512, 512);
      BlockBottomWall.mirror = true;
      setRotation(BlockBottomWall, 0F, 0F, 0F);
      BlockTopWall = new ModelRenderer(this, 100, 0);
      BlockTopWall.addBox(0F, 0F, 0F, 16, 1, 16);
      BlockTopWall.setRotationPoint(-8F, 8F, -8F);
      BlockTopWall.setTextureSize(512, 512);
      BlockTopWall.mirror = true;
      setRotation(BlockTopWall, 0F, 0F, 0F);
      BlockLeftWall = new ModelRenderer(this, 200, 0);
      BlockLeftWall.addBox(0F, 0F, 0F, 1, 14, 16);
      BlockLeftWall.setRotationPoint(-8F, 9F, -8F);
      BlockLeftWall.setTextureSize(512, 512);
      BlockLeftWall.mirror = true;
      setRotation(BlockLeftWall, 0F, 0F, 0F);
      BlockRightWall = new ModelRenderer(this, 300, 0);
      BlockRightWall.addBox(0F, 0F, 0F, 1, 14, 16);
      BlockRightWall.setRotationPoint(7F, 9F, -8F);
      BlockRightWall.setTextureSize(512, 512);
      BlockRightWall.mirror = true;
      setRotation(BlockRightWall, 0F, 0F, 0F);
      FrontVent1 = new ModelRenderer(this, 400, 0);
      FrontVent1.addBox(0F, 0F, 0F, 14, 3, 0);
      FrontVent1.setRotationPoint(-7F, 8F, -8F);
      FrontVent1.setTextureSize(512, 512);
      FrontVent1.mirror = true;
      setRotation(FrontVent1, 0.7853982F, 0F, 0F);
      FrontVent2 = new ModelRenderer(this, 0, 100);
      FrontVent2.addBox(0F, 0F, 0F, 14, 3, 0);
      FrontVent2.setRotationPoint(-7F, 14F, -8F);
      FrontVent2.setTextureSize(512, 512);
      FrontVent2.mirror = true;
      setRotation(FrontVent2, 0.7853982F, 0F, 0F);
      FrontVent3 = new ModelRenderer(this, 100, 100);
      FrontVent3.addBox(0F, 0F, 0F, 14, 3, 0);
      FrontVent3.setRotationPoint(-7F, 11F, -8F);
      FrontVent3.setTextureSize(512, 512);
      FrontVent3.mirror = true;
      setRotation(FrontVent3, 0.7853982F, 0F, 0F);
      FrontVent4 = new ModelRenderer(this, 200, 100);
      FrontVent4.addBox(0F, 0F, 0F, 14, 3, 0);
      FrontVent4.setRotationPoint(-7F, 17F, -8F);
      FrontVent4.setTextureSize(512, 512);
      FrontVent4.mirror = true;
      setRotation(FrontVent4, 0.7853982F, 0F, 0F);
      FrontVent5 = new ModelRenderer(this, 300, 100);
      FrontVent5.addBox(0F, 0F, 0F, 14, 3, 0);
      FrontVent5.setRotationPoint(-7F, 20F, -8F);
      FrontVent5.setTextureSize(512, 512);
      FrontVent5.mirror = true;
      setRotation(FrontVent5, 0.7853982F, 0F, 0F);
      BackPanel = new ModelRenderer(this, 400, 100);
      BackPanel.addBox(0F, 0F, 0F, 1, 21, 1);
      BackPanel.setRotationPoint(7F, 8F, 6F);
      BackPanel.setTextureSize(512, 512);
      BackPanel.mirror = true;
      setRotation(BackPanel, 0F, 0F, 0.7853982F);
      BackPanel2 = new ModelRenderer(this, 500, 0);
      BackPanel2.addBox(0F, 0F, 0F, 1, 21, 1);
      BackPanel2.setRotationPoint(-8F, 9F, 6F);
      BackPanel2.setTextureSize(512, 512);
      BackPanel2.mirror = true;
      setRotation(BackPanel2, 0F, 0F, -0.7853982F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    BlockBottomWall.render(f5);
    BlockTopWall.render(f5);
    BlockLeftWall.render(f5);
    BlockRightWall.render(f5);
    FrontVent1.render(f5);
    FrontVent2.render(f5);
    FrontVent3.render(f5);
    FrontVent4.render(f5);
    FrontVent5.render(f5);
    BackPanel.render(f5);
    BackPanel2.render(f5);
  }
  
  public void renderModel(float f){
	  BlockBottomWall.render(f);
	    BlockTopWall.render(f);
	    BlockLeftWall.render(f);
	    BlockRightWall.render(f);
	    FrontVent1.render(f);
	    FrontVent2.render(f);
	    FrontVent3.render(f);
	    FrontVent4.render(f);
	    FrontVent5.render(f);
	    BackPanel.render(f);
	    BackPanel2.render(f); 
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
