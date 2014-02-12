package mod.xtronius.bc_mod.client.render.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;



public class BaseModel extends ModelBase
{
	ModelRenderer Front;
    ModelRenderer Middle;
    ModelRenderer Tip;
    ModelRenderer End;

  public BaseModel()
  {
	  textureWidth = 64;
	    textureHeight = 64;
	    
	      Front = new ModelRenderer(this, 2, 6);
	      Front.addBox(-2F, -2F, -6F, 4, 4, 6);
	      Front.setRotationPoint(0F, 0F, 0F);
	      Front.setTextureSize(64, 64);
	      Front.mirror = true;
	      setRotation(Front, 0F, 0F, 0F);
	      Middle = new ModelRenderer(this, 2, 18);
	      Middle.addBox(-1F, -1F, 0F, 2, 2, 2);
	      Middle.setRotationPoint(0F, 0F, 0F);
	      Middle.setTextureSize(64, 64);
	      Middle.mirror = true;
	      setRotation(Middle, 0F, 0F, 0F);
	      Tip = new ModelRenderer(this, 2, 2);
	      Tip.addBox(-1F, -1F, -1F, 2, 2, 1);
	      Tip.setRotationPoint(0F, 0F, -6F);
	      Tip.setTextureSize(64, 64);
	      Tip.mirror = true;
	      setRotation(Tip, 0F, 0F, 0F);
	      End = new ModelRenderer(this, 2, 24);
	      End.addBox(-2F, -2F, 0F, 4, 4, 1);
	      End.setRotationPoint(0F, 0F, 2F);
	      End.setTextureSize(64, 64);
	      End.mirror = true;
	      setRotation(End, 0F, 0F, 0F);
  }

  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
	  super.render(entity, f, f1, f2, f3, f4, f5);
	    setRotationAngles(f, f1, f2, f3, f4, f5);
	    Front.render(f5);
	    Middle.render(f5);
	    Tip.render(f5);
	    End.render(f5);
  }

  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
	  model.rotateAngleX = x;
	  model.rotateAngleY = y;
	  model.rotateAngleZ = z;
  }

  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
	  super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
  }
}