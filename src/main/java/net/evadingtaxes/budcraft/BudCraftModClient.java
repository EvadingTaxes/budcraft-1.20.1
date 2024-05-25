package net.evadingtaxes.budcraft;

import net.evadingtaxes.budcraft.block.ModBlocks;
import net.evadingtaxes.budcraft.util.ModModelPredicateProvider;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class BudCraftModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BUD_CROP, RenderLayer.getCutout());

        ModModelPredicateProvider.registerModModels();
    }
}
