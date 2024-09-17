package net.scorchedduck.infernia.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.scorchedduck.infernia.Infernia;
import net.scorchedduck.infernia.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Infernia.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.BISMUTH_BLOCK.get())
                .add(ModBlocks.RAW_BISMUTH_BLOCK.get())
                .add(ModBlocks.BISMUTH_ORE.get())
                .add(ModBlocks.SAPPHIRE_BLOCK.get())
                .add(ModBlocks.SAPPHIRE_ORE.get())
                .add(ModBlocks.RAW_SAPPHIRE_BLOCK.get())
                .add(ModBlocks.RUBY_BLOCK.get())
                .add(ModBlocks.RUBY_ORE.get())
                .add(ModBlocks.RAW_RUBY_BLOCK.get())
                .add(ModBlocks.SCORCHED_BLOCK.get())
                .add(ModBlocks.SCORCHED_ORE.get())
                .add(ModBlocks.STARLIGHT.get())
                .add(ModBlocks.MOD_COOKER_BLOCK.get());

        tag(BlockTags.MINEABLE_WITH_AXE);

        tag(BlockTags.MINEABLE_WITH_HOE);

        tag(BlockTags.MINEABLE_WITH_SHOVEL);

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.SCORCHED_BLOCK.get())
                .add(ModBlocks.STARLIGHT.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.BISMUTH_BLOCK.get())
                .add(ModBlocks.SAPPHIRE_BLOCK.get())
                .add(ModBlocks.RUBY_BLOCK.get())
                .add(ModBlocks.RAW_BISMUTH_BLOCK.get())
                .add(ModBlocks.RAW_RUBY_BLOCK.get())
                .add(ModBlocks.RAW_SAPPHIRE_BLOCK.get())
                .add(ModBlocks.SCORCHED_ORE.get())
                .add(ModBlocks.MOD_COOKER_BLOCK.get());

        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.BISMUTH_ORE.get())
                .add(ModBlocks.RUBY_ORE.get())
                .add(ModBlocks.SAPPHIRE_ORE.get());
    }
}