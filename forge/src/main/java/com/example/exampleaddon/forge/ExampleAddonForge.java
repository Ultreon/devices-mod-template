package com.example.exampleaddon.forge;

import com.ultreon.devices.forge.DevicesForge;
import com.ultreon.devices.forge.ForgeApplicationRegistration;
import dev.architectury.platform.forge.EventBuses;
import com.example.exampleaddon.ExampleAddon;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExampleAddon.MOD_ID)
public class ExampleAddonForge {
    public ExampleAddonForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(ExampleAddon.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        ExampleAddon.init();

        MinecraftForge.EVENT_BUS.<ForgeApplicationRegistration>addListener(event -> {
            ExampleAddon.registerApps();
        });
    }
}