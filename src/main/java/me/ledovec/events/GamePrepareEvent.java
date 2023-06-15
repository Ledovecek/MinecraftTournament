package me.ledovec.events;

import me.ledovec.Game;

public class GamePrepareEvent extends GameEvent {

    public GamePrepareEvent(Game game) {
        super(game);
        game.onInit();
    }

}
