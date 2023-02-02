package morey.utils.commands;

import morey.utils.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class VanishCmds implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {

        if(s.equalsIgnoreCase("v")) {
            Player player = (Player) sender;
            if(player.isInvisible()){
                player.setInvisible(false);
                player.sendMessage(Main.prefix + "§aYou are no longer vanish.");
            } else {
                player.setInvisible(true);
                player.sendMessage(Main.prefix + "§aYou are now vanish.");
            }
        }
        return false;
    }
}