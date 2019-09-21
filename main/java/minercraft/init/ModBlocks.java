package minercraft.init;

import minercraft.MinerCraft;
import minercraft.block.CopperBlock;
import minercraft.block.CopperOre;
import minercraft.block.TungstenBlock;
import minercraft.block.TungstenOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=MinerCraft.MODID)
public class ModBlocks {

	
	static public Block tungstenOre;
	static public Block copperOre;
	static Block tungstenBlock;
	static Block copperBlock;
	
	public static void init() {
		tungstenOre = new TungstenOre("tungsten_ore", Material.ROCK);
		tungstenOre.setHardness(2.5f).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		tungstenOre.setHarvestLevel("pickaxe", 2);
		copperOre = new CopperOre("copper_ore", Material.ROCK);
		copperOre.setHardness(2.5f).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		copperOre.setHarvestLevel("pickaxe", 1);
		tungstenBlock = new TungstenBlock("tungsten_block", Material.ROCK);
		tungstenBlock.setHardness(2.5f).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		tungstenBlock.setHarvestLevel("pickaxe", 1);
		copperBlock = new CopperBlock("copper_block", Material.ROCK);
		copperBlock.setHardness(2.5f).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		copperBlock.setHarvestLevel("pickaxe", 1);
	}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(tungstenOre);
		event.getRegistry().registerAll(tungstenBlock);
		event.getRegistry().registerAll(copperOre);
		event.getRegistry().registerAll(copperBlock);
	}                  	  	  	 	 	  	  	 	 	 
	
	@SubscribeEvent
	public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(new ItemBlock(tungstenOre).setRegistryName(tungstenOre.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(tungstenBlock).setRegistryName(tungstenBlock.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(copperOre).setRegistryName(copperOre.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(copperBlock).setRegistryName(copperBlock.getRegistryName()));
	}
	
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(Item.getItemFromBlock(tungstenOre));
		registerRender(Item.getItemFromBlock(tungstenBlock));
		registerRender(Item.getItemFromBlock(copperOre));
		registerRender(Item.getItemFromBlock(copperBlock));

	}
	
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}
}
