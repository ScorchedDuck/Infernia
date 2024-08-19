package net.scorchedduck.infernia.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.scorchedduck.infernia.Infernia;
import net.scorchedduck.infernia.item.ModItems;
import org.apache.commons.compress.compressors.lz77support.LZ77Compressor;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Infernia.MOD_ID);

    //scorched block - done
    public static final DeferredBlock<Block> SCORCHED_BLOCK = registerBlock("scorched_block",
            () -> new Block((BlockBehaviour.Properties.of()
                    .strength(8f).requiresCorrectToolForDrops().sound(SoundType.METAL).explosionResistance(10f))));

    //scorched ore - done
    public static final DeferredBlock<Block> SCORCHED_ORE = registerBlock("scorched_ore",
            () -> new DropExperienceBlock(UniformInt.of(5, 10),
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE).explosionResistance(12f)));


    //sapphire block - done
    public static final DeferredBlock<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            () -> new Block((BlockBehaviour.Properties.of()
                    .strength(7f).requiresCorrectToolForDrops().sound(SoundType.METAL).explosionResistance(2f))));

    //raw sapphire block
    public static final DeferredBlock<Block> RAW_SAPPHIRE_BLOCK = registerBlock("raw_sapphire_block",
            () -> new Block((BlockBehaviour.Properties.of()
                    .strength(7f).requiresCorrectToolForDrops().sound(SoundType.METAL).explosionResistance(2f))));

    //sapphire ore - done
    public static final DeferredBlock<Block> SAPPHIRE_ORE = registerBlock("sapphire_ore",
            () -> new DropExperienceBlock(UniformInt.of(5, 10),
                    BlockBehaviour.Properties.of().strength(7f).requiresCorrectToolForDrops().sound(SoundType.STONE).explosionResistance(3f)));

    //ruby block - done
    public static final DeferredBlock<Block> RUBY_BLOCK = registerBlock("ruby_block",
            () -> new Block((BlockBehaviour.Properties.of()
                    .strength(3f).requiresCorrectToolForDrops().sound(SoundType.METAL).explosionResistance(15f))));

    //raw ruby block
    public static final DeferredBlock<Block> RAW_RUBY_BLOCK = registerBlock("raw_ruby_block",
            () -> new Block((BlockBehaviour.Properties.of()
                    .strength(3f).requiresCorrectToolForDrops().sound(SoundType.METAL).explosionResistance(15f))));

    //ruby ore - done
    public static final DeferredBlock<Block> RUBY_ORE = registerBlock("ruby_ore",
            () -> new DropExperienceBlock(UniformInt.of(5, 10),
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE).explosionResistance(12f)));

    //bismuth block - done
    public static final DeferredBlock<Block> BISMUTH_BLOCK = registerBlock("bismuth_block",
            () -> new Block((BlockBehaviour.Properties.of()
                    .strength(5f).requiresCorrectToolForDrops().sound(SoundType.METAL).explosionResistance(6f))));

    //raw bismuth block
    public static final DeferredBlock<Block> RAW_BISMUTH_BLOCK = registerBlock("raw_bismuth_block",
            () -> new Block((BlockBehaviour.Properties.of()
                    .strength(5f).requiresCorrectToolForDrops().sound(SoundType.METAL).explosionResistance(6f))));

    //bismuth ore - done
    public static final DeferredBlock<Block> BISMUTH_ORE = registerBlock("bismuth_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 5),
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE).explosionResistance(7f)));


    private  static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }


    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
