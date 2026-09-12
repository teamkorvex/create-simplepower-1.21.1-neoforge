package com.seagullsz.createsimplepower.datagen;

import java.util.concurrent.CompletableFuture;

import com.seagullsz.createsimplepower.CreateSimplePower;
import com.simibubi.create.api.data.recipe.BaseRecipeProvider.GeneratedRecipe;
import com.simibubi.create.api.data.recipe.EmptyingRecipeGen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.material.Fluids;
import net.neoforged.neoforge.fluids.FluidStack;

/**
 * Emptying recipe generator. Shows a fluid result, declared with withFluidOutputs.
 */
public class CreateSimplePowerEmptyingRecipeGen extends EmptyingRecipeGen {

    GeneratedRecipe EXAMPLE = create("createsimplepower_emptying", b -> b
            .require(Items.WATER_BUCKET)
            .output(Items.BUCKET)
            .withFluidOutputs(new FluidStack(Fluids.WATER, 1000)));

    public CreateSimplePowerEmptyingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateSimplePower.ID);
    }
}
