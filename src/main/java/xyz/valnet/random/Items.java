package xyz.valnet.random;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class Items {
	
	public static final Item VALYRIAN_LOG = new BlockItem(
			Blocks.VALYRIAN_LOG,
			new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)
	).setRegistryName("asd");
	
	
	public static List<Item> getItems() {
		List<Item> list = new ArrayList<Item>();
		
		list.add(VALYRIAN_LOG);
		
		return list;
	}
}
