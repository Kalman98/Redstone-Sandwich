package com.kalman98.redstonesandwich;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;

public class StartupClientOnly 
{
	public static void preInitClientOnly()
	{
	
	}
	
	public static void initClientOnly()
	{
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(StartupCommon.redstone_sandwich, 0, new ModelResourceLocation("empty_bucket", "inventory"));
    	System.out.println("It happens.");
	}
	 
	public static void postInitClientOnly()
	{
		
	}
}
