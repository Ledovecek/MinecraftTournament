package me.ledovec.session;

import org.bukkit.entity.Player;

public class PlayerSessionFactory implements SessionFactory<Long, PlayerSession, Player> {

    @Override
    public PlayerSession create(Player player) {
        return new PlayerSession(player);
    }

}
