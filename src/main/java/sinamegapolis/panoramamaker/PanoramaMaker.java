/**
 * This class was created by <SinaMegapolis>. It's distributed as
 * part of the PanoramaMaker Mod. Get the Source Code in github:
 * https://github.com/SinaMegapolis/PanoramaMaker
 *
 * PanoramaMaker is Open Source and distributed under the
 * CC-BY-NC-SA 3.0 License: https://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB
 *
 */
package sinamegapolis.panoramamaker;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

@Mod(modid = PanoramaMaker.MODID, name = PanoramaMaker.NAME, version = PanoramaMaker.VERSION)
public class PanoramaMaker {
    public static final String MODID = "panoramamaker";
    public static final String NAME = "PanoramaMaker";
    public static final String VERSION = "1.0.0";

    public static File configFile = null;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e){
      configFile = e.getSuggestedConfigurationFile();
    }
    @Mod.EventHandler
	public void init(FMLInitializationEvent e) {
        MinecraftForge.EVENT_BUS.register(this);
        if(!Loader.isModLoaded("quark"))
            MinecraftForge.EVENT_BUS.register(new PanoramaScreenshotMaker());
    }

    @Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e) {

    }
}
