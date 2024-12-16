package gui.homepage;

import core.gui.components.Button;

import java.awt.*;

public class StartButton extends Button {

    public StartButton() {

        setPosition(30, 70);
        setSize(170, 40);
        setRound(20);
        setColor(Color.decode("#dddddd"));

    }

    @Override
    public void onClick() {
        System.out.println("Service starting..");
    }
}
