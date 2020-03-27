package xyz.valnet.qverse;

import java.util.List;
import java.util.ArrayList;

import net.minecraft.world.biome.Biome;
import xyz.valnet.qverse.biome.QVersePlane;

public class Biomes {
	public static final Biome QVERSE_PLANE = new QVersePlane();

	public static List<Biome> getBiomes() {
		List<Biome> biomes = new ArrayList<Biome>();

		biomes.add(QVERSE_PLANE);

		return biomes;
	}
}