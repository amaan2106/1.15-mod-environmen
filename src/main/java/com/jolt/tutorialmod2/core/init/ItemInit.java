package com.jolt.tutorialmod2.core.init;

import com.jolt.tutorialmod2.TutorialMod;
import com.jolt.tutorialmod2.TutorialMod.TutorialItemGroup;
import com.jolt.tutorialmod2.common.items.SpecialItem;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS,
			TutorialMod.MOD_ID);

	public static final RegistryObject<SpecialItem> DEF_ITEM = ITEMS.register("def_item",
			() -> new SpecialItem(new Item.Properties().group(TutorialItemGroup.instance)));



	public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item",
			() -> new Item(new Item.Properties().group(TutorialItemGroup.instance)));

} 
	
	
	//food
	
	

