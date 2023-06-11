package me.ledovec;

import me.ledovec.builder.GameBuilder;
import me.ledovec.game.Game;
import me.ledovec.game.GameType;
import me.ledovec.listener.GlobalListener;
import me.ledovec.listener.ParkourListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static final GameProvider GAME_PROVIDER = new GameProvider();
    public static Plugin PLUGIN = null;

    @Override
    public void onLoad() {

    }

    @Override
    public void onEnable() {
        PLUGIN = Main.getProvidingPlugin(Main.class);
        Bukkit.getPluginManager().registerEvents(new GlobalListener(), this);

        ParkourListener parkourListener = new ParkourListener();
        Bukkit.getPluginManager().registerEvents(parkourListener, this);

        Game game = GameBuilder.builder(GameType.PARKOUR)
                .withListener(parkourListener)
                .build();

        game.start();

        GAME_PROVIDER.prepareGame(game);
        GAME_PROVIDER.startPrepared();
        GAME_PROVIDER.prepareListener(parkourListener);
    }

    @Override
    public void onDisable() {

    }

}