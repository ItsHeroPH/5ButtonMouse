package core.listeners;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

public class MouseListener extends MouseAdapter {

    // Mouse Listener's Variables
    private final boolean[] keyPressed = new boolean[9];
    private int xPos, yPos, scroll = 0;

    /**
     * This is called when the button in the mouse is pressed
     */
    @Override
    public void mousePressed(MouseEvent e) {

        this.keyPressed[e.getButton()] = true;
        System.out.println("Mouse " + e.getButton() + " pressed");

    }

    /**
     * This is called after a button in the mouse is pressed
     */
    @Override
    public void mouseReleased(MouseEvent e) {

        this.keyPressed[e.getButton()] = false;
        System.out.println("Mouse " + e.getButton() + " released");

    }

    /**
     * This is called when the cursor moved in the window
     */
    @Override
    public void mouseMoved(MouseEvent e) {

        this.xPos = e.getX();
        this.yPos = e.getY();
//        System.out.println("Mouse moved to [" + xPos + ", " + yPos + "]");

    }

    /**
     * This is called when the mouse wheel scroll up or down
     */
    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {

        this.scroll = e.getScrollType();
//        System.out.println("Mouse scroll to " + scroll);

    }

    /**
     * Check if the button is pressed or not
     * @param keyCode The key code of the button
     * @return Whether the button is pressed or not
     */
    public boolean isKeyPressed(int keyCode) {

        return this.keyPressed[keyCode];

    }

    /**
     * Get the X position of the cursor
     * @return The X position of the cursor
     */
    public int getX() {

        return this.xPos;

    }

    /**
     * Get the Y position of the cursor
     * @return The Y position of the cursor
     */
    public int getY() {

        return this.yPos;

    }

}
