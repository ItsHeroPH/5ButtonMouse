package core.gui.shapes;

import core.gui.Component;

import java.awt.*;

public class Rectangle extends Component {

    private int round;
    private Color color;

    private int stroke;
    private Color strokeColor;

    /**
     * Set the roundness of the rectangle
     * @param round the amount of roundness of the rectangle
     */
    public void setRound(int round) {

        this.round = round;

    }

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
            graphics2D.setStroke(new BasicStroke(stroke, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_MITER));

        }

        graphics2D.setColor(color);
        graphics2D.fillRoundRect(this.getX(), this.getY() - 30, this.getWidth(), this.getHeight(), round, round);

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
