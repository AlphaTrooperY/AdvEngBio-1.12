package AlphaTrooperY.AdvEngBio.init;

import AlphaTrooperY.AdvEngBio.Refrence;
import AlphaTrooperY.AdvEngBio.init.items.CustomIngot;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;


public class ItemInit {
	
	public static Item copperingot;
	
	public static void init()
	{
	 copperingot = new CustomIngot("copperingot");
	}
	public static void register()
	{
		registerItem(copperingot);
	}
	public static void registerItem(Item item)
	{
		ForgeRegistries.ITEMS.register(item);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Refrence.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
