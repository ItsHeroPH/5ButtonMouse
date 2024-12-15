package gui.homepage.buttons;

import core.gui.components.button.Button;
import mouse.Mouse;

import java.awt.*;

public class StartButton extends Button {

    public StartButton() {

        super.setColor("#dddddd")
                .setPosition(240, 70)
                .setSize(170, 40)
                .setRound(25);

        super.setPadding(60, 7)
                .setText("Start")
                .setColor("#000000")
                .setFontSize(20)
                .setFontFamily("Arial")
                .setFontStyle(Font.TRUETYPE_FONT);

    }

    @Override
    public void onRepaint(Graphics2D graphics2D) {

        super.setColor(!Mouse.isActive() ? "#dddddd" : "#848484");
        super.getText().setColor(!Mouse.isActive() ? "#000000" : "#4b4949");
        super.onRepaint(graphics2D);

    }

    @Override
    public void onClick() {

        Mouse.setActive(true);

    }
}
