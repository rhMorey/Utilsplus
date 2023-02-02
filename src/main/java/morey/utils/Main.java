package morey.utils;

import morey.utils.commands.GamemodeCmds;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("*-------------------*");
        System.out.println("Hello Utils+ :)");
        System.out.println("By Morey");
        System.out.println("*-------------------*");

        Objects.requireNonNull(Bukkit.getPluginCommand("0")).setExecutor(new GamemodeCmds());

    }

    @Override
    public void onDisable() {
        System.out.println("*-------------------*");
        System.out.println("Goodbye!");
        System.out.println("*-------------------*");
    }
}
