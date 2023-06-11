package me.ledovec.session;

import org.bukkit.entity.Player;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class PlayerSessionFactory
        implements SessionFactory<Long, PlayerSession, Player> {

    private static final Set<PlayerSession> sessions = new HashSet<>();

    @Override
    public PlayerSession create(Player player) {
        PlayerSession playerSession = new PlayerSession(player);
        sessions.add(playerSession);
        return playerSession;
    }

    @Override
    public void remove(PlayerSession playerSession) {
        sessions.remove(playerSession);
    }

    @Override
    public void removeBySubject(Player player) {
        Optional<PlayerSession> sessionOptional =
                sessions.stream()
                .filter(s -> s.getSessionSubject().equals(player))
                .findFirst();
        sessionOptional.ifPresent(sessions::remove);
    }

    @Override
    public Set<PlayerSession> getSessions() {
        return sessions;
    }

}
