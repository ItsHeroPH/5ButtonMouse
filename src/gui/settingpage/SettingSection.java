package gui.settingpage;

import core.gui.components.Text;
import core.gui.shapes.Rectangle;

import java.awt.*;

public class SettingSection extends Rectangle {

    public SettingSection() {

        setColor(Color.decode("#848484"));
        setPosition(215, 50);
        setSize(480, 1230);

        Rectangle settingRectangleInner = new Rectangle();
        settingRectangleInner.setColor(Color.decode("#cccccc"));
        settingRectangleInner.setPosition(220, 55);
        settingRectangleInner.setSize(470, 1220);

        Rectangle settingRectangleText = new Rectangle();
        settingRectangleText.setColor(Color.decode("#cccccc"));
        settingRectangleText.setPosition(230, 45);
        settingRectangleText.setSize(88, 20);

        Text settingText = new Text("SETTINGS");
        settingText.setPosition(245, 47);
        settingText.setColor(Color.decode("#848484"));
        settingText.setFontSize(15);
        settingText.setFontStyle(Font.BOLD);
        settingText.setFontFamily("Arial");

        add(settingRectangleInner, settingRectangleText, settingText);

    }
}
