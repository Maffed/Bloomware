package me.offeex.ofx.module.modules.render;

import me.offeex.ofx.module.Module;
import me.offeex.ofx.setting.settings.NumberSetting;
import org.lwjgl.glfw.GLFW;

public class ExtraTab extends Module {
    public ExtraTab() {
        super("Extra Tab", "Allows you to see more players in tab", GLFW.GLFW_KEY_UNKNOWN, Category.RENDER, false,
                new NumberSetting("Count", 80, 80, 1000, 1));
    }
}