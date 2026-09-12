package com.seagullsz.createsimplepower;

import com.seagullsz.createsimplepower.content.display.CreateSimplePowerDisplaySource;
import com.simibubi.create.api.behaviour.display.DisplaySource;
import com.tterrag.registrate.util.entry.RegistryEntry;

/**
 * Display source registration. Attach an entry to a block in AllBlocks with
 * transform(DisplaySource.displaySource(entry)).
 */
public class AllDisplaySources {

    public static final RegistryEntry<DisplaySource, CreateSimplePowerDisplaySource> EXAMPLE_SOURCE = CreateSimplePower.REGISTRATE
            .displaySource("createsimplepower_source", CreateSimplePowerDisplaySource::new)
            .register();

    public static void register() {
        // Force class loading to trigger Registrate calls
    }
}
