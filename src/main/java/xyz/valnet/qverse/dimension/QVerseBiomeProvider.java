package xyz.valnet.qverse.dimension;

import com.google.common.collect.ImmutableSet;
import net.minecraft.world.biome.Biome;
import xyz.valnet.qverse.Biomes;
import net.minecraft.world.biome.provider.BiomeProvider;

public class QVerseBiomeProvider extends BiomeProvider {

   public QVerseBiomeProvider() {
      super(ImmutableSet.of(Biomes.QVERSE_PLANE));
   }

   public Biome getNoiseBiome(int x, int y, int z) {
      return Biomes.QVERSE_PLANE;
   }
}