package ru.serverpro.messages.listener;

import java.util.Collections;
import java.util.List;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerCommandEvent;

import ru.serverpro.messages.configuration.ConfigWrapper;

/**
 * Fully Recoded Classes
 * @author lolka13372
 */
public class CheckConsoleListener implements Listener {	
	@EventHandler
	public void checkConsoleMessages(ServerCommandEvent e) {
//		List<String> strings = Arrays.asList("Server.pro", "server.pro");
		List<String> strings = ConfigWrapper.get().getStringList("blacklisted");
		Collections.sort(strings);
		
		for (int i = 0; i < strings.size(); i++) {
			if(e.getCommand().indexOf("say " + strings.get(i)) != -1) {
				e.setCancelled(true);
				e.getSender().sendMessage("cancel = " + e.isCancelled());
			}
		}
	}
}
