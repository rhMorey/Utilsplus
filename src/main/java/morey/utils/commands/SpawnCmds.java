package morey.utils.commands;

import morey.utils.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class SpawnCmds implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {


        if(command.getName().equalsIgnoreCase("spawn")){
            Location spawn = Main.getInstance().getConfig().getLocation("spawn");

            sender.sendMessage(Main.prefix  + "§aVous allez être téléporté...");
            Bukkit.getScheduler().runTaskLater(Main.getInstance(), () -> {
                assert spawn != null;
                ((Player) sender).teleport(spawn);

                sender.sendMessage(Main.prefix + "§aTéléportation !");

            }, 60L);
        }
        return false;
    }

}
