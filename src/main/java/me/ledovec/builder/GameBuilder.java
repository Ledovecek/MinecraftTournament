package me.ledovec.builder;

import me.ledovec.game.GameFactory;
import me.ledovec.game.Game;
import me.ledovec.game.GameType;
import me.ledovec.listener.GameListener;

public class GameBuilder {

    private GameListener gameListener;

    private final GameType gameType;

    public GameBuilder(GameType gameType) {
        this.gameType = gameType;
    }

    public static GameBuilder builder(GameType gameType) {
        return new GameBuilder(gameType);
    }

    public GameBuilder withListener(GameListener listener) {
        this.gameListener = listener;
        return this;
    }

    public Game build() {
        return new GameFactory().createGame(gameType, gameListener);
    }

}
