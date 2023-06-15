package me.ledovec.tournament.events;

import me.ledovec.tournament.Game;

public class GameUnpauseEvent extends GameEvent {

    public GameUnpauseEvent(Game game) {
        super(game);
    }

}
