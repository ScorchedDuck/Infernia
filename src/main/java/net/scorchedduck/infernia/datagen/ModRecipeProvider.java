package net.scorchedduck.infernia.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
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

        List<ItemLike> SAPPHIRE_SMELTABLES = List.of(ModItems.RAW_SAPPHIRE,
                ModBlocks.SAPPHIRE_ORE);

        List<ItemLike> RUBY_SMELTABLES = List.of(ModItems.RAW_RUBY,
                ModBlocks.RUBY_ORE);

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


        //sapphire
        //shaped
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAPPHIRE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.SAPPHIRE.get())
                .unlockedBy("has_sapphire", has(ModItems.SAPPHIRE))
                .save(recipeOutput, "infernia:sapphire_block_from_sapphire");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_SAPPHIRE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.RAW_SAPPHIRE.get())
                .unlockedBy("has_raw_sapphire", has(ModItems.RAW_SAPPHIRE))
                .save(recipeOutput, "infernia:raw_sapphire_block_from_raw_sapphire");

        //shapeless
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 9)
                .requires(ModBlocks.SAPPHIRE_BLOCK)
                .unlockedBy("has_sapphire_block", has(ModBlocks.SAPPHIRE_BLOCK))
                .save(recipeOutput, "infernia:sapphire_from_sapphire_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_SAPPHIRE.get(), 9)
                .requires(ModBlocks.RAW_SAPPHIRE_BLOCK)
                .unlockedBy("has_raw_sapphire_block", has(ModBlocks.RAW_SAPPHIRE_BLOCK))
                .save(recipeOutput, "infernia:raw_sapphire_from_raw_sapphire_block");
        //smelting / blasting
        oreSmelting(recipeOutput, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 0.25f,200,"sapphire");
        oreBlasting(recipeOutput, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 0.25f,100,"sapphire");


        //ruby
        //shaped
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RUBY_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.RUBY.get())
                .unlockedBy("has_ruby", has(ModItems.RUBY))
                .save(recipeOutput, "infernia:ruby_block_from_ruby");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_RUBY_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.RAW_RUBY.get())
                .unlockedBy("has_raw_ruby", has(ModItems.RAW_RUBY))
                .save(recipeOutput, "infernia:raw_ruby_block_from_raw_ruby");

        //shapeless
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RUBY.get(), 9)
                .requires(ModBlocks.RUBY_BLOCK)
                .unlockedBy("has_ruby_block", has(ModBlocks.RUBY_BLOCK))
                .save(recipeOutput, "infernia:ruby_from_ruby_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_RUBY.get(), 9)
                .requires(ModBlocks.RAW_RUBY_BLOCK)
                .unlockedBy("has_raw_ruby_block", has(ModBlocks.RAW_RUBY_BLOCK))
                .save(recipeOutput, "infernia:raw_ruby_from_raw_ruby_block");
        //smelting / blasting
        oreSmelting(recipeOutput, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY.get(), 0.25f,200,"ruby");
        oreBlasting(recipeOutput, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY.get(), 0.25f,100,"ruby");


        //scorched / starlight
        //shaped
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SCORCHED_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.SCORCHED_INGOT.get())
                .unlockedBy("has_scorched_ingot_2", has(ModItems.SCORCHED_INGOT))
                .save(recipeOutput, "infernia:scorched_block_from_ingot");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SCORCHED_INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.SCORCHED_NUGGET.get())
                .unlockedBy("has_scorched_nugget", has(ModItems.SCORCHED_NUGGET))
                .save(recipeOutput, "infernia:scorched_ingot_from_nugget");

        //shapeless
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SCORCHED_INGOT.get(), 9)
                .requires(ModBlocks.SCORCHED_BLOCK)
                .unlockedBy("has_scorched_block", has(ModBlocks.SCORCHED_BLOCK))
                .save(recipeOutput, "infernia:scorched_ingot_out_of_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SCORCHED_NUGGET.get(), 9)
                .requires(ModItems.SCORCHED_INGOT)
                .unlockedBy("has_scorched_ingot", has(ModItems.SCORCHED_INGOT))
                .save(recipeOutput, "infernia:scorched_nugget_from_ingot");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.SAPPHIRE_LAMP.get())
                .requires(ModBlocks.SAPPHIRE_BLOCK)
                .requires(Blocks.REDSTONE_LAMP)
                .unlockedBy("has_redstone_lamp", has(Blocks.REDSTONE_LAMP))
                .save(recipeOutput, "infernia:sapphire_lamp_rec");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.RUBY_LAMP.get())
                .requires(ModBlocks.RUBY_BLOCK)
                .requires(Blocks.REDSTONE_LAMP)
                .unlockedBy("has_redstone_lamp", has(Blocks.REDSTONE_LAMP))
                .save(recipeOutput, "infernia:ruby_lamp_rec");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.BISMUTH_LAMP.get())
                .requires(ModBlocks.BISMUTH_BLOCK)
                .requires(Blocks.REDSTONE_LAMP)
                .unlockedBy("has_redstone_lamp", has(Blocks.REDSTONE_LAMP))
                .save(recipeOutput, "infernia:bismuth_lamp_rec");

        //idc
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STARLIGHT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.SCORCHED_BLOCK.get())
                .unlockedBy("has_scorched_block", has(ModBlocks.SCORCHED_BLOCK))
                .save(recipeOutput, "infernia:starlight_get");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.STARLIGHT_ASHES.get(), 9)
                .requires(ModBlocks.STARLIGHT)
                .unlockedBy("has_starlight", has(ModBlocks.STARLIGHT))
                .save(recipeOutput, "infernia:starlight_ashes_get");

        //misc

        //chisel
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CHISEL.get())
                .pattern(" A ")
                .pattern(" B ")
                .pattern(" B ")
                .define('A', ModItems.BISMUTH.get())
                .define('B', Items.STICK)
                .unlockedBy("has_bismuth_2", has(ModItems.BISMUTH))
                .save(recipeOutput, "infernia:chisel_get");

        //mod cooker block

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MOD_COOKER_BLOCK.get())
                .pattern("CAC")
                .pattern("ABA")
                .pattern("CAC")
                .define('A', ModBlocks.RUBY_BLOCK.get())
                .define('B', ModBlocks.STARLIGHT)
                .define('C', ModItems.STARLIGHT_ASHES)
                .unlockedBy("has_starlight_ashes_and_block", has(ModItems.STARLIGHT_ASHES))
                .save(recipeOutput, "infernia:mod_cooker_block_get");




        stairBuilder(ModBlocks.BISMUTH_STAIRS.get(), Ingredient.of(ModItems.BISMUTH)).group("bismuth")
                .unlockedBy("has_bismuth", has(ModItems.BISMUTH)).save(recipeOutput);

        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BISMUTH_SLAB.get(), ModItems.BISMUTH.get());

        buttonBuilder(ModBlocks.BISMUTH_BUTTON.get(), Ingredient.of(ModItems.BISMUTH.get())).group("bismuth")
                .unlockedBy("has_bismuth", has(ModItems.BISMUTH.get())).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.BISMUTH_PRESSURE_PLATE.get(), ModItems.BISMUTH.get());

        fenceBuilder(ModBlocks.BISMUTH_FENCE.get(), Ingredient.of(ModItems.BISMUTH.get())).group("bismuth")
                .unlockedBy("has_bismuth", has(ModItems.BISMUTH.get())).save(recipeOutput);
        fenceGateBuilder(ModBlocks.BISMUTH_FENCE_GATE.get(), Ingredient.of(ModItems.BISMUTH.get())).group("bismuth")
                .unlockedBy("has_bismuth", has(ModItems.BISMUTH.get())).save(recipeOutput);
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BISMUTH_WALL.get(), ModItems.BISMUTH.get());

        doorBuilder(ModBlocks.BISMUTH_DOOR.get(), Ingredient.of(ModItems.BISMUTH.get())).group("bismuth")
                .unlockedBy("has_bismuth", has(ModItems.BISMUTH.get())).save(recipeOutput);
        trapdoorBuilder(ModBlocks.BISMUTH_TRAPDOOR.get(), Ingredient.of(ModItems.BISMUTH.get())).group("bismuth")
                .unlockedBy("has_bismuth", has(ModItems.BISMUTH.get())).save(recipeOutput);



        stairBuilder(ModBlocks.RUBY_STAIRS.get(), Ingredient.of(ModItems.RUBY)).group("ruby")
                .unlockedBy("has_ruby", has(ModItems.RUBY)).save(recipeOutput);

        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBY_SLAB.get(), ModItems.RUBY.get());

        buttonBuilder(ModBlocks.RUBY_BUTTON.get(), Ingredient.of(ModItems.RUBY.get())).group("ruby")
                .unlockedBy("has_ruby", has(ModItems.RUBY.get())).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.RUBY_PRESSURE_PLATE.get(), ModItems.RUBY.get());

        fenceBuilder(ModBlocks.RUBY_FENCE.get(), Ingredient.of(ModItems.RUBY.get())).group("ruby")
                .unlockedBy("has_ruby", has(ModItems.RUBY.get())).save(recipeOutput);
        fenceGateBuilder(ModBlocks.RUBY_FENCE_GATE.get(), Ingredient.of(ModItems.RUBY.get())).group("ruby")
                .unlockedBy("has_ruby", has(ModItems.RUBY.get())).save(recipeOutput);
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBY_WALL.get(), ModItems.RUBY.get());

        doorBuilder(ModBlocks.RUBY_DOOR.get(), Ingredient.of(ModItems.RUBY.get())).group("bismuth")
                .unlockedBy("has_bismuth", has(ModItems.RUBY.get())).save(recipeOutput);
        trapdoorBuilder(ModBlocks.RUBY_TRAPDOOR.get(), Ingredient.of(ModItems.BISMUTH.get())).group("bismuth")
                .unlockedBy("has_bismuth", has(ModItems.RUBY.get())).save(recipeOutput);



        stairBuilder(ModBlocks.SAPPHIRE_STAIRS.get(), Ingredient.of(ModItems.SAPPHIRE)).group("sapphire")
                .unlockedBy("has_sapphire", has(ModItems.SAPPHIRE)).save(recipeOutput);

        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SAPPHIRE_SLAB.get(), ModItems.SAPPHIRE.get());

        buttonBuilder(ModBlocks.SAPPHIRE_BUTTON.get(), Ingredient.of(ModItems.SAPPHIRE.get())).group("sapphire")
                .unlockedBy("has_sapphire", has(ModItems.SAPPHIRE.get())).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.SAPPHIRE_PRESSURE_PLATE.get(), ModItems.SAPPHIRE.get());

        fenceBuilder(ModBlocks.SAPPHIRE_FENCE.get(), Ingredient.of(ModItems.SAPPHIRE.get())).group("sapphire")
                .unlockedBy("has_sapphire", has(ModItems.SAPPHIRE.get())).save(recipeOutput);
        fenceGateBuilder(ModBlocks.SAPPHIRE_FENCE_GATE.get(), Ingredient.of(ModItems.SAPPHIRE.get())).group("sapphire")
                .unlockedBy("has_sapphire", has(ModItems.SAPPHIRE.get())).save(recipeOutput);
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SAPPHIRE_WALL.get(), ModItems.SAPPHIRE.get());

        doorBuilder(ModBlocks.SAPPHIRE_DOOR.get(), Ingredient.of(ModItems.SAPPHIRE.get())).group("sapphire")
                .unlockedBy("has_sapphire", has(ModItems.SAPPHIRE.get())).save(recipeOutput);
        trapdoorBuilder(ModBlocks.SAPPHIRE_TRAPDOOR.get(), Ingredient.of(ModItems.SAPPHIRE.get())).group("sapphire")
                .unlockedBy("has_sapphire", has(ModItems.SAPPHIRE.get())).save(recipeOutput);



        stairBuilder(ModBlocks.SCORCHED_STAIRS.get(), Ingredient.of(ModItems.SCORCHED_INGOT)).group("scorched")
                .unlockedBy("has_scorched", has(ModItems.SCORCHED_INGOT)).save(recipeOutput);

        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SCORCHED_SLAB.get(), ModItems.SCORCHED_INGOT.get());

        buttonBuilder(ModBlocks.SCORCHED_BUTTON.get(), Ingredient.of(ModItems.SCORCHED_INGOT.get())).group("scorched")
                .unlockedBy("has_scorched", has(ModItems.SCORCHED_INGOT.get())).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.SCORCHED_PRESSURE_PLATE.get(), ModItems.SCORCHED_INGOT.get());

        fenceBuilder(ModBlocks.SCORCHED_FENCE.get(), Ingredient.of(ModItems.SCORCHED_INGOT.get())).group("scorched")
                .unlockedBy("has_scorched", has(ModItems.SCORCHED_INGOT.get())).save(recipeOutput);
        fenceGateBuilder(ModBlocks.SCORCHED_FENCE_GATE.get(), Ingredient.of(ModItems.SCORCHED_INGOT.get())).group("scorched")
                .unlockedBy("has_scorched", has(ModItems.SCORCHED_INGOT.get())).save(recipeOutput);
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SCORCHED_WALL.get(), ModItems.SCORCHED_INGOT.get());

        doorBuilder(ModBlocks.SCORCHED_DOOR.get(), Ingredient.of(ModItems.SCORCHED_INGOT.get())).group("scorched")
                .unlockedBy("has_scorched", has(ModItems.SCORCHED_INGOT.get())).save(recipeOutput);
        trapdoorBuilder(ModBlocks.SCORCHED_TRAPDOOR.get(), Ingredient.of(ModItems.SCORCHED_INGOT.get())).group("scorched")
                .unlockedBy("has_scorched", has(ModItems.SCORCHED_INGOT.get())).save(recipeOutput);
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
