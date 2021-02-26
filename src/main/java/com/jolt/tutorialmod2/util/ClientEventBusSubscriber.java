package com.jolt.tutorialmod2.util;

import com.jolt.tutorialmod2.TutorialMod;
import com.jolt.tutorialmod2.client.entity.render.ExampleEntityRender;
import com.jolt.tutorialmod2.core.init.ModEntityTypes;

import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
	public class ClientEventBusSubscriber {

		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
	

		RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.EXAMPLE_ENTITY.get(), ExampleEntityRender::new);

			

			
		}
	}

