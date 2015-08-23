package assets.toughertools.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelToolTable extends ModelBase
{
  //fields
    ModelRenderer Base;
    ModelRenderer Leg1;
    ModelRenderer Leg2;
    ModelRenderer Head;
    ModelRenderer Leg3;
    ModelRenderer Leg4;
  
  public ModelToolTable()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Base = new ModelRenderer(this, 0, 0);
      Base.addBox(0F, 0F, 0F, 12, 2, 12);
      Base.setRotationPoint(-5F, 22F, -6F);
      Base.setTextureSize(64, 64);
      Base.mirror = true;
      setRotation(Base, 0F, 0F, 0F);

      Leg1 = new ModelRenderer(this, 0, 43);
      Leg1.addBox(0F, 0F, 0F, 2, 7, 2);
      Leg1.setRotationPoint(-4F, 16F, 3F);
      Leg1.setTextureSize(64, 64);
      Leg1.mirror = true;
      setRotation(Leg1, 0F, 0F, 0F);

      Leg2 = new ModelRenderer(this, 0, 43);
      Leg2.addBox(0F, 0F, 0F, 2, 7, 2);
      Leg2.setRotationPoint(-4F, 16F, -5F);
      Leg2.setTextureSize(64, 64);
      Leg2.mirror = true;
      setRotation(Leg2, 0F, 0F, 0F);

      Head = new ModelRenderer(this, 0, 14);
      Head.addBox(0F, 0F, 0F, 12, 4, 18);
      Head.setRotationPoint(-5F, 12F, -9F);
      Head.setTextureSize(64, 64);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);

      Leg3 = new ModelRenderer(this, 0, 43);
      Leg3.addBox(0F, 0F, 0F, 2, 7, 2);
      Leg3.setRotationPoint(4F, 16F, -5F);
      Leg3.setTextureSize(64, 64);
      Leg3.mirror = true;
      setRotation(Leg3, 0F, 0F, 0F);

      Leg4 = new ModelRenderer(this, 0, 43);
      Leg4.addBox(0F, 0F, 0F, 2, 7, 2);
      Leg4.setRotationPoint(4F, 16F, 3F);
      Leg4.setTextureSize(64, 64);
      Leg4.mirror = true;
      setRotation(Leg4, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Base.render(f5);
    Leg1.render(f5);
    Leg2.render(f5);
    Head.render(f5);
    Leg3.render(f5);
    Leg4.render(f5);
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

  public void renderModel(Float f){
    Base.render(f);
    Leg1.render(f);
    Leg2.render(f);
    Head.render(f);
    Leg3.render(f);
    Leg4.render(f);
  }
}
