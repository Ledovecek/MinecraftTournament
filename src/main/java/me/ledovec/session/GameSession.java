package me.ledovec.session;

import me.ledovec.game.Game;

import java.time.Instant;
import java.util.concurrent.atomic.AtomicLong;

public class GameSession implements TimedSession<Long, Game>, Pauseable {

    private static volatile AtomicLong GLOBAL_ID = new AtomicLong(0);

    private final Game game;

    private final long id;

    private long startTime;

    private long endTime;

    private long sessionLength;

    private long pauseStart;

    private long pauseStop;

    private long pauseTime;

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
        pauseStart = Instant.now().getEpochSecond();
    }

    @Override
    public void unpause() {
        pauseStop = Instant.now().getEpochSecond();
        pauseTime = pauseStop - pauseStart;
    }

    @Override
    public void startTimer() {
        startTime = Instant.now().getEpochSecond();
    }

    @Override
    public void stopTimer() {
        endTime = Instant.now().getEpochSecond();
        sessionLength = (endTime - startTime) - pauseTime;
    }

}
