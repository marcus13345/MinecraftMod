package xyz.valnet.random.dimension;

import java.util.function.BiFunction;

import net.minecraft.world.World;
import net.minecraft.world.dimension.Dimension;
import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.ModDimension;
import net.minecraftforge.event.world.RegisterDimensionsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import xyz.valnet.random.Dimensions;
import xyz.valnet.random.ExampleMod;

@EventBusSubscriber(modid = ExampleMod.MOD_ID, bus = EventBusSubscriber.Bus.FORGE)
public class QVerseModDimension extends ModDimension {

	@Override
	public BiFunction<World, DimensionType, ? extends Dimension> getFactory() {
		return QVerseDimension::new;
	}

	@SubscribeEvent
	public static void onRegisterDimensionsEvent(RegisterDimensionsEvent event) {
		
		
		if (DimensionType.byName(Dimensions.QVERSE_MOD_DIMENSION_LOCATION) == null) {
			DimensionManager.registerDimension(Dimensions.QVERSE_MOD_DIMENSION_LOCATION, Dimensions.QVERSE_MOD_DIMENSION, null, true);
		}
		
    // this returns a DimensionType for your ResourceLocation; alternatively you can also retrieve the dimensiontype with
    // DimensionType.byName(ResourceLocation)
	}

}