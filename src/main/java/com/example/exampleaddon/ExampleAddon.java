package com.example.exampleaddon;

import com.example.exampleaddon.apps.ExampleApp;
import com.ultreon.devices.api.ApplicationManager;
import com.ultreon.devices.forge.ForgeApplicationRegistration;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(ExampleAddon.MOD_ID)
public class ExampleAddon {
    public static final String MOD_ID = "exampleaddon";
    public ExampleAddon() {
        MinecraftForge.EVENT_BUS.<ForgeApplicationRegistration>addListener(event -> {
            ApplicationManager.registerApplication(ExampleAddon.res("example"), () -> ExampleApp::new, false);
        });
    }

    private static ResourceLocation res(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}