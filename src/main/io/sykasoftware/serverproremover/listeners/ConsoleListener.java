package io.sykasoftware.serverproremover.listeners;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerCommandEvent;

import io.sykasoftware.serverproremover.regex.Matcher;

public class ConsoleListener implements Listener
{
    private boolean blockCommand;

    public ConsoleListener(boolean blockCommand)
    {
        this.blockCommand = blockCommand;
    }
    
    @EventHandler
    public void onServerCommand(ServerCommandEvent event)
    {
    	String[] args = event.getCommand().split(" ");
    	
		if (this.blockCommand)
		{
			for (int i = 1; i < args.length; i++)
			{
//				if (args[i].matches("^.*Server.*\\.pro$")) {
				if (Matcher.matchesAny(args[i]))
				{
					event.setCancelled(true);
					event.getSender().sendMessage("cancelled = " + ChatColor.GREEN + "" + event.isCancelled());
					return;
				}
			}
		}
    }
}
