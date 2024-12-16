package gui.homepage;

import core.gui.components.Button;
import core.gui.components.Text;
import gui.HomePage;
import mouse.Mouse;

import java.awt.*;

public class StopButton extends Button {

    public StopButton() {

        setPosition(230, 70);
        setSize(170, 40);
        setRound(20);
        setColor(Color.decode("#848484"));
        setPadding(70, 7);

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

        Mouse.setActive(false);

    }

    @Override
    public void onHoverEnter() {

        super.onHoverEnter();
        if(Mouse.isActive()) {

            setColor(Color.decode("#b3b3b3"));
            getText().setColor(Color.decode("#848484"));

        } else {

            setColor(Color.decode("#6c6c6c"));
            getText().setColor(Color.decode("#2f2f2f"));

        }

    }

    @Override
    public void onHoverLeave() {

        super.onHoverLeave();
        if(Mouse.isActive()) {

            setColor(Color.decode("#dddddd"));
            getText().setColor(Color.decode("#000000"));

        } else {

            setColor(Color.decode("#848484"));
            getText().setColor(Color.decode("#4b4949"));

        }

    }
}
