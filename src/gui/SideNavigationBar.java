package gui;

import core.gui.shapes.Rectangle;
import gui.sidebar.HomeLink;
import gui.sidebar.SettingsLink;

import java.awt.*;

public class SideNavigationBar extends Rectangle {

    public SideNavigationBar() {

        setPosition(0, 30);
        setSize(200, 450);
        setColor(Color.decode("#dddddd"));
        add(
                new HomeLink(),
                new SettingsLink()
        );

    }
}
