package xyz.valnet.qverse.biome;

import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class QVersePlane extends Biome {

	public QVersePlane() {
		super(new Builder()
			.surfaceBuilder(new ConfiguredSurfaceBuilder<SurfaceBuilderConfig>(
				SurfaceBuilder.DEFAULT,
				new SurfaceBuilderConfig(
					Blocks.BLUE_CONCRETE.getDefaultState(),
					Blocks.RED_CONCRETE.getDefaultState(),
					Blocks.WHITE_CONCRETE.getDefaultState()
				)
			))
			.category(Biome.Category.PLAINS)
			.waterColor(0xFF2C6D)
			.waterFogColor(0xFF2C6D)
			.depth(0.2F)
			.temperature(1.0F)
			.downfall(0.3F)
			.precipitation(RainType.RAIN)
			.scale(0.5F)
			.parent(null)
		);

		this.setRegistryName("qverse:qverse_plane");
	}

}