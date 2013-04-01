package com.deth.buybuilds;

//////////////////Imports//////////////////
//Alfabetic order please!//
import com.deth.buybuilds.config;

import java.util.*;

import org.bukkit.ChatColor;
import org.bukkit.command.*;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.*;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.PluginDescriptionFile;



public final class BuyBuilds extends JavaPlugin {
	
	//////////////////Attributes//////////////////
	private PluginDescriptionFile description;
    
    
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