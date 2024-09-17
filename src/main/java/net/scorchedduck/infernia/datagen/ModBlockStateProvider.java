package net.scorchedduck.infernia.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.scorchedduck.infernia.Infernia;
import net.scorchedduck.infernia.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Infernia.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.BISMUTH_BLOCK);
        blockWithItem(ModBlocks.RUBY_BLOCK);
        blockWithItem(ModBlocks.SAPPHIRE_BLOCK);
        blockWithItem(ModBlocks.SCORCHED_BLOCK);
        blockWithItem(ModBlocks.STARLIGHT);
        blockWithItem(ModBlocks.BISMUTH_ORE);
        blockWithItem(ModBlocks.RUBY_ORE);
        blockWithItem(ModBlocks.SAPPHIRE_ORE);
        blockWithItem(ModBlocks.SCORCHED_ORE);
        blockWithItem(ModBlocks.MOD_COOKER_BLOCK);
        blockWithItem(ModBlocks.RAW_BISMUTH_BLOCK);
        blockWithItem(ModBlocks.RAW_RUBY_BLOCK);
        blockWithItem(ModBlocks.RAW_SAPPHIRE_BLOCK);
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}