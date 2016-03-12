package com.t10a.myfirstmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="MyFirstMod", name="My First Mod", version="1.7.10-1.0")
public class MyFirstMod
{
    @Mod.Instance("MyFirstMod")
    public static MyFirstMod instance;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {

    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }
    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {

    }
}
