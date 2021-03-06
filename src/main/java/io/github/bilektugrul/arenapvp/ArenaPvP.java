package io.github.bilektugrul.arenapvp;

import io.github.bilektugrul.arenapvp.arenas.ArenaManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class ArenaPvP extends JavaPlugin {

    private ArenaManager arenaManager;

    @Override
    public void onEnable() {
        arenaManager = new ArenaManager();
    }

    public ArenaManager getArenaManager() {
        return arenaManager;
    }

}
