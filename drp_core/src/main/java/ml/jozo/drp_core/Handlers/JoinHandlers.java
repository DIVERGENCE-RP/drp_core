package ml.jozo.drp_core.Handlers;

import ml.jozo.drp_core.Drp_core;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinHandlers implements Listener {

    public JoinHandlers(Drp_core plugin){
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){
        Player player = e.getPlayer();
        e.setJoinMessage(ChatColor.GREEN + "[+]" + e.getPlayer().getDisplayName());
    }
}
