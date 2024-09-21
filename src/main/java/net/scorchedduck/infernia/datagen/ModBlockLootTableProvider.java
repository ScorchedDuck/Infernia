package net.scorchedduck.infernia.datagen;

import net.scorchedduck.infernia.block.ModBlocks;
import net.scorchedduck.infernia.item.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.BISMUTH_BLOCK.get());
        dropSelf(ModBlocks.MOD_COOKER_BLOCK.get());
        dropSelf(ModBlocks.SAPPHIRE_BLOCK.get());
        dropSelf(ModBlocks.RUBY_BLOCK.get());
        dropSelf(ModBlocks.RAW_BISMUTH_BLOCK.get());
        dropSelf(ModBlocks.RAW_RUBY_BLOCK.get());
        dropSelf(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
        dropSelf(ModBlocks.SCORCHED_BLOCK.get());
        dropSelf(ModBlocks.STARLIGHT.get());
        add(ModBlocks.BISMUTH_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.BISMUTH_ORE.get(), ModItems.RAW_BISMUTH.get(),2,5));
        add(ModBlocks.RUBY_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.RUBY_ORE.get(), ModItems.RAW_RUBY.get(),2,5));
        add(ModBlocks.SAPPHIRE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get(),2,5));
        add(ModBlocks.SCORCHED_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.SCORCHED_ORE.get(), ModItems.SCORCHED_INGOT.get(),2,5));

        dropSelf(ModBlocks.BISMUTH_STAIRS.get());
        add(ModBlocks.BISMUTH_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.BISMUTH_SLAB.get()));
        dropSelf(ModBlocks.BISMUTH_FENCE.get());
        dropSelf(ModBlocks.BISMUTH_FENCE_GATE.get());
        dropSelf(ModBlocks.BISMUTH_WALL.get());
        dropSelf(ModBlocks.BISMUTH_BUTTON.get());
        dropSelf(ModBlocks.BISMUTH_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.BISMUTH_TRAPDOOR.get());
        add(ModBlocks.BISMUTH_DOOR.get(),
                block -> createDoorTable(ModBlocks.BISMUTH_DOOR.get()));

        dropSelf(ModBlocks.RUBY_STAIRS.get());
        add(ModBlocks.RUBY_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.RUBY_SLAB.get()));
        dropSelf(ModBlocks.RUBY_FENCE.get());
        dropSelf(ModBlocks.RUBY_FENCE_GATE.get());
        dropSelf(ModBlocks.RUBY_WALL.get());
        dropSelf(ModBlocks.RUBY_BUTTON.get());
        dropSelf(ModBlocks.RUBY_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.RUBY_TRAPDOOR.get());
        add(ModBlocks.RUBY_DOOR.get(),
                block -> createDoorTable(ModBlocks.RUBY_DOOR.get()));

        dropSelf(ModBlocks.SAPPHIRE_STAIRS.get());
        add(ModBlocks.SAPPHIRE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SAPPHIRE_SLAB.get()));
        dropSelf(ModBlocks.SAPPHIRE_FENCE.get());
        dropSelf(ModBlocks.SAPPHIRE_FENCE_GATE.get());
        dropSelf(ModBlocks.SAPPHIRE_WALL.get());
        dropSelf(ModBlocks.SAPPHIRE_BUTTON.get());
        dropSelf(ModBlocks.SAPPHIRE_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.SAPPHIRE_TRAPDOOR.get());
        add(ModBlocks.SAPPHIRE_DOOR.get(),
                block -> createDoorTable(ModBlocks.SAPPHIRE_DOOR.get()));

        dropSelf(ModBlocks.SCORCHED_STAIRS.get());
        add(ModBlocks.SCORCHED_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SCORCHED_SLAB.get()));
        dropSelf(ModBlocks.SCORCHED_FENCE.get());
        dropSelf(ModBlocks.SCORCHED_FENCE_GATE.get());
        dropSelf(ModBlocks.SCORCHED_WALL.get());
        dropSelf(ModBlocks.SCORCHED_BUTTON.get());
        dropSelf(ModBlocks.SCORCHED_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.SCORCHED_TRAPDOOR.get());
        add(ModBlocks.SCORCHED_DOOR.get(),
                block -> createDoorTable(ModBlocks.SCORCHED_DOOR.get()));

    }


    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }


    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
