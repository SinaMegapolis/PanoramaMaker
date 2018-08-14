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

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = PanoramaMaker.MODID)
@Config(modid = PanoramaMaker.MODID)
public class PanoramaMakerConfig {

    @Config.RequiresMcRestart
    @Config.Comment("Use panorama screenshots on main menu")
    public static boolean overrideMainMenu = true;

    @Config.Comment("Fullres screenshots: Take panorama screenshots without changing the render size")
    public static boolean fullScreen = false;

    @Config.Comment("Panorama Picture Resolution")
    public static int panoramaSize = 256;

    @SubscribeEvent
    public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event){
        if(event.getModID().equals(PanoramaMaker.MODID)){
            ConfigManager.sync(PanoramaMaker.MODID, Config.Type.INSTANCE);
        }
    }
}
