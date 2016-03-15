package com.t10a.myfirstmod;

import com.t10a.myfirstmod.client.handler.KeyInputEventHandler;
import com.t10a.myfirstmod.handler.ConfigurationHandler;
import com.t10a.myfirstmod.init.ModBlocks;
import com.t10a.myfirstmod.init.ModItems;
import com.t10a.myfirstmod.init.Recipes;
import com.t10a.myfirstmod.proxy.IProxy;
import com.t10a.myfirstmod.reference.Reference;
import com.t10a.myfirstmod.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class MyFirstMod
{
    @Mod.Instance(Reference.MOD_ID)
    public static MyFirstMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        proxy.registerKeyBindings();

        ModItems.init();

        ModBlocks.init();

        LogHelper.info("Pre Initialisation Complete!");
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
        Recipes.init();
        LogHelper.info("Initialisation Complete!");
    }
    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialisation Complete!");
    }
}
