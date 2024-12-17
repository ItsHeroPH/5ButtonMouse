package gui.sidebar;

import core.gui.components.ClickableText;
import core.page.PageManager;
import gui.AboutPage;

import java.awt.*;

public class AboutLink extends ClickableText {

    public AboutLink() {

        super("ABOUT");
        setColor(Color.decode("#00000"));
        setFontSize(20);
        setFontStyle(Font.TRUETYPE_FONT);
        setPosition(30, 180);

    }

    @Override
    public void onClick() {

        if(!(PageManager.getCurrentPage() instanceof AboutPage)) {

            PageManager.setCurrentPage(new AboutPage());

        }

    }

    @Override
    public void onHoverEnter() {

        super.onHoverEnter();
        setColor(Color.decode("#848484"));

    }

    @Override
    public void onHoverLeave() {

        super.onHoverLeave();
        setColor(Color.decode("#00000"));

    }
}
