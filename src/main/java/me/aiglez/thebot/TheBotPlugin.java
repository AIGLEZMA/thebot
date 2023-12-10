package me.aiglez.thebot;

import me.aiglez.thebot.discord.DiscordManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class TheBotPlugin extends JavaPlugin {

    private static TheBotPlugin instance;

    private DiscordManager discordManager;


    @Override
    public void onEnable() {
        instance = this;

        this.discordManager = new DiscordManager();

        final String token = this.getConfig().getString("discord.bot-token");
        try {
            discordManager.launch(token);
        } catch (final Exception e) {
            this.getLogger().severe("The was an error connecting to the discord bot !");
            e.printStackTrace();
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static TheBotPlugin getInstance() {
        return instance;
    }
}
