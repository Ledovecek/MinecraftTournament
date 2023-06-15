package me.ledovec.tournament.events;

import me.ledovec.tournament.Game;

public class GamePauseEvent extends GameEvent {

    public GamePauseEvent(Game game) {
        super(game);
    }

}
