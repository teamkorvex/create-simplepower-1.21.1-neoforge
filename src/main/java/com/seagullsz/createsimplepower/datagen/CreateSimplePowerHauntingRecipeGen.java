package com.seagullsz.createsimplepower.datagen;

import java.util.concurrent.CompletableFuture;

import com.seagullsz.createsimplepower.AllItems;
import com.seagullsz.createsimplepower.CreateSimplePower;
import com.simibubi.create.api.data.recipe.BaseRecipeProvider.GeneratedRecipe;
import com.simibubi.create.api.data.recipe.HauntingRecipeGen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;

/**
 * Haunting recipe generator. The convert helper is shorthand for a single-input,
 * single-output recipe.
 */
public class CreateSimplePowerHauntingRecipeGen extends HauntingRecipeGen {

    GeneratedRecipe EXAMPLE = convert(AllItems.EXAMPLE_ITEM.get(), AllItems.EXAMPLE_RESULT.get());

    public CreateSimplePowerHauntingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateSimplePower.ID);
    }
}
