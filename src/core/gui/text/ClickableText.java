package core.gui.text;

import core.gui.components.TextComponent;
import core.util.Window;

import java.awt.*;

public abstract class ClickableText extends TextComponent {

    @Override
    public void onHoverEnter() {

        Window.getFrame().setCursor(new Cursor(Cursor.HAND_CURSOR));

    }

    @Override
    public void onHoverLeave() {

        Window.getFrame().setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

    }
}
