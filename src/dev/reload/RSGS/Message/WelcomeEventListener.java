package dev.reload.RSGS.Message;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class WelcomeEventListener implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent Player) {
        Player.setJoinMessage(ChatColor.RED+Player.getPlayer().getDisplayName()+" join the game.");
        Player.getPlayer().sendMessage(ChatColor.BLACK+"\n");
        Player.getPlayer().sendMessage(ChatColor.AQUA + "Welcome Back," + ChatColor.AQUA + Player.getPlayer().getDisplayName());

    }

}
