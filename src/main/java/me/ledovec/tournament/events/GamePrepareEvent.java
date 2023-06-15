package me.ledovec.tournament.events;

import me.ledovec.tournament.Game;

public class GamePrepareEvent extends GameEvent {

    public GamePrepareEvent(Game game) {
        super(game);
        game.onInit();
    }

}
