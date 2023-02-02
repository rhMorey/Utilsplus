package morey.utils.commands;

import morey.utils.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class PingCmds implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {

        if(s.equalsIgnoreCase("ping")) {
            Player player = (Player) sender;
            if(args.length == 1){
                Player target = Bukkit.getPlayer(args[0]);
                if(target != null){
                    sender.sendMessage(Main.prefix + "§7--------------------------------*");
                    sender.sendMessage("§ePing de " + target.getName() + " : §a" + target.getPing());
                    sender.sendMessage(Main.prefix + "§7--------------------------------*");
                }
            } else if (args.length == 0) {
                sender.sendMessage(Main.prefix + "§7--------------------------------*");
                sender.sendMessage("§eVotre ping :§a " + player.getPing());
                sender.sendMessage(Main.prefix + "§7--------------------------------*");
            }
        }
        return false;
    }
}