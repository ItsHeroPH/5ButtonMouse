package gui.homepage;

import core.gui.components.Button;
import core.gui.components.Text;
import gui.HomePage;

import java.awt.*;

public class StopButton extends Button {

    public StopButton() {

        setPosition(230, 70);
        setSize(170, 40);
        setRound(20);
        setColor(Color.decode("#848484"));
        setPadding(60, 7);

        Text text = new Text("Stop");
        text.setColor(Color.decode("#4b4949"));
        text.setFontSize(20);
        text.setFontFamily("Arial");
        text.setFontStyle(Font.TRUETYPE_FONT);

        setText(text);

    }

    @Override
    public void onClick() {

        setColor(Color.decode("#848484"));
        getText().setColor(Color.decode("#4b4949"));

        StartButton startButton = ((HomePage) getParent()).getStartButton();
        startButton.setColor(Color.decode("#dddddd"));
        startButton.getText().setColor(Color.decode("#000000"));

        System.out.println("System stopping");
    }
}
