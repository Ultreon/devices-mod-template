package com.example.exampleaddon;

import com.example.exampleaddon.apps.ExampleApp;
import com.ultreon.devices.api.ApplicationManager;
import net.minecraft.resources.ResourceLocation;

public class ExampleAddon {
    public static final String MOD_ID = "exampleaddon";

    public static void init() {

    }

    private static ResourceLocation res(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

    public static void registerApps() {
        ApplicationManager.registerApplication(ExampleAddon.res("example"), () -> ExampleApp::new, false);
    }
}