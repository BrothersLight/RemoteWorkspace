
package net.mcreator.compartido.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class AntorchaBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public AntorchaBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
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
			default -> Shapes.or(box(4, 2, 4, 12, 7, 12), box(3, 6, 3, 13, 8, 13), box(3, 0, 3, 13, 2, 13), box(4.99, 9.99, 11.99, 11.01, 11.01, 12.01), box(4.99, 9.99, 3.99, 11.01, 11.01, 4.01), box(5, 8, 7, 7, 10, 9), box(7, 9, 8, 9, 11, 10),
					box(7, 8, 5, 9, 10, 7), box(9, 8, 6, 11, 10, 8), box(7, 8, 7, 9, 9, 9), box(8, 8, 9, 10, 9, 11), box(3, 2, 6, 4, 6, 7), box(3, 2, 9, 4, 6, 10), box(9, 2, 12, 10, 6, 13), box(6, 2, 12, 7, 6, 13), box(6, 2, 3, 7, 6, 4),
					box(9, 2, 3, 10, 6, 4), box(12, 2, 9, 13, 6, 10), box(12, 2, 6, 13, 6, 7));
			case NORTH -> Shapes.or(box(4, 2, 4, 12, 7, 12), box(3, 6, 3, 13, 8, 13), box(3, 0, 3, 13, 2, 13), box(4.99, 9.99, 3.99, 11.01, 11.01, 4.01), box(4.99, 9.99, 11.99, 11.01, 11.01, 12.01), box(9, 8, 7, 11, 10, 9), box(7, 9, 6, 9, 11, 8),
					box(7, 8, 9, 9, 10, 11), box(5, 8, 8, 7, 10, 10), box(7, 8, 7, 9, 9, 9), box(6, 8, 5, 8, 9, 7), box(12, 2, 9, 13, 6, 10), box(12, 2, 6, 13, 6, 7), box(6, 2, 3, 7, 6, 4), box(9, 2, 3, 10, 6, 4), box(9, 2, 12, 10, 6, 13),
					box(6, 2, 12, 7, 6, 13), box(3, 2, 6, 4, 6, 7), box(3, 2, 9, 4, 6, 10));
			case EAST -> Shapes.or(box(4, 2, 4, 12, 7, 12), box(3, 6, 3, 13, 8, 13), box(3, 0, 3, 13, 2, 13), box(11.99, 9.99, 4.99, 12.01, 11.01, 11.01), box(3.99, 9.99, 4.99, 4.01, 11.01, 11.01), box(7, 8, 9, 9, 10, 11), box(8, 9, 7, 10, 11, 9),
					box(5, 8, 7, 7, 10, 9), box(6, 8, 5, 8, 10, 7), box(7, 8, 7, 9, 9, 9), box(9, 8, 6, 11, 9, 8), box(6, 2, 12, 7, 6, 13), box(9, 2, 12, 10, 6, 13), box(12, 2, 6, 13, 6, 7), box(12, 2, 9, 13, 6, 10), box(3, 2, 9, 4, 6, 10),
					box(3, 2, 6, 4, 6, 7), box(9, 2, 3, 10, 6, 4), box(6, 2, 3, 7, 6, 4));
			case WEST -> Shapes.or(box(4, 2, 4, 12, 7, 12), box(3, 6, 3, 13, 8, 13), box(3, 0, 3, 13, 2, 13), box(3.99, 9.99, 4.99, 4.01, 11.01, 11.01), box(11.99, 9.99, 4.99, 12.01, 11.01, 11.01), box(7, 8, 5, 9, 10, 7), box(6, 9, 7, 8, 11, 9),
					box(9, 8, 7, 11, 10, 9), box(8, 8, 9, 10, 10, 11), box(7, 8, 7, 9, 9, 9), box(5, 8, 8, 7, 9, 10), box(9, 2, 3, 10, 6, 4), box(6, 2, 3, 7, 6, 4), box(3, 2, 9, 4, 6, 10), box(3, 2, 6, 4, 6, 7), box(12, 2, 6, 13, 6, 7),
					box(12, 2, 9, 13, 6, 10), box(6, 2, 12, 7, 6, 13), box(9, 2, 12, 10, 6, 13));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}
}
