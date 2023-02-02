package morey.utils.commands;

import morey.utils.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class WhoisCmds implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {

        if(s.equalsIgnoreCase("whois")) {
            if(args.length == 1){
                Player target = Bukkit.getPlayer(args[0]);
                if(target != null){
                    sender.sendMessage(Main.prefix + "§7--------------------------------*");
                    sender.sendMessage("§eTarget: §a" + target.getName());
                    sender.sendMessage("§eUUID: §a" + target.getUniqueId());
                    sender.sendMessage("§ePing: §a" + target.getPing());
                    sender.sendMessage("§eWorld: §a" + target.getWorld().getName());
                    sender.sendMessage("§eX: §a" + target.getLocation().getX());
                    sender.sendMessage("§eY: §a" + target.getLocation().getY());
                    sender.sendMessage("§eZ: §a" + target.getLocation().getZ());
                    sender.sendMessage("§eIP: §a" + target.getAddress());
                    sender.sendMessage(Main.prefix + "§7--------------------------------*");
                }
                if (target == null) {
                    sender.sendMessage(Main.prefix + "§cLe joueur n'a pas été trouvé.");
                }
            }

        }
        return false;
    }
}