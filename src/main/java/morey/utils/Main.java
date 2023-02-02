package morey.utils;

import morey.utils.commands.GamemodeCmds;
import morey.utils.commands.SpeedCmds;
import morey.utils.commands.VanishCmds;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.checkerframework.checker.units.qual.Speed;

import java.util.Objects;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("*-------------------*");
        System.out.println("Hello Utils+ :)");
        System.out.println("By Morey");
        System.out.println("*-------------------*");

        Objects.requireNonNull(Bukkit.getPluginCommand("0")).setExecutor(new GamemodeCmds());
        Objects.requireNonNull(Bukkit.getPluginCommand("1")).setExecutor(new GamemodeCmds());
        Objects.requireNonNull(Bukkit.getPluginCommand("2")).setExecutor(new GamemodeCmds());
        Objects.requireNonNull(Bukkit.getPluginCommand("3")).setExecutor(new GamemodeCmds());
        Objects.requireNonNull(Bukkit.getPluginCommand("speed")).setExecutor(new SpeedCmds());
        Objects.requireNonNull(Bukkit.getPluginCommand("v")).setExecutor(new VanishCmds());

    }

    @Override
    public void onDisable() {
        System.out.println("*-------------------*");
        System.out.println("Goodbye!");
        System.out.println("*-------------------*");
    }

    public static String prefix = "§c§l(!) §r";
}
