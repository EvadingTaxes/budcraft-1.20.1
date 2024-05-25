package net.evadingtaxes.budcraft.block;

import net.evadingtaxes.budcraft.BudCraft;
import net.evadingtaxes.budcraft.block.custom.BudCropBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block HEMP_BLOCK = registerBlock("hemp_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DRIED_KELP_BLOCK)));

    public static final Block BUD_CROP = registerBlockWithoutBlockItem("bud_crop",
            new BudCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));


    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(BudCraft.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BudCraft.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(BudCraft.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        BudCraft.LOGGER.info("Registering ModBlocks for " + BudCraft.MOD_ID);
    }
}
