package minercraft.init;

import minercraft.MinerCraft;
import minercraft.item.CopperIngot;
import minercraft.item.TungstenIngot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


	
@Mod.EventBusSubscriber(modid=MinerCraft.MODID)
public class ModItems {
	
	static Item copperIngot;
	static Item tungstenIngot;

	public static void init() {
		tungstenIngot = new TungstenIngot();
		copperIngot = new CopperIngot();
		tungstenIngot.setCreativeTab(ModItems.tabMinerCraft).setMaxStackSize(64);
		copperIngot.setCreativeTab(ModItems.tabMinerCraft).setMaxStackSize(64);
	}
	
		

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(tungstenIngot);
		event.getRegistry().registerAll(copperIngot);
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(tungstenIngot);
		registerRender(copperIngot);
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
		
	}
	
	static final CreativeTabs tabMinerCraft = (new CreativeTabs("tabMinerCraft") {

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(copperIngot);
		}
		
	});

}
