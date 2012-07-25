package fr.Pasificking;

import fr.Pasificking.Listener.*;
import fr.Pasificking.SeasonManager.SeasonManage;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public void onEnable(){
		new SeasonManage(false);
		Bukkit.getPluginManager().registerEvents(new PlayerJoin(this), this);
	}
	public void onDisable(){
		
	}
	
	@EventHandler
	public boolean onCommand (CommandSender sender, Command command, String label, String[] args){
		return CommandsManager.onCommand (sender, command, label, args);
	}
}
