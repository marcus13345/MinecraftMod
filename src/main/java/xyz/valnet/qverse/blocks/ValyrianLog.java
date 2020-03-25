package xyz.valnet.qverse.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ValyrianLog extends Block {

	public ValyrianLog() {
		super(Properties.create(Material.WOOD));
		this.setRegistryName("valyrian_log_block");
	}

}
