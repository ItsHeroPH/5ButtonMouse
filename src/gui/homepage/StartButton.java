package gui.homepage;

import core.gui.components.Button;
import core.gui.components.Text;
import gui.HomePage;

import java.awt.*;

public class StartButton extends Button {

    public StartButton() {

        setPosition(30, 70);
        setSize(170, 40);
        setRound(20);
        setColor(Color.decode("#dddddd"));
        setPadding(60, 7);

        Text text = new Text("Start");
        text.setColor(Color.decode("#000000"));
        text.setFontSize(20);
        text.setFontFamily("Arial");
        text.setFontStyle(Font.TRUETYPE_FONT);

        setText(text);

    }

    @Override
    public void onClick() {

        setColor(Color.decode("#848484"));
        getText().setColor(Color.decode("#4b4949"));

        StopButton stopButton = ((HomePage) getParent()).getStopButton();
        stopButton.setColor(Color.decode("#dddddd"));
        stopButton.getText().setColor(Color.decode("#000000"));

        System.out.println("Service starting..");

    }
}
