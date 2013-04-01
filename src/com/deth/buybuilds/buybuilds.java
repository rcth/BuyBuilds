package com.deth.buybuilds;

import java.util.*;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.command.*;
import org.bukkit.event.*;
import org.bukkit.ChatColor;
import com.deth.buybuilds.config;

public final class BuyBuilds extends JavaPlugin {
	
	private PluginDescriptionFile description = null;
    
    
	@Override
	public void onDisable() {
		getLogger().info("[" + description.getName() + "] Plugin disabled.");
	}
	
	@Override
	public void onEnable() {
		getLogger().info("[" + description.getName() + "] Ready to enable plugin...");
		getLogger().info("[" + description.getName() + "] Running version " + description.getVersion() + "!");
	}
	
	

}