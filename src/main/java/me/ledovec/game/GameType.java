package me.ledovec.game;

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
