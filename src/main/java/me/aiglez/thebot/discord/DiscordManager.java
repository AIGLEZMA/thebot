package me.aiglez.thebot.discord;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

public class DiscordManager {

    private JDA jda = null;

    public void launch(final String token) {
        jda = JDABuilder.createDefault(token)
                .setActivity(Activity.customStatus("join us at mc.server.net"))
                .build();

    }

}
