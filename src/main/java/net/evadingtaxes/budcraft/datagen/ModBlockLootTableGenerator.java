package net.evadingtaxes.budcraft.datagen;

import net.evadingtaxes.budcraft.block.ModBlocks;
import net.evadingtaxes.budcraft.block.custom.BudCropBlock;
import net.evadingtaxes.budcraft.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;

public class ModBlockLootTableGenerator extends FabricBlockLootTableProvider {
    public ModBlockLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }
    @Override
    public void generate() {

        BlockStatePropertyLootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlocks.BUD_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(BudCropBlock.AGE, 5));
        addDrop(ModBlocks.BUD_CROP, cropDrops(ModBlocks.BUD_CROP, ModItems.BUD, ModItems.HEMP_SEEDS, builder2));
    }
}
