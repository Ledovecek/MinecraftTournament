package me.ledovec.game;

import me.ledovec.listener.GameListener;
import me.ledovec.session.GameSession;
import me.ledovec.session.Pauseable;

public sealed interface Game extends Pauseable permits GameProvider {

    void start();

    void stop();

    void setGameListener(GameListener gameListener);

    void setGameSession(GameSession gameSession);

    GameListener getGameListener();

    GameSession getGameSession();

}
