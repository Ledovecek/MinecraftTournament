package me.ledovec.session;

import me.ledovec.game.Game;

import java.util.concurrent.atomic.AtomicLong;

public class GameSession implements TimedSession<Long, Game>, Pauseable {

    private static volatile AtomicLong GLOBAL_ID = new AtomicLong(0);

    private final Game game;
    private final long id;

    protected GameSession(Game game) {
        this.game = game;
        id = GLOBAL_ID.incrementAndGet();
    }

    @Override
    public Long getSessionId() {
        return id;
    }

    @Override
    public Game getSessionSubject() {
        return game;
    }

    @Override
    public void pause() {

    }

    @Override
    public void unpause() {

    }

    @Override
    public void startTimer() {

    }

    @Override
    public void stopTimer() {

    }

}
