package org.teddy.minercraft.block;

import org.teddy.minercraft.MinerCraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TungstenOre extends Block {

	public static final String NAME = "Tungsten Ore";
    private static final String UNLOCALIZED_NAME = "TungstenOre";
    private static final String REGISTRY_NAME = MinerCraft.MODID + "." + TungstenOre.UNLOCALIZED_NAME;
	
	public TungstenOre() {
		super(Material.ROCK);
		
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		this.setUnlocalizedName(TungstenOre.UNLOCALIZED_NAME);
        this.setRegistryName(TungstenOre.REGISTRY_NAME);
	}
	
	@SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
		return BlockRenderLayer.SOLID;
    }
}
