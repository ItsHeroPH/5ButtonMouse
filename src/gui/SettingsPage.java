package gui;

import core.gui.shapes.Rectangle;
import gui.settingpage.Button1;
import gui.settingpage.SettingBorder;

import java.awt.*;

public class SettingsPage extends Rectangle {

    public SettingsPage() {

        setPosition(200, 30);
        setSize(520, 450);
        setColor(Color.decode("#cccccc"));

        add(new SettingBorder());

    }

}
