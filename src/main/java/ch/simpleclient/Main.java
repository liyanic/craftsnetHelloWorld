package ch.simpleclient;

import de.craftsblock.craftscore.event.ListenerAdapter;
import de.craftsblock.craftsnet.addon.Addon;
import de.craftsblock.craftsnet.api.Handler;

public class Main extends Addon implements ListenerAdapter {


    @Override
    public void onLoad() {

        routeRegistry().register((Handler) new SocketHelper());
        System.out.println(getDataFolder().getAbsoluteFile());
        routeRegistry().share("/debugg/", getDataFolder());

        super.onLoad();
    }

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {

    }
}