package me.aiglez.thebot.commands;

import me.aiglez.thebot.commons.CommonPlayer;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class Verify implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (!(commandSender instanceof Player)) {
            commandSender.sendMessage("You must be ingame to run this command");
            return false;
        }
        String pin = getRandomNumberString();
        commandSender.sendMessage("Your verification code is: ", pin);
        Player player = ((Player) commandSender);
        CommonPlayer.players.add(new CommonPlayer(player.getUniqueId(), Integer.getInteger(pin)));
        return true;
    }

    public static String getRandomNumberString() {
        // It will generate 6 digit random Number.
        // from 0 to 999999
        Random rnd = new Random();
        int number = rnd.nextInt(999999);

        // this will convert any number sequence into 6 character.
        return String.format("%06d", number);
    }
}
