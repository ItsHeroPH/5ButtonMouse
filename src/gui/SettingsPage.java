package gui;

import core.gui.components.ScrollablePanel;
import core.gui.components.Text;
import core.gui.shapes.Rectangle;

import java.awt.*;

public class SettingsPage extends ScrollablePanel {

    public SettingsPage() {

        setPosition(200, 30);
        setSize(520, 550);
        setColor(Color.decode("#cccccc"));

        Rectangle settingRectangleStroke = new Rectangle();
        settingRectangleStroke.setColor(Color.decode("#848484"));
        settingRectangleStroke.setPosition(215, 50);
        settingRectangleStroke.setSize(480, 500);

        Rectangle settingRectangleInner = new Rectangle();
        settingRectangleInner.setColor(Color.decode("#cccccc"));
        settingRectangleInner.setPosition(220, 55);
        settingRectangleInner.setSize(470, 490);

        Rectangle settingRectangleText = new Rectangle();
        settingRectangleText.setColor(Color.decode("#cccccc"));
        settingRectangleText.setPosition(230, 45);
        settingRectangleText.setSize(88, 20);

        Text settingText = new Text("SETTINGS");
        settingText.setPosition(245, 42);
        settingText.setColor(Color.decode("#848484"));
        settingText.setFontSize(15);
        settingText.setFontStyle(Font.BOLD);
        settingText.setFontFamily("Arial");


        /*
         * Button 1 configuration
         */
        Rectangle button1RectangleBorder = new Rectangle();
        button1RectangleBorder.setColor(Color.decode("#848484"));
        button1RectangleBorder.setPosition(230, 80);
        button1RectangleBorder.setSize(450, 200);

        Rectangle button1RectangleInner = new Rectangle();
        button1RectangleInner.setColor(Color.decode("#cccccc"));
        button1RectangleInner.setPosition(235, 85);
        button1RectangleInner.setSize(440, 190);

        Rectangle button1RectangleText = new Rectangle();
        button1RectangleText.setColor(Color.decode("#cccccc"));
        button1RectangleText.setPosition(245, 75);
        button1RectangleText.setSize(88, 20);

        Text button1Text = new Text("BUTTON 1");
        button1Text.setPosition(260, 72);
        button1Text.setColor(Color.decode("#848484"));
        button1Text.setFontSize(15);
        button1Text.setFontStyle(Font.BOLD);
        button1Text.setFontFamily("Arial");

        /*
         * Button 2 configuration
         */
        Rectangle button2RectangleBorder = new Rectangle();
        button2RectangleBorder.setColor(Color.decode("#848484"));
        button2RectangleBorder.setPosition(230, 290);
        button2RectangleBorder.setSize(450, 200);

        Rectangle button2RectangleInner = new Rectangle();
        button2RectangleInner.setColor(Color.decode("#cccccc"));
        button2RectangleInner.setPosition(235, 295);
        button2RectangleInner.setSize(440, 190);

        Rectangle button2RectangleText = new Rectangle();
        button2RectangleText.setColor(Color.decode("#cccccc"));
        button2RectangleText.setPosition(245, 285);
        button2RectangleText.setSize(88, 20);

        Text button2Text = new Text("BUTTON 2");
        button2Text.setPosition(260, 282);
        button2Text.setColor(Color.decode("#848484"));
        button2Text.setFontSize(15);
        button2Text.setFontStyle(Font.BOLD);
        button2Text.setFontFamily("Arial");

        add(
                settingRectangleStroke,
                settingRectangleInner,
                settingRectangleText,
                settingText,

                button1RectangleBorder,
                button1RectangleInner,
                button1RectangleText,
                button1Text,

                button2RectangleBorder,
                button2RectangleInner,
                button2RectangleText,
                button2Text
        );

    }
}
