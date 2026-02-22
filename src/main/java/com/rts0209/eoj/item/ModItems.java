package com.rts0209.eoj.item;

import com.rts0209.eoj.EvolutionOfJujutsu;
import com.rts0209.eoj.block.ModBlocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(EvolutionOfJujutsu.MOD_ID);

    // 🔥 Normal item
    public static final DeferredItem<Item> CURSED_ENERGY =
            ITEMS.register("cursed_energy",
                    () -> new Item(new Item.Properties()));

    // 🔥 Block item
    public static final DeferredItem<Item> CURSED_ENERGY_BLOCK =
            ITEMS.register("cursed_energy_block",
                    () -> new BlockItem(
                            ModBlocks.CURSED_ENERGY_BLOCK.get(),
                            new Item.Properties()
                    ));
}
// Cursed Energy
