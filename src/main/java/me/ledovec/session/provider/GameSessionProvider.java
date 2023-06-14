package me.ledovec.session.provider;

import me.ledovec.session.GameSession;
import me.ledovec.session.Pauseable;

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
        gameSession.getSessionSubject().stop();
        this.gameSession = gameSession;
    }

    @Override
    public void pauseCurrent() {
        gameSession.pause();
    }

    @Override
    public void stopCurrent() {
        gameSession.stopTimer();
    }

    @Override
    public GameSession getPrepared() {
        return gameSession;
    }

}
