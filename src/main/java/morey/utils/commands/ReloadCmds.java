package morey.utils.commands;

import morey.utils.Main;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class ReloadCmds implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {

        if(s.equalsIgnoreCase("rl")) {
            Bukkit.broadcastMessage(Main.prefix + "§4Reload ...");
            Player player = (Player) sender;
            player.performCommand("reload confirm");
            Bukkit.broadcastMessage(Main.prefix + "§4Reload finished !");
        }
        return false;
    }
}
