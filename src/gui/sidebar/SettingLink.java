package gui.sidebar;

import core.gui.text.ClickableText;
import core.page.PageManager;
import gui.SettingPage;

import java.awt.*;

public class SettingLink extends ClickableText {

    public SettingLink() {

        super.setColor("#000000")
                .setText("SETTINGS")
                .setFontFamily("Arial")
                .setFontSize(20)
                .setFontStyle(Font.TRUETYPE_FONT)
                .setPosition(20, 100)
                .setSize(100, 40);
    }
    @Override
    public void onClick() {

        if(!(PageManager.getCurrentPage() instanceof SettingPage)) {

            PageManager.setCurrentPage(new SettingPage());

        }

    }
}
