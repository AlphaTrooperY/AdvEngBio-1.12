package AlphaTrooperY.AdvEngBio.handlers;

import AlphaTrooperY.AdvEngBio.init.ItemInit;

public class RegistryHandler {
	public static void Client()
	{
		ItemInit.register();
	}
	public static void Common()
	{
		ItemInit.init();
	}
}
