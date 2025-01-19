
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rollylindenshnizzer.abandonedwellings.init;

import net.rollylindenshnizzer.abandonedwellings.block.AbandonedDwellingsPersonInTheSkyBlock;
import net.rollylindenshnizzer.abandonedwellings.block.AbandonedDwellingsMossyCobblestoneCrossBlock;
import net.rollylindenshnizzer.abandonedwellings.block.AbandonedDwellingsCobblestoneCrossBlock;
import net.rollylindenshnizzer.abandonedwellings.AbandonedDwellingsMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

public class AbandonedDwellingsModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(AbandonedDwellingsMod.MODID);
	public static final DeferredBlock<Block> ABANDONED_DWELLINGS_COBBLESTONE_CROSS = REGISTRY.register("abandoned_dwellings_cobblestone_cross", AbandonedDwellingsCobblestoneCrossBlock::new);
	public static final DeferredBlock<Block> ABANDONED_DWELLINGS_MOSSY_COBBLESTONE_CROSS = REGISTRY.register("abandoned_dwellings_mossy_cobblestone_cross", AbandonedDwellingsMossyCobblestoneCrossBlock::new);
	public static final DeferredBlock<Block> ABANDONED_DWELLINGS_PERSON_IN_THE_SKY = REGISTRY.register("abandoned_dwellings_person_in_the_sky", AbandonedDwellingsPersonInTheSkyBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
