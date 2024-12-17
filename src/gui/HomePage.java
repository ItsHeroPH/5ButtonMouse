package gui;

import core.gui.components.Text;
import core.gui.shapes.Rectangle;
import gui.homepage.AutoStartSwitch;
import gui.homepage.StartButton;
import gui.homepage.StopButton;

import java.awt.*;

public class HomePage extends Rectangle {

    private final StartButton startButton = new StartButton();
    private final StopButton stopButton = new StopButton();

    public HomePage() {

        setPosition(200, 30);
        setSize(520, 450);
        setColor(Color.decode("#cccccc"));

        Text autoStartHeader = new Text("Auto Start");
        autoStartHeader.setPosition(300, 170);
        autoStartHeader.setFontFamily("Arial");
        autoStartHeader.setFontSize(25);
        autoStartHeader.setFontStyle(Font.TRUETYPE_FONT);
        autoStartHeader.setColor(Color.decode("#000000"));

        Text autoStartParagraph = new Text("Automatically start the program when the device open");
        autoStartParagraph.setPosition(300, 190);
        autoStartParagraph.setFontFamily("Arial");
        autoStartParagraph.setFontSize(15);
        autoStartParagraph.setFontStyle(Font.TRUETYPE_FONT);
        autoStartParagraph.setColor(Color.decode("#848484"));

        add(
                startButton,
                stopButton,
                new AutoStartSwitch(),
                autoStartHeader,
                autoStartParagraph
        );

    }

    public StartButton getStartButton() {

        return startButton;

    }

    public StopButton getStopButton() {

        return stopButton;

    }
}
