package minercraft.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.lang.System;

public class ModRecipes {
	
	public static void init() {
		GameRegistry.addSmelting(ModBlocks.tungstenOre, new ItemStack(ModItems.tungstenIngot, 1), 0.7f);
		GameRegistry.addSmelting(ModBlocks.copperOre, new ItemStack(ModItems.copperIngot, 1), 0.7f);

		
	}
	

}
