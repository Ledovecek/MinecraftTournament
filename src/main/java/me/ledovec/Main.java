package me.ledovec;

import me.ledovec.game.Game;
import me.ledovec.game.GameBuilder;
import me.ledovec.game.GameType;
import me.ledovec.listener.GlobalListener;
import me.ledovec.listener.ParkourListener;
import me.ledovec.session.GameSession;
import me.ledovec.session.provider.GameSessionProvider;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static final GameSessionProvider GAME_SESSION_PROVIDER = new GameSessionProvider();

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

        GameSession gameSession = game.getGameSession();
        GAME_SESSION_PROVIDER.prepare(gameSession);
        GAME_SESSION_PROVIDER.beginPrepared();

    }

    @Override
    public void onDisable() {

    }

}