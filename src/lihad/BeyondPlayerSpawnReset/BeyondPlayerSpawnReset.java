package lihad.BeyondPlayerSpawnReset;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class BeyondPlayerSpawnReset extends JavaPlugin implements Listener{
	protected static String PLUGIN_NAME = "BeyondPlayerSpawnReset";
	protected static String header = "[" + PLUGIN_NAME + "] ";

	@Override
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(this, this);
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event){
		event.getPlayer().teleport(event.getPlayer().getWorld().getSpawnLocation());
	}
}
