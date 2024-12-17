package core.gui.components;

import core.gui.Component;

import java.awt.*;

public abstract class TextComponent extends Component {

    private Color textColor;
    private String text;
    private String fontFamily = "Arial";
    private int fontSize = 10;
    private int fontStyle = 0;

    public TextComponent(String text) {

        this.text = text;

    }

    /**
     * Set the text in text component
     * @param text the text you want to display
     */
    public void setText(String text) {

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
        super.setPosition(this.getX(), this.getY() - (fontSize/2)); // fixed the text hit box is being not in the position

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

        Font font = new Font(getFontFamily(), getFontStyle(), getFontSize());
        FontMetrics fm = graphics2D.getFontMetrics(font);

        graphics2D.setColor(getColor());
        graphics2D.setFont(font);

        String[] texts = text.split("\n");

        int yPos = getY() - 30; // fixed the text hit box is being not in the position
        int size = 0;
        for(int i = 0; i <= texts.length; i++) {

            size += fm.getHeight();
            graphics2D.drawString(texts[i], getX() - 10, yPos + size);

            super.setSize(fm.stringWidth(text), size);

        }

        graphics2D.setColor(Color.BLACK);
        graphics2D.fillRect(getX() - 10, getY() - 30, getWidth(), getHeight());

    }
}