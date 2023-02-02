package morey.utils.commands;

import morey.utils.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class MsgCmds implements CommandExecutor {

    public static final String msgprefix = "§7§l» ";

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        if(sender instanceof Player player){

            if(s.equalsIgnoreCase("msg")){
                if(args.length == 1){
                    player.sendMessage(Main.prefix + "§cVous devez préciser un joueur existant.");
                }else if(args.length >= 2) {
                    Player target = Bukkit.getPlayer(args[0]);
                    if(target != null){
                        StringBuilder msg = new StringBuilder();
                        for(int i = 1; i != args.length ; i++){
                            msg.append(args[i]).append(" ");
                        }
                        msg(player, target, msg);
                        Main.lastTarget.put(player,target);
                        Main.lastTarget.put(target,player);
                    }
                    if (target == null) {
                        player.sendMessage(Main.prefix + "§cLe joueur n'a pas été trouvé.");
                    }
                }
                else {
                    player.sendMessage(Main.prefix + "§cVous devez indiquer un joueur.");
                }
                //»
            }
            else if(s.equalsIgnoreCase("r")){
                if(args.length == 0){
                    player.sendMessage(Main.prefix + "§cVous devez préciser un joueur existant.");
                }else{
                    if(Main.lastTarget.containsKey(player)){
                        Player target = Bukkit.getPlayer(Main.lastTarget.get(player).getName());
                        if(target != null){
                            StringBuilder msg = new StringBuilder();
                            for(int i = 0; i != args.length; i++){
                                msg.append(args[i]).append(" ");
                            }
                            msg(player, target, msg);
                        }else{
                            player.sendMessage("§c" + Main.lastTarget.get(player).getName() + " n'est plus connecté.");
                            Main.lastTarget.remove(player);
                        }
                    }else{
                        player.sendMessage("§cVous n'avez personne à qui répondre.");
                    }
                }
            }
            else if(s.equalsIgnoreCase("tell")){
                if(args.length == 1){
                    player.sendMessage(Main.prefix + "§cVous devez préciser un joueur existant.");
                }else if(args.length >= 2) {
                    Player target = Bukkit.getPlayer(args[0]);
                    if(target != null){
                        StringBuilder msg = new StringBuilder();
                        for(int i = 1; i != args.length ; i++){
                            msg.append(args[i]).append(" ");
                        }
                        msg(player, target, msg);
                        Main.lastTarget.put(player,target);
                        Main.lastTarget.put(target,player);
                    }
                    if (target == null) {
                        player.sendMessage(Main.prefix + "§cLe joueur n'a pas été trouvé.");
                    }
                }
                else {
                    player.sendMessage(Main.prefix + "§cVous devez indiquer un joueur.");
                }
                //»
            }
            else if(s.equalsIgnoreCase("m")){
                if(args.length == 1){
                    player.sendMessage(Main.prefix + "§cVous devez préciser un joueur existant.");
                }else if(args.length >= 2) {
                    Player target = Bukkit.getPlayer(args[0]);
                    if(target != null){
                        StringBuilder msg = new StringBuilder();
                        for(int i = 1; i != args.length ; i++){
                            msg.append(args[i]).append(" ");
                        }
                        msg(player, target, msg);
                        Main.lastTarget.put(player,target);
                        Main.lastTarget.put(target,player);
                    }
                    if (target == null) {
                        player.sendMessage(Main.prefix + "§cLe joueur n'a pas été trouvé.");
                    }
                }
                else {
                    player.sendMessage(Main.prefix + "§cVous devez indiquer un joueur.");
                }
                //»
            }
            else if(s.equalsIgnoreCase("w")){
                if(args.length == 1){
                    player.sendMessage(Main.prefix + "§cVous devez préciser un joueur existant.");
                }else if(args.length >= 2) {
                    Player target = Bukkit.getPlayer(args[0]);
                    if(target != null){
                        StringBuilder msg = new StringBuilder();
                        for(int i = 1; i != args.length ; i++){
                            msg.append(args[i]).append(" ");
                        }
                        msg(player, target, msg);
                        Main.lastTarget.put(player,target);
                        Main.lastTarget.put(target,player);
                    }
                    if (target == null) {
                        player.sendMessage(Main.prefix + "§cLe joueur n'a pas été trouvé.");
                    }
                }
                else {
                    player.sendMessage(Main.prefix + "§cVous devez indiquer un joueur.");
                }
                //»
            }
            else if(s.equalsIgnoreCase("whisper")){
                if(args.length == 1){
                    player.sendMessage(Main.prefix + "§cVous devez préciser un joueur existant.");
                }else if(args.length >= 2) {
                    Player target = Bukkit.getPlayer(args[0]);
                    if(target != null){
                        StringBuilder msg = new StringBuilder();
                        for(int i = 1; i != args.length ; i++){
                            msg.append(args[i]).append(" ");
                        }
                        msg(player, target, msg);
                        Main.lastTarget.put(player,target);
                        Main.lastTarget.put(target,player);
                    }
                    if (target == null) {
                        player.sendMessage(Main.prefix + "§cLe joueur n'a pas été trouvé.");
                    }
                }
                else {
                    player.sendMessage(Main.prefix + "§cVous devez indiquer un joueur.");
                }
                //»
            }

        }
        return false;
    }
    public static void msg(Player player, Player target, StringBuilder msg){
        target.sendMessage("§f§l" + player.getName() + " " + "§dt'écrit : " + msg);
        player.sendMessage("§d" + "À §f§l" + target.getName() + " §d: " + msg);
    }

}
