package me.ledovec.tournament.events;

import me.ledovec.tournament.Game;

public class GameStartEvent extends GameEvent {

    public GameStartEvent(Game game) {
        super(game);
    }

}
