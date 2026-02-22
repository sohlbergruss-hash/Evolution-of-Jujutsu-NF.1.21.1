package com.rts0209.eoj.creativetab;

import com.rts0209.eoj.EvolutionOfJujutsu;
import com.rts0209.eoj.item.ModItems;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EvolutionOfJujutsu.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> JUJUTSU_TAB =
            CREATIVE_MODE_TABS.register("jujutsu_tab",
                    () -> CreativeModeTab.builder()
                            .title(Component.literal("Evolution Of Jujutsu"))
                            .icon(() -> new ItemStack(ModItems.CURSED_ENERGY_BLOCK.get()))
                            .displayItems((parameters, output) -> {
                                output.accept(ModItems.CURSED_ENERGY.get());
                                output.accept(ModItems.CURSED_ENERGY_BLOCK.get());
                            })

                            .build());
}
