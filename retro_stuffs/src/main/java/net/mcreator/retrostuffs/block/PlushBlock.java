
package net.mcreator.retrostuffs.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.FaceAttachedHorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class PlushBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	public static final EnumProperty<AttachFace> FACE = FaceAttachedHorizontalDirectionalBlock.FACE;

	public PlushBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().sound(SoundType.WOOL).strength(1f, 7f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(FACE, AttachFace.WALL));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> switch (state.getValue(FACE)) {
				case FLOOR -> Shapes.or(box(4.5, 7, 4, 11.5, 14, 11), box(5, 0, 5, 11, 8, 10), box(3.8, 3.8, 8.8, 7.2, 7.2, 15.2), box(8.8, 3.8, 8.8, 12.2, 7.2, 15.2), box(3.8, -0.3, 7.8, 7.2, 3.1, 14.2), box(8.8, -0.3, 8.8, 12.2, 3.1, 15.2));
				case WALL -> Shapes.or(box(4.5, 5, 7, 11.5, 12, 14), box(5, 6, 0, 11, 11, 8), box(3.8, 0.8, 3.8, 7.2, 7.2, 7.2), box(8.8, 0.8, 3.8, 12.2, 7.2, 7.2), box(3.8, 1.8, -0.3, 7.2, 8.2, 3.1), box(8.8, 0.8, -0.3, 12.2, 7.2, 3.1));
				case CEILING -> Shapes.or(box(4.5, 2, 4, 11.5, 9, 11), box(5, 8, 5, 11, 16, 10), box(8.8, 8.8, 8.8, 12.2, 12.2, 15.2), box(3.8, 8.8, 8.8, 7.2, 12.2, 15.2), box(8.8, 12.9, 7.8, 12.2, 16.3, 14.2), box(3.8, 12.9, 8.8, 7.2, 16.3, 15.2));
			};
			case NORTH -> switch (state.getValue(FACE)) {
				case FLOOR -> Shapes.or(box(4.5, 7, 5, 11.5, 14, 12), box(5, 0, 6, 11, 8, 11), box(8.8, 3.8, 0.8, 12.2, 7.2, 7.2), box(3.8, 3.8, 0.8, 7.2, 7.2, 7.2), box(8.8, -0.3, 1.8, 12.2, 3.1, 8.2), box(3.8, -0.3, 0.8, 7.2, 3.1, 7.2));
				case WALL -> Shapes.or(box(4.5, 5, 2, 11.5, 12, 9), box(5, 6, 8, 11, 11, 16), box(8.8, 0.8, 8.8, 12.2, 7.2, 12.2), box(3.8, 0.8, 8.8, 7.2, 7.2, 12.2), box(8.8, 1.8, 12.9, 12.2, 8.2, 16.3), box(3.8, 0.8, 12.9, 7.2, 7.2, 16.3));
				case CEILING -> Shapes.or(box(4.5, 2, 5, 11.5, 9, 12), box(5, 8, 6, 11, 16, 11), box(3.8, 8.8, 0.8, 7.2, 12.2, 7.2), box(8.8, 8.8, 0.8, 12.2, 12.2, 7.2), box(3.8, 12.9, 1.8, 7.2, 16.3, 8.2), box(8.8, 12.9, 0.8, 12.2, 16.3, 7.2));
			};
			case EAST -> switch (state.getValue(FACE)) {
				case FLOOR -> Shapes.or(box(4, 7, 4.5, 11, 14, 11.5), box(5, 0, 5, 10, 8, 11), box(8.8, 3.8, 8.8, 15.2, 7.2, 12.2), box(8.8, 3.8, 3.8, 15.2, 7.2, 7.2), box(7.8, -0.3, 8.8, 14.2, 3.1, 12.2), box(8.8, -0.3, 3.8, 15.2, 3.1, 7.2));
				case WALL -> Shapes.or(box(7, 5, 4.5, 14, 12, 11.5), box(0, 6, 5, 8, 11, 11), box(3.8, 0.8, 8.8, 7.2, 7.2, 12.2), box(3.8, 0.8, 3.8, 7.2, 7.2, 7.2), box(-0.3, 1.8, 8.8, 3.1, 8.2, 12.2), box(-0.3, 0.8, 3.8, 3.1, 7.2, 7.2));
				case CEILING -> Shapes.or(box(4, 2, 4.5, 11, 9, 11.5), box(5, 8, 5, 10, 16, 11), box(8.8, 8.8, 3.8, 15.2, 12.2, 7.2), box(8.8, 8.8, 8.8, 15.2, 12.2, 12.2), box(7.8, 12.9, 3.8, 14.2, 16.3, 7.2), box(8.8, 12.9, 8.8, 15.2, 16.3, 12.2));
			};
			case WEST -> switch (state.getValue(FACE)) {
				case FLOOR -> Shapes.or(box(5, 7, 4.5, 12, 14, 11.5), box(6, 0, 5, 11, 8, 11), box(0.8, 3.8, 3.8, 7.2, 7.2, 7.2), box(0.8, 3.8, 8.8, 7.2, 7.2, 12.2), box(1.8, -0.3, 3.8, 8.2, 3.1, 7.2), box(0.8, -0.3, 8.8, 7.2, 3.1, 12.2));
				case WALL -> Shapes.or(box(2, 5, 4.5, 9, 12, 11.5), box(8, 6, 5, 16, 11, 11), box(8.8, 0.8, 3.8, 12.2, 7.2, 7.2), box(8.8, 0.8, 8.8, 12.2, 7.2, 12.2), box(12.9, 1.8, 3.8, 16.3, 8.2, 7.2), box(12.9, 0.8, 8.8, 16.3, 7.2, 12.2));
				case CEILING -> Shapes.or(box(5, 2, 4.5, 12, 9, 11.5), box(6, 8, 5, 11, 16, 11), box(0.8, 8.8, 8.8, 7.2, 12.2, 12.2), box(0.8, 8.8, 3.8, 7.2, 12.2, 7.2), box(1.8, 12.9, 8.8, 8.2, 16.3, 12.2), box(0.8, 12.9, 3.8, 7.2, 16.3, 7.2));
			};
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING, FACE);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		if (context.getClickedFace().getAxis() == Direction.Axis.Y)
			return this.defaultBlockState().setValue(FACE, context.getClickedFace().getOpposite() == Direction.UP ? AttachFace.CEILING : AttachFace.FLOOR).setValue(FACING, context.getHorizontalDirection());
		return this.defaultBlockState().setValue(FACE, AttachFace.WALL).setValue(FACING, context.getClickedFace());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}
}
