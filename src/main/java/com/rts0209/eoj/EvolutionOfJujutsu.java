package com.rts0209.eoj;

import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

import com.rts0209.eoj.cursedenergy.ModAttachments;
import com.rts0209.eoj.block.ModBlocks;
import com.rts0209.eoj.item.ModItems;
import com.rts0209.eoj.creativetab.ModCreativeTabs;



import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.NeoForgeRegistries;


@Mod(EvolutionOfJujutsu.MOD_ID)
public class EvolutionOfJujutsu {

    public static final String MOD_ID = "evolution_of_jujutsu";
    public static final Logger LOGGER = LogUtils.getLogger();

    public EvolutionOfJujutsu(IEventBus modEventBus) {

        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        ModAttachments.ATTACHMENTS.register(modEventBus);

        LOGGER.info("Evolution Of Jujutsu has loaded!");
    }

}
