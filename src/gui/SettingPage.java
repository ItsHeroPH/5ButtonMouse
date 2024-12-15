package gui;

import core.gui.shapes.Rectangle;
import core.gui.text.Text;
import gui.settingpage.Button1;
import gui.settingpage.Header;

import java.awt.*;

public class SettingPage extends Rectangle {

    public SettingPage() {
        super.setColor("#cccccc")
                .setPosition(200, 0)
                .setSize(520, 480)
                .add(
                        new Header(),
                        new Button1()

                );
    }
}
