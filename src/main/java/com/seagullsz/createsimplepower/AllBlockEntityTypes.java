package com.seagullsz.createsimplepower;

import com.seagullsz.createsimplepower.content.kinetics.CreateSimplePowerGeneratorBlockEntity;
import com.seagullsz.createsimplepower.content.kinetics.CreateSimplePowerKineticBlockEntity;
import com.seagullsz.createsimplepower.content.kinetics.CreateSimplePowerShaftRenderer;
import com.simibubi.create.content.kinetics.base.ShaftVisual;
import com.tterrag.registrate.util.entry.BlockEntityEntry;

/**
 * Block entity type registration.
 */
public class AllBlockEntityTypes {

    /**
     * Block entity for EXAMPLE_KINETIC_BLOCK, rendered with CreateSimplePowerShaftRenderer so a
     * shaft visibly spins through the casing.
     */
    public static final BlockEntityEntry<CreateSimplePowerKineticBlockEntity> EXAMPLE_KINETIC = CreateSimplePower.REGISTRATE
            .blockEntity("createsimplepower_kinetic", CreateSimplePowerKineticBlockEntity::new)
            // visual for flywheel renderer
            .visual(() -> ShaftVisual::new)
            .validBlock(AllBlocks.EXAMPLE_KINETIC_BLOCK)
            // fallback renderer if flywheel is not available
            .renderer(() -> CreateSimplePowerShaftRenderer::new)
            .register();

    /**
     * Block entity for EXAMPLE_GENERATOR_BLOCK, also rendered with CreateSimplePowerShaftRenderer.
     */
    public static final BlockEntityEntry<CreateSimplePowerGeneratorBlockEntity> EXAMPLE_GENERATOR = CreateSimplePower.REGISTRATE
            .blockEntity("createsimplepower_generator", CreateSimplePowerGeneratorBlockEntity::new)
            .visual(() -> ShaftVisual::new)
            .validBlock(AllBlocks.EXAMPLE_GENERATOR_BLOCK)
            .renderer(() -> CreateSimplePowerShaftRenderer::new)
            .register();

    public static void register() {
        // Force class loading to trigger Registrate calls
    }
}
