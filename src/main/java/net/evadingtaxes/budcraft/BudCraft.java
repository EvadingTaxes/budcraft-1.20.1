package net.evadingtaxes.budcraft;

import net.evadingtaxes.budcraft.block.ModBlocks;
import net.evadingtaxes.budcraft.item.ModItemGroups;
import net.evadingtaxes.budcraft.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BudCraft implements ModInitializer {
	public static final String MOD_ID = "budcraft";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}