package me.ledovec.session;

import org.bukkit.entity.Player;

public final class GameSessionFactory implements SessionFactory<Long, GameSession, Player> {

    @Override
    public GameSession create(Player player) {
        return new GameSession(player);
    }

}
