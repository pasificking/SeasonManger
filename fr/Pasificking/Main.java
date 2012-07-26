package fr.Pasificking;

import fr.Pasificking.Listener.*;
import fr.Pasificking.SeasonManager.SeasonDays;
import fr.Pasificking.SeasonManager.SeasonManage;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;

public class Main extends JavaPlugin {

	private PlayerJoin pl;
	private SeasonDays sd;
	private BukkitScheduler scheduler;
	
	public void onEnable(){
		this.scheduler = getServer().getScheduler();
		this.pl = new PlayerJoin();
		new SeasonManage(false,20);
		this.sd = new SeasonDays(this);
		Bukkit.getPluginManager().registerEvents(pl, this);
	    scheduler.scheduleSyncRepeatingTask(this, sd, 3L, 3L);
	}
	public void onDisable(){
		
	}
	
	@EventHandler
	public boolean onCommand (CommandSender sender, Command command, String label, String[] args){
		return CommandsManager.onCommand (sender, command, label, args);
	}
}
