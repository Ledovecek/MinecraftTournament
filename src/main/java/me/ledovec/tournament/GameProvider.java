package me.ledovec.tournament;

import me.ledovec.tournament.events.GameFinishEvent;
import me.ledovec.tournament.events.GamePauseEvent;
import me.ledovec.tournament.events.GameStartEvent;
import me.ledovec.tournament.events.GameResumeEvent;
import me.ledovec.tournament.listener.GameListener;
import me.ledovec.tournament.session.GameSession;
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
    public void resume() {
        Bukkit.getPluginManager().callEvent(new GameResumeEvent(this));
        this.onResume();
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

    @Override public void onInit() { /* Methods body is empty to be optional */ }

    public void onStart() { /* Method body is empty to be optional */ }

    public void onFinish() { /* Method body is empty to be optional */ }

    public void onPause() { /* Method body is empty to be optional */ }

    public void onResume() { /* Method body is empty to be optional */ }

}
