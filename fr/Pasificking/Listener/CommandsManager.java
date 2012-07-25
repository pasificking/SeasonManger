package fr.Pasificking.Listener;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import fr.Pasificking.Main;
import fr.Pasificking.SeasonManager.SeasonBiome;
import fr.Pasificking.SeasonManager.SeasonManage;

public class CommandsManager {
	
	@SuppressWarnings("unused")
	private Main plugin;
	
	public CommandsManager(Main plugin){
		this.plugin = plugin;
	}

	public static boolean onCommand (CommandSender sender, Command command, String label, String[] args){
		if(!(sender instanceof Player)){
			return false;
		}
		Player p = (Player)sender;
		if(label.equalsIgnoreCase("Hello"));{
			p.sendMessage("Hello on est en "+ SeasonManage.getActuallySeason().getName());
		return SeasonBiome.SeasonInitialise(p);
		}
	}
}
