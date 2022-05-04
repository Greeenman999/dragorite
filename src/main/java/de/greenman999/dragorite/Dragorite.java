package de.greenman999.dragorite;

import de.greenman999.dragorite.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dragorite implements ModInitializer {

	public static final String MOD_ID = "dragorite";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Loaded!");

		ModItems.registerModItems();
	}
}
