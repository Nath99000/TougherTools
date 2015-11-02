package com.nath99000.toughertools.Entity.Render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelDryad extends ModelBase
{
  //fields
    ModelRenderer rightarmext;
    ModelRenderer leftarmext;
    ModelRenderer leftlegext;
    ModelRenderer rightlegext;
    ModelRenderer shoulders;
    ModelRenderer earleft;
    ModelRenderer earright;
    ModelRenderer armendA;
    ModelRenderer armendB;
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer rightarm;
    ModelRenderer veilend;
    ModelRenderer root;
    ModelRenderer root2;
    ModelRenderer root3;
    ModelRenderer root4;
    ModelRenderer root5;
    ModelRenderer root6;
  
  public ModelDryad()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      rightarmext = new ModelRenderer(this, 0, 36);
      rightarmext.addBox(0F, 0F, 0F, 4, 8, 4);
      rightarmext.setRotationPoint(-8.5F, 7F, 0F);
      rightarmext.setTextureSize(128, 64);
      rightarmext.mirror = true;
      setRotation(rightarmext, -1.003822F, 0F, 0F);
      leftarmext = new ModelRenderer(this, 3, 40);
      leftarmext.addBox(0F, 0F, 0F, 4, 8, 4);
      leftarmext.setRotationPoint(5F, 7F, 1F);
      leftarmext.setTextureSize(128, 64);
      leftarmext.mirror = true;
      setRotation(leftarmext, -1.003822F, 0F, 0F);
      leftlegext = new ModelRenderer(this, 0, 45);
      leftlegext.addBox(0F, 0F, 0F, 4, 9, 5);
      leftlegext.setRotationPoint(1F, 15F, -5F);
      leftlegext.setTextureSize(128, 64);
      leftlegext.mirror = true;
      setRotation(leftlegext, 0.0523599F, 0F, 0F);
      rightlegext = new ModelRenderer(this, 7, 38);
      rightlegext.addBox(0F, 0F, 0F, 4, 9, 5);
      rightlegext.setRotationPoint(-5F, 15F, -5F);
      rightlegext.setTextureSize(128, 64);
      rightlegext.mirror = true;
      setRotation(rightlegext, 0.0523599F, 0F, 0F);
      shoulders = new ModelRenderer(this, 30, 5);
      shoulders.addBox(0F, 0F, 0F, 10, 1, 1);
      shoulders.setRotationPoint(-5F, 0F, 0F);
      shoulders.setTextureSize(128, 64);
      shoulders.mirror = true;
      setRotation(shoulders, 0F, 0F, 0F);
      earleft = new ModelRenderer(this, 0, 0);
      earleft.addBox(0F, 0F, 0F, 0, 7, 1);
      earleft.setRotationPoint(3F, -9F, 6F);
      earleft.setTextureSize(128, 64);
      earleft.mirror = true;
      setRotation(earleft, -0.7504916F, 0.1570796F, 0F);
      earright = new ModelRenderer(this, 0, 0);
      earright.addBox(0F, 0F, 0F, 0, 7, 1);
      earright.setRotationPoint(-3F, -9F, 6F);
      earright.setTextureSize(128, 64);
      earright.mirror = true;
      setRotation(earright, -0.7504916F, -0.1570796F, 0F);
      armendA = new ModelRenderer(this, 43, 39);
    armendA.addBox(0F, 0F, 0F, 4, 3, 2);
    armendA.setRotationPoint(-8.5F, 7.3F, 3F);
    armendA.setTextureSize(128, 64);
    armendA.mirror = true;
      setRotation(armendA, -1.003826F, 0F, 0F);
      armendB = new ModelRenderer(this, 34, 39);
    armendB.addBox(0F, 0F, 0F, 4, 3, 2);
    armendB.setRotationPoint(4.9F, 7.5F, 4F);
    armendB.setTextureSize(128, 64);
    armendB.mirror = true;
      setRotation(armendB, -1.003826F, 0F, 0F);
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -8F, -4F, 7, 8, 8);
      head.setRotationPoint(0.5F, 0F, 0F);
      head.setTextureSize(128, 64);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      body = new ModelRenderer(this, 16, 16);
      body.addBox(-4F, 0F, -2F, 6, 12, 4);
      body.setRotationPoint(1F, 0F, 0F);
      body.setTextureSize(128, 64);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      leftarm = new ModelRenderer(this, 40, 16);
      leftarm.addBox(-1F, -2F, -2F, 2, 8, 2);
      leftarm.setRotationPoint(5F, 2F, 1F);
      leftarm.setTextureSize(128, 64);
      leftarm.mirror = true;
      setRotation(leftarm, 0F, 0F, -0.2974289F);
      rightleg = new ModelRenderer(this, 0, 16);
      rightleg.addBox(-2F, 0F, -2F, 2, 6, 2);
      rightleg.setRotationPoint(-1F, 12F, -0.7F);
      rightleg.setTextureSize(128, 64);
      rightleg.mirror = true;
      setRotation(rightleg, -0.4089656F, 0.2974216F, 0F);
      leftleg = new ModelRenderer(this, 0, 16);
      leftleg.addBox(-2F, 0F, -2F, 2, 6, 2);
      leftleg.setRotationPoint(3F, 12F, 0F);
      leftleg.setTextureSize(128, 64);
      leftleg.mirror = true;
      setRotation(leftleg, -0.4089647F, -0.2974289F, 0F);
      rightarm = new ModelRenderer(this, 40, 16);
      rightarm.addBox(0F, 0F, 0F, 2, 8, 2);
      rightarm.setRotationPoint(-5.1F, 0F, -1F);
      rightarm.setTextureSize(128, 64);
      rightarm.mirror = true;
      setRotation(rightarm, 0F, 0F, 0.2974216F);
      veilend = new ModelRenderer(this, 52, 0);
      veilend.addBox(0F, 0F, 0F, 6, 5, 4);
      veilend.setRotationPoint(-3F, 10F, -2F);
      veilend.setTextureSize(128, 64);
      veilend.mirror = true;
      setRotation(veilend, 0F, 0F, 0F);
      root = new ModelRenderer(this, 9, 45);
      root.addBox(0F, 0F, 0F, 1, 1, 2);
      root.setRotationPoint(2.4F, 23F, -5F);
      root.setTextureSize(128, 64);
      root.mirror = true;
      setRotation(root, 0F, 0F, 0F);
      root2 = new ModelRenderer(this, 9, 45);
      root2.addBox(0F, 0F, 0F, 1, 1, 2);
      root2.setRotationPoint(2F, 23F, 0F);
      root2.setTextureSize(128, 64);
      root2.mirror = true;
      setRotation(root2, 0F, 0F, 0F);
      root3 = new ModelRenderer(this, 9, 45);
      root3.addBox(0F, 0F, 0F, 2, 1, 1);
      root3.setRotationPoint(5F, 23F, -2F);
      root3.setTextureSize(128, 64);
      root3.mirror = true;
      setRotation(root3, 0F, 0F, 0F);
      root4 = new ModelRenderer(this, 9, 45);
      root4.addBox(0F, 0F, 0F, 1, 1, 2);
      root4.setRotationPoint(-5F, 23F, -6F);
      root4.setTextureSize(128, 64);
      root4.mirror = true;
      setRotation(root4, 0F, 0F, 0F);
      root5 = new ModelRenderer(this, 9, 45);
      root5.addBox(0F, 0F, 0F, 2, 1, 1);
      root5.setRotationPoint(-6F, 23F, -1F);
      root5.setTextureSize(128, 64);
      root5.mirror = true;
      setRotation(root5, 0F, 0F, 0F);
      root6 = new ModelRenderer(this, 9, 45);
      root6.addBox(0F, 0F, 0F, 1, 1, 2);
      root6.setRotationPoint(-4F, 23F, -1F);
      root6.setTextureSize(128, 64);
      root6.mirror = true;
      setRotation(root6, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    rightarmext.render(f5);
    leftarmext.render(f5);
    leftlegext.render(f5);
    rightlegext.render(f5);
    shoulders.render(f5);
    earleft.render(f5);
    earright.render(f5);
    armendA.render(f5);
    armendB.render(f5);
    head.render(f5);
    body.render(f5);
    leftarm.render(f5);
    rightleg.render(f5);
    leftleg.render(f5);
    rightarm.render(f5);
    veilend.render(f5);
    root.render(f5);
    root2.render(f5);
    root3.render(f5);
    root4.render(f5);
    root5.render(f5);
    root6.render(f5);
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
    float f6 =(180f /(float)Math.PI);

    //left

    //

    //right

    //

  }

}
