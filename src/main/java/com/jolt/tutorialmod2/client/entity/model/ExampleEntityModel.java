package com.jolt.tutorialmod2.client.entity.model;

import com.jolt.tutorialmod2.common.entities.ExampleEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;




public class ExampleEntityModel extends AnimatedEntityModel<ExampleEntity> {
	private final ModelRenderer body;
	private final ModelRenderer rotation;
	private final ModelRenderer penguin;
	private final ModelRenderer Legs;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;
	private final ModelRenderer Head;
	private final ModelRenderer Wings;
	private final ModelRenderer right_wing;
	private final ModelRenderer left_wing;
	private final ModelRenderer beak;

	public ExampleEntityModel() {
		textureWidth = 32;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 16.0F, 0.0F);
		

		rotation = new ModelRenderer(this);
		rotation.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(rotation);
		

		penguin = new ModelRenderer(this);
		penguin.setRotationPoint(0.0F, 0.0F, 0.0F);
		rotation.addChild(penguin);
		

		Legs = new ModelRenderer(this);
		Legs.setRotationPoint(0.0F, 0.0F, 0.0F);
		penguin.addChild(Legs);
		

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(0.0F, 0.0F, 0.0F);
		Legs.addChild(left_leg);
		left_leg.setTextureOffset(0, 1).addBox(0.0F, 8.0F, 2.0F, 1.0F, 0.0F, 1.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(0.0F, 0.0F, 0.0F);
		Legs.addChild(right_leg);
		right_leg.setTextureOffset(0, 0).addBox(-3.0F, 8.0F, 2.0F, 1.0F, 0.0F, 1.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		penguin.addChild(Head);
		Head.setTextureOffset(0, 1).addBox(-4.0F, 1.0F, -2.0F, 6.0F, 3.0F, 4.0F, 0.0F, false);
		Head.setTextureOffset(2, 4).addBox(-3.0F, 0.0F, 1.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(2, 4).addBox(-3.0F, 0.0F, -2.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 4).addBox(-4.0F, 0.0F, -1.0F, 6.0F, 1.0F, 2.0F, 0.0F, false);
		Head.setTextureOffset(0, 3).addBox(-4.0F, 4.0F, -2.0F, 6.0F, 4.0F, 4.0F, 0.0F, false);

		Wings = new ModelRenderer(this);
		Wings.setRotationPoint(0.0F, 0.0F, 0.0F);
		penguin.addChild(Wings);
		

		right_wing = new ModelRenderer(this);
		right_wing.setRotationPoint(0.0F, 0.0F, 0.0F);
		Wings.addChild(right_wing);
		right_wing.setTextureOffset(0, 12).addBox(-5.0F, 3.0F, -1.0F, 1.0F, 5.0F, 2.0F, 0.0F, false);

		left_wing = new ModelRenderer(this);
		left_wing.setRotationPoint(0.0F, 0.0F, 0.0F);
		Wings.addChild(left_wing);
		left_wing.setTextureOffset(0, 12).addBox(2.0F, 3.0F, -1.0F, 1.0F, 5.0F, 2.0F, 0.0F, true);

		beak = new ModelRenderer(this);
		beak.setRotationPoint(0.0F, 0.0F, 0.0F);
		penguin.addChild(beak);
		beak.setTextureOffset(4, 12).addBox(-2.0F, 3.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
	}

	

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public ResourceLocation getAnimationFileLocation() {
		// TODO Auto-generated method stub
		return null;
	}
}