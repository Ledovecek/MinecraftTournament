package me.ledovec.tournament.events;

import me.ledovec.tournament.Game;

public class GameResumeEvent extends GameEvent {

    public GameResumeEvent(Game game) {
        super(game);
    }

}
