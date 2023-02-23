package morey.utils.commands;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class DayCmds implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {

        if(s.equalsIgnoreCase("day")){

            Player player = (Player) sender;
            World w = player.getWorld();
            w.setTime(1000);
        }
        if(s.equalsIgnoreCase("night")){

            Player player = (Player) sender;
            World w = player.getWorld();
            w.setTime(13000);
        }
        return false;
    }
}
