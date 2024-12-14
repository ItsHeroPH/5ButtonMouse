package gui;

import core.gui.shapes.Rectangle;
import core.gui.text.Text;

import java.awt.*;

public class SupportPage extends Rectangle {

    public SupportPage() {

        super.setColor("#cccccc")
                .setPosition(200, 0)
                .setSize(520, 480)
                .add(
                        new Text()
                                .setPosition(this.getX() + 20, 80)
                                .setColor("#8b0000")
                                .setText("ERROR 404")
                                .setFontFamily("Arial")
                                .setFontSize(60)
                                .setFontStyle(Font.BOLD),

                        new Text()
                                .setPosition(this.getX() + 20, 140)
                                .setColor("#4b4949")
                                .setText("PAGE NOT FOUND :(")
                                .setFontFamily("Arial")
                                .setFontSize(40)
                                .setFontStyle(Font.BOLD)
                );

    }
}
