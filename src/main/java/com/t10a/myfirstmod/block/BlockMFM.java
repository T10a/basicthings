package com.t10a.myfirstmod.block;

import com.t10a.myfirstmod.creativetab.CreativeTabMFM;
import com.t10a.myfirstmod.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockMFM extends Block
{
    public BlockMFM(Material material)
    {
        super (material);
        this.setCreativeTab(CreativeTabMFM.MFM_TAB);
    }

    public BlockMFM()
    {
        this(Material.rock);
        this.setCreativeTab(CreativeTabMFM.MFM_TAB);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
        //Returns the name of the block as follows: tile.modid:blockname.name
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
