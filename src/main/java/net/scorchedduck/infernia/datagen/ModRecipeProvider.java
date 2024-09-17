package net.scorchedduck.infernia.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.scorchedduck.infernia.Infernia;
import net.scorchedduck.infernia.block.ModBlocks;
import net.scorchedduck.infernia.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        List<ItemLike> BISMUTH_SMELTABLES = List.of(ModItems.RAW_BISMUTH,
                ModBlocks.BISMUTH_ORE);

        //bismuth
        //shaped
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BISMUTH_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.BISMUTH.get())
                .unlockedBy("has_bismuth", has(ModItems.BISMUTH))
                .save(recipeOutput, "infernia:bismuth_block_from_bismuth");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_BISMUTH_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.RAW_BISMUTH.get())
                .unlockedBy("has_raw_bismuth", has(ModItems.RAW_BISMUTH))
                .save(recipeOutput, "infernia:raw_bismuth_block_from_raw_bismuth");

        //shapeless
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BISMUTH.get(), 9)
                .requires(ModBlocks.BISMUTH_BLOCK)
                .unlockedBy("has_bismuth_block", has(ModBlocks.BISMUTH_BLOCK))
                .save(recipeOutput, "infernia:bismuth_from_bismuth_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_BISMUTH.get(), 9)
                .requires(ModBlocks.RAW_BISMUTH_BLOCK)
                .unlockedBy("has_raw_bismuth_block", has(ModBlocks.RAW_BISMUTH_BLOCK))
                .save(recipeOutput, "infernia:raw_bismuth_from_raw_bismuth_block");
        //smelting / blasting
        oreSmelting(recipeOutput, BISMUTH_SMELTABLES, RecipeCategory.MISC, ModItems.BISMUTH.get(), 0.25f,200,"bismuth");
        oreBlasting(recipeOutput, BISMUTH_SMELTABLES, RecipeCategory.MISC, ModItems.BISMUTH.get(), 0.25f,100,"bismuth");
    }













//stuff
    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, Infernia.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
