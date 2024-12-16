package gui.homepage;

import core.gui.components.Button;

import java.awt.*;

public class StopButton extends Button {

    public StopButton() {

        setPosition(230, 70);
        setSize(170, 40);
        setRound(20);
        setColor(Color.decode("#848484"));

    }

    @Override
    public void onClick() {
        System.out.println("System stopping");
    }
}
