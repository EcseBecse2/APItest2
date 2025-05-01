package org.egyse.apitest1.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class CustomEvent extends Event {
    private final Player player;

    public CustomEvent(Player player) {
        this.player = player;
    }

    @Override
    public HandlerList getHandlers() {
        return null;
    }
}
