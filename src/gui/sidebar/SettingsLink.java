package gui.sidebar;

import core.gui.components.ClickableText;
import core.page.PageManager;
import gui.SettingsPage;

import java.awt.*;

public class SettingsLink extends ClickableText {

    public SettingsLink() {

        super("SETTINGS");
        setColor(Color.decode("#00000"));
        setFontSize(20);
        setFontStyle(Font.TRUETYPE_FONT);
        setPosition(30, 100);

    }

    @Override
    public void onClick() {

        if(!(PageManager.getCurrentPage() instanceof SettingsPage)) {

            PageManager.setCurrentPage(new SettingsPage());

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
