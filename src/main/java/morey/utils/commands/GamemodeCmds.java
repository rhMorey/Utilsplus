package morey.utils.commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class GamemodeCmds implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

        Player player = (Player) commandSender;
        if(s.equalsIgnoreCase("1")) {
            player.setGameMode(GameMode.CREATIVE);
            player.sendMessage("§aYou are now in creative mode.");
        }
        if(s.equalsIgnoreCase("0")) {
            player.setGameMode(GameMode.SURVIVAL);
            player.sendMessage("§aYou are now in survival mode.");
        }
        if(s.equalsIgnoreCase("3")) {
            player.setGameMode(GameMode.SPECTATOR);
            player.sendMessage("§aYou are now in spectator mode.");
        }
        if(s.equalsIgnoreCase("2")) {
            player.setGameMode(GameMode.ADVENTURE);
            player.sendMessage("§aYou are now in adventure mode.");
        }
        return false;
    }
}