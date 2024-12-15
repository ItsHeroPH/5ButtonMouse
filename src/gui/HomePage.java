package gui;

import core.gui.shapes.Rectangle;
import gui.homepage.buttons.StartButton;
import gui.homepage.buttons.StopButton;

public class HomePage extends Rectangle {

    public HomePage() {

        super.setColor("#cccccc")
                .setPosition(200, 0)
                .setSize(520, 480)
                .add(
                        new StartButton(),
                        new StopButton()
                );

    }
}
