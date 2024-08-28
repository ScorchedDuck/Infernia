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
