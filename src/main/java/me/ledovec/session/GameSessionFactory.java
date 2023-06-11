package me.ledovec.session;

import me.ledovec.game.Game;

public final class GameSessionFactory implements SessionFactory<Long, GameSession, Game> {

    @Override
    public GameSession create(Game game) {
        return new GameSession(game);
    }

}
