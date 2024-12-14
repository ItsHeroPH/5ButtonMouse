package core.gui;

import core.util.Window;

import java.awt.*;

public abstract class Component {

    private int xPos, yPos, width, height, stroke = 0;

    // Fill color
    private String fillColor;
    // Stroke color
    private String strokeColor;

    private boolean clicked = false;
    private boolean hovered = false;

    public Component setPosition(int xPos, int yPos) {

        this.xPos = xPos;
        this.yPos = yPos;

        return this;

    }

    public Component setSize(int width, int height) {

        this.width = width;
        this.height = height;

        return this;

    }

    public Component setColor(String color) {

        this.fillColor = color;

        return this;

    }

    public Component setStroke(int size) {

        this.stroke = size;

        return this;

    }

    public Component setStrokeColor(String color) {

        this.strokeColor = color;

        return this;

    }

    public boolean isClicked() {

        return this.clicked;

    }

    public boolean isHovered() {

        return this.hovered;

    }

    /**
     * This method is called to repaint the whole component 60 times per seconds
     */
    public void paint(Graphics2D graphics2D) {

        if(fillColor != null) {

            graphics2D.setColor(Color.decode(fillColor));
            graphics2D.fillRect(xPos, yPos, width, height);

        }

        if(strokeColor != null) {

            graphics2D.setColor(Color.decode(strokeColor));
            graphics2D.setStroke(new BasicStroke(stroke));

        }

    }

    /**
     * This method is called to update the value in every 60 times per seconds
     */
    public void update() {

        if(Window.getMouse().getX() >= xPos && Window.getMouse().getX()  <= xPos + width && Window.getMouse().getY() >= yPos && Window.getMouse().getY() <= yPos + height) {

            this.hovered = true;
            this.onHovered();

        } else {

            this.hovered = false;

        }

        if(hovered && Window.getMouse().isKeyPressed(1)) {

            this.clicked = true;
            this.onClick();

        } else {

            this.clicked = false;

        }

    }

    /**
     * Creates an abstract method to call when the component is clicked
     */
    public abstract void onClick();

    /**
     * Creates an abstract method to call when the component is hovered
     */
    public abstract void onHovered();

}
