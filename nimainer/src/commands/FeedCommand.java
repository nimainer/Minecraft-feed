package commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FeedCommand implements CommandExecutor {
	
	@Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player p = (Player) sender;
			p.setFoodLevel(20);
		}
		return true;
	}

}