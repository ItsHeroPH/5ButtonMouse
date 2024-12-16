package core.gui.components;

import core.gui.shapes.Rectangle;
import core.util.Window;

import java.awt.*;

public abstract class Button extends Rectangle {

    @Override
    public void onHoverEnter() {

        Window.getFrame().setCursor(new Cursor(Cursor.HAND_CURSOR));

    }

    @Override
    public void onHoverLeave() {

        Window.getFrame().setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

    }

    public abstract void onClick();
}
