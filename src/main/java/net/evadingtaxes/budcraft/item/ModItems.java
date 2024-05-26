package net.evadingtaxes.budcraft.item;

import net.evadingtaxes.budcraft.BudCraft;
import net.evadingtaxes.budcraft.block.ModBlocks;
import net.evadingtaxes.budcraft.item.custom.JointItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item HEMP_SEEDS = registerItem("hemp_seeds",
            new AliasedBlockItem(ModBlocks.BUD_CROP, new FabricItemSettings()));
    public static final Item HEMP_LEAF = registerItem("hemp_leaf",
            new Item(new FabricItemSettings()));
    public static final Item BUD = registerItem("bud",
            new Item(new FabricItemSettings()));
    public static final Item GROUND_BUD = registerItem("ground_bud",
            new Item(new FabricItemSettings()));
    public static final Item DRIED_HEMP_LEAF = registerItem("dried_hemp_leaf",
            new Item(new FabricItemSettings()));
    public static final Item ROLLING_PAPER = registerItem("rolling_paper",
            new Item(new FabricItemSettings()));
    public static final Item JOINT = registerItem("joint",
            new JointItem(new FabricItemSettings().maxCount(8)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BudCraft.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BudCraft.LOGGER.info("Registering Mod Items for " + BudCraft.MOD_ID);
    }
}
