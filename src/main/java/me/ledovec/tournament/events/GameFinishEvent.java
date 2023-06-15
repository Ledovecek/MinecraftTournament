package me.ledovec.tournament.events;

import me.ledovec.tournament.Game;
import org.bukkit.event.HandlerList;

public class GameFinishEvent extends GameEvent {

    public GameFinishEvent(Game game) {
        super(game);
        game.getGameSession().stopTimer();
        HandlerList.unregisterAll(game.getGameListener());
    }

}
