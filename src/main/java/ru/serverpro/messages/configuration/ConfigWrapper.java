package ru.serverpro.messages.configuration;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

/**
 * Fully Recoded Classes
 * @author lolka13372
 */
public class ConfigWrapper {
    private static File file;
    private static FileConfiguration customFile;
 
    public static void setup() {
        file = new File(Bukkit.getServer().getPluginManager().getPlugin("ServerProMsgRemover").getDataFolder(), "blacklist.yml");
 
        if (!file.exists()){
            try{
                file.createNewFile();
            }catch (IOException e) {}
        }
        customFile = YamlConfiguration.loadConfiguration(file);
    }
 
    public static FileConfiguration get(){
        return customFile;
    }
 
    public static void save(){
        try{
            customFile.save(file);
        }catch (IOException e){
            System.out.println("Couldn't save file");
        }
    }
 
    public static void reload(){
        customFile = YamlConfiguration.loadConfiguration(file);
    }
    
}
