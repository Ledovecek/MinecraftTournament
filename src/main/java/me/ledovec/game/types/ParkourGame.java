package me.ledovec.game.types;

import me.ledovec.events.GameFinishEvent;
import me.ledovec.events.GamePauseEvent;
import me.ledovec.events.GameStartEvent;
import me.ledovec.events.GameUnpauseEvent;
import me.ledovec.game.Game;
import me.ledovec.listener.GameListener;
import me.ledovec.session.GameSession;
import org.bukkit.Bukkit;

public class ParkourGame implements Game {

    private GameListener gameListener;

    private GameSession gameSession;

    @Override
    public void start() {
        Bukkit.getPluginManager().callEvent(new GameStartEvent(this));
    }

    @Override
    public void stop() {
        Bukkit.getPluginManager().callEvent(new GameFinishEvent(this));
    }

    @Override
    public void pause() {
        Bukkit.getPluginManager().callEvent(new GamePauseEvent(this));
    }

    @Override
    public void unpause() {
        Bukkit.getPluginManager().callEvent(new GameUnpauseEvent(this));
    }

    @Override
    public void setGameListener(GameListener gameListener) {
        this.gameListener = gameListener;
    }

    @Override
    public void setGameSession(GameSession gameSession) {
        this.gameSession = gameSession;
    }

    @Override
    public GameListener getGameListener() {
        return gameListener;
    }

    @Override
    public GameSession getGameSession() {
        return gameSession;
    }

}
