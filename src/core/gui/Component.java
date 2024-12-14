package core.gui;

import core.util.Window;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public abstract class Component {

    private int xPos, yPos, width, height;

    private boolean clicked = false;
    private boolean hovered = false;

    // Child component list
    private final List<Component> componentList = new ArrayList<>();

    /**
     * Add the child component
     * @param component the child component
     */
    public Component add(Component component) {

        this.componentList.add(component);
        return this;

    }

    /**
     * Add many child component
     * @param components the children components
     */
    public Component add(Component... components) {

        for(Component component : components) {

            this.add(component);

        }
        return this;

    }

    /**
     * Set the position of the component
     * @param xPos X position coordinate
     * @param yPos Y position coordinate
     */
    public Component setPosition(int xPos, int yPos) {

        this.xPos = xPos;
        this.yPos = yPos;

        return this;

    }

    /**
     * Set the size of the component
     * @param width the width of the component
     * @param height the height of the component
     */
    public Component setSize(int width, int height) {

        this.width = width;
        this.height = height;

        return this;

    }

    /**
     * Checks if the component is clicked
     * @return Whether the component is clicked or not
     */
    public boolean isClicked() {

        return this.clicked;

    }

    /**
     * Checks if the component is hovered
     * @return Whether the component is hovered or not
     */
    public boolean isHovered() {

        return this.hovered;

    }

    public int getX() {

        return this.xPos;

    }

    public int getY() {

        return this.yPos;

    }

    public int getWidth() {

        return this.width;

    }

    public int getHeight() {

        return this.height;

    }

    /**
     * This method is called to repaint the whole component 60 times per seconds
     */
    public void paint(Graphics2D graphics2D) {

        try {

            this.onRepaint(graphics2D);

        } catch(Exception ignored) {}

        for(Component component : componentList) {

            component.paint(graphics2D);

        }

    }

    /**
     * This method is called to update the value in every 60 times per seconds
     */
    public void update() {

        if(Window.getMouse().getX() >= getX() && Window.getMouse().getX() <= getX() + width && Window.getMouse().getY() >= getY() && Window.getMouse().getY() <= getY() + height) {

            this.hovered = true;
            this.onHoverEnter();

        } else {

            this.hovered = false;
            this.onHoverLeave();

        }

        if(hovered && Window.getMouse().isKeyPressed(1)) {

            this.clicked = true;
            this.onClick();

        } else {

            this.clicked = false;

        }

        for(Component component : componentList) {

            component.update();

        }

    }

    public abstract void onRepaint(Graphics2D graphics2D);

    /**
     * Creates an abstract method to call when the component is clicked
     */
    public abstract void onClick();

    /**
     * Creates an abstract method to call when the component is hovered
     */
    public abstract void onHoverEnter();

    public abstract void onHoverLeave();

}
