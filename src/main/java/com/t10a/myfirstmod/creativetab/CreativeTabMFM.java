package com.t10a.myfirstmod.creativetab;

import com.t10a.myfirstmod.init.ModItems;
import com.t10a.myfirstmod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabMFM
{
    public static final CreativeTabs MFM_TAB = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.eucalyptusLeaf;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return "My First Mod!";
        }
    };
}
