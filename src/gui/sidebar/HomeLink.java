package gui.sidebar;

import core.gui.text.ClickableText;
import core.page.PageManager;
import gui.HomePage;

import java.awt.*;

public class HomeLink extends ClickableText {

    public HomeLink() {

        super.setColor("#4b4949")
                .setPosition(10, 10)
                .setText("5 BUTTON MOUSE")
                .setFontFamily("Arial")
                .setFontSize(20)
                .setFontStyle(Font.BOLD)
                .setSize(200, 40);
    }
    @Override
    public void onClick() {

        if(!(PageManager.getCurrentPage() instanceof HomePage)) {

            PageManager.setCurrentPage(new HomePage());

        }

    }
}
