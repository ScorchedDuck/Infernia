package net.scorchedduck.infernia.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.scorchedduck.infernia.block.ModBlocks;
import net.scorchedduck.infernia.item.ModItems;

public class ModCookerBlock extends Block {
    public ModCookerBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos,
                                               Player player, BlockHitResult hitResult) {
        level.playSound(player, pos, SoundEvents.AMETHYST_BLOCK_CHIME, SoundSource.BLOCKS, 1f, 1f);
        return InteractionResult.SUCCESS;
    }

    @Override
    public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
        if (entity instanceof ItemEntity itemEntity) {
            if (itemEntity.getItem().getItem() == ModItems.RAW_BISMUTH.get()) {
                itemEntity.setItem(new ItemStack(ModItems.BISMUTH.get(), itemEntity.getItem().getCount()));
            }


            if (itemEntity.getItem().getItem() == ModItems.RAW_SAPPHIRE.get()) {
                itemEntity.setItem(new ItemStack(ModItems.SAPPHIRE.get(), itemEntity.getItem().getCount()));
            }



            if (itemEntity.getItem().getItem() == ModItems.RAW_RUBY.get()) {
                itemEntity.setItem(new ItemStack(ModItems.RUBY.get(), itemEntity.getItem().getCount()));
            }


        }



        super.stepOn(level, pos, state, entity);
    }
}
