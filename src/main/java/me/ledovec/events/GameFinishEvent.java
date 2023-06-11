package me.ledovec.events;

import me.ledovec.game.Game;

public class GameFinishEvent extends GameEvent {

    public GameFinishEvent(Game game) {
        super(game);
    }

}
