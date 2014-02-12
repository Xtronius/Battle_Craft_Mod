package mod.xtronius.bc_mod.world;

import java.util.Random;

import mod.xtronius.bc_mod.bc_mod;
import mod.xtronius.bc_mod.blocks.Gem.Gems;
import mod.xtronius.bc_mod.blocks.Metal.Metals;
import mod.xtronius.bc_mod.blocks.Special.Special;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenBeach;
import net.minecraft.world.biome.BiomeGenDesert;
import net.minecraft.world.biome.BiomeGenEnd;
import net.minecraft.world.biome.BiomeGenForest;
import net.minecraft.world.biome.BiomeGenHell;
import net.minecraft.world.biome.BiomeGenHills;
import net.minecraft.world.biome.BiomeGenJungle;
import net.minecraft.world.biome.BiomeGenOcean;
import net.minecraft.world.biome.BiomeGenPlains;
import net.minecraft.world.biome.BiomeGenRiver;
import net.minecraft.world.biome.BiomeGenSnow;
import net.minecraft.world.biome.BiomeGenSwamp;
import net.minecraft.world.biome.BiomeGenTaiga;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class EventManager implements IWorldGenerator
{

	/** Rarity */
	public int OreExtremelyCommon = 5;
	public int OreCommon = 4;
	public int OreUncommon = 3;
	public int OreRare = 2;
	public int OreVeryRare = 1;
	
	/** Vein Size */
	public int OreVeinVeryLargeSize = 7;
	public int OreVeinLargeSize = 6;
	public int OreVeinAboveNormalSize = 5;
	public int OreVeinNormalSize = 4;
	public int OreVeinBelowNormalSize = 3;
	public int OreVeinSmallSize = 2;
	public int OreVeinVerySmallSize = 1;
	
	/** Height */
	public int OreHeightSkyLimit = 255;
	public int OreHeightVeryHigh = 86;
	public int OreHeightHigh = 63;
	public int OreHeightSomeWhatHigh = 56;
	public int OreHeightNormal = 43;
	public int OreHeightSomeWhatLow = 33;
	public int OreHeightLow = 23;
	public int OreHeightVeryLow = 13;
	public int OreHeightBedRockLevel = 5;

	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch (world.provider.dimensionId)
		{
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		case 1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	private void generateEnd(World world, Random random, int x, int z)
	{
	  //this.addOreSpawn(Ore, world, random, x-coord, z-Ccoord, x-16, z-16, vein size + random.nextInt(3), rarity, min-y, max-y);
		BiomeGenBase biomeAir = world.getWorldChunkManager().getBiomeGenAt(x ,z);
		if(biomeAir instanceof BiomeGenEnd){
		this.addEndOreSpawn(Special.airOre, world, random, x, z, 16, 16, OreVeinSmallSize + random.nextInt(3), OreRare, OreHeightBedRockLevel, OreHeightSkyLimit);
		// System.out.println("Air Ores Have Spawned!!!");

	}

	}

	private void generateSurface(World world, Random random, int x, int z)
	{
	  //this.addOreSpawn(Ore, world, random, x-coord, z-Ccoord, x-16, z-16, vein size + random.nextInt(3), rarity, min-y, max-y);
		BiomeGenBase biomeWater = world.getWorldChunkManager().getBiomeGenAt(x ,z);
		if(biomeWater instanceof BiomeGenOcean || biomeWater instanceof BiomeGenRiver || biomeWater instanceof BiomeGenSwamp || biomeWater instanceof BiomeGenSnow || biomeWater instanceof BiomeGenJungle  ){
		this.addOreSpawn(Special.waterOre, world, random, x, z, 16, 16, OreVeinSmallSize + random.nextInt(3), OreRare, OreHeightBedRockLevel, 60);
		// System.out.println("Water Ore Has Spawned!!!");
		}
		
		BiomeGenBase biomeEarth = world.getWorldChunkManager().getBiomeGenAt(x ,z);
		if(biomeEarth instanceof BiomeGenPlains || biomeEarth instanceof BiomeGenBeach || biomeEarth instanceof BiomeGenForest || biomeEarth instanceof BiomeGenHills || biomeEarth instanceof BiomeGenTaiga){
		this.addOreSpawn(Special.earthOre, world, random, x, z, 16, 16, OreVeinSmallSize + random.nextInt(3), OreRare, OreHeightBedRockLevel, 79);
		// System.out.println("Earth Ore Has Spawned!!!");
		}
		
		BiomeGenBase biomeFire = world.getWorldChunkManager().getBiomeGenAt(x ,z);
		if(biomeFire instanceof BiomeGenDesert){
		this.addOreSpawn(Special.fireOre, world, random, x, z, 16, 16, OreVeinSmallSize + random.nextInt(3), OreRare, OreHeightBedRockLevel, OreHeightSkyLimit);
		// System.out.println("Fire Ore Has Spawned!!!");
		}

		BiomeGenBase biomeAir = world.getWorldChunkManager().getBiomeGenAt(x ,z);
		if(biomeAir instanceof BiomeGenHills){
		this.addOreSpawn(Special.airOre, world, random, x, z, 16, 16, OreVeinSmallSize + random.nextInt(3), OreRare, 80, OreHeightSkyLimit);
		// System.out.println("Air Ore Has Spawned!!!");
		}
		
		BiomeGenBase biomeWaterPeal = world.getWorldChunkManager().getBiomeGenAt(x ,z);
		if(biomeWaterPeal instanceof BiomeGenOcean || biomeWaterPeal instanceof BiomeGenRiver  ){
			this.addOreSpawn(Gems.blockPearlOre, world, random, x, z, 16, 16, OreVeinVerySmallSize + random.nextInt(3), OreVeryRare, OreHeightLow, OreHeightHigh);
		// System.out.println("Peal Ore Has Spawned!!!");
		}
		
	  //this.addOreSpawn(Ore, world, random, x-coord, z-Ccoord, x-16, z-16, vein size + random.nextInt(3), rarity, min-y, max-y);
		this.addOreSpawn(Metals.blockTungstenOre, world, random, x, z, 16, 16, OreVeinSmallSize + random.nextInt(3), OreVeryRare, OreHeightBedRockLevel, OreHeightVeryLow);
		this.addOreSpawn(Metals.blockOsmiumOre, world, random, x, z, 16, 16, OreVeinSmallSize + random.nextInt(3), OreVeryRare, OreHeightBedRockLevel, OreHeightVeryLow);
		this.addOreSpawn(Metals.blockIridiumOre, world, random, x, z, 16, 16, OreVeinSmallSize + random.nextInt(3), OreVeryRare, OreHeightBedRockLevel, OreHeightVeryLow);
		this.addOreSpawn(Metals.blockTitaniumOre, world, random, x, z, 16, 16, OreVeinSmallSize + random.nextInt(3), OreRare, OreHeightBedRockLevel, OreHeightLow);
		this.addOreSpawn(Metals.blockRhodiumOre, world, random, x, z, 16, 16, OreVeinBelowNormalSize + random.nextInt(3), OreRare, OreHeightBedRockLevel, OreHeightLow);
		this.addOreSpawn(Metals.blockPalladiamOre, world, random, x, z, 16, 16, OreVeinBelowNormalSize + random.nextInt(3), OreRare, OreHeightBedRockLevel, OreHeightLow);
		this.addOreSpawn(Metals.blockPlatinumOre, world, random, x, z, 16, 16, OreVeinNormalSize + random.nextInt(3), OreUncommon, OreHeightBedRockLevel, OreHeightLow);
		this.addOreSpawn(Metals.blockNickelOre, world, random, x, z, 16, 16, OreVeinAboveNormalSize + random.nextInt(3), OreCommon, OreHeightBedRockLevel, OreHeightNormal);
		this.addOreSpawn(Metals.blockCopperOre, world, random, x, z, 16, 16, OreVeinLargeSize + random.nextInt(3), OreCommon, OreHeightBedRockLevel, OreHeightSomeWhatHigh);
		this.addOreSpawn(Metals.blockAluminumOre, world, random, x, z, 16, 16, OreVeinLargeSize + random.nextInt(3), OreCommon, OreHeightBedRockLevel, OreHeightNormal);
		this.addOreSpawn(Metals.blockSilverOre, world, random, x, z, 16, 16, OreVeinNormalSize + random.nextInt(3), OreUncommon, OreHeightBedRockLevel, OreHeightNormal);
		this.addOreSpawn(Metals.blockZincOre, world, random, x, z, 16, 16, OreVeinAboveNormalSize + random.nextInt(3), OreCommon, OreHeightBedRockLevel, OreHeightSomeWhatHigh);
		this.addOreSpawn(Metals.blockTinOre, world, random, x, z, 16, 16, OreVeinAboveNormalSize + random.nextInt(3), OreCommon, OreHeightBedRockLevel, OreHeightSomeWhatHigh);
		
		this.addOreSpawn(Gems.blockRubyOre, world, random, x, z, 16, 16, OreVeinBelowNormalSize + random.nextInt(3), OreRare, OreHeightBedRockLevel, OreHeightVeryLow);
		this.addOreSpawn(Gems.blockSapphireOre, world, random, x, z, 16, 16, OreVeinBelowNormalSize + random.nextInt(3), OreRare, OreHeightBedRockLevel, OreHeightVeryLow);
		this.addOreSpawn(Gems.blockTopazOre, world, random, x, z, 16, 16, OreVeinBelowNormalSize + random.nextInt(3), OreRare, OreHeightBedRockLevel, OreHeightVeryLow);
		this.addOreSpawn(Gems.blockEmeraldOre, world, random, x, z, 16, 16, OreVeinBelowNormalSize + random.nextInt(3), OreRare, OreHeightBedRockLevel, OreHeightVeryLow);
		this.addOreSpawn(Gems.blockAquamarineOre, world, random, x, z, 16, 16, OreVeinBelowNormalSize + random.nextInt(3), OreRare, OreHeightBedRockLevel, OreHeightVeryLow);
		this.addOreSpawn(Gems.blockBerylOre, world, random, x, z, 16, 16, OreVeinBelowNormalSize + random.nextInt(3), OreRare, OreHeightBedRockLevel, OreHeightVeryLow);
		this.addOreSpawn(Gems.blockSmokyQuartzOre, world, random, x, z, 16, 16, OreVeinNormalSize + random.nextInt(3), OreCommon, OreHeightVeryLow, OreHeightSomeWhatHigh);
		this.addOreSpawn(Gems.blockQuartzOre, world, random, x, z, 16, 16, OreVeinNormalSize + random.nextInt(3), OreCommon, OreHeightVeryLow, OreHeightSomeWhatHigh);
		this.addOreSpawn(Gems.blockAmetrineOre, world, random, x, z, 16, 16, OreVeinNormalSize + random.nextInt(3), OreUncommon, OreHeightVeryLow, OreHeightSomeWhatHigh);
		this.addOreSpawn(Gems.blockKunziteOre, world, random, x, z, 16, 16, OreVeinNormalSize + random.nextInt(3), OreUncommon, OreHeightVeryLow, OreHeightSomeWhatHigh);
		this.addOreSpawn(Gems.blockAmethystOre, world, random, x, z, 16, 16, OreVeinNormalSize + random.nextInt(3), OreUncommon, OreHeightVeryLow, OreHeightSomeWhatHigh);
		this.addOreSpawn(Gems.blockJasperOre, world, random, x, z, 16, 16, OreVeinNormalSize + random.nextInt(3), OreUncommon, OreHeightVeryLow, OreHeightSomeWhatHigh);
		this.addOreSpawn(Gems.blockAxiniteOre, world, random, x, z, 16, 16, OreVeinNormalSize + random.nextInt(3), OreUncommon, OreHeightVeryLow, OreHeightSomeWhatHigh);
		this.addOreSpawn(Gems.blockOnyxOre, world, random, x, z, 16, 16, OreVeinNormalSize + random.nextInt(3), OreRare, OreHeightBedRockLevel, OreHeightSomeWhatLow);
		this.addOreSpawn(Gems.blockSunStoneOre, world, random, x, z, 16, 16, OreVeinBelowNormalSize + random.nextInt(3), OreVeryRare, OreHeightSomeWhatLow, OreHeightNormal);
		this.addOreSpawn(Gems.blockMoonStoneOre, world, random, x, z, 16, 16, OreVeinBelowNormalSize + random.nextInt(3), OreVeryRare, OreHeightSomeWhatLow, OreHeightNormal);
		this.addOreSpawn(Gems.blockOpalOre, world, random, x, z, 16, 16, OreVeinNormalSize + random.nextInt(3), OreUncommon, OreHeightVeryLow, OreHeightSomeWhatHigh);
		this.addOreSpawn(Gems.blockApatiteOre, world, random, x, z, 16, 16, OreVeinVeryLargeSize + random.nextInt(3), OreRare, OreHeightHigh, OreHeightSkyLimit);
		this.addOreSpawn(Gems.blockAzuriteOre, world, random, x, z, 16, 16, OreVeinAboveNormalSize + random.nextInt(3), OreUncommon, OreHeightVeryLow, OreHeightSomeWhatHigh);
		this.addOreSpawn(Gems.blockAmberOre, world, random, x, z, 16, 16, OreVeinLargeSize + random.nextInt(3), OreCommon, OreHeightVeryLow, OreHeightSomeWhatHigh);		
		// System.out.println("Regular Ores Have Spawned!!!");
		
	}

	private void generateNether(World world, Random random, int x, int z)
	{
	  //this.addOreSpawn(Ore, world, random, x-coord, z-Ccoord, x-16, z-16, vein size + random.nextInt(3), rarity, min-y, max-y);
		BiomeGenBase biomeFire = world.getWorldChunkManager().getBiomeGenAt(x ,z);
		if(biomeFire instanceof BiomeGenHell){
		this.addNetherOreSpawn(Special.fireOre, world, random, x, z, 16, 16, 5 + random.nextInt(3), 5, 5, 255);
		// System.out.println("Fire Ores Have Spawned!!!");

	}
		}

	/**
	 * Adds an Ore Spawn to Minecraft. Simply register all Ores to spawn with this method in your Generation method in your IWorldGeneration extending Class
	 * 
	 * @param The Block to spawn
	 * @param The World to spawn in
	 * @param A Random object for retrieving random positions within the world to spawn the Block
	 * @param An int for passing the X-Coordinate for the Generation method
	 * @param An int for passing the Z-Coordinate for the Generation method
	 * @param An int for setting the maximum X-Coordinate values for spawning on the X-Axis on a Per-Chunk basis
	 * @param An int for setting the maximum Z-Coordinate values for spawning on the Z-Axis on a Per-Chunk basis
	 * @param An int for setting the maximum size of a vein
	 * @param An int for the Number of chances available for the Block to spawn per-chunk
	 * @param An int for the minimum Y-Coordinate height at which this block may spawn
	 * @param An int for the maximum Y-Coordinate height at which this block may spawn
	 **/
	public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY)
	{
		int maxPossY = minY + (maxY - 1);
		assert maxY > minY : "The maximum Y must be greater than the Minimum Y";
		assert maxX > 0 && maxX <= 16 : "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
		assert minY > 0 : "addOreSpawn: The Minimum Y must be greater than 0";
		assert maxY < 256 && maxY > 0 : "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
		assert maxZ > 0 && maxZ <= 16 : "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";

		int diffBtwnMinMaxY = maxY - minY;
		for (int x = 0; x < chancesToSpawn; x++)
		{
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(diffBtwnMinMaxY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new WorldGenMinable(block.blockID, maxVeinSize)).generate(world, random, posX, posY, posZ);
		}
	}
	public void addNetherOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY)
	{
		int maxPossY = minY + (maxY - 1);
		assert maxY > minY : "The maximum Y must be greater than the Minimum Y";
		assert maxX > 0 && maxX <= 16 : "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
		assert minY > 0 : "addOreSpawn: The Minimum Y must be greater than 0";
		assert maxY < 256 && maxY > 0 : "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
		assert maxZ > 0 && maxZ <= 16 : "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";

		int diffBtwnMinMaxY = maxY - minY;
		for (int x = 0; x < chancesToSpawn; x++)
		{
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(diffBtwnMinMaxY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new WorldGenNetherMinable(block.blockID, maxVeinSize)).generate(world, random, posX, posY, posZ);
		}
	}
	public void addEndOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY)
	{
		int maxPossY = minY + (maxY - 1);
		assert maxY > minY : "The maximum Y must be greater than the Minimum Y";
		assert maxX > 0 && maxX <= 16 : "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
		assert minY > 0 : "addOreSpawn: The Minimum Y must be greater than 0";
		assert maxY < 256 && maxY > 0 : "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
		assert maxZ > 0 && maxZ <= 16 : "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";

		int diffBtwnMinMaxY = maxY - minY;
		for (int x = 0; x < chancesToSpawn; x++)
		{
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(diffBtwnMinMaxY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new WorldGenEndMinable(block.blockID, maxVeinSize)).generate(world, random, posX, posY, posZ);
		}
	}
}