package core.util;

import core.listeners.KeyboardListener;
import core.listeners.MouseListener;
import core.listeners.WindowListener;

import javax.swing.*;
import java.awt.*;

public class Window {

    private static Window window;

    // Window's variables
    private String title;
    private int width;
    private int height;
    private boolean resizable;
    private JFrame frame;
    private Panel panel;

    // Window's event listeners
    private final KeyboardListener keyboardListener = new KeyboardListener();
    private final MouseListener mouseListener = new MouseListener();
    private final WindowListener windowListener = new WindowListener();

    /**
     * Create a window
     * @return The window that you created
     */
    public static Window create() {

        window = new Window();

        return window;

    }

    /**
     * Allows you to get access to the keyboard
     * @return the keyboard
     */
    public static KeyboardListener getKeyboard() {

        return window.keyboardListener;

    }

    /**
     * Allows you to get access to the mouse
     * @return the mouse
     */
    public static MouseListener getMouse() {

        return window.mouseListener;

    }

    public static Panel getPanel() {

        return window.panel;

    }

    public static JFrame getFrame() {

        return window.frame;

    }

    public Window() {

        this.title = "My First App";
        this.width = 1280;
        this.height = 720;
        this.resizable = true;

    }

    /**
     * Set the window's title
     * @param title The title of the window
     */
    public Window setTitle(String title) {

        this.title = title;
        return this;

    }

    /**
     * Set the size of the window
     * @param width Width of the window
     * @param height Height of the window
     */
    public Window setSize(int width, int height) {

        this.width = width;
        this.height =  height;
        return this;

    }

    /**
     * Set the ability to resize the window
     * @param resizable Choose whether you want to be able to resize the window or not
     */
    public Window setResizable(boolean resizable) {

        this.resizable = resizable;
        return this;

    }

    /**
     * Run the window and its logic
     */
    public void run() {

        frame = new JFrame();
        frame.setSize(width, height);
        frame.setTitle(title);
        frame.setResizable(resizable);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setFocusable(true);
        frame.setBackground(Color.BLACK);

        // Register all the event listeners
        frame.addKeyListener(keyboardListener);
        frame.addMouseListener(mouseListener);
        frame.addMouseMotionListener(mouseListener);
        frame.addMouseWheelListener(mouseListener);
        frame.addWindowListener(windowListener);

        panel = new Panel();
        frame.add(panel);

        frame.setVisible(true);

    }
}
