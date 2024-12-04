package exersolver.mcsrfairplay;

import net.fabricmc.api.ClientModInitializer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MCSRFairplay implements ClientModInitializer {
	public static final String MOD_ID = "mcsrfairplay";

	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitializeClient() {
		InputListener.init();
	}
}