package com.example.examplemod;

import com.example.examplemod.command.ExampleCommand;
import com.example.examplemod.config.ExampleConfiguration;
import gg.essential.vigilance.Vigilance;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";

    public static final ExampleMod instance = new ExampleMod();
    public ExampleConfiguration config = new ExampleConfiguration();
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // Initialize and preload modules
        Vigilance.initialize();
        config.preload();

        // Registered new ExampleCommand that is activated using /example or /ex
        new ExampleCommand("example").register();
        new ExampleCommand("ex").register();

        MinecraftForge.EVENT_BUS.register(this);

        System.out.println("Woohoo! This example mod is working!");
    }
}
