package me.ledovec;

import lombok.Getter;
import me.ledovec.game.Game;
import me.ledovec.listener.GameListener;
import org.bukkit.event.HandlerList;

@Getter
public class GameProvider implements Provider {

    private Game currentGame;
    private GameListener legacyListener;
    private GameListener currentListener;

    @Override
    public void startPrepared() {
        if (currentGame != null) {
            currentGame.start();
        }
    }

    @Override
    public void prepareGame(Game game) {
        if (game != null) {
            this.currentGame = game;
        }
    }

    @Override
    public void pauseCurrent() {
        if (currentGame != null) {
            currentGame.pause();
        }
    }

    @Override
    public void stopCurrent() {
        if (currentGame != null) {
            currentGame.stop();
        }
    }

    public void prepareListener(GameListener gameListener) {
        if (gameListener != null) {
            this.legacyListener = currentListener;
            this.currentListener = gameListener;
        }
    }

    public void updateListener() {
        if (legacyListener != null) HandlerList.unregisterAll(legacyListener);
    }

}
