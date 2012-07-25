package fr.Pasificking.SeasonManager;

import java.util.ArrayList;

import org.bukkit.Chunk;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public class SeasonBiome {
	
	public SeasonBiome(){
		
	}
	public static boolean SeasonInitialise(Player p){
		World w = p.getWorld();
		ArrayList<Block> cb = new ArrayList<Block>(); 
		ArrayList<Chunk> c = new ArrayList<Chunk>();
		
		int minX = p.getLocation().getBlockX()-100;
		int minZ = p.getLocation().getBlockZ()-100;
		
		for(int i = 0; i< 200; i++)
			for(int j = 0; j<200;j++)
				cb.add(w.getBlockAt(minX+i, 0, minZ+j));
		
		for(int i=0; i<cb.size();i++){
			int x = cb.get(i).getX();
			int z = cb.get(i).getZ();
			
			if(!c.contains(w.getChunkAt(cb.get(i)))){
				c.add(w.getChunkAt(cb.get(i)));
				w.regenerateChunk(x, z);
			}
			
			if(!w.getBiome(x, z).equals(Biome.DESERT) || !w.getBiome(x, z).equals(Biome.DESERT_HILLS))
				w.setBiome(x, z, Biome.ICE_PLAINS);
		}
		return true;
	} 
}
