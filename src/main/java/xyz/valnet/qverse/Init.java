package xyz.valnet.qverse;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.ModDimension;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(bus = Bus.MOD, modid = QVerse.MOD_ID)
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
	public static void registerBiomes(final RegistryEvent.Register<Biome> event) {
		IForgeRegistry<Biome> registry = event.getRegistry();

		for(Biome biome : Biomes.getBiomes()) {
			registry.register(biome);
		}
	}

	@SubscribeEvent
	public static void onDimensionRegistryEvent(RegistryEvent.Register<ModDimension> event) {
		IForgeRegistry<ModDimension> registry = event.getRegistry();

		for(ModDimension dim : Dimensions.getDimensions()) {
			registry.register(dim);
		}
	}

	
}
