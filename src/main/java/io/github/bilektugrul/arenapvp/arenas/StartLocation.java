package io.github.bilektugrul.arenapvp.arenas;

import org.bukkit.Location;

public class StartLocation {

    private final Location redStart;
    private final Location blueStart;

    public StartLocation(Location redStart, Location blueStart) {
        this.redStart = redStart;
        this.blueStart = blueStart;
    }

    public Location getRedStart() {
        return redStart;
    }

    public Location getBlueStart() {
        return blueStart;
    }

}
