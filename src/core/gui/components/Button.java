package core.gui.components;

import core.gui.shapes.Rectangle;
import core.util.Window;

import java.awt.*;

public abstract class Button extends Rectangle {

    private int pX, pY = 0; // Padding X and Y

    private TextComponent text;

    /**
     * Set the padding of the text
     * @param x the x padding
     * @param y the y padding
     */
    public void setPadding(int x, int y) {

        this.pX = x;
        this.pY = y;

    }

    /**
     * Set the text inside the button
     * @param text the text inside the button
     */
    public void setText(TextComponent text) {

        this.text = text;

        text.setPosition(text.getX() + pX, text.getY() + (text.getFontSize() / 2) + pY);
        add(text);

    }

    /**
     * Get the text inside the button
     * @return the text inside the button
     */
    public TextComponent getText() {

        return text;

    }

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
