package me.ledovec.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.server.ServerLoadEvent;

public class ParkourListener implements GameListener {

    @EventHandler
    public void onLoad(ServerLoadEvent e) {
        System.out.println("LOADED!");
    }

}
