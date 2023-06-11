package me.ledovec.session;

import org.bukkit.entity.Player;

import java.util.concurrent.atomic.AtomicLong;

public class GameSession implements TimedSession<Long, Player>, Pauseable {

    private static volatile AtomicLong GLOBAL_ID = new AtomicLong(0);

    private final Player player;
    private final long id;

    protected GameSession(Player player) {
        this.player = player;
        id = GLOBAL_ID.incrementAndGet();
    }

    @Override
    public Long getSessionId() {
        return id;
    }

    @Override
    public Player getSessionSubject() {
        return player;
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
