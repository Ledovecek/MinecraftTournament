package me.ledovec.listener;

import me.ledovec.session.PlayerSession;
import me.ledovec.session.PlayerSessionFactory;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class GlobalListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        PlayerSession playerSession = new PlayerSessionFactory().create(player);
        playerSession.setNickname("JdiDoPrdele");
    }

}
