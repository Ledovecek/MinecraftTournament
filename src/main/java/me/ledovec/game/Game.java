package me.ledovec.game;

import me.ledovec.listener.GameListener;
import me.ledovec.session.GameSession;
import me.ledovec.session.Pauseable;

public interface Game extends Pauseable {

    void start();

    void stop();

    void setGameListener(GameListener gameListener);

    void setGameSession(GameSession gameSession);

    GameListener getGameListener();

    GameSession getGameSession();

}
