package gui;

import core.gui.shapes.Rectangle;
import gui.homepage.AutoStartSwitch;
import gui.homepage.StartButton;
import gui.homepage.StopButton;

import java.awt.*;

public class HomePage extends Rectangle {

    public HomePage() {

        setPosition(200, 30);
        setSize(520, 450);
        setColor(Color.decode("#cccccc"));

        add(
                new StartButton(),
                new StopButton(),
                new AutoStartSwitch()
        );

    }
}
