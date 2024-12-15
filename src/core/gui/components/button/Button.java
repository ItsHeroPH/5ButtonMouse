package core.gui.components.button;

import core.gui.components.TextComponent;
import core.gui.shapes.Rectangle;
import core.gui.text.Text;
import core.util.Window;

import java.awt.*;

public abstract class Button extends Rectangle {

    // padding of the text
    private int pX, pY;
    private TextComponent textComponent;

    public Button setPadding(int x, int y) {

        this.pX = x;
        this.pY = y;

        return this;

    }

    public Text setText(String text) {

        textComponent = new Text()
                .setText(text)
                .setPosition(this.getX() + pX, this.getY() + pY);

        this.add(textComponent);

        return (Text) textComponent;

    }

    public Text getText() {

        return (Text) this.textComponent;

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
