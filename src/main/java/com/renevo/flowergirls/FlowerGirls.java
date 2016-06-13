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
            Blocks.GRASS,
            Blocks.DIRT,
            Blocks.SAND,
            Blocks.GRAVEL,
            Blocks.TNT,
            Blocks.CACTUS,
            Blocks.CLAY,
            Blocks.PUMPKIN,
            Blocks.MELON_BLOCK,
            Blocks.MYCELIUM,
            Blocks.BROWN_MUSHROOM,
            Blocks.RED_MUSHROOM
    };

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        for (Block block : blocks) {
            EntityEnderman.setCarriable(block, false);
        }
    }
}
