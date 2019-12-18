package ru.remover;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerCommandEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class RemoverIIlALllA extends JavaPlugin implements Listener {

	// Cencelled boolean default true
	private boolean econsole = true;
	// For easy receiving command
	private String s = "say ";
    
	// Register plugin in server
	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
		
	}
	
	// Plugin tag to console
	private String pluginTag = "§7[S2$S$§7] ";
	
	// say Â§cServerÂ§c.pro Â§b- Â§bFree Â§bGame Â§bHosting. Â§6Upgrade Â§6to Â§6remove Â§6ads.

    //[INFO] [Server] Â§cServerÂ§c.pro Â§b- Â§bFree Â§bGame Â§bHosting. Â§6Upgrade Â§6to Â§6remove Â§6ads.
	
	// say §6Server §6will §6expire §6in §610 §6minutes. §6To §6continue §6playing §6renew §6your §6server §6at §cServer§c.pro
	
	@EventHandler
	public void controlConsole(ServerCommandEvent e) {
		// Messages full list
		if(this.econsole = e.getCommand().toLowerCase().contains(s + "§cServer§c.pro") || e.getCommand().contains(s + "§bFree") || e.getCommand().contains(s + "Server.pro")) {
			e.setCancelled(econsole);
			e.getSender().sendMessage(pluginTag + "Messages | Disabled by plugin " + Bukkit.getPluginManager().getPlugin(getName()));
		}
		else if(this.econsole = e.getCommand().contains(s + "§cServer§c.pro §b- §bFree §bGame §bHosting. §6Upgrade §6to §6remove §6ads.")) {
			e.setCancelled(econsole);
			e.getSender().sendMessage(pluginTag + "Messages | Disabled by plugin " + Bukkit.getPluginManager().getPlugin(getName()));
		}
		else if(this.econsole = e.getCommand().contains(s + "Free Game Hosting") || e.getCommand().contains(s + "Upgrade to remove ads") || e.getCommand().contains(s + "§6Upgrade §6to §6remove §6ads") || e.getCommand().contains(s + "§6remove §6ads.") || e.getCommand().contains(s + "§6to §6remove")) {
			e.setCancelled(econsole);
			e.getSender().sendMessage(pluginTag + "Messages | Disabled by plugin " + Bukkit.getPluginManager().getPlugin(getName()));
		}
		else if(this.econsole = e.getCommand().contains(s + "§0Server§0.pro") || e.getCommand().contains(s + "§1Server§1.pro") || e.getCommand().contains(s + "§2Server§2.pro") || e.getCommand().contains(s + "§3Server§3.pro") || e.getCommand().contains(s + "§4Server§4.pro") || e.getCommand().contains(s + "§5Server§5.pro") || e.getCommand().contains(s + "§6Server§6.pro") || e.getCommand().contains(s + "§7Server§7.pro") || e.getCommand().contains(s + "§8Server§8.pro") || e.getCommand().contains(s + "§9Server§9.pro") || e.getCommand().contains(s + "§aServer§a.pro") || e.getCommand().contains(s + "§fServer§f.pro") || e.getCommand().contains(s + "§dServer§d.pro") || e.getCommand().contains(s + "§bServer§b.pro") || e.getCommand().contains(s + "§lServer§l.pro") || e.getCommand().contains(s + "§mServer§m.pro") || e.getCommand().contains(s + "§nServer§n.pro") || e.getCommand().contains(s + "§oServer§o.pro") || e.getCommand().contains(s + "§rServer§r.pro")) {
			e.setCancelled(econsole);
			e.getSender().sendMessage(pluginTag + "Messages | Disabled by plugin " + Bukkit.getPluginManager().getPlugin(getName()));
		}
		else if(this.econsole = e.getCommand().contains(s + "ServerPro") || e.getCommand().contains(s + "server.pro") ||e.getCommand().contains(s + "§cserver§c.pro") || e.getCommand().contains("§0server§0.pro") || e.getCommand().contains(s + "§1server§1.pro") || e.getCommand().contains(s + "§2server§2.pro") || e.getCommand().contains(s + "§3server§3.pro") || e.getCommand().contains(s + "§4server§4.pro") || e.getCommand().contains(s + "§5server§5.pro") || e.getCommand().contains(s + "§6server§6.pro") || e.getCommand().contains(s + "§7server§7.pro") || e.getCommand().contains(s + "§8server§8.pro") || e.getCommand().contains(s + "§9server§9.pro") || e.getCommand().contains(s + "§aserver§a.pro") || e.getCommand().contains(s + "§bserver§b.pro") || e.getCommand().contains(s + "§eserver§e.pro") || e.getCommand().contains(s + "§cserver§c.pro") || e.getCommand().contains(s + "§dserver§d.pro") || e.getCommand().contains(s + "§rserver§r.pro") || e.getCommand().contains(s + "§oserver§o.pro") || e.getCommand().contains(s + "§mserver§m.pro") || e.getCommand().contains(s + "§nserver§n.pro") || e.getCommand().contains(s + "§c" + "server.pro") || e.getCommand().contains(s + "serverpro")) {
			e.setCancelled(econsole);
			e.getSender().sendMessage(pluginTag + "Messages | Disabled by plugin " + Bukkit.getPluginManager().getPlugin(getName()));
		}
		// test messages list
		else if(this.econsole = e.getCommand().contains(s + "§6Server §6will §6expire") || e.getCommand().contains(s + "§6Server §6will §6expire §6in §610 §6minutes. §6To §6continue §6playing §6renew §6your §6server §6at §cServer§c.pro")) {
			e.setCancelled(econsole);
			e.getSender().sendMessage(pluginTag + "Messages | Disabled by plugin " + Bukkit.getPluginManager().getPlugin(getName()));
		}
	}
}
