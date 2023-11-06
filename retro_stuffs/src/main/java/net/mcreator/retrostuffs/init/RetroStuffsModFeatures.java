
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.retrostuffs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.retrostuffs.world.features.ores.BlueStoneOreFeature;
import net.mcreator.retrostuffs.world.features.ores.BlueStoneOre2Feature;
import net.mcreator.retrostuffs.RetroStuffsMod;

@Mod.EventBusSubscriber
public class RetroStuffsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, RetroStuffsMod.MODID);
	public static final RegistryObject<Feature<?>> BLUE_STONE_ORE = REGISTRY.register("blue_stone_ore", BlueStoneOreFeature::new);
	public static final RegistryObject<Feature<?>> BLUE_STONE_ORE_2 = REGISTRY.register("blue_stone_ore_2", BlueStoneOre2Feature::new);
}
