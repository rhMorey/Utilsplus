package morey.utils;

import morey.utils.commands.*;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.checkerframework.checker.units.qual.Speed;

import java.util.HashMap;
import java.util.Objects;
import java.util.logging.Logger;

public final class Main extends JavaPlugin {

    public static final HashMap<Player, Player> lastTarget = new HashMap<>();

    private static Main instance;

    FileConfiguration config = this.getConfig();

    @Override
    public void onEnable() {
        Logger logger = Bukkit.getLogger();
        logger.info("*-------------------*");
        logger.info("Hello Utils+ :)");
        logger.info("By Morey");
        logger.info("*-------------------*");
        saveDefaultConfig();

        instance = this;

        Objects.requireNonNull(Bukkit.getPluginCommand("0")).setExecutor(new GamemodeCmds());
        Objects.requireNonNull(Bukkit.getPluginCommand("1")).setExecutor(new GamemodeCmds());
        Objects.requireNonNull(Bukkit.getPluginCommand("2")).setExecutor(new GamemodeCmds());
        Objects.requireNonNull(Bukkit.getPluginCommand("3")).setExecutor(new GamemodeCmds());
        Objects.requireNonNull(Bukkit.getPluginCommand("speed")).setExecutor(new SpeedCmds());
        Objects.requireNonNull(Bukkit.getPluginCommand("v")).setExecutor(new VanishCmds());
        Objects.requireNonNull(Bukkit.getPluginCommand("bc")).setExecutor(new BroadcastCmds());
        Objects.requireNonNull(Bukkit.getPluginCommand("de")).setExecutor(new DeCmds());
        Objects.requireNonNull(Bukkit.getPluginCommand("whois")).setExecutor(new WhoisCmds());
        Objects.requireNonNull(Bukkit.getPluginCommand("rl")).setExecutor(new ReloadCmds());
        Objects.requireNonNull(Bukkit.getPluginCommand("ping")).setExecutor(new PingCmds());
        Objects.requireNonNull(Bukkit.getPluginCommand("msg")).setExecutor(new MsgCmds());
        Objects.requireNonNull(Bukkit.getPluginCommand("w")).setExecutor(new MsgCmds());
        Objects.requireNonNull(Bukkit.getPluginCommand("r")).setExecutor(new MsgCmds());
        Objects.requireNonNull(Bukkit.getPluginCommand("whisper")).setExecutor(new MsgCmds());
        Objects.requireNonNull(Bukkit.getPluginCommand("tell")).setExecutor(new MsgCmds());
        Objects.requireNonNull(Bukkit.getPluginCommand("m")).setExecutor(new MsgCmds());
        Objects.requireNonNull(Bukkit.getPluginCommand("day")).setExecutor(new DayCmds());
        Objects.requireNonNull(Bukkit.getPluginCommand("night")).setExecutor(new DayCmds());
        Objects.requireNonNull(Bukkit.getPluginCommand("armorstand")).setExecutor(new ArmorStandCmds());
        Objects.requireNonNull(Bukkit.getPluginCommand("spawn")).setExecutor(new SpawnCmds());
        Objects.requireNonNull(Bukkit.getPluginCommand("setspawn")).setExecutor(new SetSpawnCmds());

    }

    @Override
    public void onDisable() {
        Logger logger = Bukkit.getLogger();
        logger.info("*-------------------*");
        logger.info("Goodbye!");
        logger.info("*-------------------*");
    }

    public static String prefix = "§c§l(!) §r";

    public static Main getInstance() {
        return instance;
    }
}
