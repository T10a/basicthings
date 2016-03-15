package com.t10a.myfirstmod.init;

import com.t10a.myfirstmod.block.BlockFlag;
import com.t10a.myfirstmod.block.BlockMFM;
import com.t10a.myfirstmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockMFM flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
    }
}
