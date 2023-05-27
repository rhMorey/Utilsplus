package morey.utils.commands;

import morey.utils.Main;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class SetSpawnCmds implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        Player p = (Player) sender;
        Location spawn = ((Player) sender).getLocation();
        if(command.getName().equalsIgnoreCase("setspawn")) {
            Main.getInstance().getConfig().set("spawn", spawn);

            Main.getInstance().saveConfig();
            sender.sendMessage(Main.prefix + "Le spawn a été placé aux coordonnées: " + spawn);
            //((Player) sender).teleport(spawn);
        }

        return false;
    }
}
