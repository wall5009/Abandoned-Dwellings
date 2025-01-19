
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rollylindenshnizzer.abandonedwellings.init;

import net.rollylindenshnizzer.abandonedwellings.AbandonedDwellingsMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class AbandonedDwellingsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(AbandonedDwellingsMod.MODID);
	public static final DeferredItem<Item> ABANDONED_DWELLINGS_COBBLESTONE_CROSS = block(AbandonedDwellingsModBlocks.ABANDONED_DWELLINGS_COBBLESTONE_CROSS);
	public static final DeferredItem<Item> ABANDONED_DWELLINGS_MOSSY_COBBLESTONE_CROSS = block(AbandonedDwellingsModBlocks.ABANDONED_DWELLINGS_MOSSY_COBBLESTONE_CROSS);
	public static final DeferredItem<Item> ABANDONED_DWELLINGS_PERSON_IN_THE_SKY = block(AbandonedDwellingsModBlocks.ABANDONED_DWELLINGS_PERSON_IN_THE_SKY);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
