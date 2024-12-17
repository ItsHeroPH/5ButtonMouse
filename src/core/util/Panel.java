package core.util;

import core.gui.Component;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Panel extends JPanel implements Runnable {

    private final Thread thread;
    private final List<Component> componentList = new ArrayList<>();

    public Panel() {

        this.thread = new Thread(this);
        this.thread.start();

    }

    public void add(Component component) {

        this.componentList.add(component);

    }

    public void remove(Component component) {

        this.componentList.remove(component);

    }

    @Override
    public void run() {

        double drawInterval = (double) 1000000000 / 60;
        double delta = 0;
        double lastTime = System.nanoTime();
        double currentTime;
        double timer = 0;
        double drawCount = 0;

        while (thread != null) {

            currentTime = System.nanoTime();

            delta += (currentTime - lastTime) / drawInterval;
            timer += (currentTime - lastTime);

            lastTime = currentTime;

            if(delta >= 1) {

                try {

                    this.update();
                    this.repaint();

                } catch (Exception ignored) {}

                delta--;
                drawCount++;

            }

            if(timer >= 1000000000) {

                System.out.println("Current FPS: " + drawCount);
                drawCount = 0;
                timer = 0;

            }
        }

    }

    private void update() {

        for(Component component : componentList) {

            component.update();

        }
    }

    @Override
    protected void paintComponent(Graphics g) {

        Graphics2D graphics2D = (Graphics2D) g;
        try {
            for(Component component : componentList) {

                component.paint(graphics2D);

            }
        } catch(Exception ignored) {}

    }
}
