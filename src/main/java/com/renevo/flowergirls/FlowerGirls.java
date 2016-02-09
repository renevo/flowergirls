package com.renevo.flowergirls;

import net.minecraft.block.Block;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = FlowerGirls.MODID, useMetadata = true)
public class FlowerGirls {
    public static final String MODID = "flowergirls";

    public static final Block[] blocks = new Block[]{
            Blocks.grass,
            Blocks.dirt,
            Blocks.sand,
            Blocks.gravel,
            Blocks.tnt,
            Blocks.cactus,
            Blocks.clay,
            Blocks.pumpkin,
            Blocks.melon_block,
            Blocks.mycelium,
            Blocks.brown_mushroom,
            Blocks.red_mushroom
    };

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        for (Block block : blocks) {
            EntityEnderman.setCarriable(block, false);
        }
    }
}
