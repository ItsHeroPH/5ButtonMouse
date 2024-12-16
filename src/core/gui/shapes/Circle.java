package core.gui.shapes;

import core.gui.Component;

import java.awt.*;

public class Circle extends Component {

    private Color color;

    private int stroke;
    private Color strokeColor;

    /**
     * Set the background color of the rectangle
     * @param color the background color
     */
    public void setColor(Color color) {

        this.color = color;

    }

    /**
     * Set the stroke of the rectangle
     * @param amount the amount of the stroke
     * @param color the color of the stroke
     */
    public void setStroke(int amount, Color color) {

        this.stroke = amount;
        this.strokeColor = color;

    }

    @Override
    public void onRepaint(Graphics2D graphics2D) {

        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        if(this.strokeColor != null) {

            graphics2D.setColor(strokeColor);
            graphics2D.setStroke(new BasicStroke(stroke));

        }

        graphics2D.setColor(color);
        graphics2D.fillOval(this.getX(), this.getY() - 30, this.getWidth(), this.getHeight());

    }

    @Override
    public void onClick() {

    }

    @Override
    public void onHoverEnter() {

    }

    @Override
    public void onHoverLeave() {

    }
}
