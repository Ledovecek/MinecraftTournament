package me.ledovec.events;

import me.ledovec.game.Game;

public class GamePrepareEvent extends GameEvent {

    public GamePrepareEvent(Game game) {
        super(game);
        game.onInit();
    }

}
