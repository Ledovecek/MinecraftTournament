package me.ledovec.session;

import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;

import java.util.concurrent.atomic.AtomicLong;

public class PlayerSession implements Session<Long, Player> {

    private static volatile AtomicLong GLOBAL_ID = new AtomicLong(0);

    private final Player player;
    private String nickname;
    private final long id;

    protected PlayerSession(Player player) {
        this.player = player;
        this.id = GLOBAL_ID.incrementAndGet();
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
        player.displayName(Component.text(nickname));
        player.playerListName(Component.text(nickname));
        player.customName(Component.text(nickname));
    }

    public String getNickname() {
        return nickname;
    }

    @Override
    public Long getSessionId() {
        return id;
    }

    @Override
    public Player getSessionSubject() {
        return player;
    }

}