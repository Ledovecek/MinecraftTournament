package me.ledovec.events;

import me.ledovec.game.Game;
import org.bukkit.event.HandlerList;

public class GameFinishEvent extends GameEvent {

    public GameFinishEvent(Game game) {
        super(game);
        HandlerList.unregisterAll(game.getGameListener());
    }

}
