package io.github.bilektugrul.arenapvp.users;

import io.github.bilektugrul.arenapvp.arenas.Arena;

public class User {

    private final String name;
    private UserState state;
    private Arena arena;

    public User(String name, UserState state) {
        this.name = name;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public UserState getState() {
        return state;
    }

    public void setState(UserState state) {
        this.state = state;
    }

    public Arena getArena() {
        return arena;
    }

    public void setArena(Arena arena) {
        this.arena = arena;
    }

    public boolean isInArena() {
        return arena != null;
    }

}
