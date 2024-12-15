package gui.settingpage;

import core.gui.shapes.Rectangle;
import core.gui.text.Text;

import java.awt.*;

public class Header extends Rectangle {

    public Header() {

        super.setColor("#848484")
                .setPosition(220, 20)
                .setSize(460, 400)
                .add(
                        new Rectangle()
                                .setColor("#cccccc")
                                .setPosition(225, 25)
                                .setSize(450, 390),
                        new Rectangle()
                                .setColor("#cccccc")
                                .setPosition(240, 20)
                                .setSize(100, 40),

                        new Text()
                                .setColor("#848484")
                                .setText("SETTINGS")
                                .setPosition(250, 13)
                                .setFontSize(15)
                                .setFontFamily("Arial")
                                .setFontStyle(Font.TYPE1_FONT)
                );

    }
}
