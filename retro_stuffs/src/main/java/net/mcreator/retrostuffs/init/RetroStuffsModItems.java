
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.retrostuffs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.retrostuffs.item.RemoteToolItem;
import net.mcreator.retrostuffs.item.ObsidianAppleItem;
import net.mcreator.retrostuffs.item.ObsidianAppleEnchantedItem;
import net.mcreator.retrostuffs.item.BlueStoneItem;
import net.mcreator.retrostuffs.RetroStuffsMod;

public class RetroStuffsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RetroStuffsMod.MODID);
	public static final RegistryObject<Item> OBSIDIAN_APPLE = REGISTRY.register("obsidian_apple", () -> new ObsidianAppleItem());
	public static final RegistryObject<Item> OBSIDIAN_APPLE_ENCHANTED = REGISTRY.register("obsidian_apple_enchanted", () -> new ObsidianAppleEnchantedItem());
	public static final RegistryObject<Item> BLUE_STONE = REGISTRY.register("blue_stone", () -> new BlueStoneItem());
	public static final RegistryObject<Item> BLUE_STONE_ORE = block(RetroStuffsModBlocks.BLUE_STONE_ORE);
	public static final RegistryObject<Item> BLUE_STONE_BLOCK = block(RetroStuffsModBlocks.BLUE_STONE_BLOCK);
	public static final RegistryObject<Item> BLUE_STONE_ORE_2 = block(RetroStuffsModBlocks.BLUE_STONE_ORE_2);
	public static final RegistryObject<Item> BLUE_STONE_PISTON_ATTRACTIVE = block(RetroStuffsModBlocks.BLUE_STONE_PISTON_ATTRACTIVE);
	public static final RegistryObject<Item> WEATHER_SENSOR = block(RetroStuffsModBlocks.WEATHER_SENSOR);
	public static final RegistryObject<Item> WEATHER_SENSOR_ACTIVATED = block(RetroStuffsModBlocks.WEATHER_SENSOR_ACTIVATED);
	public static final RegistryObject<Item> REMOTE_BLOCK_OFF = block(RetroStuffsModBlocks.REMOTE_BLOCK_OFF);
	public static final RegistryObject<Item> REMOTE_BLOCK_ON = block(RetroStuffsModBlocks.REMOTE_BLOCK_ON);
	public static final RegistryObject<Item> SIGNAL_BLOCK = block(RetroStuffsModBlocks.SIGNAL_BLOCK);
	public static final RegistryObject<Item> REMOTE_TOOL = REGISTRY.register("remote_tool", () -> new RemoteToolItem());
	public static final RegistryObject<Item> SIGNAL_0 = block(RetroStuffsModBlocks.SIGNAL_0);
	public static final RegistryObject<Item> SIGNAL_1 = block(RetroStuffsModBlocks.SIGNAL_1);
	public static final RegistryObject<Item> SIGNAL_2 = block(RetroStuffsModBlocks.SIGNAL_2);
	public static final RegistryObject<Item> SIGNAL_3 = block(RetroStuffsModBlocks.SIGNAL_3);
	public static final RegistryObject<Item> SIGNAL_4 = block(RetroStuffsModBlocks.SIGNAL_4);
	public static final RegistryObject<Item> SIGNAL_5 = block(RetroStuffsModBlocks.SIGNAL_5);
	public static final RegistryObject<Item> SIGNAL_6 = block(RetroStuffsModBlocks.SIGNAL_6);
	public static final RegistryObject<Item> SIGNAL_7 = block(RetroStuffsModBlocks.SIGNAL_7);
	public static final RegistryObject<Item> SIGNAL_8 = block(RetroStuffsModBlocks.SIGNAL_8);
	public static final RegistryObject<Item> SIGNAL_9 = block(RetroStuffsModBlocks.SIGNAL_9);
	public static final RegistryObject<Item> SIGNAL_10 = block(RetroStuffsModBlocks.SIGNAL_10);
	public static final RegistryObject<Item> SIGNAL_11 = block(RetroStuffsModBlocks.SIGNAL_11);
	public static final RegistryObject<Item> SIGNAL_12 = block(RetroStuffsModBlocks.SIGNAL_12);
	public static final RegistryObject<Item> SIGNAL_13 = block(RetroStuffsModBlocks.SIGNAL_13);
	public static final RegistryObject<Item> SIGNAL_14 = block(RetroStuffsModBlocks.SIGNAL_14);
	public static final RegistryObject<Item> SIGNAL_15 = block(RetroStuffsModBlocks.SIGNAL_15);
	public static final RegistryObject<Item> PLUSH = block(RetroStuffsModBlocks.PLUSH);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
