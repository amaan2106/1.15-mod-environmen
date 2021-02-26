package com.jolt.tutorialmod2.core.init;

import com.jolt.tutorialmod2.TutorialMod;


import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<> (ForgeRegistries.BLOCKS, 
			TutorialMod.MOD_ID);
	
	public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block", () -> new Block(
			Block.Properties.create(Material.IRON).hardnessAndResistance(0.5f, 15.0f).sound(SoundType.SAND)));
}		





