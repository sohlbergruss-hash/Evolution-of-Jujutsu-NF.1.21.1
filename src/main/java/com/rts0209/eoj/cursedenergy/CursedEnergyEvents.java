package com.rts0209.eoj.cursedenergy;

import com.rts0209.eoj.EvolutionOfJujutsu;
import net.minecraft.world.entity.player.Player;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;

@EventBusSubscriber(modid = EvolutionOfJujutsu.MOD_ID)
public class CursedEnergyEvents {

    @SubscribeEvent
    public static void onPlayerTick(PlayerTickEvent.Post event) {

        Player player = event.getEntity();

        if (player.level().isClientSide()) return;

        if (player.tickCount % 20 == 0) {
            // Temporary logic
            // Later this will use attachments
            player.giveExperiencePoints(0); // dummy action
        }
    }
}
