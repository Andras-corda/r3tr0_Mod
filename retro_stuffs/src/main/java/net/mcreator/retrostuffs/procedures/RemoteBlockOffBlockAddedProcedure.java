package net.mcreator.retrostuffs.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class RemoteBlockOffBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double X = 0;
		double Y = 0;
		double Z = 0;
		double posX = 0;
		double posY = 0;
		double posZ = 0;
		X = x;
		Y = y;
		Z = z;
		if (!world.isClientSide()) {
			BlockPos _bp = BlockPos.containing(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getPersistentData().putDouble("posX", X);
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
		if (!world.isClientSide()) {
			BlockPos _bp = BlockPos.containing(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getPersistentData().putDouble("posY", Y);
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
		if (!world.isClientSide()) {
			BlockPos _bp = BlockPos.containing(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getPersistentData().putDouble("posZ", Z);
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
	}
}
