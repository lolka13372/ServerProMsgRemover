package io.sykasoftware.serverproremover;

import java.io.IOException;

import org.bukkit.plugin.java.JavaPlugin;

import io.sykasoftware.serverproremover.configuration.Config;
import io.sykasoftware.serverproremover.listeners.ConsoleListener;

public class Main extends JavaPlugin
{
    private Config config;
    private ConsoleListener consoleListener;
    
    @Override
    public void onEnable()
    {
        try
        {
            this.config = new Config(getDataFolder());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        boolean blockCommand = this.config.isBlockCommand();

        this.consoleListener = new ConsoleListener(blockCommand);

        this.getServer().getPluginManager().registerEvents(consoleListener, this);
    }
}
