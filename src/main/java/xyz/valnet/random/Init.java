package xyz.valnet.random;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(bus = Bus.MOD, modid = ExampleMod.MOD_ID)
//@ObjectHolder(ExampleMod.MOD_ID)
public class Init {
	
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		List<Item> itemList = Items.getItems();
		Item[] items = new Item[itemList.size()];
		itemList.toArray(items);

		event.getRegistry().register(Items.VALYRIAN_LOG);
		
//		event.getRegistry().registerAll(items);
	}
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
		List<Block> blockList = Blocks.getBlocks();
		Block[] blocks = new Block[blockList.size()];
		blockList.toArray(blocks);

		event.getRegistry().register(Blocks.VALYRIAN_LOG);
//		event.getRegistry().registerAll(blocks);
	}
}
