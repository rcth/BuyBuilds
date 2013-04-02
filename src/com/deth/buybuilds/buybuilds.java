//////////////////Notes//////////////////
// If you find a bug in a change or if you don't agree with something we did, make a pullrequest or open a ticket! //

// Package name, DO NOT TOUCH! //
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
	private PluginDescriptionFile description; //Variable for getting plugin.yml info
	private String latestVersion; //Variable for storing latest version from the site
    
    
	@Override
	public void onDisable() {
		getLogger().info("[" + description.getName() + "] Plugin disabled.");
	}
	
	@Override
	public void onEnable() {
		getLogger().info("[" + description.getName() + "] Ready to enable plugin...");
		///TODO: Add logic for enabling plugin, like initilize command, permissions, mysql///
		getLogger().info("[" + description.getName() + "] Running version " + description.getVersion() + "!");
		getLogger().info("[" + description.getName() + "] Made by: " + description.getAuthors() + "!");
		getLogger().info("[" + description.getName() + "] Cheap dutch Minecraft servers? Check http://www.serverbuilds.nl!");
		getLogger().info("[" + description.getName() + "] Plugin will check for updates, please stand by...");
		///TODO: Add versioncheck logic///
		getLogger().info("[" + description.getName() + "] Current version " + description.getVersion() + " where latest version equals " + latestVersion);
		if (description.getVersion() == latestVersion)
		{
			getLogger().info("[" + description.getName() + "] You are running the latest recommended build!");
		} else {
			getLogger().info("[" + description.getName() + "] There is a newer build available! We recommended updating, due to bugfixes and new features and maybe critical safety issues.");
			getLogger().info("[" + description.getName() + "] Plugin will still run if compatible with this version of Craftbukkit.");
		}
	}
	
	

}