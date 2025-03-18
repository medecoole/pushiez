package net.medecoole.plushiez.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.Equipment;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;

public class PandaPlushieBlock extends HorizontalFacingBlock implements Equipment, Waterloggable {
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    public PandaPlushieBlock(Settings settings) {
        super(settings.nonOpaque());
        // Set the default state to face north
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(WATERLOGGED,false));
    }

    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return null;
    }

    @Override
    public RegistryEntry<SoundEvent> getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_GENERIC;
    }
    @Override
    public BlockState getPlacementState(ItemPlacementContext context) {
        // Automatically set the facing direction to the opposite of the player's facing direction
        return this.getDefaultState()
                .with(FACING, context.getHorizontalPlayerFacing().getOpposite())
                .with(WATERLOGGED, context.getWorld().getFluidState(context.getBlockPos()).isOf(Fluids.WATER));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING,WATERLOGGED);

    }
    @Override
    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }
    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (state.get(WATERLOGGED)) {
            // For 1.17 and below:
            // world.getFluidTickScheduler().schedule(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
            // For versions since 1.18 below 1.21.2:
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }

        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }


    @Override
    public EquipmentSlot getSlotType() {
        return EquipmentSlot.HEAD;
    }

    private static final VoxelShape CUSTOM_SHAPE_N = VoxelShapes.union(
            Block.createCuboidShape(4.6, 0, 6.6, 11.4, 7.8, 12.4),
            Block.createCuboidShape(4, 7.3, 6.5, 12, 13.3, 12.5)
    );
    private static final VoxelShape CUSTOM_SHAPE_S = VoxelShapes.union(
            Block.createCuboidShape(4.6, 0, 3.6, 11.4, 7.8, 9.4),
            Block.createCuboidShape(4, 7.3, 3.5, 12, 13.3, 9.5)
    );
    private static final VoxelShape CUSTOM_SHAPE_E = VoxelShapes.union(
            Block.createCuboidShape(3.6, 0, 4.6, 9.4, 7.8, 11.4),
            Block.createCuboidShape(3.5, 7.3, 4, 9.5, 13.3, 12)
    );
    private static final VoxelShape CUSTOM_SHAPE_W = VoxelShapes.union(
            Block.createCuboidShape(6.6, 0, 4.6, 12.4, 7.8, 11.4),
            Block.createCuboidShape(6.5, 7.3, 4, 12.5, 13.3, 12)
    );
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction facing = state.get(FACING); // Assume the block has a "FACING" property
        return switch (facing) {
            case NORTH -> CUSTOM_SHAPE_N;
            case SOUTH -> CUSTOM_SHAPE_S;
            case EAST -> CUSTOM_SHAPE_E;
            case WEST -> CUSTOM_SHAPE_W;
            default -> CUSTOM_SHAPE_N; // Default shape
        };
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction facing = state.get(FACING); // Assume the block has a "FACING" property
        return switch (facing) {
            case NORTH -> CUSTOM_SHAPE_N;
            case SOUTH -> CUSTOM_SHAPE_S;
            case EAST -> CUSTOM_SHAPE_E;
            case WEST -> CUSTOM_SHAPE_W;
            default -> CUSTOM_SHAPE_N; // Default shape
        };
    }
}
