package morey.utils.commands;

import morey.utils.Main;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class ArmorStandCmds implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {

        Player player = (Player) sender;
        if (s.equalsIgnoreCase("armorstand")) {
            if (args.length >= 1) {
                StringBuilder name = new StringBuilder();

                for (String part : args) {
                    name.append(part).append(" ");
                }
                ArmorStand armorStand = (ArmorStand) player.getWorld().spawnEntity(player.getLocation().add(0, 2, 0), EntityType.ARMOR_STAND);
                armorStand.setInvulnerable(false);
                armorStand.setGravity(false);
                armorStand.setVisible(false);
                armorStand.setCustomNameVisible(true);
                armorStand.setCustomName(name.toString());
                Location playerLoc = player.getLocation();
                armorStand.teleport(playerLoc);
            } else {
                player.sendMessage(Main.prefix + "§cUsage: /armorstand <name>");
            }

        }
        return false;
    }
}
