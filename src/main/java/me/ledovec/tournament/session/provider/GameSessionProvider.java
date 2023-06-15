package me.ledovec.tournament.session.provider;

import me.ledovec.tournament.events.GamePrepareEvent;
import me.ledovec.tournament.session.GameSession;
import me.ledovec.tournament.session.Pauseable;
import org.bukkit.Bukkit;

import java.util.Objects;

public class GameSessionProvider implements Provider<GameSession>, Pauseable {

    private GameSession gameSession;

    @Override
    public void pause() {
        gameSession.pause();
    }

    @Override
    public void unpause() {
        gameSession.unpause();
    }

    @Override
    public void beginPrepared() {
        gameSession.startTimer();
    }

    @Override
    public void prepare(GameSession gameSession) {
        Objects.requireNonNull(gameSession, "Game session can not be null!");
        this.gameSession.getSessionSubject().stop();
        this.gameSession = gameSession;

        Bukkit.getPluginManager().callEvent(new GamePrepareEvent(gameSession.getSessionSubject()));
    }

    @Override
    public void pauseCurrent() {
        gameSession.pause();
    }

    @Override
    public void stopCurrent() {
        gameSession.getSessionSubject().stop();
    }

    @Override
    public GameSession getPrepared() {
        return gameSession;
    }

}
