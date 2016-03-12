package com.t10a.myfirstmod;

import com.t10a.myfirstmod.proxy.IProxy;
import com.t10a.myfirstmod.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class MyFirstMod
{
    @Mod.Instance(Reference.MOD_ID)
    public static MyFirstMod instance;

    @SidedProxy(clientSide = "com.t10a.myfirstmod.proxy.ClientProxy", serverSide = "com.t10a.myfirstmod.proxy.ServerProxy")
    public static IProxy proxy;

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
