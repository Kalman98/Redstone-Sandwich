package com.kalman98.redstonesandwich;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class StartupCommon {
 
    public static ItemFood redstone_sandwich;
    
    public static void preInitCommon() {

    	redstone_sandwich = (ItemFood) new ItemFood(-2, 4F, false).setAlwaysEdible().setMaxStackSize(16).setUnlocalizedName("redstone_sandwich").setCreativeTab(CreativeTabs.tabFood);
    	GameRegistry.registerItem(redstone_sandwich, "redstone_sandwich");
    	
    }
    
    public static void initCommon() {
    	 GameRegistry.addRecipe(new ItemStack(StartupCommon.redstone_sandwich, 1),  new Object[] {
    		 "R",
    		 "R",
    		 "R",
    		 'R', Items.redstone
    			 });
    }
    
    public static void postInitCommon() {
    	
    }
}
