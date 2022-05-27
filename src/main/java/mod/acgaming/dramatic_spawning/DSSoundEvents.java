package mod.acgaming.dramatic_spawning;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DSSoundEvents
{
    public static SoundEvent spawn;

    public static void preInit()
    {
        spawn = register("spawn");
        MinecraftForge.EVENT_BUS.register(DSSoundEvents.class);
    }

    public static SoundEvent register(String name)
    {
        ResourceLocation loc = new ResourceLocation(DramaticSpawning.MOD_ID, name);
        return new SoundEvent(loc).setRegistryName(loc);
    }

    @SubscribeEvent
    public static void register(RegistryEvent.Register<SoundEvent> event)
    {
        event.getRegistry().register(spawn);
    }
}