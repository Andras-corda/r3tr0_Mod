
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.retrostuffs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.retrostuffs.RetroStuffsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RetroStuffsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RetroStuffsMod.MODID);
	public static final RegistryObject<CreativeModeTab> BLUE_STONE_CREATIVE_TAB = REGISTRY.register("blue_stone_creative_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.retro_stuffs.blue_stone_creative_tab")).icon(() -> new ItemStack(RetroStuffsModItems.BLUE_STONE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(RetroStuffsModBlocks.BLUE_STONE_ORE.get().asItem());
				tabData.accept(RetroStuffsModBlocks.BLUE_STONE_ORE_2.get().asItem());
				tabData.accept(RetroStuffsModItems.BLUE_STONE.get());
				tabData.accept(RetroStuffsModBlocks.BLUE_STONE_BLOCK.get().asItem());
				tabData.accept(RetroStuffsModBlocks.BLUE_STONE_PISTON_ATTRACTIVE.get().asItem());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(RetroStuffsModBlocks.WEATHER_SENSOR.get().asItem());
			tabData.accept(RetroStuffsModBlocks.WEATHER_SENSOR_ACTIVATED.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(RetroStuffsModItems.OBSIDIAN_APPLE.get());
			tabData.accept(RetroStuffsModItems.OBSIDIAN_APPLE_ENCHANTED.get());
		}
	}
}
