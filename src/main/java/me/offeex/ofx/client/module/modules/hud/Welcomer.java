package me.offeex.ofx.client.module.modules.hud;

import me.offeex.ofx.Bloomware;
import me.offeex.ofx.api.util.ColorUtils;
import me.offeex.ofx.client.module.Module;
import net.minecraft.client.util.math.MatrixStack;

public class Welcomer extends Module {
    public Welcomer() {
        super("Welcomer", "Welcomes you", Category.HUD, true);
    }

    @Override
    public void draw(MatrixStack stack, int mouseX, int mouseY, float tickDelta) {
        if (isEnabled()) {
            width = Bloomware.sFontRenderer.getStringWidth("Looking cute today, " + mc.getSession().getUsername() + "! :^)", Bloomware.sFontRenderer.getFontsize()) + 8;

            Bloomware.sFontRenderer.drawString("Looking cute today, " + mc.getSession().getUsername() + "! :^)", x + 4, y + 4, ColorUtils.getHudColor().getRGB(), true);
        }
    }
}
