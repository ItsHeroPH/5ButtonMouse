package core.gui.components;

import core.gui.shapes.Circle;

import java.awt.*;

public abstract class Switch extends Button {

    private boolean active = false;

    private final Circle switchHead = new Circle();

    public Switch() {

        add(switchHead);

    }

    @Deprecated
    @Override
    public void setRound(int round) {}

    @Override
    public void setSize(int width, int height) {

        super.setSize(width, height);
        super.setRound(height);
        switchHead.setSize(height + 10, height + 10);

    }

    @Override
    public void setPosition(int xPos, int yPos) {

        super.setPosition(xPos, yPos);
        switchHead.setPosition(xPos - 5, yPos - 5);

    }

    public void setSwitchHeadColor(Color color) {

        this.switchHead.setColor(color);

    }

    /**
     * Set if the switch is active or not
     * @param active whether the switch is active or not
     */
    public void setActive(boolean active) {

        this.active = active;
        if(isActive()) {

            this.onActivated();
            switchHead.setPosition((getX() + getWidth()) - (switchHead.getWidth() - 5), getY() - 5);

        } else {

            this.onDeactivated();
            switchHead.setPosition(getX() - 5, getY() - 5);

        }

    }

    /**
     * Checks if the switch is active
     * @return a boolean value
     */
    public boolean isActive() {

        return active;

    }

    @Override
    public void onClick() {

        this.setActive(!active);

    }

    public abstract void onActivated();

    public abstract  void onDeactivated();
}
