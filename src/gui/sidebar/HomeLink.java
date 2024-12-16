package gui.sidebar;

import core.gui.components.ClickableText;
import core.page.PageManager;
import gui.HomePage;

import java.awt.*;

public class HomeLink extends ClickableText {

    public HomeLink() {

        super("5 BUTTON MOUSE");
        setColor(Color.decode("#4b4949"));
        setPosition(20, 45);
        setFontFamily("Arial");
        setFontSize(20);
        setFontStyle(Font.BOLD);

    }

    @Override
    public void onClick() {

        if(!(PageManager.getCurrentPage() instanceof HomePage)) {

            PageManager.setCurrentPage(new HomePage());

        }

    }
}
