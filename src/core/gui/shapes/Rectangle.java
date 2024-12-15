package core.gui.shapes;

import core.gui.Component;

import java.awt.*;

public class Rectangle extends Component {

    private int round = 0;
    private int stroke = 0;
    // Fill color
    private String fillColor;
    // Stroke color
    private String strokeColor;

    /**
     * Set the fill color of the component
     * @param color the hex code color
     */
    public Rectangle setColor(String color) {

        this.fillColor = color;

        return this;

    }

    /**
     * Set the amount of roundness of the rectangle
     * @param amount The amount of roundness of the rectang;e
     */
    public Rectangle setRound(int amount) {

        this.round = amount;
        return this;

    }

    /**
     * Set the size of the stroke of the component
     * @param size the size of the stroke
     */
    public Rectangle setStroke(int size) {

        this.stroke = size;

        return this;

    }

    /**
     * Set the stroke color of the component
     * @param color the hex code color
     */
    public Rectangle setStrokeColor(String color) {

        this.strokeColor = color;

        return this;

    }

    /**
     * Set the position of the component
     * @param xPos X position coordinate
     * @param yPos Y position coordinate
     */
    @Override
    public Rectangle setPosition(int xPos, int yPos) {

        super.setPosition(xPos, yPos);

        return this;

    }

    /**
     * Set the size of the component
     * @param width the width of the component
     * @param height the height of the component
     */
    @Override
    public Rectangle setSize(int width, int height) {

        super.setSize(width, height);

        return this;

    }

    @Override
    public void onRepaint(Graphics2D graphics2D) {

        graphics2D.setColor(Color.decode(fillColor));
        graphics2D.fillRoundRect(this.getX(), this.getY(), this.getWidth(), this.getHeight(), round, round);

        graphics2D.setColor(Color.decode(strokeColor));
        graphics2D.setStroke(new BasicStroke(stroke));

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
