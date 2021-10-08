package dev.reload.Warder;

import org.bukkit.plugin.java.JavaPlugin;
import  org.bukkit.ChatColor;
import  dev.reload.Warder.Message.WelcomeEventListener;

public class Init_Warder extends JavaPlugin {
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new WelcomeEventListener(), this);


        getLogger().info(ChatColor.BLUE +"\n"+
                " _______  _______  _______  _______ \n" +
                "(  ____ )(  ____ \\(  ____ \\(  ____ \\\n" +
                "| (    )|| (    \\/| (    \\/| (    \\/\n" +
                "| (____)|| (_____ | |      | (_____ \n" +
                "|     __)(_____  )| | ____ (_____  )\n" +
                "| (\\ (         ) || | \\_  )      ) |\n" +
                "| ) \\ \\__/\\____) || (___) |/\\____) |\n" +
                "|/   \\__/\\_______)(_______)\\_______)\n" +
                "                                    ");
        getLogger().info(ChatColor.GREEN + "Reload Server Guardian Service is Ready!");

    }

}
