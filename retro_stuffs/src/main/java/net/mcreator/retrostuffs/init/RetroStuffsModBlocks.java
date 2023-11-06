
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.retrostuffs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.retrostuffs.block.WeatherSensorBlock;
import net.mcreator.retrostuffs.block.WeatherSensorActivatedBlock;
import net.mcreator.retrostuffs.block.BlueStonePistonAttractiveBlock;
import net.mcreator.retrostuffs.block.BlueStoneOreBlock;
import net.mcreator.retrostuffs.block.BlueStoneOre2Block;
import net.mcreator.retrostuffs.block.BlueStoneBlockBlock;
import net.mcreator.retrostuffs.RetroStuffsMod;

public class RetroStuffsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RetroStuffsMod.MODID);
	public static final RegistryObject<Block> BLUE_STONE_ORE = REGISTRY.register("blue_stone_ore", () -> new BlueStoneOreBlock());
	public static final RegistryObject<Block> BLUE_STONE_ORE_2 = REGISTRY.register("blue_stone_ore_2", () -> new BlueStoneOre2Block());
	public static final RegistryObject<Block> BLUE_STONE_BLOCK = REGISTRY.register("blue_stone_block", () -> new BlueStoneBlockBlock());
	public static final RegistryObject<Block> BLUE_STONE_PISTON_ATTRACTIVE = REGISTRY.register("blue_stone_piston_attractive", () -> new BlueStonePistonAttractiveBlock());
	public static final RegistryObject<Block> WEATHER_SENSOR = REGISTRY.register("weather_sensor", () -> new WeatherSensorBlock());
	public static final RegistryObject<Block> WEATHER_SENSOR_ACTIVATED = REGISTRY.register("weather_sensor_activated", () -> new WeatherSensorActivatedBlock());
}
