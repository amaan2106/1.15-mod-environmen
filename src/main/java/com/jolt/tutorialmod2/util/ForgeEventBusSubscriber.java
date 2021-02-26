package com.jolt.tutorialmod2.util;

import com.jolt.tutorialmod2.TutorialMod;

import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.world.RegisterDimensionsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = Bus.FORGE)
	public class ForgeEventBusSubscriber {

		@SubscribeEvent
		public static void registerDimensions(final RegisterDimensionsEvent event) {
			if (DimensionType.byName(TutorialMod.EXAMPLE_DIM_TYPE) == null) {
			}
			TutorialMod.LOGGER.info("Dimensions Registered!");
		}
	}

