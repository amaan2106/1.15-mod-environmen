package com.jolt.tutorialmod2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.jolt.tutorialmod2.core.init.BlockInit;
import com.jolt.tutorialmod2.core.init.ItemInit;
import com.jolt.tutorialmod2.core.init.ModEntityTypes;

import net.minecraft.block.ComposterBlock;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
//import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import software.bernie.geckolib.GeckoLib;


//lololol
//yessirrr
		
		
@SuppressWarnings("deprecation")
@Mod("tutorial")
@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = Bus.MOD)
public class TutorialMod {

	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "tutorial";
	public static TutorialMod instance;
	// public static final WorldType EXAMPLE_WORLDTYPE = new ExampleWorldType();
	public static final ResourceLocation EXAMPLE_DIM_TYPE = new ResourceLocation(MOD_ID, "example");

	public TutorialMod() {
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		modEventBus.addListener(this::setup);

	
		ItemInit.ITEMS.register(modEventBus);
		BlockInit.BLOCKS.register(modEventBus);
		ModEntityTypes.ENTITY_TYPES.register(modEventBus);
		GeckoLib.initialize();

		instance = this;
		MinecraftForge.EVENT_BUS.register(this);
		
	}

	@SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();

		

		LOGGER.debug("Registered  BlockItems!");
	}

	

	private void setup(final FMLCommonSetupEvent event) {
	}

	/*
	 * public static void registerPlacementType(EntityType type,
	 * EntitySpawnPlacementRegistry.PlacementType placementType) {
	 * EntitySpawnPlacementRegistry.register(type, placementType,
	 * Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
	 * MonsterEntity::canMonsterSpawnInLight); }
	 */

	@SubscribeEvent
	public static void onServerStarting(FMLServerStartingEvent event) {

	}

	@SubscribeEvent
	public static void loadCompleteEvent(FMLLoadCompleteEvent event) {
		// This doesnt work anymore
		// TutorialOreGen.generateOre();
	}

	@SubscribeEvent
	public static void onRegisterEntities(final RegistryEvent.Register<EntityType<?>> event) {
		
	}

	public static class TutorialItemGroup extends ItemGroup {
		public static final ItemGroup instance = new TutorialItemGroup(ItemGroup.GROUPS.length, "tutorialtab");

		private TutorialItemGroup(int index, String label) {
			super(index, label);
		}

		@Override
		public ItemStack createIcon() {
			return new ItemStack(BlockInit.EXAMPLE_BLOCK.get());
		}
	}
}
