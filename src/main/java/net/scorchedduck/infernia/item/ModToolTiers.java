package net.scorchedduck.infernia.item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.scorchedduck.infernia.util.ModTags;

public class ModToolTiers {
    public static final Tier BISMUTH = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_BISMUTH_TOOL,
            8000,6f,10f,50, () -> Ingredient.of(ModItems.BISMUTH));

    public static final Tier RUBY = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_RUBY_TOOL,
            1200,15f,3f,5, () -> Ingredient.of(ModItems.RUBY));

    public static final Tier SAPPHIRE = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_SAPPHIRE_TOOL,
            10000,3f,5f,10, () -> Ingredient.of(ModItems.SAPPHIRE));

    public static final Tier SCORCHED = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_SCORCHED_TOOL,
            500,15f,20f,100, () -> Ingredient.of(ModItems.SCORCHED_INGOT));
}
