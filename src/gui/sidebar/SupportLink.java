package gui.sidebar;

import core.gui.components.ClickableText;
import core.page.PageManager;
import gui.SupportPage;

import java.awt.*;

public class SupportLink extends ClickableText {

    public SupportLink() {

        super("SUPPORT");
        setColor(Color.decode("#00000"));
        setFontSize(20);
        setFontStyle(Font.TRUETYPE_FONT);
        setPosition(30, 140);

    }
    @Override
    public void onClick() {

        if(!(PageManager.getCurrentPage() instanceof SupportPage)) {

            PageManager.setCurrentPage(new SupportPage());

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
