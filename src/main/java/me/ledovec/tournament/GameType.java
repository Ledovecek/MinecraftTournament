package me.ledovec.tournament;

import me.ledovec.tournament.game.types.ParkourGame;

public enum GameType {
    PARKOUR(ParkourGame.class);

    private final Class<? extends Game> clazz;

    GameType(Class<? extends Game> clazz) {
        this.clazz = clazz;
    }

    public Class<? extends Game> getGameType() {
        return clazz;
    }

}
