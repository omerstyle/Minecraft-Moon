package net.engineerofchaos;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
	modid = FireSupport.MODID,
	name = FireSupport.NAME,
	version = FireSupport.VERSION
)
public class FireSupport {
	public static final String MODID = "firesupport";
	public static final String NAME = "Fire Support";
	public static final String VERSION = "0.0.1";
	
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	
	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent preinit) {
		LOGGER.info("Hello, world!");
	}
}
