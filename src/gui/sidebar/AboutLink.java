package gui.sidebar;

import core.gui.components.ClickableText;

import java.awt.*;

public class AboutLink extends ClickableText {

    public AboutLink() {

        super("ABOUT");
        setColor(Color.decode("#00000"));
        setFontSize(20);
        setFontStyle(Font.TRUETYPE_FONT);
        setPosition(30, 150);

    }

    @Override
    public void onClick() {

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
