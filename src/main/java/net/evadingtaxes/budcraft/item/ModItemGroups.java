package net.evadingtaxes.budcraft.item;

import net.evadingtaxes.budcraft.BudCraft;
import net.evadingtaxes.budcraft.block.ModBlocks;
import net.evadingtaxes.budcraft.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BUDCRAFT_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BudCraft.MOD_ID, "budcraft"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroups.budcraft"))
                    .icon(() -> new ItemStack(ModItems.HEMP_LEAF)).entries((displayContext, entries) -> {
                        entries.add(ModItems.HEMP_SEEDS);
                        entries.add(ModBlocks.HEMP_BLOCK);
                        entries.add(ModItems.HEMP_LEAF);
                        entries.add(ModItems.BUD);
                        entries.add(ModItems.GROUND_BUD);
                        entries.add(ModItems.DRIED_HEMP_LEAF);
                        entries.add(ModItems.ROLLING_PAPER);

                        entries.add(ModItems.JOINT);



                    }).build());


    public static void registerItemGroups() {
        BudCraft.LOGGER.info("Registering Item Groups for " + BudCraft.MOD_ID);
    }
}