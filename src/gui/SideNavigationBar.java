package gui;

import core.gui.text.Text;
import core.gui.shapes.Rectangle;
import gui.sidebar.AboutLink;
import gui.sidebar.HomeLink;
import gui.sidebar.SettingLink;
import gui.sidebar.SupportLink;

import java.awt.*;

public class SideNavigationBar extends Rectangle {

    public SideNavigationBar() {


        super.setSize(250, 480)
                .setPosition(0, 0)
                .setColor("#dddddd")
                .add(
                        new HomeLink(),

                        new SettingLink(),

                        new SupportLink(),

                        new AboutLink(),

                        new Text()
                                .setColor("#898989")
                                .setText("version.1.0.0")
                                .setFontFamily("Arial")
                                .setFontSize(15)
                                .setFontStyle(Font.CENTER_BASELINE)
                                .setPosition(20, 420)

                );
    }

    /**
     * Leaved it black because we do not do any action when it clicked
     */
    @Override
    public void onClick() {}

}
