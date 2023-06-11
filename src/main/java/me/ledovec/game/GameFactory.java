package me.ledovec.game;

import me.ledovec.listener.GameListener;
import me.ledovec.session.GameSessionFactory;

import java.lang.reflect.InvocationTargetException;

public class GameFactory {

    public Game createGame(GameType gameType, GameListener gameListener) {
        if (gameType != null && gameListener != null) {
            Class<? extends Game> type = gameType.getGameType();
            try {
                Game game = type.getConstructor().newInstance();
                game.setGameListener(gameListener);
                game.setGameSession(new GameSessionFactory().create(game));
                return game;
            } catch (InstantiationException | IllegalAccessException | NoSuchMethodException |
                     InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
        throw new NullPointerException("game type or listener in null");
    }

}
