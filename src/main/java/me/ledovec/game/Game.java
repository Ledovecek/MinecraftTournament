package me.ledovec.game;

import me.ledovec.listener.GameListener;
import me.ledovec.session.GameSession;

public interface Game {

    void start();

    void stop();

    void pause();

    void unpause();

    void setGameListener(GameListener gameListener);

    void setGameSession(GameSession gameSession);

    GameListener getGameListener();

    GameSession getGameSession();

}
