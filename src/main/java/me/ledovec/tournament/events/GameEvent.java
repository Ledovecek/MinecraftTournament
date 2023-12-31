package me.ledovec.tournament.events;

import me.ledovec.tournament.Game;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public abstract class GameEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final Game game;

    public GameEvent(Game game) {
        this.game = game;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public Game getGame() {
        return game;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLERS;
    }

}
