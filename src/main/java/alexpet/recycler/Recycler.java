package alexpet.recycler;

import alexpet.recycler.listeners.InventoryListeners;
import alexpet.recycler.misc.HyperApi;
import org.bukkit.plugin.java.JavaPlugin;

public final class Recycler extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        HyperApi api = new HyperApi();
        getServer().getPluginManager().registerEvents(new InventoryListeners(this,api),this);


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
