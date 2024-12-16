package gui.settingpage;

import core.gui.components.Text;
import core.gui.shapes.Rectangle;

import java.awt.*;

public class SettingBorder extends Rectangle {

    public SettingBorder() {

        setColor(Color.decode("#848484"));
        setPosition(215, 50);
        setSize(480, 400);

        Rectangle rectangle = new Rectangle();
        rectangle.setColor(Color.decode("#cccccc"));
        rectangle.setPosition(220, 55);
        rectangle.setSize(470, 390);

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setColor(Color.decode("#cccccc"));
        rectangle2.setPosition(230, 45);
        rectangle2.setSize(88, 20);

        Text text = new Text("SETTINGS");
        text.setPosition(245, 42);
        text.setColor(Color.decode("#848484"));
        text.setFontSize(15);
        text.setFontStyle(Font.BOLD);
        text.setFontFamily("Arial");

        add(rectangle, rectangle2, text, new Button1());

    }
}
