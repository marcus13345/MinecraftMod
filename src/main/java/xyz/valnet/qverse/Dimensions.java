package xyz.valnet.qverse;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ModDimension;
import xyz.valnet.qverse.dimension.QVerseModDimension;

public class Dimensions {
	public static final ModDimension QVERSE_MOD_DIMENSION = new QVerseModDimension().setRegistryName("qverse:qverse");
	public static final ResourceLocation QVERSE_MOD_DIMENSION_LOCATION = new ResourceLocation("qverse:qverse");
}