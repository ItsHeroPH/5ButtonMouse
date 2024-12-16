package gui.homepage;

import core.gui.components.Button;
import core.gui.components.Text;
import gui.HomePage;
import mouse.Mouse;

import java.awt.*;

public class StartButton extends Button {

    public StartButton() {

        setPosition(230, 100);
        setSize(170, 40);
        setRound(20);
        setColor(Color.decode("#dddddd"));
        setPadding(70, 7);

        Text text = new Text("Start");
        text.setPosition(230, 100);
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

        Mouse.setActive(true);

    }

    @Override
    public void onHoverEnter() {

        super.onHoverEnter();
        if(Mouse.isActive()) {

            setColor(Color.decode("#6c6c6c"));
            getText().setColor(Color.decode("#2f2f2f"));

        } else {

            setColor(Color.decode("#b3b3b3"));
            getText().setColor(Color.decode("#848484"));

        }

    }

    @Override
    public void onHoverLeave() {

        super.onHoverLeave();
        if(Mouse.isActive()) {

            setColor(Color.decode("#848484"));
            getText().setColor(Color.decode("#4b4949"));

        } else {

            setColor(Color.decode("#dddddd"));
            getText().setColor(Color.decode("#000000"));

        }

    }
}
