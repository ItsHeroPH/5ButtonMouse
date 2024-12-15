package gui.settingpage;

import core.gui.shapes.Rectangle;
import core.gui.text.Text;

import java.awt.*;

public class Button1 extends Rectangle {

    public Button1() {

        super.setColor("#848484")
                .setPosition(230, 40)
                .setSize(440, 200)
                .add(
                        new Rectangle()
                                .setColor("#cccccc")
                                .setPosition(235, 45)
                                .setSize(430, 290),
                        new Rectangle()
                                .setColor("#cccccc")
                                .setPosition(250, 35)
                                .setSize(100, 40),

                        new Text()
                                .setColor("#848484")
                                .setText("BUTTON 1")
                                .setPosition(260, 33)
                                .setFontSize(15)
                                .setFontFamily("Arial")
                                .setFontStyle(Font.TYPE1_FONT)
                );

    }
}
