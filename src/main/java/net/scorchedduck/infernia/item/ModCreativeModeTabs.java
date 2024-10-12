package net.scorchedduck.infernia.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.scorchedduck.infernia.Infernia;
import net.scorchedduck.infernia.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Infernia.MOD_ID);

    public static final Supplier<CreativeModeTab> INFERNIA_ITEMS_TAB = CREATIVE_MODE_TAB.register("infernia_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BISMUTH.get()))
                    .title(Component.translatable("creativetab.infernia.infernia_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.BISMUTH);
                        output.accept(ModItems.RAW_BISMUTH);
                        output.accept(ModItems.RAW_SAPPHIRE);
                        output.accept(ModItems.RAW_RUBY);
                        output.accept(ModItems.RUBY);
                        output.accept(ModItems.SAPPHIRE);
                        output.accept(ModItems.SCORCHED_INGOT);
                        output.accept(ModItems.SCORCHED_NUGGET);
                        output.accept(ModItems.CHISEL);
                        output.accept(ModItems.RADISH);
                        output.accept(ModItems.STARLIGHT_ASHES);
                        output.accept(ModItems.FROSTFIRE_ICE);
                        
                        output.accept(ModItems.BISMUTH_SWORD);
                        output.accept(ModItems.BISMUTH_AXE);
                        output.accept(ModItems.BISMUTH_HOE);
                        output.accept(ModItems.BISMUTH_SHOVEL);
                        output.accept(ModItems.BISMUTH_PICKAXE);

                        output.accept(ModItems.RUBY_SWORD);
                        output.accept(ModItems.RUBY_AXE);
                        output.accept(ModItems.RUBY_HOE);
                        output.accept(ModItems.RUBY_SHOVEL);
                        output.accept(ModItems.RUBY_PICKAXE);

                        output.accept(ModItems.SAPPHIRE_SWORD);
                        output.accept(ModItems.SAPPHIRE_AXE);
                        output.accept(ModItems.SAPPHIRE_HOE);
                        output.accept(ModItems.SAPPHIRE_SHOVEL);
                        output.accept(ModItems.SAPPHIRE_PICKAXE);

                        output.accept(ModItems.SCORCHED_SWORD);
                        output.accept(ModItems.SCORCHED_AXE);
                        output.accept(ModItems.SCORCHED_HOE);
                        output.accept(ModItems.SCORCHED_SHOVEL);
                        output.accept(ModItems.SCORCHED_PICKAXE);

                        output.accept(ModItems.BISMUTH_HAMMER);

                        output.accept(ModItems.BISMUTH_HELMET);
                        output.accept(ModItems.BISMUTH_CHESTPLATE);
                        output.accept(ModItems.BISMUTH_LEGGINGS);
                        output.accept(ModItems.BISMUTH_BOOTS);
                        
                    }).build());

    public static final Supplier<CreativeModeTab> INFERNIA_BLOCKS_TAB = CREATIVE_MODE_TAB.register("infernia_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.BISMUTH_BLOCK.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(Infernia.MOD_ID, "infernia_items_tab"))
                    .title(Component.translatable("creativetab.infernia.infernia_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.BISMUTH_ORE);
                        output.accept(ModBlocks.BISMUTH_BLOCK);
                        output.accept(ModBlocks.SCORCHED_BLOCK);
                        output.accept(ModBlocks.SCORCHED_ORE);
                        output.accept(ModBlocks.SAPPHIRE_BLOCK);
                        output.accept(ModBlocks.SAPPHIRE_ORE);
                        output.accept(ModBlocks.RUBY_BLOCK);
                        output.accept(ModBlocks.RUBY_ORE);
                        output.accept(ModBlocks.RAW_RUBY_BLOCK);
                        output.accept(ModBlocks.RAW_SAPPHIRE_BLOCK);
                        output.accept(ModBlocks.RAW_BISMUTH_BLOCK);
                        output.accept(ModBlocks.MOD_COOKER_BLOCK);
                        output.accept(ModBlocks.STARLIGHT);
                        output.accept(ModBlocks.BISMUTH_LAMP);
                        output.accept(ModBlocks.RUBY_LAMP);
                        output.accept(ModBlocks.SAPPHIRE_LAMP);

                        output.accept(ModBlocks.BISMUTH_STAIRS);
                        output.accept(ModBlocks.BISMUTH_SLAB);
                        output.accept(ModBlocks.BISMUTH_BUTTON);
                        output.accept(ModBlocks.BISMUTH_PRESSURE_PLATE);
                        output.accept(ModBlocks.BISMUTH_DOOR);
                        output.accept(ModBlocks.BISMUTH_TRAPDOOR);
                        output.accept(ModBlocks.BISMUTH_WALL);
                        output.accept(ModBlocks.BISMUTH_FENCE);
                        output.accept(ModBlocks.BISMUTH_FENCE_GATE);

                        output.accept(ModBlocks.RUBY_STAIRS);
                        output.accept(ModBlocks.RUBY_SLAB);
                        output.accept(ModBlocks.RUBY_BUTTON);
                        output.accept(ModBlocks.RUBY_PRESSURE_PLATE);
                        output.accept(ModBlocks.RUBY_DOOR);
                        output.accept(ModBlocks.RUBY_TRAPDOOR);
                        output.accept(ModBlocks.RUBY_WALL);
                        output.accept(ModBlocks.RUBY_FENCE);
                        output.accept(ModBlocks.RUBY_FENCE_GATE);

                        output.accept(ModBlocks.SAPPHIRE_STAIRS);
                        output.accept(ModBlocks.SAPPHIRE_SLAB);
                        output.accept(ModBlocks.SAPPHIRE_BUTTON);
                        output.accept(ModBlocks.SAPPHIRE_PRESSURE_PLATE);
                        output.accept(ModBlocks.SAPPHIRE_DOOR);
                        output.accept(ModBlocks.SAPPHIRE_TRAPDOOR);
                        output.accept(ModBlocks.SAPPHIRE_WALL);
                        output.accept(ModBlocks.SAPPHIRE_FENCE);
                        output.accept(ModBlocks.SAPPHIRE_FENCE_GATE);

                        output.accept(ModBlocks.SCORCHED_STAIRS);
                        output.accept(ModBlocks.SCORCHED_SLAB);
                        output.accept(ModBlocks.SCORCHED_BUTTON);
                        output.accept(ModBlocks.SCORCHED_PRESSURE_PLATE);
                        output.accept(ModBlocks.SCORCHED_DOOR);
                        output.accept(ModBlocks.SCORCHED_TRAPDOOR);
                        output.accept(ModBlocks.SCORCHED_WALL);
                        output.accept(ModBlocks.SCORCHED_FENCE);
                        output.accept(ModBlocks.SCORCHED_FENCE_GATE);


                    }).build());

    public static final Supplier<CreativeModeTab> INFERNIA_ENTITIES_TAB = CREATIVE_MODE_TAB.register("infernia_entities_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.BISMUTH_BLOCK.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(Infernia.MOD_ID, "infernia_blocks_tab"))
                    .title(Component.translatable("creativetab.infernia.infernia_entities"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.BISMUTH);
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }


}
