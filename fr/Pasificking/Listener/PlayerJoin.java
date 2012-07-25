package fr.Pasificking.Listener;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import fr.Pasificking.SeasonManager.*;

public class PlayerJoin implements Listener{
	
	public PlayerJoin(){

	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e){
		e.setJoinMessage(ChatColor.BLUE+""+ChatColor.ITALIC+"Bonjours, "+e.getPlayer().getName()+".On est actuellements en "+SeasonManage.getActuallySeason().getName());
		if(!SeasonBiome.SeasonInitialise(e.getPlayer())){
		}
	}
	
}
