package core.util;

import javax.swing.*;

public class Window {

    private static Window window;

    // Window's variables
    private String title;
    private int width;
    private int height;
    private boolean resizable;

    /**
     * Create a window
     * @return The window that you created
     */
    public static Window create() {

        window = new Window();

        return window;

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

        JFrame frame = new JFrame();
        frame.setSize(width, height);
        frame.setTitle(title);
        frame.setResizable(resizable);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);

    }
}
