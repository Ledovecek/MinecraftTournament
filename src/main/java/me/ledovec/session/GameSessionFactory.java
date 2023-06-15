package me.ledovec.session;

import lombok.NonNull;
import me.ledovec.Game;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public final class GameSessionFactory
        implements SessionFactory<Long, GameSession, Game> {

    private static final Set<GameSession> sessions = new HashSet<>();

    @Override
    public GameSession create(@NonNull Game game) {
        GameSession gameSession = new GameSession(game);
        sessions.add(gameSession);
        return gameSession;
    }

    @Override
    public void remove(@NonNull GameSession gameSession) {
        sessions.remove(gameSession);
    }

    @Override
    public void removeBySubject(@NonNull Game game) {
        Optional<GameSession> gameSessionOptional =
                sessions.stream()
                .filter(f -> f.getSessionSubject().equals(game))
                .findFirst();
        gameSessionOptional.ifPresent(sessions::remove);
    }

    @Override
    public Set<GameSession> getSessions() {
        return sessions;
    }

}
