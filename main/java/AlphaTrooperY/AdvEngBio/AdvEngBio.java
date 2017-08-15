package AlphaTrooperY.AdvEngBio;

import AlphaTrooperY.AdvEngBio.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Refrence.MODID, name = Refrence.NAME, version = Refrence.VERSION)
public class AdvEngBio 
{
	@SidedProxy(clientSide = Refrence.CLIENTPROXY, serverSide = Refrence.COMMONPROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event)
	{
		proxy.preInit(event);
	}
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		proxy.init(event);
	}
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event)
	{
		proxy.postInit(event);
	}
}
