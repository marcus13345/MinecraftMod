package xyz.valnet.qverse.dimension;

import com.google.common.collect.ImmutableSet;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.biome.provider.BiomeProvider;

public class QVerseBiomeProvider extends BiomeProvider {

   public QVerseBiomeProvider() {
      super(ImmutableSet.of(Biomes.SHATTERED_SAVANNA_PLATEAU));
   }

   public Biome getNoiseBiome(int x, int y, int z) {
      return Biomes.SHATTERED_SAVANNA_PLATEAU;
   }
}