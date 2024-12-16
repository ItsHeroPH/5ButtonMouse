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
    private Component parent;

    /**
     * Add the child component
     * @param component the child component
     */
    public void add(Component component) {

        component.setParent(this);
        this.componentList.add(component);

    }

    /**
     * Add many child component
     * @param components the children components
     */
    public void add(Component... components) {

        for(Component component : components) {

            this.add(component);

        }

    }

    /**
     * Set the parent component of this component
     * @param parent the parent component
     */
    public void setParent(Component parent) {

        this.parent = parent;

    }

    /**
     * Get the parent component of this component
     * @return the parent component
     */
    public Component getParent() {

        return parent;

    }

    /**
     * Get the children component of this component
     * @return the children component
     */
    public List<Component> getChildren() {

        return componentList;

    }

    /**
     * Set the position of the component
     * @param xPos X position coordinate
     * @param yPos Y position coordinate
     */
    public void setPosition(int xPos, int yPos) {

        this.xPos = xPos;
        this.yPos = yPos;

    }

    /**
     * Set the size of the component
     * @param width the width of the component
     * @param height the height of the component
     */
    public void setSize(int width, int height) {

        this.width = width;
        this.height = height;

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

        if(
                Window.getMouse().getX() >= getX() &&
                Window.getMouse().getX() <= getX() + width &&
                Window.getMouse().getY() >= getY() &&
                Window.getMouse().getY() <= getY() + height
        ) {

            if(!isHovered()) this.onHoverEnter(); // fixed the multiple callback on the onHoverEnter method
            this.hovered = true;

        } else {

            if(isHovered()) this.onHoverLeave(); // fixed the multiple callback on the onHoverLeave method
            this.hovered = false;

        }

        if(hovered && Window.getMouse().isKeyPressed(1)) {

            if(!isClicked()) this.onClick(); // fixed the multiple callback on the onClick method
            this.clicked = true;

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
