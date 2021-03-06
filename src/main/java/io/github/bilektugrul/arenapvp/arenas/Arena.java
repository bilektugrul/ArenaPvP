package io.github.bilektugrul.arenapvp.arenas;

import org.bukkit.Location;

public class Arena {

    private final Location loc1;
    private final Location loc2;

    private final StartLocation startLocation;

    private ArenaState state;

    public Arena(Location loc1, Location loc2, StartLocation startLocation, ArenaState state) {
        this.loc1 = loc1;
        this.loc2 = loc2;
        this.startLocation = startLocation;
        this.state = state;
    }

    public Location getLoc1() {
        return loc1;
    }

    public Location getLoc2() {
        return loc2;
    }

    public StartLocation getStartLocation() {
        return startLocation;
    }

    public ArenaState getState() {
        return state;
    }

}
