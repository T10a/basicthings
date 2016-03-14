package com.t10a.myfirstmod.init;

import com.t10a.myfirstmod.item.ItemEucalyptusLeaf;
import com.t10a.myfirstmod.item.ItemMFM;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems

{
    public static final ItemMFM eucalyptusLeaf = new ItemEucalyptusLeaf();

    public static void init()
    {
        GameRegistry.registerItem(eucalyptusLeaf, "eucalyptusLeaf");

    }
}
