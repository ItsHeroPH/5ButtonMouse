package core.listeners;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyboardListener extends KeyAdapter {

    // Keyboard Listener's Variable
    private final boolean[] keyPressed = new boolean[350];

    /**
     * This is called when the key in the keyboard is pressed
     */
    @Override
    public void keyPressed(KeyEvent e) {

        this.keyPressed[e.getKeyCode()] = true;
        System.out.println("Key " + KeyEvent.getKeyText(e.getKeyCode()) + " pressed");

    }

    /**
     * This is called after a key in the keyboard is pressed
     */
    @Override
    public void keyReleased(KeyEvent e) {

        this.keyPressed[e.getKeyCode()] = false;
        System.out.println("Key " + KeyEvent.getKeyText(e.getKeyCode()) + " released");

    }

    /**
     * Checks if the key is pressed or not
     * @param keyCode the key code of the key
     * @return Whether the key in the keyboard is pressed or not
     */
    public boolean isKeyPressed(int keyCode) {

        return this.keyPressed[keyCode];

    }

}
