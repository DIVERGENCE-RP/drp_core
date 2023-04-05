package ml.jozo.drp_core;

import ml.jozo.drp_core.Commands.Fly;
import ml.jozo.drp_core.Handlers.JoinHandlers;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Drp_core extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("drp_core start");
        Bukkit.getLogger().info("Create by Jozo_85");
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        new JoinHandlers(this);

        getCommand("fly").setExecutor(new Fly());


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
