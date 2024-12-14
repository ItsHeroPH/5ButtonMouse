package core.gui.components;

import core.gui.Component;

import java.awt.*;

public abstract class TextComponent extends Component {

    private String textColor;
    private String text;
    private String fontFamily = "Arial";
    private int fontSize = 10;
    private int fontStyle = 0;

    public TextComponent setText(String text) {

        this.text = text;
        return this;

    }

    public TextComponent setColor(String textColor) {

        this.textColor = textColor;
        return this;

    }

    public TextComponent setFontFamily(String fontFamily) {

        this.fontFamily = fontFamily;
        return this;

    }

    public TextComponent setFontSize(int fontSize) {

        this.fontSize = fontSize;
        return this;

    }

    public TextComponent setFontStyle(int fontStyle) {

        this.fontStyle = fontStyle;
        return this;

    }

    /**
     * Set the position of the component
     * @param xPos X position coordinate
     * @param yPos Y position coordinate
     */
    @Override
    public TextComponent setPosition(int xPos, int yPos) {

        super.setPosition(xPos, yPos);

        return this;

    }

    /**
     * Set the size of the component
     * @param width the width of the component
     * @param height the height of the component
     */
    @Override
    public TextComponent setSize(int width, int height) {

        super.setSize(width, height);

        return this;

    }

    @Override
    public void onRepaint(Graphics2D graphics2D) {

        graphics2D.setColor(Color.decode(textColor));
        graphics2D.setFont(new Font(fontFamily, fontStyle, fontSize));
        graphics2D.drawString(text, getX(), getY());

    }
}
