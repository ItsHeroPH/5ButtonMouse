package gui.sidebar;

import core.gui.text.ClickableText;
import core.page.PageManager;
import gui.AboutPage;

import java.awt.*;

public class AboutLink extends ClickableText {

    public AboutLink() {

        super.setColor("#000000")
                .setText("ABOUT")
                .setFontFamily("Arial")
                .setFontSize(20)
                .setFontStyle(Font.TRUETYPE_FONT)
                .setPosition(20, 180)
                .setSize(80, 40);
    }

    @Override
    public void onClick() {

        if(!(PageManager.getCurrentPage() instanceof AboutPage)) {

            PageManager.setCurrentPage(new AboutPage());

        }

    }
}
