package com.example.exampleaddon;

import com.example.exampleaddon.apps.ExampleApp;
import com.ultreon.devices.api.ApplicationManager;
import net.minecraft.resources.ResourceLocation;

public class ExampleAddon {
    public static final String MOD_ID = "exampleaddon";

    public static void init() {
        ApplicationManager.registerApplication(ExampleAddon.res("example"), () -> ExampleApp::new, false);
    }

    private static ResourceLocation res(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}