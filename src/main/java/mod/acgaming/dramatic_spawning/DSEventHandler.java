package mod.acgaming.dramatic_spawning;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.SoundCategory;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class DSEventHandler
{
    @SubscribeEvent
    public static void onJoinEvent(EntityJoinWorldEvent event)
    {
        if (event.getWorld().isRemote && event.getEntity() instanceof EntityLiving && Minecraft.getMinecraft().player.ticksExisted > 20)
        {
            event.getWorld().playSound(event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, DSSoundEvents.spawn, SoundCategory.AMBIENT, 1.0F, 1.0F, true);
        }
    }
}