package com.jolt.tutorialmod2.client.entity.render;

import com.jolt.tutorialmod2.TutorialMod;
import com.jolt.tutorialmod2.client.entity.model.ExampleEntityModel;
import com.jolt.tutorialmod2.common.entities.ExampleEntity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;







public class ExampleEntityRender extends MobRenderer<ExampleEntity, ExampleEntityModel> {

	protected static final ResourceLocation TEXTURE = new ResourceLocation(TutorialMod.MOD_ID, "textures/entities/example_entity.png");

	public ExampleEntityRender(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new ExampleEntityModel(), 0.5f);
		
	}
	@Override
	public ResourceLocation getEntityTexture(ExampleEntity entity){
		return TEXTURE;
	}
}
