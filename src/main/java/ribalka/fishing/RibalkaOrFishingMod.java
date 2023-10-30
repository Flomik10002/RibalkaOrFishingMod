package ribalka.fishing;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ribalka.fishing.item.ModItemGroups;
import ribalka.fishing.register.RegisterBlocks;
import ribalka.fishing.register.RegisterCustomTrades;
import ribalka.fishing.register.RegisterVillagers;

public class RibalkaOrFishingMod implements ModInitializer {
	public static final String MOD_ID = "fishing";
	public static final Logger LOGGER = LoggerFactory.getLogger("Ribalka Or Fishing Mod");

	@Override
	public void onInitialize() {
		RegisterVillagers.registerVillagers();
		RegisterBlocks.registerBlocks();
		RegisterCustomTrades.registerCustomTrades();

		ModItemGroups.registerItemGroups();
	}
}