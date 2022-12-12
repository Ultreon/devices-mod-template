package com.example.exampleaddon.apps;

import com.ultreon.devices.api.app.Application;
import com.ultreon.devices.api.app.component.Label;
import net.minecraft.nbt.CompoundTag;
import org.jetbrains.annotations.Nullable;

public class ExampleApp extends Application {
    private Label label;

    public ExampleApp() {
        this.setDefaultWidth(180);
        this.setDefaultHeight(120);
    }

    @Override
    public void init(@Nullable CompoundTag intent) {
        label = new Label("Hello World", 10, 10);
        super.addComponent(label);
    }

    @Override
    public void load(CompoundTag tag) {

    }

    @Override
    public void save(CompoundTag tag) {

    }
}
