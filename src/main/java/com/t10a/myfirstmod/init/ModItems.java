package com.t10a.myfirstmod.init;

import com.t10a.myfirstmod.item.ItemEucalyptusLeaf;
import com.t10a.myfirstmod.item.ItemMFM;
import com.t10a.myfirstmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems

{
    public static final ItemMFM eucalyptusLeaf = new ItemEucalyptusLeaf();

    public static void init()
    {
        GameRegistry.registerItem(eucalyptusLeaf, "eucalyptusLeaf");

    }
}
