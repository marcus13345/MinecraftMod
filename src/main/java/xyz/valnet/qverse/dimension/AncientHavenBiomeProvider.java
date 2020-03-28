package xyz.valnet.qverse.dimension;

import com.google.common.collect.ImmutableSet;
import net.minecraft.world.biome.Biome;
import xyz.valnet.qverse.Biomes;
import net.minecraft.world.biome.provider.BiomeProvider;

public class AncientHavenBiomeProvider extends BiomeProvider {

   public AncientHavenBiomeProvider() {
      super(ImmutableSet.of(Biomes.HAVEN));
   }

   public Biome getNoiseBiome(int x, int y, int z) {
      return Biomes.QVERSE_PLANE;
   }
}