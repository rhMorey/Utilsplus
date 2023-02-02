package morey.utils.commands;

import morey.utils.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class BroadcastCmds implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if(label.equalsIgnoreCase("bc")){
            if(args.length >= 1) {
                StringBuilder bc = new StringBuilder();

                for (String part : args) {
                    bc.append(part).append(" ");
                }
                Bukkit.broadcastMessage("§e§lAlert §7§l» §r" + bc);
            } else {
                sender.sendMessage(Main.prefix + "You need to put a text.");
            }
        }
        return false;
    }
}