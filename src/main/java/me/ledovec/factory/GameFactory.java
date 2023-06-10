package me.ledovec.factory;

import me.ledovec.game.Game;
import me.ledovec.game.GameType;
import me.ledovec.listener.GameListener;

import java.lang.reflect.InvocationTargetException;

public class GameFactory {

    public Game createGame(GameType gameType, GameListener gameListener) {
        Class<? extends Game> type = gameType.getGameType();
        try {
            return type.getConstructor(GameListener.class).newInstance(gameListener);
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException |
                 InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

}
