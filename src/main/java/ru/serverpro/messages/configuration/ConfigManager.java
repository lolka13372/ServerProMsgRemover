package ru.serverpro.messages.configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Fully Recoded Classes
 * @author lolka13372
 */
public class ConfigManager {
	
	public static void inputAll() {
        List<String> list = new ArrayList<>();
        list.add("server.pro");
        for (int i = 0; i < 10; i++) {
        	list.add("�" + i + "server" + "�" + i + ".pro");
		}
        list.add("�cserver�c.pro");
        list.add("�aserver�a.pro");
        list.add("�eserver�e.pro");
        list.add("�bserver�b.pro");
        list.add("�dserver�d.pro");
        list.add("�lserver�l.pro");
        list.add("�rserver�r.pro");
        
        list.add("Server.pro");
        for (int i = 0; i < 10; i++) {
        	list.add("�" + i + "Server" + "�" + i + ".pro");
		}
        list.add("�cServer�c.pro");
        list.add("�aServer�a.pro");
        list.add("�eServer�e.pro");
        list.add("�bServer�b.pro");
        list.add("�dServer�d.pro");
        list.add("�lServer�l.pro");
        list.add("�rServer�r.pro");
        for (int i = 0; i < 10; i++) {
        	list.add("�" + i + "Server �" + i + "will �" + i + "expire �" + i + "in");
		}
        
        //Collections.sort(list);
        ConfigWrapper.get().set("blacklisted", list);
	}
}
