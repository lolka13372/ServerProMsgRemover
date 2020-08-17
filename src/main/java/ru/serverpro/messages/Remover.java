package ru.serverpro.messages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.bukkit.plugin.java.JavaPlugin;

import ru.serverpro.messages.configuration.ConfigWrapper;
import ru.serverpro.messages.listener.CheckConsoleListener;

/**
 * Fully Recoded Classes
 * @author lolka13372
 */
public class Remover extends JavaPlugin {
	
	public void onEnable() { 
        ConfigWrapper.setup();
        
	if(ConfigWrapper.get().getList("blacklisted") == null) {
	    ConfigManager.inputAll();
	}
		
        ConfigWrapper.get().options().copyDefaults(true);
        ConfigWrapper.save();
        
		this.getServer().getPluginManager().registerEvents(new CheckConsoleListener(), this);
	}

	public void onDisable() {
		this.getServer().getPluginManager().disablePlugin(this);
	}
}
