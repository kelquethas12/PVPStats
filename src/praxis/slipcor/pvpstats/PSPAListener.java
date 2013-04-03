package praxis.slipcor.pvpstats;

import net.slipcor.pvparena.events.PADeathEvent;
import net.slipcor.pvparena.events.PAKillEvent;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

/**
 * PVP Arena listener class
 * 
 * @author slipcor
 * 
 * @version v0.1.1
 *
 */

public class PSPAListener implements Listener {
	
	@EventHandler
	public void onArenaKill(final PAKillEvent event) {
		PSMySQL.incKill(event.getPlayer());
	}
	
	@EventHandler
	public void onArenaDeath(final PADeathEvent event) {
		if (!event.isPVP()) {
			return;
		}
		PSMySQL.incDeath(event.getPlayer());
	}
}