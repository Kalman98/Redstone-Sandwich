package com.kalman98.redstonesandwich;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = RedstoneSandwich.MODID, name = RedstoneSandwich.NAME,version = RedstoneSandwich.VERSION)
public class RedstoneSandwich
{
    public static final String MODID = "redstonesandwich";
    public static final String VERSION = "1.0";
    public static final String NAME = "Redstone Sandwich";
    
    @SidedProxy(clientSide="com.kalman98.redstonesandwich.ClientOnlyProxy", serverSide="com.kalman98.redstonesandwich.CommonProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLInitializationEvent event) {
    proxy.preInit();
    }
        
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	proxy.init();
    }

    public void postInit(FMLInitializationEvent event) {
    	proxy.postInit();
    }
}
