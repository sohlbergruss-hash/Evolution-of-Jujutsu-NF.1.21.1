package com.rts0209.eoj.block;

import com.rts0209.eoj.EvolutionOfJujutsu;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(EvolutionOfJujutsu.MOD_ID);

    public static final DeferredBlock<Block> CURSED_ENERGY_BLOCK =
            BLOCKS.register("cursed_energy_block",
                    () -> new Block(BlockBehaviour.Properties.of()
                            .strength(4f)
                            .sound(SoundType.WOOL)
                    ));
}
