package xyz.valnet.random;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ModDimension;
import xyz.valnet.random.dimension.QVerseModDimension;

public class Dimensions {
	public static final ModDimension QVERSE_MOD_DIMENSION = new QVerseModDimension().setRegistryName("examplemod:qverse");
	public static final ResourceLocation QVERSE_MOD_DIMENSION_LOCATION = new ResourceLocation("examplemod:qverse");
}