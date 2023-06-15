package me.ledovec;

import me.ledovec.listener.GameListener;
import me.ledovec.session.GameSessionFactory;

import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

public class GameFactory {

    public Game createGame(GameType gameType, GameListener gameListener) {
        Objects.requireNonNull(gameType, "GameType can not be null!");
        Objects.requireNonNull(gameListener, "Game listener can not be null!");
        Class<? extends Game> type = gameType.getGameType();
        try {
            Game game = type.getConstructor().newInstance();
            game.setGameListener(gameListener);
            game.setGameSession(new GameSessionFactory().create(game));
            return game;
        } catch (InstantiationException | IllegalAccessException |
                 NoSuchMethodException |
                 InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

}
