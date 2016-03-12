package com.t10a.myfirstmod.configuration;


import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
 public static void init(File configFile)
 {
     // Create the configuration object from the given configuration file
     Configuration configuration = new Configuration(configFile);
     boolean configValue = false;
     try
     {
         // Load in the configuration file
         configuration.load();

         // Read in properties from configuration file
         configValue = configuration.get("Forgecraft^2", "configValue", true, "This is an example config value!").getBoolean(true);
     }
     catch (Exception e)
     {
         // Log the exception
     }
     finally
     {
         // Save the configuration file
        configuration.save();
     }

     System.out.println("Configuration Test: " + configValue);
 }
}

// Note to self: You might want to ensure that these values are referenced in a Reference class somewhere. This way, you can use em' wherever you want, with little hardcoding fuss!