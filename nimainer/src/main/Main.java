package main;


import org.bukkit.plugin.java.JavaPlugin;

import commands.FeedCommand;
import listeners.JoinLeaveListener;
import listeners.XpBottleBreakListner;


public final class Main extends JavaPlugin {
	
	 @Override
	    public void onEnable() {
	        
		 // commands 
		 getCommand("feed").setExecutor(new FeedCommand());
		 
		 
		 
		 // listeners
		 getServer().getPluginManager().registerEvents(new XpBottleBreakListner(), this);
	     getServer().getPluginManager().registerEvents(new JoinLeaveListener (), this);
	}
	 
	 
	 
	public void onDisable() {

	}
	
	
}