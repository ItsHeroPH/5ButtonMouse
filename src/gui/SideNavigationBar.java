package gui;

import core.gui.components.Text;
import core.gui.shapes.Rectangle;
import gui.sidebar.AboutLink;
import gui.sidebar.HomeLink;
import gui.sidebar.SettingsLink;
import gui.sidebar.SupportLink;

import java.awt.*;

public class SideNavigationBar extends Rectangle {

    public SideNavigationBar() {

        setPosition(0, 30);
        setSize(200, 450);
        setColor(Color.decode("#dddddd"));

        Text version = new Text("version.1.0.0");
        version.setColor(Color.decode("#898989"));
        version.setPosition(30, 430);
        version.setFontSize(15);
        version.setFontFamily("Arial");
        version.setFontStyle(Font.BOLD);

        add(
                new HomeLink(),
                new SettingsLink(),
                new SupportLink(),
                new AboutLink(),
                version
        );

    }
}
