
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
import net.mcreator.retrostuffs.block.SignalBlockBlock;
import net.mcreator.retrostuffs.block.Signal9Block;
import net.mcreator.retrostuffs.block.Signal8Block;
import net.mcreator.retrostuffs.block.Signal7Block;
import net.mcreator.retrostuffs.block.Signal6Block;
import net.mcreator.retrostuffs.block.Signal5Block;
import net.mcreator.retrostuffs.block.Signal4Block;
import net.mcreator.retrostuffs.block.Signal3Block;
import net.mcreator.retrostuffs.block.Signal2Block;
import net.mcreator.retrostuffs.block.Signal1Block;
import net.mcreator.retrostuffs.block.Signal15Block;
import net.mcreator.retrostuffs.block.Signal14Block;
import net.mcreator.retrostuffs.block.Signal13Block;
import net.mcreator.retrostuffs.block.Signal12Block;
import net.mcreator.retrostuffs.block.Signal11Block;
import net.mcreator.retrostuffs.block.Signal10Block;
import net.mcreator.retrostuffs.block.Signal0Block;
import net.mcreator.retrostuffs.block.RemoteBlockOnBlock;
import net.mcreator.retrostuffs.block.RemoteBlockOffBlock;
import net.mcreator.retrostuffs.block.PlushBlock;
import net.mcreator.retrostuffs.block.BlueStonePistonAttractiveBlock;
import net.mcreator.retrostuffs.block.BlueStoneOreBlock;
import net.mcreator.retrostuffs.block.BlueStoneOre2Block;
import net.mcreator.retrostuffs.block.BlueStoneBlockBlock;
import net.mcreator.retrostuffs.RetroStuffsMod;

public class RetroStuffsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RetroStuffsMod.MODID);
	public static final RegistryObject<Block> BLUE_STONE_ORE = REGISTRY.register("blue_stone_ore", () -> new BlueStoneOreBlock());
	public static final RegistryObject<Block> BLUE_STONE_BLOCK = REGISTRY.register("blue_stone_block", () -> new BlueStoneBlockBlock());
	public static final RegistryObject<Block> BLUE_STONE_ORE_2 = REGISTRY.register("blue_stone_ore_2", () -> new BlueStoneOre2Block());
	public static final RegistryObject<Block> BLUE_STONE_PISTON_ATTRACTIVE = REGISTRY.register("blue_stone_piston_attractive", () -> new BlueStonePistonAttractiveBlock());
	public static final RegistryObject<Block> WEATHER_SENSOR = REGISTRY.register("weather_sensor", () -> new WeatherSensorBlock());
	public static final RegistryObject<Block> WEATHER_SENSOR_ACTIVATED = REGISTRY.register("weather_sensor_activated", () -> new WeatherSensorActivatedBlock());
	public static final RegistryObject<Block> REMOTE_BLOCK_OFF = REGISTRY.register("remote_block_off", () -> new RemoteBlockOffBlock());
	public static final RegistryObject<Block> REMOTE_BLOCK_ON = REGISTRY.register("remote_block_on", () -> new RemoteBlockOnBlock());
	public static final RegistryObject<Block> SIGNAL_BLOCK = REGISTRY.register("signal_block", () -> new SignalBlockBlock());
	public static final RegistryObject<Block> SIGNAL_0 = REGISTRY.register("signal_0", () -> new Signal0Block());
	public static final RegistryObject<Block> SIGNAL_1 = REGISTRY.register("signal_1", () -> new Signal1Block());
	public static final RegistryObject<Block> SIGNAL_2 = REGISTRY.register("signal_2", () -> new Signal2Block());
	public static final RegistryObject<Block> SIGNAL_3 = REGISTRY.register("signal_3", () -> new Signal3Block());
	public static final RegistryObject<Block> SIGNAL_4 = REGISTRY.register("signal_4", () -> new Signal4Block());
	public static final RegistryObject<Block> SIGNAL_5 = REGISTRY.register("signal_5", () -> new Signal5Block());
	public static final RegistryObject<Block> SIGNAL_6 = REGISTRY.register("signal_6", () -> new Signal6Block());
	public static final RegistryObject<Block> SIGNAL_7 = REGISTRY.register("signal_7", () -> new Signal7Block());
	public static final RegistryObject<Block> SIGNAL_8 = REGISTRY.register("signal_8", () -> new Signal8Block());
	public static final RegistryObject<Block> SIGNAL_9 = REGISTRY.register("signal_9", () -> new Signal9Block());
	public static final RegistryObject<Block> SIGNAL_10 = REGISTRY.register("signal_10", () -> new Signal10Block());
	public static final RegistryObject<Block> SIGNAL_11 = REGISTRY.register("signal_11", () -> new Signal11Block());
	public static final RegistryObject<Block> SIGNAL_12 = REGISTRY.register("signal_12", () -> new Signal12Block());
	public static final RegistryObject<Block> SIGNAL_13 = REGISTRY.register("signal_13", () -> new Signal13Block());
	public static final RegistryObject<Block> SIGNAL_14 = REGISTRY.register("signal_14", () -> new Signal14Block());
	public static final RegistryObject<Block> SIGNAL_15 = REGISTRY.register("signal_15", () -> new Signal15Block());
	public static final RegistryObject<Block> PLUSH = REGISTRY.register("plush", () -> new PlushBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
