package fr.Pasificking.Listener;

//import java.util.ArrayList;

import org.bukkit.ChatColor;
//import org.bukkit.Chunk;
//import org.bukkit.World;
//import org.bukkit.block.Biome;
//import org.bukkit.block.Block;
//import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import fr.Pasificking.Main;
import fr.Pasificking.SeasonManager.*;

public class PlayerJoin implements Listener{

	@SuppressWarnings("unused")
	private Main plugin;
	
	public PlayerJoin(Main plugin){
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e){
		e.setJoinMessage(ChatColor.BLUE+""+ChatColor.ITALIC+"Bonjours, "+e.getPlayer().getName()+".On est actuellements en "+SeasonManage.getActuallySeason().getName());
		if(!SeasonBiome.SeasonInitialise(e.getPlayer())){
			//e.getPlayer().kickPlayer("Reconnecter vous la saison a Changer et/ou n'est pas encore charger désolé!");
		}
	}
	
}
