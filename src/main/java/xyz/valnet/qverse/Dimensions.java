package xyz.valnet.qverse;

import java.util.List;
import java.util.ArrayList;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.ModDimension;
import net.minecraftforge.event.world.RegisterDimensionsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import xyz.valnet.qverse.dimension.QVerseModDimension;

@EventBusSubscriber(modid = QVerse.MOD_ID, bus = EventBusSubscriber.Bus.FORGE)
public class Dimensions {
	public static final ModDimension QVERSE_MOD_DIMENSION = new QVerseModDimension().setRegistryName("qverse:qverse");
	public static final ResourceLocation QVERSE_MOD_DIMENSION_LOCATION = new ResourceLocation("qverse:qverse");

	public static final ModDimension ANCIENT_HAVEN_MOD_DIMENSION = new QVerseModDimension().setRegistryName("qverse:ancient_haven");
	public static final ResourceLocation ANCIENT_HAVEN_MOD_DIMENSION_LOCATION = new ResourceLocation("qverse:ancient_haven");

	public static List<ModDimension> getDimensions() {
		List<ModDimension> dims = new ArrayList<ModDimension>();

		dims.add(QVERSE_MOD_DIMENSION);
		dims.add(ANCIENT_HAVEN_MOD_DIMENSION);

		return dims;
	}

	@SubscribeEvent
	public static void onRegisterDimensionsEvent(RegisterDimensionsEvent event) {
		
		if (DimensionType.byName(Dimensions.ANCIENT_HAVEN_MOD_DIMENSION_LOCATION) == null) {
			DimensionManager.registerDimension(Dimensions.ANCIENT_HAVEN_MOD_DIMENSION_LOCATION, Dimensions.ANCIENT_HAVEN_MOD_DIMENSION, null, true);
		}
		
    // this returns a DimensionType for your ResourceLocation; alternatively you can also retrieve the dimensiontype with
    // DimensionType.byName(ResourceLocation)
	}
}