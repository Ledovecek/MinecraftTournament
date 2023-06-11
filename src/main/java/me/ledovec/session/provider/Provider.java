package me.ledovec.session.provider;

import me.ledovec.game.Game;

public interface Provider {

    void startPrepared();

    void prepareGame(Game game);

    void pauseCurrent();

    void stopCurrent();

}
