package me.ledovec.game;

import me.ledovec.Main;
import me.ledovec.listener.GameListener;

public abstract class Game {

    private final GameListener gameListener;

    public Game(GameListener gameListener) {
        this.gameListener = gameListener;
    }

    public void start() {
        Main.GAME_PROVIDER.updateListener();
    }

    public abstract void stop();

    public abstract void pause();

}
