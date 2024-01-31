
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.retrostuffs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.retrostuffs.block.entity.SignalBlockBlockEntity;
import net.mcreator.retrostuffs.block.entity.Signal9BlockEntity;
import net.mcreator.retrostuffs.block.entity.Signal8BlockEntity;
import net.mcreator.retrostuffs.block.entity.Signal7BlockEntity;
import net.mcreator.retrostuffs.block.entity.Signal6BlockEntity;
import net.mcreator.retrostuffs.block.entity.Signal5BlockEntity;
import net.mcreator.retrostuffs.block.entity.Signal4BlockEntity;
import net.mcreator.retrostuffs.block.entity.Signal3BlockEntity;
import net.mcreator.retrostuffs.block.entity.Signal2BlockEntity;
import net.mcreator.retrostuffs.block.entity.Signal1BlockEntity;
import net.mcreator.retrostuffs.block.entity.Signal15BlockEntity;
import net.mcreator.retrostuffs.block.entity.Signal14BlockEntity;
import net.mcreator.retrostuffs.block.entity.Signal13BlockEntity;
import net.mcreator.retrostuffs.block.entity.Signal12BlockEntity;
import net.mcreator.retrostuffs.block.entity.Signal11BlockEntity;
import net.mcreator.retrostuffs.block.entity.Signal10BlockEntity;
import net.mcreator.retrostuffs.block.entity.Signal0BlockEntity;
import net.mcreator.retrostuffs.block.entity.RemoteBlockOnBlockEntity;
import net.mcreator.retrostuffs.block.entity.RemoteBlockOffBlockEntity;
import net.mcreator.retrostuffs.RetroStuffsMod;

public class RetroStuffsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, RetroStuffsMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> REMOTE_BLOCK_OFF = register("remote_block_off", RetroStuffsModBlocks.REMOTE_BLOCK_OFF, RemoteBlockOffBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> REMOTE_BLOCK_ON = register("remote_block_on", RetroStuffsModBlocks.REMOTE_BLOCK_ON, RemoteBlockOnBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SIGNAL_BLOCK = register("signal_block", RetroStuffsModBlocks.SIGNAL_BLOCK, SignalBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SIGNAL_0 = register("signal_0", RetroStuffsModBlocks.SIGNAL_0, Signal0BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SIGNAL_1 = register("signal_1", RetroStuffsModBlocks.SIGNAL_1, Signal1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SIGNAL_2 = register("signal_2", RetroStuffsModBlocks.SIGNAL_2, Signal2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SIGNAL_3 = register("signal_3", RetroStuffsModBlocks.SIGNAL_3, Signal3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SIGNAL_4 = register("signal_4", RetroStuffsModBlocks.SIGNAL_4, Signal4BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SIGNAL_5 = register("signal_5", RetroStuffsModBlocks.SIGNAL_5, Signal5BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SIGNAL_6 = register("signal_6", RetroStuffsModBlocks.SIGNAL_6, Signal6BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SIGNAL_7 = register("signal_7", RetroStuffsModBlocks.SIGNAL_7, Signal7BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SIGNAL_8 = register("signal_8", RetroStuffsModBlocks.SIGNAL_8, Signal8BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SIGNAL_9 = register("signal_9", RetroStuffsModBlocks.SIGNAL_9, Signal9BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SIGNAL_10 = register("signal_10", RetroStuffsModBlocks.SIGNAL_10, Signal10BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SIGNAL_11 = register("signal_11", RetroStuffsModBlocks.SIGNAL_11, Signal11BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SIGNAL_12 = register("signal_12", RetroStuffsModBlocks.SIGNAL_12, Signal12BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SIGNAL_13 = register("signal_13", RetroStuffsModBlocks.SIGNAL_13, Signal13BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SIGNAL_14 = register("signal_14", RetroStuffsModBlocks.SIGNAL_14, Signal14BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SIGNAL_15 = register("signal_15", RetroStuffsModBlocks.SIGNAL_15, Signal15BlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
