package morey.utils.commands;

import morey.utils.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class DeCmds implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {

        if(s.equalsIgnoreCase("de")){
            Player player = (Player) sender;
            player.performCommand("give " + player.getName() + " minecraft:debug_stick 1");
            player.sendMessage(Main.prefix + "A debug stick was given to you.");
        }
        return false;
    }
}