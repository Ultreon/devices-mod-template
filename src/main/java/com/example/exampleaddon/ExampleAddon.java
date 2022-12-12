package com.example.exampleaddon;

import com.example.exampleaddon.apps.ExampleApp;
import com.ultreon.devices.api.ApplicationManager;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.common.Mod;

@Mod(ExampleAddon.MOD_ID)
public class ExampleAddon {
    public static final String MOD_ID = "exampleaddon";
    public ExampleAddon() {
        ApplicationManager.registerApplication(ExampleAddon.res("example"), () -> ExampleApp::new, false);
    }

    private static ResourceLocation res(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}