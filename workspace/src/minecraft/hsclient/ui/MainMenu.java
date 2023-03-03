package hsclient.ui;

import hsclient.Client;
import net.minecraft.client.gui.GuiLanguage;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.gui.GuiOptions;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiSelectWorld;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;


public class MainMenu extends GuiScreen{
    // 중요하지 않는건데 일단 나두기
    public MainMenu() {

    }

    public void initGui() {

    }

    // main
    public void drawScreen() {
        mc.getTextureManager().bindTexture(new ResourceLocation("hsclient/ui/background.png"));

        // draw
        this.drawModalRectWithCustomSizedTexture(0, 0, 0, 0, this.width, this.height, this.width, this.height);
        this.drawGradientRect(0, height - 75, width, height, 0x00000000, 0xff000000);
    }

}
