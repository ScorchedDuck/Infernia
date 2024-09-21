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
                .add(ModBlocks.MOD_COOKER_BLOCK.get())

                .add(ModBlocks.BISMUTH_STAIRS.get())
                .add(ModBlocks.BISMUTH_SLAB.get())
                .add(ModBlocks.BISMUTH_BUTTON.get())
                .add(ModBlocks.BISMUTH_PRESSURE_PLATE.get())
                .add(ModBlocks.BISMUTH_WALL.get())
                .add(ModBlocks.BISMUTH_FENCE_GATE.get())
                .add(ModBlocks.BISMUTH_FENCE.get())
                .add(ModBlocks.BISMUTH_DOOR.get())
                .add(ModBlocks.BISMUTH_TRAPDOOR.get())

                .add(ModBlocks.RUBY_STAIRS.get())
                .add(ModBlocks.RUBY_SLAB.get())
                .add(ModBlocks.RUBY_BUTTON.get())
                .add(ModBlocks.RUBY_PRESSURE_PLATE.get())
                .add(ModBlocks.RUBY_WALL.get())
                .add(ModBlocks.RUBY_FENCE_GATE.get())
                .add(ModBlocks.RUBY_FENCE.get())
                .add(ModBlocks.RUBY_DOOR.get())
                .add(ModBlocks.RUBY_TRAPDOOR.get())

                .add(ModBlocks.SAPPHIRE_STAIRS.get())
                .add(ModBlocks.SAPPHIRE_SLAB.get())
                .add(ModBlocks.SAPPHIRE_BUTTON.get())
                .add(ModBlocks.SAPPHIRE_PRESSURE_PLATE.get())
                .add(ModBlocks.SAPPHIRE_WALL.get())
                .add(ModBlocks.SAPPHIRE_FENCE_GATE.get())
                .add(ModBlocks.SAPPHIRE_FENCE.get())
                .add(ModBlocks.SAPPHIRE_DOOR.get())
                .add(ModBlocks.SAPPHIRE_TRAPDOOR.get())

                .add(ModBlocks.SCORCHED_STAIRS.get())
                .add(ModBlocks.SCORCHED_SLAB.get())
                .add(ModBlocks.SCORCHED_BUTTON.get())
                .add(ModBlocks.SCORCHED_PRESSURE_PLATE.get())
                .add(ModBlocks.SCORCHED_WALL.get())
                .add(ModBlocks.SCORCHED_FENCE_GATE.get())
                .add(ModBlocks.SCORCHED_FENCE.get())
                .add(ModBlocks.SCORCHED_DOOR.get())
                .add(ModBlocks.SCORCHED_TRAPDOOR.get());



        tag(BlockTags.MINEABLE_WITH_AXE);

        tag(BlockTags.MINEABLE_WITH_HOE);

        tag(BlockTags.MINEABLE_WITH_SHOVEL);

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.SCORCHED_BLOCK.get())
                .add(ModBlocks.STARLIGHT.get())

                .add(ModBlocks.SCORCHED_STAIRS.get())
                .add(ModBlocks.SCORCHED_SLAB.get())
                .add(ModBlocks.SCORCHED_BUTTON.get())
                .add(ModBlocks.SCORCHED_PRESSURE_PLATE.get())
                .add(ModBlocks.SCORCHED_WALL.get())
                .add(ModBlocks.SCORCHED_FENCE_GATE.get())
                .add(ModBlocks.SCORCHED_FENCE.get())
                .add(ModBlocks.SCORCHED_DOOR.get())
                .add(ModBlocks.SCORCHED_TRAPDOOR.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.BISMUTH_BLOCK.get())
                .add(ModBlocks.SAPPHIRE_BLOCK.get())
                .add(ModBlocks.RUBY_BLOCK.get())
                .add(ModBlocks.RAW_BISMUTH_BLOCK.get())
                .add(ModBlocks.RAW_RUBY_BLOCK.get())
                .add(ModBlocks.RAW_SAPPHIRE_BLOCK.get())
                .add(ModBlocks.SCORCHED_ORE.get())
                .add(ModBlocks.MOD_COOKER_BLOCK.get())

                .add(ModBlocks.BISMUTH_STAIRS.get())
                .add(ModBlocks.BISMUTH_SLAB.get())
                .add(ModBlocks.BISMUTH_BUTTON.get())
                .add(ModBlocks.BISMUTH_PRESSURE_PLATE.get())
                .add(ModBlocks.BISMUTH_WALL.get())
                .add(ModBlocks.BISMUTH_FENCE_GATE.get())
                .add(ModBlocks.BISMUTH_FENCE.get())
                .add(ModBlocks.BISMUTH_DOOR.get())
                .add(ModBlocks.BISMUTH_TRAPDOOR.get())

                .add(ModBlocks.RUBY_STAIRS.get())
                .add(ModBlocks.RUBY_SLAB.get())
                .add(ModBlocks.RUBY_BUTTON.get())
                .add(ModBlocks.RUBY_PRESSURE_PLATE.get())
                .add(ModBlocks.RUBY_WALL.get())
                .add(ModBlocks.RUBY_FENCE_GATE.get())
                .add(ModBlocks.RUBY_FENCE.get())
                .add(ModBlocks.RUBY_DOOR.get())
                .add(ModBlocks.RUBY_TRAPDOOR.get())

                .add(ModBlocks.SAPPHIRE_STAIRS.get())
                .add(ModBlocks.SAPPHIRE_SLAB.get())
                .add(ModBlocks.SAPPHIRE_BUTTON.get())
                .add(ModBlocks.SAPPHIRE_PRESSURE_PLATE.get())
                .add(ModBlocks.SAPPHIRE_WALL.get())
                .add(ModBlocks.SAPPHIRE_FENCE_GATE.get())
                .add(ModBlocks.SAPPHIRE_FENCE.get())
                .add(ModBlocks.SAPPHIRE_DOOR.get())
                .add(ModBlocks.SAPPHIRE_TRAPDOOR.get());

        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.BISMUTH_ORE.get())
                .add(ModBlocks.RUBY_ORE.get())
                .add(ModBlocks.SAPPHIRE_ORE.get());

        tag(BlockTags.FENCES).add(ModBlocks.BISMUTH_FENCE.get());
        tag(BlockTags.FENCE_GATES).add(ModBlocks.BISMUTH_FENCE_GATE.get());
        tag(BlockTags.WALLS).add(ModBlocks.BISMUTH_WALL.get());

        tag(BlockTags.FENCES).add(ModBlocks.RUBY_FENCE.get());
        tag(BlockTags.FENCE_GATES).add(ModBlocks.RUBY_FENCE_GATE.get());
        tag(BlockTags.WALLS).add(ModBlocks.RUBY_WALL.get());

        tag(BlockTags.FENCES).add(ModBlocks.SAPPHIRE_FENCE.get());
        tag(BlockTags.FENCE_GATES).add(ModBlocks.SAPPHIRE_FENCE_GATE.get());
        tag(BlockTags.WALLS).add(ModBlocks.SAPPHIRE_WALL.get());

        tag(BlockTags.FENCES).add(ModBlocks.SCORCHED_FENCE.get());
        tag(BlockTags.FENCE_GATES).add(ModBlocks.SCORCHED_FENCE_GATE.get());
        tag(BlockTags.WALLS).add(ModBlocks.SCORCHED_WALL.get());
    }
}