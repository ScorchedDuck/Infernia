package net.scorchedduck.infernia.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
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
//bismuth
        stairsBlock(ModBlocks.BISMUTH_STAIRS.get(), blockTexture(ModBlocks.BISMUTH_BLOCK.get()));
        slabBlock(ModBlocks.BISMUTH_SLAB.get(), blockTexture(ModBlocks.BISMUTH_BLOCK.get()), blockTexture(ModBlocks.BISMUTH_BLOCK.get()));
        buttonBlock(ModBlocks.BISMUTH_BUTTON.get(), blockTexture(ModBlocks.BISMUTH_BLOCK.get()));
        pressurePlateBlock(ModBlocks.BISMUTH_PRESSURE_PLATE.get(), blockTexture(ModBlocks.BISMUTH_BLOCK.get()));
        fenceBlock(ModBlocks.BISMUTH_FENCE.get(), blockTexture(ModBlocks.BISMUTH_BLOCK.get()));
        fenceGateBlock(ModBlocks.BISMUTH_FENCE_GATE.get(), blockTexture(ModBlocks.BISMUTH_BLOCK.get()));
        wallBlock(ModBlocks.BISMUTH_WALL.get(), blockTexture(ModBlocks.BISMUTH_BLOCK.get()));
        doorBlockWithRenderType(ModBlocks.BISMUTH_DOOR.get(), modLoc("block/bismuth_door_bottom"), modLoc("block/bismuth_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.BISMUTH_TRAPDOOR.get(), modLoc("block/bismuth_trapdoor"), true, "cutout");

        blockItem(ModBlocks.BISMUTH_STAIRS);
        blockItem(ModBlocks.BISMUTH_SLAB);
        blockItem(ModBlocks.BISMUTH_PRESSURE_PLATE);
        blockItem(ModBlocks.BISMUTH_FENCE_GATE);
        blockItem(ModBlocks.BISMUTH_TRAPDOOR, "_bottom");
//ruby
        stairsBlock(ModBlocks.RUBY_STAIRS.get(), blockTexture(ModBlocks.RUBY_BLOCK.get()));
        slabBlock(ModBlocks.RUBY_SLAB.get(), blockTexture(ModBlocks.RUBY_BLOCK.get()), blockTexture(ModBlocks.RUBY_BLOCK.get()));
        buttonBlock(ModBlocks.RUBY_BUTTON.get(), blockTexture(ModBlocks.RUBY_BLOCK.get()));
        pressurePlateBlock(ModBlocks.RUBY_PRESSURE_PLATE.get(), blockTexture(ModBlocks.RUBY_BLOCK.get()));
        fenceBlock(ModBlocks.RUBY_FENCE.get(), blockTexture(ModBlocks.RUBY_BLOCK.get()));
        fenceGateBlock(ModBlocks.RUBY_FENCE_GATE.get(), blockTexture(ModBlocks.RUBY_BLOCK.get()));
        wallBlock(ModBlocks.RUBY_WALL.get(), blockTexture(ModBlocks.RUBY_BLOCK.get()));
        doorBlockWithRenderType(ModBlocks.RUBY_DOOR.get(), modLoc("block/ruby_door_bottom"), modLoc("block/ruby_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.RUBY_TRAPDOOR.get(), modLoc("block/ruby_trapdoor"), true, "cutout");

        blockItem(ModBlocks.RUBY_STAIRS);
        blockItem(ModBlocks.RUBY_SLAB);
        blockItem(ModBlocks.RUBY_PRESSURE_PLATE);
        blockItem(ModBlocks.RUBY_FENCE_GATE);
        blockItem(ModBlocks.RUBY_TRAPDOOR, "_bottom");
//sapphire
        stairsBlock(ModBlocks.SAPPHIRE_STAIRS.get(), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        slabBlock(ModBlocks.SAPPHIRE_SLAB.get(), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        buttonBlock(ModBlocks.SAPPHIRE_BUTTON.get(), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        pressurePlateBlock(ModBlocks.SAPPHIRE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        fenceBlock(ModBlocks.SAPPHIRE_FENCE.get(), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        fenceGateBlock(ModBlocks.SAPPHIRE_FENCE_GATE.get(), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        wallBlock(ModBlocks.SAPPHIRE_WALL.get(), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        doorBlockWithRenderType(ModBlocks.SAPPHIRE_DOOR.get(), modLoc("block/sapphire_door_bottom"), modLoc("block/sapphire_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.SAPPHIRE_TRAPDOOR.get(), modLoc("block/sapphire_trapdoor"), true, "cutout");

        blockItem(ModBlocks.SAPPHIRE_STAIRS);
        blockItem(ModBlocks.SAPPHIRE_SLAB);
        blockItem(ModBlocks.SAPPHIRE_PRESSURE_PLATE);
        blockItem(ModBlocks.SAPPHIRE_FENCE_GATE);
        blockItem(ModBlocks.SAPPHIRE_TRAPDOOR, "_bottom");
//scorched
        stairsBlock(ModBlocks.SCORCHED_STAIRS.get(), blockTexture(ModBlocks.SCORCHED_BLOCK.get()));
        slabBlock(ModBlocks.SCORCHED_SLAB.get(), blockTexture(ModBlocks.SCORCHED_BLOCK.get()), blockTexture(ModBlocks.SCORCHED_BLOCK.get()));
        buttonBlock(ModBlocks.SCORCHED_BUTTON.get(), blockTexture(ModBlocks.SCORCHED_BLOCK.get()));
        pressurePlateBlock(ModBlocks.SCORCHED_PRESSURE_PLATE.get(), blockTexture(ModBlocks.SCORCHED_BLOCK.get()));
        fenceBlock(ModBlocks.SCORCHED_FENCE.get(), blockTexture(ModBlocks.SCORCHED_BLOCK.get()));
        fenceGateBlock(ModBlocks.SCORCHED_FENCE_GATE.get(), blockTexture(ModBlocks.SCORCHED_BLOCK.get()));
        wallBlock(ModBlocks.SCORCHED_WALL.get(), blockTexture(ModBlocks.SCORCHED_BLOCK.get()));
        doorBlockWithRenderType(ModBlocks.SCORCHED_DOOR.get(), modLoc("block/scorched_door_bottom"), modLoc("block/scorched_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.SCORCHED_TRAPDOOR.get(), modLoc("block/scorched_trapdoor"), true, "cutout");

        blockItem(ModBlocks.SCORCHED_STAIRS);
        blockItem(ModBlocks.SCORCHED_SLAB);
        blockItem(ModBlocks.SCORCHED_PRESSURE_PLATE);
        blockItem(ModBlocks.SCORCHED_FENCE_GATE);
        blockItem(ModBlocks.SCORCHED_TRAPDOOR, "_bottom");

    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("infernia:block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("infernia:block/" + deferredBlock.getId().getPath() + appendix));
    }
}