package me.ledovec.game;

import me.ledovec.events.GameFinishEvent;
import me.ledovec.events.GamePauseEvent;
import me.ledovec.events.GameStartEvent;
import me.ledovec.events.GameUnpauseEvent;
import me.ledovec.listener.GameListener;
import me.ledovec.session.GameSession;
import org.bukkit.Bukkit;

public abstract non-sealed class GameProvider implements Game {

    private GameListener gameListener;

    private GameSession gameSession;

    @Override
    public void start() {
        Bukkit.getPluginManager().callEvent(new GameStartEvent(this));
        this.onStart();
    }

    @Override
    public void stop() {
        Bukkit.getPluginManager().callEvent(new GameFinishEvent(this));
        this.onFinish();
    }

    @Override
    public void pause() {
        Bukkit.getPluginManager().callEvent(new GamePauseEvent(this));
        this.onPause();
    }

    @Override
    public void unpause() {
        Bukkit.getPluginManager().callEvent(new GameUnpauseEvent(this));
        this.onUnpause();
    }

    @Override
    public GameListener getGameListener() {
        return gameListener;
    }

    @Override
    public GameSession getGameSession() {
        return gameSession;
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
    public void onInit() {
        this.onPrepare();
    }

    /*
                Methods body is empty to be optional
             */
    public void onPrepare() {}

    public void onStart() {}

    public void onFinish() {}

    public void onPause() {}

    public void onUnpause() {}

}
