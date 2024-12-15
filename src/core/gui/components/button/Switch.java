package core.gui.components.button;

import core.gui.shapes.Rectangle;
import core.util.Window;

import java.awt.*;

public class Switch extends Rectangle {

    @Override
    public Rectangle setSize(int width, int height) {
        super.setRound(height/2);
        return super.setSize(width, height);
    }

    @Override
    public void onHoverEnter() {

        Window.getFrame().setCursor(new Cursor(Cursor.HAND_CURSOR));

    }

    @Override
    public void onHoverLeave() {

        Window.getFrame().setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

    }
}
