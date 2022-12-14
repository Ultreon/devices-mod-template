package com.example.exampleaddon.fabric;

import com.example.exampleaddon.ExampleAddon;
import com.ultreon.devices.fabric.FabricApplicationRegistration;
import net.fabricmc.api.ModInitializer;

public class ExampleAddonFabric implements FabricApplicationRegistration, ModInitializer {
    @Override
    public void onInitialize() {
        ExampleAddon.init();
    }

    @Override
    public void registerApplications() {
        ExampleAddon.registerApps();
    }
}