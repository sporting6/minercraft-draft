package minercraft;

import org.apache.logging.log4j.Logger;

import minercraft.init.ModBlocks;
import minercraft.init.ModItems;
import minercraft.init.ModRecipes;
import minercraft.worldgen.OreGen;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = MinerCraft.MODID, name = MinerCraft.NAME, version = MinerCraft.VERSION)
public class MinerCraft
{
    public static final String MODID = "minercraft";
    public static final String NAME = "Miner Craft";
    public static final String VERSION = "0.0.1";
    
    @Instance
    public static MinerCraft instance;

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        ModItems.init();
        ModBlocks.init();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	logger.info("Initializing " + NAME + "...");
        ModRecipes.init();
        GameRegistry.registerWorldGenerator(new OreGen(), 0);
    }
    
    @EventHandler
    public void postInit(FMLInitializationEvent event)
    {
    	logger.info(NAME + "Initialized");
    }    
}
