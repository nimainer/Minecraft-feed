package listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ExpBottleEvent;

public class XpBottleBreakListner implements Listener {
	
	@EventHandler
	public void onXPBottleBreak(ExpBottleEvent event) {
			event.setExperience(300);
			
	}
	

}
