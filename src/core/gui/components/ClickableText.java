package core.gui.components;

import core.util.Window;

import java.awt.*;

public abstract class ClickableText extends TextComponent {

    public ClickableText(String text) {

        super(text);

    }

    public abstract void onClick();

    @Override
    public void onHoverEnter() {

        Window.getFrame().setCursor(new Cursor(Cursor.HAND_CURSOR));

    }

    @Override
    public void onHoverLeave() {

        Window.getFrame().setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

    }
}
