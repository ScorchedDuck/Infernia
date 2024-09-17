package net.scorchedduck.infernia.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.scorchedduck.infernia.Infernia;
import net.scorchedduck.infernia.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Infernia.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.BISMUTH.get());
        basicItem(ModItems.RAW_BISMUTH.get());
        basicItem(ModItems.SAPPHIRE.get());
        basicItem(ModItems.RAW_SAPPHIRE.get());
        basicItem(ModItems.RUBY.get());
        basicItem(ModItems.RAW_RUBY.get());
        basicItem(ModItems.SCORCHED_INGOT.get());
        basicItem(ModItems.SCORCHED_NUGGET.get());
        basicItem(ModItems.STARLIGHT_ASHES.get());
        basicItem(ModItems.FROSTFIRE_ICE.get());
        basicItem(ModItems.RADISH.get());
        basicItem(ModItems.CHISEL.get());
    }
}
