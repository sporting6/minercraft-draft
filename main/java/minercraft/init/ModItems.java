package minercraft.init;

import minercraft.MinerCraft;
import minercraft.item.CopperIngot;
import minercraft.item.ItemCustomPickaxe;
import minercraft.item.TungstenIngot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


	
@Mod.EventBusSubscriber(modid=MinerCraft.MODID)
public class ModItems {
	
	static Item copperIngot;
	static Item tungstenIngot;
	static Item tungstenPickaxe;

	public static void init() {
		tungstenIngot = new TungstenIngot();
		tungstenIngot.setCreativeTab(ModItems.tabMinerCraft).setMaxStackSize(64);

		copperIngot = new CopperIngot();
		copperIngot.setCreativeTab(ModItems.tabMinerCraft).setMaxStackSize(64);
		
		tungstenPickaxe = new ItemCustomPickaxe("tungsten_pickaxe", TUNGSTEN);
		tungstenPickaxe.setCreativeTab(ModItems.tabMinerCraft).setMaxStackSize(1);
		
				
	}
	
		

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(tungstenIngot);
		event.getRegistry().registerAll(copperIngot);
		event.getRegistry().registerAll(tungstenPickaxe);
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(tungstenIngot);
		registerRender(copperIngot);
		registerRender(tungstenPickaxe);
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
	public static final ToolMaterial TUNGSTEN = EnumHelper.addToolMaterial
						("TUNGSTEN", 2, 275, 7.0f, 2.5f, 15);
}
