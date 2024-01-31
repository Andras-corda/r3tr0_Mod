package net.mcreator.retrostuffs.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.retrostuffs.init.RetroStuffsModBlocks;

public class RemoteToolRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		String de = "";
		if (entity.isShiftKeyDown()) {
			itemstack.getOrCreateTag().putDouble("RP", (itemstack.getOrCreateTag().getDouble("RP") + 1));
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("Redstone flux" + itemstack.getOrCreateTag().getDouble("RP"))), false);
			if (itemstack.getOrCreateTag().getDouble("RP") >= 16) {
				itemstack.getOrCreateTag().putDouble("RP", 0);
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("Redstone flux" + itemstack.getOrCreateTag().getDouble("RP"))), false);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GOLD_BLOCK) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("blockPosX" + itemstack.getOrCreateTag().getDouble("blockPosX") + "blockPosY" + itemstack.getOrCreateTag().getDouble("blockPosY") + "blockPosZ"
						+ itemstack.getOrCreateTag().getDouble("blockPosZ") + "RP" + itemstack.getOrCreateTag().getDouble("RP"))), false);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RetroStuffsModBlocks.REMOTE_BLOCK_OFF.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RetroStuffsModBlocks.REMOTE_BLOCK_ON.get()) {
			itemstack.getOrCreateTag().putDouble("blockPosX", (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "posX")));
			itemstack.getOrCreateTag().putDouble("blockPosY", (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "posY")));
			itemstack.getOrCreateTag().putDouble("blockPosZ", (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "posZ")));
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Saved position"), false);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RetroStuffsModBlocks.SIGNAL_BLOCK.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RetroStuffsModBlocks.SIGNAL_0.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RetroStuffsModBlocks.SIGNAL_1.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RetroStuffsModBlocks.SIGNAL_2.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RetroStuffsModBlocks.SIGNAL_3.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RetroStuffsModBlocks.SIGNAL_4.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RetroStuffsModBlocks.SIGNAL_5.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RetroStuffsModBlocks.SIGNAL_6.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RetroStuffsModBlocks.SIGNAL_7.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RetroStuffsModBlocks.SIGNAL_8.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RetroStuffsModBlocks.SIGNAL_9.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RetroStuffsModBlocks.SIGNAL_10.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RetroStuffsModBlocks.SIGNAL_11.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RetroStuffsModBlocks.SIGNAL_12.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RetroStuffsModBlocks.SIGNAL_13.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RetroStuffsModBlocks.SIGNAL_14.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RetroStuffsModBlocks.SIGNAL_15.get()) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("posX", (itemstack.getOrCreateTag().getDouble("blockPosX")));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("posY", (itemstack.getOrCreateTag().getDouble("blockPosY")));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("posZ", (itemstack.getOrCreateTag().getDouble("blockPosZ")));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("RP", (itemstack.getOrCreateTag().getDouble("RP")));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("linked the \"Remote block\" to the signalblock"), false);
		} else {
			de = ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString();
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(de), false);
		}
	}
}
