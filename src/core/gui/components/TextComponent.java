package core.gui.components;

import core.gui.Component;

import java.awt.*;

public abstract class TextComponent extends Component {

    private Color textColor;
    private final String text;
    private String fontFamily = "Arial";
    private int fontSize = 10;
    private int fontStyle = 0;

    public TextComponent(String text) {

        this.text = text;

    }

    @Deprecated
    @Override
    public void setSize(int width, int height) {}

    /**
     * Set the color of the text
     * @param textColor the color of the text
     */
    public void setColor(Color textColor) {

        this.textColor = textColor;

    }

    /**
     * Get the color of the text
     * @return the text color
     */
    public Color getColor() {

        return textColor;

    }

    /**
     * Set the font family of the text
     * @param fontFamily the font family of the text
     */
    public void setFontFamily(String fontFamily) {

        this.fontFamily = fontFamily;

    }

    /**
     * Get the font family of the text
     * @return the font family
     */
    public String getFontFamily() {
        return fontFamily;
    }

    /**
     * Set the font size of the text
     * @param fontSize the font size of the text
     */
    public void setFontSize(int fontSize) {

        this.fontSize = fontSize;

        super.setSize(text.length() * fontSize, fontSize);
        super.setPosition(this.getX(), this.getY() - (fontSize/2));

    }

    /**
     * Get the font size of the text
     * @return the font size
     */
    public int getFontSize() {

        return fontSize;

    }

    /**
     * Set the font style of the text
     * @param fontStyle the font style of the text
     */
    public void setFontStyle(int fontStyle) {

        this.fontStyle = fontStyle;

    }

    /**
     * Get the font style of the text
     * @return the font style
     */
    public int getFontStyle() {

        return fontStyle;

    }

    @Override
    public void onRepaint(Graphics2D graphics2D) {

        graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        graphics2D.setColor(getColor());
        graphics2D.setFont(new Font(getFontFamily(), getFontStyle(), getFontSize()));

        graphics2D.drawString(text, getX(), getY() - (getFontSize()/2));

    }
}