package xyz.valnet.qverse.dimension;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.dimension.Dimension;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationSettings;
import net.minecraft.world.gen.Heightmap.Type;
import net.minecraft.world.gen.OverworldChunkGenerator;
import net.minecraft.world.gen.OverworldGenSettings;
import net.minecraft.world.gen.WorldGenRegion;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.world.biome.provider.OverworldBiomeProviderSettings;
import net.minecraft.world.chunk.IChunk;

public class QVerseDimension extends Dimension {

	private class QVerseGenerationSettings extends GenerationSettings {

	}

	private class QVerseChunkGenerator extends ChunkGenerator<QVerseGenerationSettings> {

		public QVerseChunkGenerator(
			IWorld worldIn,
			BiomeProvider biomeProviderIn,
			QVerseGenerationSettings generationSettingsIn)
		{
			super(worldIn, biomeProviderIn, generationSettingsIn);
		}

		@Override
		public void func_225551_a_(WorldGenRegion worldGenRegion, IChunk chunk) {
			BlockState bedrock = Blocks.BEDROCK.getDefaultState();
			BlockState stone = xyz.valnet.qverse.Blocks.VALYRIAN_LOG.getDefaultState();
			ChunkPos chunkpos = chunk.getPos();

			BlockPos.Mutable pos = new BlockPos.Mutable();

			int x;
			int z;

			for (x = 0; x < 16; x++) {
				for (z = 0; z < 16; z++) {
					chunk.setBlockState(pos.setPos(x, 0, z), bedrock, false);
				}
			}

			for (x = 0; x < 16; x++) {
				for (z = 0; z < 16; z++) {
					int realx = chunkpos.x * 16 + x;
					int realz = chunkpos.z * 16 + z;
					int height = (int) (65 + Math.sin(realx / 20.0f)*10 + Math.cos(realz / 20.0f)*10);
					for (int y = 1 ; y < height ; y++) {
						chunk.setBlockState(pos.setPos(x, y, z), stone, false);
					}
				}
			}
		}

		@Override
		public int getGroundHeight() {
			return 0;
		}

		@Override
		public void makeBase(IWorld worldIn, IChunk chunkIn) {

		}

		@Override
		public int func_222529_a(int p_222529_1_, int p_222529_2_, Type heightmapType) {
			return 0;
		}

	}
	
	public QVerseDimension(World world, DimensionType dimensionType) {
		super(world, dimensionType, 1.0F);
	}

	@Override
	public ChunkGenerator<?> createChunkGenerator() {
		return new QVerseChunkGenerator(
			this.world,
			new QVerseBiomeProvider(),
			new QVerseGenerationSettings()
		);
	}

	@Override
	public BlockPos findSpawn(ChunkPos chunkPosIn, boolean checkValid) {
		return null;
	}

	@Override
	public BlockPos findSpawn(int posX, int posZ, boolean checkValid) {
		return null;
	}

	@Override
	public float calculateCelestialAngle(long worldTime, float partialTicks) {
		return 0F;
	}

	@Override
	public boolean isSurfaceWorld() {
		return true;
	}

	@Override
	public Vec3d getFogColor(float celestialAngle, float partialTicks) {
		return new Vec3d(1D, 1D, 1D);
	}

	@Override
	public boolean canRespawnHere() {
		return true;
	}

	@Override
	public boolean doesXZShowFog(int x, int z) {
		return false;
	}

}