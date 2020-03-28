package xyz.valnet.qverse;

import java.util.List;
import java.util.ArrayList;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.world.RegisterDimensionsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import xyz.valnet.qverse.biome.AncientHaven;
import xyz.valnet.qverse.biome.QVersePlane;

public class Biomes {
	public static final Biome QVERSE_PLANE = new QVersePlane();
	public static final Biome HAVEN = new AncientHaven();

	public static List<Biome> getBiomes() {
		List<Biome> biomes = new ArrayList<Biome>();

		biomes.add(QVERSE_PLANE);

		return biomes;
	}
}