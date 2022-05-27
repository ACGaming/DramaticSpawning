package mod.acgaming.dramatic_spawning;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = DramaticSpawning.MOD_ID, name = DramaticSpawning.NAME, version = DramaticSpawning.VERSION, clientSideOnly = true)
public class DramaticSpawning
{
    public static final String MOD_ID = "dramatic_spawning";
    public static final String NAME = "Dramatic Spawning";
    public static final String VERSION = "1.0.0";
    public static final Logger LOGGER = LogManager.getLogger("Dramatic Spawning");

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        DSSoundEvents.preInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LOGGER.info("*BOOM*");
    }
}