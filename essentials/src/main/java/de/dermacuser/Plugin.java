package de.dermacuser;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

/*
 * essentials java plugin
 */
public class Plugin extends JavaPlugin
{
  private static final Logger LOGGER=Logger.getLogger("essentials");

  public void onEnable()
  {
    System.out.println("Plugin Gestartet!");
  }

  public void onDisable()
  {
    System.out.println("Plugin Gestoppt!");
  }
}
