package fr.Pasificking.SeasonManager;

import java.util.List;

import org.bukkit.World;

import fr.Pasificking.Main;

public class SeasonDays implements Runnable {

	private Main pl;
	private static Season s = SeasonManage.getActuallySeason();

	public SeasonDays(Main plugin){
		this.pl = plugin;
	}
	
	public void run() {
		List<World> wl = pl.getServer().getWorlds();
		Long time;
		for(World w : wl){
	        time = Long.valueOf(System.currentTimeMillis());
	        w.setTime(time.longValue()/s.getDuration());
		}
	}

}
