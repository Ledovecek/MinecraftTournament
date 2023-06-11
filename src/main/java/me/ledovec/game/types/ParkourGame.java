package me.ledovec.game.types;

import me.ledovec.game.Game;
import me.ledovec.listener.GameListener;
import me.ledovec.session.GameSession;

public class ParkourGame implements Game {

    public ParkourGame() {
        System.out.println("Jbee?");
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void unpause() {

    }

    @Override
    public void setGameListener(GameListener gameListener) {

    }

    @Override
    public void setGameSession(GameSession gameSession) {

    }

    @Override
    public GameListener getGameListener() {
        return null;
    }

    @Override
    public GameSession getGameSession() {
        return null;
    }

}
