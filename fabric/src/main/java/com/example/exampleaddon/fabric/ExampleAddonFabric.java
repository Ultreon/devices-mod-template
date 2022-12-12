package com.example.exampleaddon.fabric;

import com.example.exampleaddon.ExampleAddon;
import net.fabricmc.api.ModInitializer;

public class ExampleAddonFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ExampleAddon.init();
    }
}