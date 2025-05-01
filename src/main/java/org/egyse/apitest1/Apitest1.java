package org.egyse.apitest1;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.egyse.apitest1.events.CustomEvent;

public final class Apitest1 extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    public static void welcomePlayer(Player p) {
        p.sendMessage("Welcome");
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Bukkit.getPluginManager().callEvent(new CustomEvent(e.getPlayer()));
    }
}
