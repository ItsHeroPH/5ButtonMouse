package core.listeners;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowListener extends WindowAdapter {

    @Override
    public void windowOpened(WindowEvent e) {

        System.out.println("Window is now open!");

    }

    @Override
    public void windowActivated(WindowEvent e) {

        System.out.println("Window activated!");

    }

    @Override
    public void windowClosing(WindowEvent e) {

        System.out.println("Closing the window");

    }

    @Override
    public void windowClosed(WindowEvent e) {

        System.out.println("Window closed!");

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

        System.out.println("Window deactivated!");

    }

}
