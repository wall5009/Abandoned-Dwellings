
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rollylindenshnizzer.abandonedwellings.init;

import net.rollylindenshnizzer.abandonedwellings.AbandonedDwellingsMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class AbandonedDwellingsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AbandonedDwellingsMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ABANDONED_DWELLINGS_CREATIVE_TAB = REGISTRY.register("abandoned_dwellings_creative_tab", () -> CreativeModeTab.builder()
			.title(Component.translatable("item_group.abandoned_dwellings.abandoned_dwellings_creative_tab")).icon(() -> new ItemStack(AbandonedDwellingsModBlocks.ABANDONED_DWELLINGS_COBBLESTONE_CROSS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(AbandonedDwellingsModBlocks.ABANDONED_DWELLINGS_COBBLESTONE_CROSS.get().asItem());
				tabData.accept(AbandonedDwellingsModBlocks.ABANDONED_DWELLINGS_MOSSY_COBBLESTONE_CROSS.get().asItem());
				tabData.accept(AbandonedDwellingsModBlocks.ABANDONED_DWELLINGS_PERSON_IN_THE_SKY.get().asItem());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(AbandonedDwellingsModBlocks.ABANDONED_DWELLINGS_COBBLESTONE_CROSS.get().asItem());
			tabData.accept(AbandonedDwellingsModBlocks.ABANDONED_DWELLINGS_MOSSY_COBBLESTONE_CROSS.get().asItem());
		}
	}
}
