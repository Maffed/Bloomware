package me.offeex.ofx.client.module.modules.render;

import me.offeex.ofx.client.module.Module;
import me.offeex.ofx.client.setting.settings.NumberSetting;
import org.lwjgl.glfw.GLFW;

public class ExtraTab extends Module {
    public ExtraTab() {
        super("ExtraTab", "Allows you to see more players in tab", Category.RENDER, false,
                new NumberSetting("Count", 80, 80, 1000, 1));
    }
}
