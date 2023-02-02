package morey.utils.commands;
import morey.utils.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class SpeedCmds implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        if(sender instanceof Player player) {
            if(s.equalsIgnoreCase("speed")){
                if(args.length == 1 ){
                    switch (args[0]) {
                        case "def" -> {
                            ((Player) sender).setFlySpeed((float) 0.1);
                            sender.sendMessage(Main.prefix + "§aDefault speed. (§e1§a)");
                        }
                        case "0" -> {
                            ((Player) sender).setFlySpeed((float) 0);
                            sender.sendMessage(Main.prefix + "§aYour speed has been set at §e" + player.getFlySpeed());
                        }
                        case "1" -> {
                            ((Player) sender).setFlySpeed((float) 0.1);
                            sender.sendMessage(Main.prefix + "§aYour speed has been set at §e" + player.getFlySpeed());
                        }
                        case "2" -> {
                            ((Player) sender).setFlySpeed((float) 0.2);
                            sender.sendMessage(Main.prefix + "§aYour speed has been set at §e" + player.getFlySpeed());
                        }
                        case "3" -> {
                            ((Player) sender).setFlySpeed((float) 0.3);
                            sender.sendMessage(Main.prefix + "§aYour speed has been set at §e" + player.getFlySpeed());
                        }
                        case "4" -> {
                            ((Player) sender).setFlySpeed((float) 0.4);
                            sender.sendMessage(Main.prefix + "§aYour speed has been set at §e" + player.getFlySpeed());
                        }
                        case "5" -> {
                            ((Player) sender).setFlySpeed((float) 0.5);
                            sender.sendMessage(Main.prefix + "§aYour speed has been set at §e" + player.getFlySpeed());
                        }
                        default ->
                                sender.sendMessage(Main.prefix + "§aChoisissez une des vitesses suivantes: (1/2/3/4/5/def)");
                    }
                } else if (args.length == 0){
                    sender.sendMessage(Main.prefix + "Vous devez saisir une vitesse. (1/2/3/4/5/def)");
                }
            }
        }

        return false;
    }
}