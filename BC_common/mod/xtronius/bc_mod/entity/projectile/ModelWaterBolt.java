package mod.xtronius.bc_mod.entity.projectile;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWaterBolt extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
    ModelRenderer Shape12;
    ModelRenderer Shape13;
    ModelRenderer Shape14;
    ModelRenderer Shape15;
    ModelRenderer Shape16;
    ModelRenderer Shape17;
  
  public ModelWaterBolt()
  {
    textureWidth = 512;
    textureHeight = 512;
    
      Shape1 = new ModelRenderer(this, 5, 0);
      Shape1.addBox(0F, 0F, 0F, 6, 6, 6);
      Shape1.setRotationPoint(-3F, 15F, 0F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 50, 0);
      Shape2.addBox(0F, 0F, 0F, 3, 3, 2);
      Shape2.setRotationPoint(-1.5F, 16.5F, -6F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 100, 0);
      Shape3.addBox(0F, 0F, 0F, 2, 2, 1);
      Shape3.setRotationPoint(-1F, 17F, -7F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 150, 0);
      Shape4.addBox(0F, 0F, 0F, 1, 1, 2);
      Shape4.setRotationPoint(-0.5F, 17.5F, -8.5F);
      Shape4.setTextureSize(64, 32);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 200, 0);
      Shape5.addBox(0F, 0F, 0F, 4, 4, 2);
      Shape5.setRotationPoint(-2F, 16F, -4F);
      Shape5.setTextureSize(64, 32);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 250, 0);
      Shape6.addBox(0F, 0F, 0F, 5, 5, 2);
      Shape6.setRotationPoint(-2.5F, 15.5F, -2F);
      Shape6.setTextureSize(64, 32);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 300, 0);
      Shape7.addBox(0F, 0F, 0F, 5, 5, 1);
      Shape7.setRotationPoint(-2.5F, 15.5F, 6F);
      Shape7.setTextureSize(64, 32);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, 0F);
      Shape8 = new ModelRenderer(this, 350, 0);
      Shape8.addBox(0F, 0F, 0F, 4, 4, 1);
      Shape8.setRotationPoint(-2F, 16F, 7F);
      Shape8.setTextureSize(64, 32);
      Shape8.mirror = true;
      setRotation(Shape8, 0F, 0F, 0F);
      Shape9 = new ModelRenderer(this, 400, 0);
      Shape9.addBox(0F, 0F, 0F, 1, 5, 5);
      Shape9.setRotationPoint(2.5F, 15.5F, 0.5F);
      Shape9.setTextureSize(64, 32);
      Shape9.mirror = true;
      setRotation(Shape9, 0F, 0F, 0F);
      Shape10 = new ModelRenderer(this, 450, 0);
      Shape10.addBox(0F, 0F, 0F, 1, 5, 5);
      Shape10.setRotationPoint(-3.5F, 15.5F, 0.5F);
      Shape10.setTextureSize(64, 32);
      Shape10.mirror = true;
      setRotation(Shape10, 0F, 0F, 0F);
      Shape11 = new ModelRenderer(this, 500, 0);
      Shape11.addBox(0F, 0F, 0F, 2, 2, 1);
      Shape11.setRotationPoint(-1F, 17F, 8F);
      Shape11.setTextureSize(64, 32);
      Shape11.mirror = true;
      setRotation(Shape11, 0F, 0F, 0F);
      Shape12 = new ModelRenderer(this, 0, 50);
      Shape12.addBox(0F, 0F, 0F, 4, 1, 4);
      Shape12.setRotationPoint(-2F, 14.5F, 1F);
      Shape12.setTextureSize(64, 32);
      Shape12.mirror = true;
      setRotation(Shape12, 0F, 0F, 0F);
      Shape13 = new ModelRenderer(this, 50, 50);
      Shape13.addBox(0F, 0F, 0F, 4, 1, 4);
      Shape13.setRotationPoint(-2F, 20.5F, 1F);
      Shape13.setTextureSize(64, 32);
      Shape13.mirror = true;
      setRotation(Shape13, 0F, 0F, 0F);
      Shape14 = new ModelRenderer(this, 100, 50);
      Shape14.addBox(0F, 0F, 0F, 1, 4, 4);
      Shape14.setRotationPoint(3F, 16F, 1F);
      Shape14.setTextureSize(64, 32);
      Shape14.mirror = true;
      setRotation(Shape14, 0F, 0F, 0F);
      Shape15 = new ModelRenderer(this, 150, 50);
      Shape15.addBox(0F, 0F, 0F, 1, 4, 4);
      Shape15.setRotationPoint(-4F, 16F, 1F);
      Shape15.setTextureSize(64, 32);
      Shape15.mirror = true;
      setRotation(Shape15, 0F, 0F, 0F);
      Shape16 = new ModelRenderer(this, 200, 50);
      Shape16.addBox(0F, 0F, 0F, 1, 2, 2);
      Shape16.setRotationPoint(3.5F, 17F, 2F);
      Shape16.setTextureSize(64, 32);
      Shape16.mirror = true;
      setRotation(Shape16, 0F, 0F, 0F);
      Shape17 = new ModelRenderer(this, 250, 50);
      Shape17.addBox(0F, 0F, 0F, 1, 2, 2);
      Shape17.setRotationPoint(-4.5F, 17F, 2F);
      Shape17.setTextureSize(64, 32);
      Shape17.mirror = true;
      setRotation(Shape17, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
    Shape6.render(f5);
    Shape7.render(f5);
    Shape8.render(f5);
    Shape9.render(f5);
    Shape10.render(f5);
    Shape11.render(f5);
    Shape12.render(f5);
    Shape13.render(f5);
    Shape14.render(f5);
    Shape15.render(f5);
    Shape16.render(f5);
    Shape17.render(f5);
  }
  public void renderModel(float f){
	    Shape1.render(f);
	    Shape2.render(f);
	    Shape3.render(f);
	    Shape4.render(f);
	    Shape5.render(f);
	    Shape6.render(f);
	    Shape7.render(f);
	    Shape8.render(f);
	    Shape9.render(f);
	    Shape10.render(f);
	    Shape11.render(f);
	    Shape12.render(f);
	    Shape13.render(f);
	    Shape14.render(f);
	    Shape15.render(f);
	    Shape16.render(f);
	    Shape17.render(f);
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
