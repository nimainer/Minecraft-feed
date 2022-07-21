package listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinLeaveListener implements Listener {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		if (player.hasPlayedBefore()){
			event.setJoinMessage(ChatColor.YELLOW+player.getDisplayName()+" has joined the server");
		}else {
			event.setJoinMessage(ChatColor.GREEN +player.getDisplayName()+" has joined the server for the first time");
		}
	}
	
	
	@EventHandler
	public void onLeave(PlayerQuitEvent event) {
		Player player = event.getPlayer();
		event.setQuitMessage(ChatColor.YELLOW + player.getDisplayName() + " has left this server");
	}

}
