package me.ledovec.tournament;

import me.ledovec.tournament.listener.GameListener;
import me.ledovec.tournament.session.GameSession;
import me.ledovec.tournament.session.Pauseable;

public sealed interface Game extends Pauseable permits GameProvider {

    void start();

    void stop();

    void setGameListener(GameListener gameListener);

    void setGameSession(GameSession gameSession);

    GameListener getGameListener();

    GameSession getGameSession();

    /*
        Invoked when game is added to GameSessionProvider
     */
    void onInit();

}
