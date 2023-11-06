
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

import net.mcreator.retrostuffs.item.ObsidianAppleItem;
import net.mcreator.retrostuffs.item.ObsidianAppleEnchantedItem;
import net.mcreator.retrostuffs.item.BlueStoneItem;
import net.mcreator.retrostuffs.RetroStuffsMod;

public class RetroStuffsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RetroStuffsMod.MODID);
	public static final RegistryObject<Item> OBSIDIAN_APPLE = REGISTRY.register("obsidian_apple", () -> new ObsidianAppleItem());
	public static final RegistryObject<Item> OBSIDIAN_APPLE_ENCHANTED = REGISTRY.register("obsidian_apple_enchanted", () -> new ObsidianAppleEnchantedItem());
	public static final RegistryObject<Item> BLUE_STONE_ORE = block(RetroStuffsModBlocks.BLUE_STONE_ORE);
	public static final RegistryObject<Item> BLUE_STONE_ORE_2 = block(RetroStuffsModBlocks.BLUE_STONE_ORE_2);
	public static final RegistryObject<Item> BLUE_STONE = REGISTRY.register("blue_stone", () -> new BlueStoneItem());
	public static final RegistryObject<Item> BLUE_STONE_BLOCK = block(RetroStuffsModBlocks.BLUE_STONE_BLOCK);
	public static final RegistryObject<Item> BLUE_STONE_PISTON_ATTRACTIVE = block(RetroStuffsModBlocks.BLUE_STONE_PISTON_ATTRACTIVE);
	public static final RegistryObject<Item> WEATHER_SENSOR = block(RetroStuffsModBlocks.WEATHER_SENSOR);
	public static final RegistryObject<Item> WEATHER_SENSOR_ACTIVATED = block(RetroStuffsModBlocks.WEATHER_SENSOR_ACTIVATED);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
