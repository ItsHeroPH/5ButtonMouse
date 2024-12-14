package gui.sidebar;

import core.gui.text.ClickableText;
import core.page.PageManager;
import gui.SupportPage;

import java.awt.*;

public class SupportLink extends ClickableText {

    public SupportLink() {

        super.setColor("#000000")
                .setText("SUPPORT")
                .setFontFamily("Arial")
                .setFontSize(20)
                .setFontStyle(Font.TRUETYPE_FONT)
                .setPosition(20, 140)
                .setSize(100, 40);
    }
    @Override
    public void onClick() {

        if(!(PageManager.getCurrentPage() instanceof SupportPage)) {

            PageManager.setCurrentPage(new SupportPage());

        }

    }
}
