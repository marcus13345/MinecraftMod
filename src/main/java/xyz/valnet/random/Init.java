package xyz.valnet.random;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item.Properties;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.common.ModDimension;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.IForgeRegistry;
import xyz.valnet.random.dimension.QVerseModDimension;

@Mod.EventBusSubscriber(bus = Bus.MOD, modid = ExampleMod.MOD_ID)
public class Init {
	
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		// List<Item> itemList = Items.getItems();
		// Item[] items = new Item[itemList.size()];
		// itemList.toArray(items);

		// event.getRegistry().register(Items.VALYRIAN_LOG);
	}
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
		List<Block> blockList = Blocks.getBlocks();
		Block[] blocks = new Block[blockList.size()];
		blockList.toArray(blocks);

		event.getRegistry().register(Blocks.VALYRIAN_LOG);
	}
	
	@SubscribeEvent
	public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
		IForgeRegistry<Item> registry = event.getRegistry();

		for(Block block : Blocks.getBlocks()) {
			Item blockItem = new BlockItem(
				block,
				new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)
			).setRegistryName(block.getRegistryName() + "_item");

			registry.register(blockItem);
		}
	}

	@SubscribeEvent
	public static void onDimensionRegistryEvent(RegistryEvent.Register<ModDimension> event) {
		IForgeRegistry<ModDimension> registry = event.getRegistry();
		registry.register(Dimensions.QVERSE_MOD_DIMENSION);
	}

	
}
