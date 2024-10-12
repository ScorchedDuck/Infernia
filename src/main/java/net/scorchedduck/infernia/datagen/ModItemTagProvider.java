package net.scorchedduck.infernia.datagen;

import net.minecraft.tags.ItemTags;
import net.scorchedduck.infernia.Infernia;
import net.scorchedduck.infernia.item.ModItems;
import net.scorchedduck.infernia.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, Infernia.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(Items.COAL);


        tag(ItemTags.SWORDS)
                .add(ModItems.BISMUTH_SWORD.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.BISMUTH_PICKAXE.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.BISMUTH_SHOVEL.get());
        tag(ItemTags.HOES)
                .add(ModItems.BISMUTH_HOE.get());
        tag(ItemTags.AXES)
                .add(ModItems.BISMUTH_AXE.get());

        tag(ItemTags.SWORDS)
                .add(ModItems.RUBY_SWORD.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.RUBY_PICKAXE.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.RUBY_SHOVEL.get());
        tag(ItemTags.HOES)
                .add(ModItems.RUBY_HOE.get());
        tag(ItemTags.AXES)
                .add(ModItems.RUBY_AXE.get());

        tag(ItemTags.SWORDS)
                .add(ModItems.SAPPHIRE_SWORD.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.SAPPHIRE_PICKAXE.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.SAPPHIRE_SHOVEL.get());
        tag(ItemTags.HOES)
                .add(ModItems.SAPPHIRE_HOE.get());
        tag(ItemTags.AXES)
                .add(ModItems.SAPPHIRE_AXE.get());

        tag(ItemTags.SWORDS)
                .add(ModItems.SCORCHED_SWORD.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.SCORCHED_PICKAXE.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.SCORCHED_SHOVEL.get());
        tag(ItemTags.HOES)
                .add(ModItems.SCORCHED_HOE.get());
        tag(ItemTags.AXES)
                .add(ModItems.SCORCHED_AXE.get());

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.BISMUTH_HELMET.get())
                .add(ModItems.BISMUTH_CHESTPLATE.get())
                .add(ModItems.BISMUTH_LEGGINGS.get())
                .add(ModItems.BISMUTH_BOOTS.get());
        

    }
}