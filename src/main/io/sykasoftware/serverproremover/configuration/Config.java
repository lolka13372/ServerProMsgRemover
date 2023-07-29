package io.sykasoftware.serverproremover.configuration;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

public class Config
{
    private final File configFile;
    private final YamlConfiguration config;

    public Config(File folder) throws IOException
    {
        if (!folder.exists())
        {
            folder.mkdirs();
        }
        this.configFile = new File(folder, "config.yml");
        if (!this.configFile.exists())
        {
            this.configFile.createNewFile();
        }
        this.config = YamlConfiguration.loadConfiguration(this.configFile);
    }

    public boolean isBlockCommand()
    {
        return this.config.getBoolean("blockCommand", true);
    }

    public void setBlockCommand(boolean value) throws IOException
    {
        this.config.set("blockCommand", value);
        this.config.save(this.configFile);
    }
}
