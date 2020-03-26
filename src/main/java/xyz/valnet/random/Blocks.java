package xyz.valnet.random;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import xyz.valnet.random.blocks.ValyrianLog;

public class Blocks {	
	
	public static final Block VALYRIAN_LOG = new ValyrianLog();	

	
	public static List<Block> getBlocks() {
		List<Block> list = new ArrayList<Block>();
		
		list.add(VALYRIAN_LOG);
		
		return list;
	}
}