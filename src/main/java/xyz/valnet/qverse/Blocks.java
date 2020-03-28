package xyz.valnet.qverse;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.Block.Properties;
import net.minecraft.block.material.Material;
import xyz.valnet.qverse.blocks.ValyrianLog;

public class Blocks {
	
	public static final Block VALYRIAN_LOG = new ValyrianLog();	
	public static final Block GLITRATE = new Block(
		Properties.create(Material.SAND)
	).setRegistryName("qverse:glitrate");
	
	public static List<Block> getBlocks() {
		List<Block> list = new ArrayList<Block>();

		list.add(VALYRIAN_LOG);
		list.add(GLITRATE);
		
		return list;
	}
}