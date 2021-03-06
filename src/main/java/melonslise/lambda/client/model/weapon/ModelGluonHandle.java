package melonslise.lambda.client.model.weapon;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

public class ModelGluonHandle extends ModelBase
{
	ModelRenderer shape1, shape2, shape3, shape4, shape5, shape6, shape7, shape8, shape9;

	public ModelGluonHandle()
	{
		this.shape1 = new ModelRenderer(this, 23, 13);
		this.shape1.addBox(0F, 0F, 0F, 2, 2, 3);
		this.shape1.setRotationPoint(0F, 0F, 0F);
		this.shape1.setTextureSize(64, 32);
		this.shape1.mirror = true;
		this.setRotation(shape1, 0F, 0F, 0.4363323F);
		this.shape2 = new ModelRenderer(this, 34, 14);
		this.shape2.addBox(0F, 0F, 0F, 1, 1, 2);
		this.shape2.setRotationPoint(0.2F, 0.6F, 2.5F);
		this.shape2.setTextureSize(64, 32);
		this.shape2.mirror = true;
		this.setRotation(shape2, 0F, 0F, 0.4363323F);
		this.shape3 = new ModelRenderer(this, 25, 20);
		this.shape3.addBox(0F, 0F, 0F, 3, 1, 0);
		this.shape3.setRotationPoint(1F, 1F, 2.5F);
		this.shape3.setTextureSize(64, 32);
		this.shape3.mirror = true;
		this.setRotation(shape3, 0F, 0F, 0F);
		this.shape4 = new ModelRenderer(this, 26, 10);
		this.shape4.addBox(0F, 0F, 0F, 1, 2, 0);
		this.shape4.setRotationPoint(0F, -1F, 2.5F);
		this.shape4.setTextureSize(64, 32);
		this.shape4.mirror = true;
		this.setRotation(shape4, 0F, 0F, 0F);
		this.shape5 = new ModelRenderer(this, 16, 11);
		this.shape5.addBox(-0.5F, 0F, 0F, 2, 1, 1);
		this.shape5.setRotationPoint(-1F, 0.2F, 1.6F);
		this.shape5.setTextureSize(64, 32);
		this.shape5.mirror = true;
		this.setRotation(shape5, 0F, 0F, 0.1745329F);
		this.shape6 = new ModelRenderer(this, 41, 14);
		this.shape6.addBox(0F, 0F, 0F, 2, 2, 1);
		this.shape6.setRotationPoint(0F, 0F, 4F);
		this.shape6.setTextureSize(64, 32);
		this.shape6.mirror = true;
		this.setRotation(shape6, -0.1745329F, 0F, 0.4363323F);
		this.shape7 = new ModelRenderer(this, 34, 20);
		this.shape7.addBox(0F, 0F, 0F, 1, 1, 2);
		this.shape7.setRotationPoint(0F, 1F, 4.7F);
		this.shape7.setTextureSize(64, 32);
		this.shape7.mirror = true;
		this.setRotation(shape7, -0.4886922F, 0F, 0.1745329F);
		this.shape8 = new ModelRenderer(this, 34, 20);
		this.shape8.addBox(0F, 0F, 0F, 1, 1, 2);
		this.shape8.setRotationPoint(0F, 1.8F, 6F);
		this.shape8.setTextureSize(64, 32);
		this.shape8.mirror = true;
		this.setRotation(shape8, -0.0174533F, 0F, 0.4363323F);
		this.shape9 = new ModelRenderer(this, 14, 14);
		this.shape9.addBox(0F, 0F, 0F, 1, 1, 3);
		this.shape9.setRotationPoint(0.2F, 0.6F, -0.2F);
		this.shape9.setTextureSize(64, 32);
		this.shape9.mirror = true;
		this.setRotation(shape9, 0F, 0F, 0.4363323F);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void render(Entity entity, float swing, float swingAmount, float age, float yaw, float pitch, float scale)
	{
		super.render(entity, swing, swingAmount, age, yaw, pitch, scale);
		shape1.render(scale);
		shape2.render(scale);
		shape3.render(scale);
		shape4.render(scale);
		shape5.render(scale);
		shape6.render(scale);
		shape7.render(scale);
		shape8.render(scale);
		shape9.render(scale);
	}

	public void render(ItemStack stack, float partialTick, float scale)
	{
		shape1.render(scale);
		shape2.render(scale);
		shape3.render(scale);
		shape4.render(scale);
		shape5.render(scale);
		shape6.render(scale);
		shape7.render(scale);
		shape8.render(scale);
		shape9.render(scale);
	}
}