package gui.sidebar;

import core.gui.text.ClickableText;

import java.awt.*;

public class HomeLink extends ClickableText {

    public HomeLink() {

        super.setColor("#4b4949")
                .setText("5 BUTTON MOUSE")
                .setFontFamily("Arial")
                .setFontSize(20)
                .setFontStyle(Font.BOLD)
                .setPosition(55, 30)
                .setSize(200, 40);
    }
    @Override
    public void onClick() {

        System.out.println("Home clicked");

    }
}
